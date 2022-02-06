package minimail;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Function;

import javax.swing.JOptionPane;

// NEUE Klasse erstellt
public class MailDBManager {

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

	//
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

	//
	public static int fuehreSqlUpdateAus(String sql) {
		try (Statement statement = verbindung.createStatement()) {
			return statement.executeUpdate(sql);

		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "SQL Befehl kann nicht ausgeführt werden.");
			return 0;
		}
	}

	//
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
