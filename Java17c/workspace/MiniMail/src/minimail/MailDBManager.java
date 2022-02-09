package minimail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Function;

import javax.swing.JOptionPane;

/**
 * Neue Klasse erstellt:
 * 
 * @author Julia Petersen
 * 
 * Diese Klasse habe ich für meine SQL Anweisungen geschrieben, zuerst wird die Verbindung hergestellt, und dann
 * Überprüft, ob es die Tabelle gibt. Die Methode fuehreSqlAus führt meine SQL Befehle aus. Zum Beispiel, ob der Benutzer
 * In der Datenbank schon existiert. Bei fuehreSqlUpdateAus werden neue Benutzer in der Datenbank hinzugefügt.
 * Bei getNaechsteId hole ich mir die nächste ID, da die ID auch nur einmal vergeben werden darf.
 *  
 */
public class MailDBManager {

	// statische Klassenvariablen
	private static final String DATENBANK_URL = "jdbc:derby:mailDB";
	private static final String DATENBANK_TREIBER = "org.apache.derby.jdbc.EmbeddedDriver";

	private static Connection verbindung;

	public static void ueberpruefeDatenbank() throws SQLException {

		// Datenbankverbindung herstellen
		verbindung = MiniDBTools.oeffnenDB(DATENBANK_TREIBER, DATENBANK_URL);

		Statement statement = verbindung.createStatement();
		try {
			// Überprüfen ob Tabelle vorhanden ist
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

	// führt die Methode fuehreSqlAus 
	public static Integer fuehreSqlAus(String sql, Function<ResultSet, Integer> function) {
		try (Statement statement = verbindung.createStatement()) {
			ResultSet resultSet = statement.executeQuery(sql);
			return function.apply(resultSet);

		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "SQL Befehl kann nicht ausgeführt werden.");
		}
		return null;
	}
	
	// führt die Methode fuehreSqlUpdateAus 
	public static int fuehreSqlUpdateAus(String sql) {
		try (Statement statement = verbindung.createStatement()) {
			return statement.executeUpdate(sql);

		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "SQL Befehl kann nicht ausgeführt werden.");
			return 0;
		}
	}

	// führt die Methode getNaechsteId aus 
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
}
