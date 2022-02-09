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

	// automatisch �ber Eclipse erg�nzt
	private static final long serialVersionUID = 5398891945440024921L;

	// f�r die Aktion
	private MeineAktionen sendenAct;
	private MeineAktionen weiterleitenAct;
	private MeineAktionen beantwortenAct;

	// f�r die Tabelle
	private JTable tabelle;

	// f�r das Modell
	private DefaultTableModel modell;

	// f�r die Zugangsdaten
	private String email;
	private String password;

	// eine innere Klasse f�r die Aktionen
	class MeineAktionen extends AbstractAction {

		// automatisch �ber Eclipse erg�nzt
		private static final long serialVersionUID = 8673560298548765044L;

		// der Konstruktor
		public MeineAktionen(String text, ImageIcon icon, String beschreibung, KeyStroke shortcut, String actionText) {

			// den Konstruktor der �bergeordneten Klasse mit dem Text und dem Icon aufrufen
			super(text, icon);

			// die Beschreibung setzen f�r den Bildschirmtipp
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

		// die Aktionen f�r Neue E-Mail erstellen
		sendenAct = new MeineAktionen("Neue E-Mail", new ImageIcon("icons/mail-generic.gif"),
				"Erstellt eine neue E-Mail", null, "senden");

		// die Aktionen f�r E-Mail weiterleiten erstellen
		weiterleitenAct = new MeineAktionen("Email Weiterleiten", new ImageIcon("icons/mail-forward.gif"),
				"Leitet eine Email weiter", null, "weiterleiten");

		// die Aktionen f�r E-Mail beantwoten erstellen
		beantwortenAct = new MeineAktionen("Email Beantworten", new ImageIcon("icons/mail-reply.gif"),
				"Email beantworten", null, "beantworten");

		// die Symbolleiste oben einf�gen
		add(symbolleiste(), BorderLayout.NORTH);

		// Gr��e setzten und anzeigen
		setVisible(true);
		setSize(700, 300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// die Tabelle erstellen und anzeigen
		tabelleErstellen();
		tabelleAktualisieren();
	}

	// die Symbolleiste erzeugen und zur�ckgeben
	private JToolBar symbolleiste() {
		JToolBar leiste = new JToolBar();

		// die Symbole �ber die Aktionen einbauen
		leiste.add(sendenAct);
		leiste.add(weiterleitenAct);
		leiste.add(beantwortenAct);

		// die Leiste zur�ckgeben
		return (leiste);
	}

	// zum Erstellen der Tabelle
	private void tabelleErstellen() {

		// f�r die Spaltenbezeichner
		String[] spaltenNamen = { "ID", "Empf�nger", "Betreff", "Text" };

		// ein neues Standardmodell erstellen
		modell = new DefaultTableModel();

		// die Spaltennamen setzen
		modell.setColumnIdentifiers(spaltenNamen);

		// die Tabelle erzeugen
		tabelle = new JTable();

		// und mit dem Modell verbinden
		tabelle.setModel(modell);

		// wir haben keinen Editor, k�nnen die Tabelle also nicht bearbeiten
		tabelle.setDefaultEditor(Object.class, null);

		// es sollen immer alle Spalten angepasst werden
		tabelle.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

		// und die volle Gr��e genutzt werden
		tabelle.setFillsViewportHeight(true);

		// die Tabelle setzen wir in ein Scrollpane
		JScrollPane scroll = new JScrollPane(tabelle);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scroll);

		// einen Maus-Listener erg�nzen
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
					// �bergeben wird der Frame der �u�eren Klasse
					new Anzeige(Senden.this, true, ID, empfaenger, betreff, inhalt);
				}
			}
		});
	}

	// zum Aktualisieren der Tabelle
	private void tabelleAktualisieren() {

		// f�r den Datenbankzugriff
		Connection verbindung;
		ResultSet ergebnisMenge;

		// f�r die Spalten
		String empfaenger, betreff, inhalt, ID;

		// die Inhalte l�schen
		modell.setRowCount(0);

		try {
			// Verbindung herstellen und Ergebnismenge beschaffen
			verbindung = MiniDBTools.oeffnenDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:mailDB");
			ergebnisMenge = MiniDBTools.liefereErgebnis(verbindung, "SELECT * FROM gesendet");

			// die Eintr�ge in die Tabelle schreiben
			while (ergebnisMenge.next()) {
				ID = ergebnisMenge.getString("iNummer");
				empfaenger = ergebnisMenge.getString("empfaenger");
				betreff = ergebnisMenge.getString("betreff");

				// den Inhalt vom CLOB beschaffen und in einen String umbauen
				Clob clob;
				clob = ergebnisMenge.getClob("inhalt");
				inhalt = clob.getSubString(1, (int) clob.length());

				// die Zeile zum Modell hinzuf�gen
				// dazu benutzen wir ein Array vom Typ Object
				modell.addRow(new Object[] { ID, empfaenger, betreff, inhalt });
			}

			// die Verbindungen wieder schlie�en und trennen
			ergebnisMenge.close();
			verbindung.close();
			MiniDBTools.schliessenDB("jdbc:derby:");
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	// zum Senden
	public void senden() {

		// den Dialog f�r eine neue Nachricht modal anzeigen
		new NeueNachricht(this, true, email, password).setVisible(true);

		// nach dem Versenden lassen wir die Anzeige aktualisieren
		tabelleAktualisieren();
	}

	// zum Weiterleiten
	public void weiterleiten() {

		// �berpr�fen welche Zeile selektiert wurde, davon wird dann die Nachricht der
		// Betreff von der alten Nachricht in die neuen Felder �bernommen
		int zeile = tabelle.getSelectedRow();
		if (zeile == -1) {
			JOptionPane.showMessageDialog(this, "Bitte eine Nachricht ausw�hlen.");
		} else {
			new NeueNachricht(this, true, email, password, (String) tabelle.getValueAt(zeile, 2),
					(String) tabelle.getValueAt(zeile, 3)).setVisible(true);
		}
	}

	// zum Beantworten
	public void beantworten() {

		// �berpr�fen welche Zeile selektiert wurde, davon wird dann die Nachricht der
		// Betreff und die Absender Adresse von der alten Nachricht in die neuen Felder
		// �bernommen
		int zeile = tabelle.getSelectedRow();
		if (zeile == -1) {
			JOptionPane.showMessageDialog(this, "Bitte eine Nachricht ausw�hlen.");
		} else {
			new NeueNachricht(this, true, email, password, (String) tabelle.getValueAt(zeile, 2),
					(String) tabelle.getValueAt(zeile, 3), (String) tabelle.getValueAt(zeile, 1)).setVisible(true);
		}
	}
}