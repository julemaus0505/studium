package minimail;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

public class Senden extends JFrame {

	// automatisch über Eclipse ergänzt
	private static final long serialVersionUID = 5398891945440024921L;

	// für die Aktion
	private MeineAktionen sendenAct;
	private MeineAktionen weiterleitenAct;
	private MeineAktionen beantwortenAct;

	// für die Tabelle
	private JTable tabelle;

	// für das Modell
	private DefaultTableModel modell;

	// für die Zugangsdaten
	private String email;
	private String password;

	// eine innere Klasse für die Aktionen
	class MeineAktionen extends AbstractAction {

		// automatisch über Eclipse ergänzt
		private static final long serialVersionUID = 8673560298548765044L;

		// der Konstruktor
		public MeineAktionen(String text, ImageIcon icon, String beschreibung, KeyStroke shortcut, String actionText) {

			// den Konstruktor der übergeordneten Klasse mit dem Text und dem Icon aufrufen
			super(text, icon);

			// die Beschreibung setzen für den Bildschirmtipp
			putValue(SHORT_DESCRIPTION, beschreibung);

			// den Shortcut
			putValue(ACCELERATOR_KEY, shortcut);

			// das ActionCommand
			putValue(ACTION_COMMAND_KEY, actionText);
		}

		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf Senden geklickt?
			if (event.getActionCommand().equals("senden")) {

				// dann das senden starten
				senden();

				// wurde auf weiterleiten geklickt?
			} else if (event.getActionCommand().equals("weiterleiten")) {

				// dann Weiterleiten starten
				weiterleiten();

				// wurde auf beantworten geklickt?
			} else if (event.getActionCommand().equals("beantworten")) {

				// dann beantworten starten
				beantworten();
			}
		}
	}

	// der Konstruktor
	Senden(String email, String password) {
		super();
		this.email = email;
		this.password = password;

		// den Title setzen
		setTitle("E-Mail senden");
		
		

		// wir nehmen ein Border-Layout
		setLayout(new BorderLayout());

		// die Aktionen für Neue E-Mail erstellen
		sendenAct = new MeineAktionen("Neue E-Mail", new ImageIcon("icons/mail-generic.gif"),
				"Erstellt eine neue E-Mail", null, "senden");

		// die Aktionen für E-Mail weiterleiten erstellen
		weiterleitenAct = new MeineAktionen("Email Weiterleiten", new ImageIcon("icons/mail-forward.gif"),
				"Leitet eine Email weiter", null, "weiterleiten");

		// die Aktionen für E-Mail beantwoten erstellen
		beantwortenAct = new MeineAktionen("Email Beantworten", new ImageIcon("icons/mail-reply.gif"),
				"Email beantworten", null, "beantworten");

		// die Symbolleiste oben einfügen
		add(symbolleiste(), BorderLayout.NORTH);

		// Größe setzten und anzeigen
		setVisible(true);
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// die Tabelle erstellen und anzeigen
		tabelleErstellen();
		tabelleAktualisieren();
	}

	// die Symbolleiste erzeugen und zurückgeben
	private JToolBar symbolleiste() {
		JToolBar leiste = new JToolBar();

		// die Symbole über die Aktionen einbauen
		leiste.add(sendenAct);
		leiste.add(weiterleitenAct);
		leiste.add(beantwortenAct);

		// die Leiste zurückgeben
		return (leiste);
	}

	// zum Erstellen der Tabelle
	private void tabelleErstellen() {

		// für die Spaltenbezeichner
		String[] spaltenNamen = { "ID", "Empfänger", "Betreff", "Text" };

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
					String empfaenger, betreff, inhalt, ID;
					ID = tabelle.getModel().getValueAt(zeile, 0).toString();
					empfaenger = tabelle.getModel().getValueAt(zeile, 1).toString();
					betreff = tabelle.getModel().getValueAt(zeile, 2).toString();
					inhalt = tabelle.getModel().getValueAt(zeile, 3).toString();

					// und anzeigen
					// übergeben wird der Frame der äußeren Klasse
					new Anzeige(Senden.this, true, ID, empfaenger, betreff, inhalt);
				}
			}
		});
	}

	// zum Aktualisieren der Tabelle
	private void tabelleAktualisieren() {

		// für den Datenbankzugriff
		Connection verbindung;
		ResultSet ergebnisMenge;

		// für die Spalten
		String empfaenger, betreff, inhalt, ID;

		// die Inhalte löschen
		modell.setRowCount(0);

		try {
			// Verbindung herstellen und Ergebnismenge beschaffen
			verbindung = MiniDBTools.oeffnenDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:mailDB");
			ergebnisMenge = MiniDBTools.liefereErgebnis(verbindung, "SELECT * FROM gesendet");

			// die Einträge in die Tabelle schreiben
			while (ergebnisMenge.next()) {
				ID = ergebnisMenge.getString("iNummer");
				empfaenger = ergebnisMenge.getString("empfaenger");
				betreff = ergebnisMenge.getString("betreff");

				// den Inhalt vom CLOB beschaffen und in einen String umbauen
				Clob clob;
				clob = ergebnisMenge.getClob("inhalt");
				inhalt = clob.getSubString(1, (int) clob.length());

				// die Zeile zum Modell hinzufügen
				// dazu benutzen wir ein Array vom Typ Object
				modell.addRow(new Object[] { ID, empfaenger, betreff, inhalt });
			}

			// die Verbindungen wieder schließen und trennen
			ergebnisMenge.close();
			verbindung.close();
			MiniDBTools.schliessenDB("jdbc:derby:");
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	// zum Senden
	public void senden() {

		// den Dialog für eine neue Nachricht modal anzeigen
		new NeueNachricht(this, true, email, password).setVisible(true);

		// nach dem Versenden lassen wir die Anzeige aktualisieren
		tabelleAktualisieren();
	}

	// zum Weiterleiten
	public void weiterleiten() {

		// Überprüfen welche Zeile selektiert wurde, davon wird dann die Nachricht der
		// Betreff von der alten Nachricht in die neuen Felder übernommen
		int zeile = tabelle.getSelectedRow();
		if (zeile == -1) {
			JOptionPane.showMessageDialog(this, "Bitte eine Nachricht auswählen.");
		} else {
			new NeueNachricht(this, true, email, password, (String) tabelle.getValueAt(zeile, 2),
					(String) tabelle.getValueAt(zeile, 3)).setVisible(true);
		}
	}

	// zum Beantworten
	public void beantworten() {

		// Überprüfen welche Zeile selektiert wurde, davon wird dann die Nachricht der
		// Betreff und die Absender Adresse von der alten Nachricht in die neuen Felder
		// übernommen
		int zeile = tabelle.getSelectedRow();
		if (zeile == -1) {
			JOptionPane.showMessageDialog(this, "Bitte eine Nachricht auswählen.");
		} else {
			new NeueNachricht(this, true, email, password, (String) tabelle.getValueAt(zeile, 2),
					(String) tabelle.getValueAt(zeile, 3), (String) tabelle.getValueAt(zeile, 1)).setVisible(true);
		}
	}
}