package minimail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Function;

import javax.swing.JOptionPane;

/**
 * * Diese Klasse stellt Methoden zum Ausf�hren von SQL - Anweisungen bereit.
 * 
 * @author Julia Petersen
 */
public class MailDBManager {

	// statische Klassenvariablen
	private static final String DATENBANK_URL = "jdbc:derby:mailDB";
	private static final String DATENBANK_TREIBER = "org.apache.derby.jdbc.EmbeddedDriver";

	private static Connection verbindung;

	/**
	 * Die Methode pr�ft ob es die Tabelle bnutzer gibt und erstellt sie
	 * gegebenenfalls
	 * 
	 * @throws SQLException
	 */
	public static void ueberpruefeBenutzerDatenbank() throws SQLException {

		// Datenbankverbindung herstellen
		stelleDbVerbindungHer();
		Statement statement = verbindung.createStatement();
		try {
			// �berpr�fen ob Tabelle vorhanden ist
			statement.executeQuery("SELECT * FROM benutzer");

		} catch (SQLException exception) {

			// Tabelle anlegen
			statement.executeUpdate("""
					CREATE TABLE benutzer (
						id int,
						email varchar (255),
						passwort varchar (30)
					)
					""");
		} finally {
			statement.close();
		}
	}

	/**
	 * Die Methode f�hrt die angegebene SELECT - Anweisung aus. In der angegebenen
	 * Funktion wird das {@link ResultSet} ausgewertet
	 * 
	 * @param sql      Anweisung die ausgef�rt werden soll
	 * @param function zum Auswerten des {@link ResultSet}
	 * @return R�ckgabewert der Funktion
	 */
	public static Integer fuehreSqlAus(String sql, Function<ResultSet, Integer> function) {
		stelleDbVerbindungHer();
		try (Statement statement = verbindung.createStatement()) {
			ResultSet resultSet = statement.executeQuery(sql);
			return function.apply(resultSet);

		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "SQL Befehl kann nicht ausgef�hrt werden.");
		}
		return null;
	}

	/**
	 * Die Methode f�hrt die angegebene DELETE || UPDATE || INSERT - Anweisung aus
	 * 
	 * @param sql Anweisung die ausgef�rt werden soll
	 * @return die Anzahl ge�nderter Zeilen
	 */
	public static int fuehreSqlUpdateAus(String sql) {
		stelleDbVerbindungHer();
		try (Statement statement = verbindung.createStatement()) {
			return statement.executeUpdate(sql);

		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "SQL Befehl kann nicht ausgef�hrt werden.");
			return 0;
		}
	}

	/**
	 * Die Methode ermittelt die n�chste ID
	 * 
	 * @param tabellenname dessen n�chste ID ermittelt werden soll
	 * @return die n�chste ID oder <code>NULL</code>
	 */
	public static Integer getNaechsteId(String tabellenname) {
		Integer count = fuehreSqlAus("SELECT COUNT(*) FROM " + tabellenname, resultSet -> {
			try {
				resultSet.next();
				return resultSet.getInt(1) + 1;
			} catch (SQLException exception) {
				return null;
			}
		});
		return count;
	}

	private static void stelleDbVerbindungHer() {
		try {
			if (verbindung == null || verbindung.isClosed()) {
				verbindung = MiniDBTools.oeffnenDB(DATENBANK_TREIBER, DATENBANK_URL);
			}
		} catch (SQLException exception) {
			JOptionPane.showMessageDialog(null, "Fehler beim Herstellen der Datenbank - Verbindung");
		}
	}
}
