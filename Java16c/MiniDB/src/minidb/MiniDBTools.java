package minidb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class MiniDBTools {

	// die Methode l�dt den Treiber und stellt die Verbindung her
	// zur�ckgeliefert wird ein Connection-Objekt
	// �bergeben werden der Treiber und Argumente f�r das �ffnen
	public static Connection oeffnenDB(String treiber, String arg) {

		Connection verbindung = null;

		try {
			// den Treiber laden
			Class.forName(treiber).getDeclaredConstructor().newInstance();

			// die Datenbank wird �ber arg festgelegt
			verbindung = DriverManager.getConnection(arg);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Problerm:\n" + e.toString());
		}

		return verbindung;
	}
	
	// die Methode liefert eine Ergebnismenge
	// �bergeben werden die Verbindung und der SQL-Ausdruck
	public static ResultSet liefereErgebnis(Connection verbindung, String sqlAnweisung) {
		
		ResultSet ergebnisMenge = null;
		
		try {
			Statement state = verbindung.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ergebnisMenge = state.executeQuery(sqlAnweisung);
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Problem: \n" + e.toString());
		}
		return ergebnisMenge;
	}
	
	// die Methode f�hrt das gesamte Datenbanksystem herunter
	// das wird bei der "embedded" Version von Apache Derby ausdr�cklich empfohlen
	// �bergeben wird das Protokoll
	public static void schliessenDB(String protokoll) {
		
		// das Herunterfahren l�st bei Erfolg eine Exception aus
		boolean erfolg = false;
		
		try {
			DriverManager.getConnection(protokoll + ";shutdown=true");
		
		} catch (SQLException e) {
			erfolg = true;
		}
		
		if(erfolg != true) {
			JOptionPane.showMessageDialog(null, "Das DBMS konnte nicht herruntergefahren werden.");
		}
	}	
}
