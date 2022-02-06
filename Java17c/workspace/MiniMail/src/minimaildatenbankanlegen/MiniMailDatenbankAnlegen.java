package minimaildatenbankanlegen;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MiniMailDatenbankAnlegen extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// f�r den Treiber und das Protokoll
	private String treiber = "org.apache.derby.jdbc.EmbeddedDriver";
	private String protokoll = "jdbc:derby:";

	// f�r die Verbindung
	// ACHTUNG! Es gibt mehrere Connection-Klassen!
	// ben�tigt wird die Klasse aus dem Paket java.sql.
	private Connection verbindung;

	// die innere Klasse f�r den ActionListener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf Anlegen geklickt?
			if (event.getActionCommand().equals("anlegen")) {

				// dann die Datenbank anlegen
				anlegenDB();

				// wurde auf neue Eintr�ge geklickt?
			} else if (event.getActionCommand().equals("eintraege")) {

				// dann die Testeintr�ge anlegen
				anlegenEintraege();

				// wurde auf Beenden geklickt?
			} else if (event.getActionCommand().equals("ende")) {

				// dann beenden
				System.exit(0);
			}
		}
	}

	// der Konstrucktor
	public MiniMailDatenbankAnlegen(String titel) {
		super(titel);

		// ein FlowLayout
		setLayout(new FlowLayout(FlowLayout.LEFT));

		// die Schaltfl�chen
		JButton anlegen = new JButton("Datenbank anlegen");
		anlegen.setActionCommand("anlegen");
		JButton test = new JButton("Testeintr�ge erzeugen");
		test.setActionCommand("eintraege");
		JButton beenden = new JButton("Beenden");
		beenden.setActionCommand("ende");

		MeinListener listener = new MeinListener();
		anlegen.addActionListener(listener);
		test.addActionListener(listener);
		beenden.addActionListener(listener);

		add(anlegen);
		add(test);
		add(beenden);

		// Gr��e setzen, Standard-Verhalten festlegen und anzeigen
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void oeffnenDB(String arg) {
		try {

			// den Treiber laden
			Class.forName(treiber).getDeclaredConstructor().newInstance();
			verbindung = DriverManager.getConnection(arg);
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	private void schliessenDB() {

		// das Schlie�en l�st bei Erfolg eine Exception aus!!!
		boolean erfolg = false;
		try {
			DriverManager.getConnection(protokoll + ";shutdown=true");
		} catch (SQLException exception) {
			erfolg = true;
		}
		if (erfolg != true) {
			JOptionPane.showMessageDialog(this, "Das DBMS konnte nicht heruntergefahren werden.");
		}
	}

	public static void main(String[] args) {
		new MiniMailDatenbankAnlegen("Datenbank-Werkzeuge");
	}

	private void anlegenDB() {

		// die Datenbank ist mailDB, sie wird neu angelegt
		oeffnenDB(protokoll + "mailDB;create=true");
		JOptionPane.showMessageDialog(this, "Die Datenbank wurde angelegt bzw. ge�ffnet.");

		// ein Statement zum Erstellen der Tabelle
		// bitte auch hier auf die richtige Klasse aus dem Paket sql achten!
		try {
			Statement state = verbindung.createStatement();
			state.execute("CREATE TABLE gesendet("
					+ "iNummer int NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),"
					+ "empfaenger varchar(255) NOT NULL," + "betreff varchar(255)," + "inhalt CLOB(64 K),"
					+ "PRIMARY KEY (iNummer))");
			JOptionPane.showMessageDialog(this, "Die Tabelle gesendet wurde angelegt.");
			state.execute("CREATE TABLE empfangen("
					+ "iNummer int NOT NULL GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),"
					+ "sender varchar(255) NOT NULL," + "betreff varchar(255)," + "inhalt CLOB(64 K),"
					+ "PRIMARY KEY (iNummer))");
			JOptionPane.showMessageDialog(this, "Die Tabelle empfangen wurde angelegt.");

			// Verbindung schlie�en
			state.close();
			verbindung.close();

			// und die Datenbank schlie�en
			schliessenDB();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	private void anlegenEintraege() {

		// die Datenbank �ffnen
		oeffnenDB(protokoll + "mailDB");
		try {

			// einen Eintrag in der Tabelle empfangen anlegen
			// �ber ein vorbereitetes Statement
			PreparedStatement prepState;
			prepState = verbindung.prepareStatement("insert into empfangen (sender, betreff, inhalt) values (?,?,?)");
			prepState.setString(1, "ilsjava22@gmail.com");
			prepState.setString(2, "Testnachricht");
			prepState.setString(3, "Der Text der empfangenen Nachricht als CLOB");

			// das Statement ausf�hren
			prepState.executeUpdate();
			verbindung.commit();

			// �nderungen von au�en werden sichtbar und der Cursor kann beliebig bewegt
			// werden
			Statement state;
			state = verbindung.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// die Ergebnismenge erzeugen
			// dazu beschaffen wir alle Eintr�ge in der Tabelle empfangen
			ResultSet ergebnisMenge;
			ergebnisMenge = state.executeQuery("SELECT * FROM empfangen");

			// ganz nach vorne gehen
			ergebnisMenge.first();

			// zum Test die Werte in der Konsole ausgeben
			// hier wird direkt die Spalte angegeben
			System.out.println(ergebnisMenge.getInt("iNummer"));
			System.out.println(ergebnisMenge.getString("sender"));
			System.out.println(ergebnisMenge.getString("betreff"));
			Clob clob;
			clob = ergebnisMenge.getClob("inhalt");
			System.out.println(clob.getSubString(1, (int) clob.length()));

			// zum letzten Eintrag gehen
			ergebnisMenge.last();
			System.out.println("In der Tabelle empfangen stehen jetzt " + ergebnisMenge.getRow() + " Eintr�ge");

			// Verbindung schlie�en
			prepState.close();
			state.close();
			ergebnisMenge.close();

			// und einen Eintrag f�r die Tabelle gesendet anlegen
			// �ber ein vorbereitetes Statement
			prepState = verbindung
					.prepareStatement("insert into gesendet (empfaenger, betreff, inhalt) values (?,?,?)");
			prepState.setString(1, "ilsjava22@gmail.com");
			prepState.setString(2, "Testnachricht");
			prepState.setString(3, "Der Text der gesendeten Nachricht als CLOB");

			// das Statement ausf�hren
			prepState.executeUpdate();
			verbindung.commit();

			// �nderungen von au�en werden sichtbar und der Cursor kann beliebig bewegt
			// werden
			state = verbindung.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

			// die Ergebnismenge erzeugen
			// dazu beschaffen wir alle Eintr�ge in der Tabelle empfangen
			ergebnisMenge = state.executeQuery("SELECT * FROM gesendet");

			// ganz nach vorne gehen
			ergebnisMenge.first();

			// zum Test die Werte in der Konsole ausgeben
			// hier wird direkt die Spalte angegeben
			System.out.println(ergebnisMenge.getInt("iNummer"));
			System.out.println(ergebnisMenge.getString("empfaenger"));
			System.out.println(ergebnisMenge.getString("betreff"));
			clob = ergebnisMenge.getClob("inhalt");
			System.out.println(clob.getSubString(1, (int) clob.length()));

			// zum letzten Eintrag gehen
			ergebnisMenge.last();
			System.out.println("In der Tabelle gesendet stehen jetzt " + ergebnisMenge.getRow() + " Eintr�ge");

			// Verbindung schlie�en
			prepState.close();
			state.close();

			verbindung.close();
			// und die Datenbank schlie�en
			schliessenDB();
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}
}
