package minimail;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Empfangen extends JFrame {

	// automatisch über Eclipse ergänzt
	private static final long serialVersionUID = 2905894464790399040L;

	// Neu Klassenvariablen für einegabe der Benutzerdaten
	private String email;
	private String password;

	// für die Tabelle
	private JTable tabelle;

	// für das Modell
	private DefaultTableModel modell;

	// eine innere Klasse für den WindowListener und den ActionListener
	// die Klasse ist von WindowAdapter abgeleitet
	class MeinWindowAdapter extends WindowAdapter {

		// für das Öffnen des Fensters
		@Override
		public void windowOpened(WindowEvent event) {

			// die Methode nachrichtenEmpfangen() aufrufen
			nachrichtenEmpfangen();
		}
	}

	// der Konstruktor
	Empfangen(String email, String password) {
		super();
		this.email = email;
		this.password = password;

		// titel setzten
		setTitle("E-Mail empfangen");

		// wir nehmen ein Border-Layout
		setLayout(new BorderLayout());

		// Größe setzten und anzeigen
		setVisible(true);
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// den Listener verbinden
		addWindowListener(new MeinWindowAdapter());

		// die Tabelle erstellen und anzeigen
		tabelleErstellen();
		tabelleAktualisieren();
		
	}

	// zum Erstellen der Tabelle
	private void tabelleErstellen() {

		// für die Spaltenbezeichner
		String[] spaltenNamen = { "ID", "Sender", "Betreff", "Text" };

		// ein neues Standardmodell erstellen
		modell = new DefaultTableModel();

		// die Spaltennamen setzen
		modell.setColumnIdentifiers(spaltenNamen);

		// die Tabelle erzeugen
		tabelle = new JTable();

		// und mit dem Modell verbinden
		tabelle.setModel(modell);

		// wir haben keinen Editor, können die Tabelle also nicht bearbeiten
		tabelle.setDefaultEditor(Object.class, null);

		// es sollen immer alle Spalten angepasst werden
		tabelle.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		// und die volle Größe genutzt werden
		tabelle.setFillsViewportHeight(true);

		// die Tabelle setzen wir in ein Scrollpane
		JScrollPane scroll = new JScrollPane(tabelle);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scroll);

		// einen Maus-Listener ergänzen
		tabelle.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {

				// war es ein Doppelklick?
				if (event.getClickCount() == 2) {

					// die Zeile beschaffen
					int zeile = tabelle.getSelectedRow();

					// die Daten beschaffen
					String sender, betreff, inhalt, ID;
					ID = tabelle.getModel().getValueAt(zeile, 0).toString();
					sender = tabelle.getModel().getValueAt(zeile, 1).toString();
					betreff = tabelle.getModel().getValueAt(zeile, 2).toString();
					inhalt = tabelle.getModel().getValueAt(zeile, 3).toString();

					// und anzeigen
					// übergeben wird der Frame der äußeren Klasse
					new Anzeige(Empfangen.this, true, ID, sender, betreff, inhalt);
				}
			}
		});
	}

	private void tabelleAktualisieren() {

		// für den Datenbankzugriff
		Connection verbindung;
		ResultSet ergebnisMenge;

		// für die Spalten
		String sender, betreff, inhalt, ID;

		// die Inhalte löschen
		modell.setRowCount(0);

		try {

			// Verbindung herstellen und Ergebnismenge beschaffen
			verbindung = MiniDBTools.oeffnenDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:mailDB");
			ergebnisMenge = MiniDBTools.liefereErgebnis(verbindung, "SELECT * FROM empfangen");

			// die Einträge in die Tabelle schreiben
			while (ergebnisMenge.next()) {
				ID = ergebnisMenge.getString("iNummer");
				sender = ergebnisMenge.getString("sender");
				betreff = ergebnisMenge.getString("betreff");

				// den Inhalt vom CLOB beschaffen und in einen String umbauen
				Clob clob;
				clob = ergebnisMenge.getClob("inhalt");
				inhalt = clob.getSubString(1, (int) clob.length());

				// die Zeile zum Modell hinzufügen
				// dazu benutzen wir ein Array vom Typ Object
				modell.addRow(new Object[] { ID, sender, betreff, inhalt });
			}

			// die Verbindungen wieder schließen und trennen
			ergebnisMenge.close();
			verbindung.close();
			MiniDBTools.schliessenDB("jdbc:derby:");

		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	private void nachrichtenEmpfangen() {

		nachrichtenAbholen();

		// nach dem Empfangen lassen wir die Anzeige aktualisieren
		tabelleAktualisieren();
	}

	private void nachrichtenAbholen() {

		// der Server
		String server = "pop.gmail.com";

		// die Eigenschaften setzen
		Properties eigenschaften = new Properties();

		// das Protokoll
		eigenschaften.put("mail.store.protocol", "pop3");

		// den Host
		eigenschaften.put("mail.pop3.host", server);

		// den Port zum Empfangen
		eigenschaften.put("mail.pop3.port", "995");

		// die Authentifizierung über TLS
		eigenschaften.put("mail.pop3.starttls.enable", "true");

		// das Session-Objekt erstellen
		Session sitzung = Session.getDefaultInstance(eigenschaften);

		// das Store-Objekt über die Sitzung erzeugen
		try (Store store = sitzung.getStore("pop3s")) {

			// und verbinden
			store.connect(server, email, password);

			// ein Ordnerobjekt für den Posteingang erzeugen
			Folder posteingang = store.getFolder("INBOX");

			// und öffnen
			// dabei sind auch Änderungen zugelassen
			posteingang.open(Folder.READ_WRITE);

			// die Nachrichten beschaffen
			Message nachrichten[] = posteingang.getMessages();

			// gibt es neue Nachrichten?
			if (nachrichten.length != 0) {

				// dann die Anzahl zeigen
				JOptionPane.showMessageDialog(this,
						"Es gibt " + posteingang.getUnreadMessageCount() + " neue Nachrichten.");

				// jede Nachricht verarbeiten
				for (Message nachricht : nachrichten)
					nachrichtVerarbeiten(nachricht);
			} else
				JOptionPane.showMessageDialog(this, "Es gibt keine neue Nachrichten.");

			// den Ordner schließen
			// durch das Argument true werden die Nachrichten gelöscht
			posteingang.close(true);

		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	private void nachrichtVerarbeiten(Message nachricht) {

		try {
			// den ersten Sender beschaffen
			String sender = nachricht.getFrom()[0].toString();

			// den Betreff
			String betreff = nachricht.getSubject();

			// ist es einfacher Text?
			if (nachricht.isMimeType("text/plain")) {

				// den Inhalt
				String inhalt = nachricht.getContent().toString();

				// und die Nachricht speichern
				nachrichtSpeichern(sender, betreff, inhalt);

				// und zum Löschen markieren
				nachricht.setFlag(Flags.Flag.DELETED, true);

			} else if (nachricht.isMimeType("multipart/*")) {
				Multipart mp = (Multipart) nachricht.getContent();

				if (mp.getCount() > 1) {
					Part part = mp.getBodyPart(0);
					if (part.getContent() instanceof String) {

						String inhalt = part.getContent().toString();
						
						// und die Nachricht speichern
						nachrichtSpeichern(sender, betreff, inhalt);

						// und zum Löschen markieren
						nachricht.setFlag(Flags.Flag.DELETED, true);
					}
				}
			}
			// sonst geben wir eine Meldung aus
			else
				JOptionPane.showMessageDialog(this,
						"Der Typ der Nachricht " + nachricht.getContentType() + "kann nicht verarbeitet werden.");

		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	private void nachrichtSpeichern(String sender, String betreff, String inhalt) {

		// für die Verbindung
		Connection verbindung;

		// die Datenbank öffnen
		verbindung = MiniDBTools.oeffnenDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:mailDB");
		try {

			// einen Eintrag in der Tabelle empfangen anlegen
			// über ein vorbereitetes Statement
			PreparedStatement prepState;
			prepState = verbindung.prepareStatement("insert into empfangen (sender, betreff, inhalt) values (?,?,?)");
			prepState.setString(1, sender);
			prepState.setString(2, betreff);
			prepState.setString(3, inhalt);

			// das Statement ausführen
			prepState.executeUpdate();
			verbindung.commit();

			// Verbindung schließen
			prepState.close();
			verbindung.close();

			// und die Datenbank schließen
			MiniDBTools.schliessenDB("jdbc:derby:");

		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}
}