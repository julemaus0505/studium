//ACHTUNG!! Das Programm l�sst sich nur fehlerfrei ausf�hren, wenn javax.activation-1.2.0.jar und javax.mail.jar eingebunden sind
package minimail;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MiniMailMain {
	public static void main(String[] args) {

		// Neu �berpr�fung der Datenbankverbindung
		try {
			MailDBManager.ueberpruefeDatenbank();
			Benutzer benutzer = new Benutzer();
			benutzer.zeigeLoginFenster();
		
		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "Es konnte keine Verbindung zur Datenbak hergestellt werden.");
			System.exit(0);
		}
	}
}
