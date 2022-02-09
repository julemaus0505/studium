//ACHTUNG!! Das Programm lässt sich nur fehlerfrei ausführen, wenn javax.activation-1.2.0.jar und javax.mail.jar eingebunden sind
package minimail;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class MiniMailMain {
	public static void main(String[] args) {

		// Neu überprüfung der Datenbankverbindung
		// Zeige Login Fenster an, wenn keine Verbindung hergestellt werden kann gibt es eine Meldung.
		try {
			MailDBManager.ueberpruefeBenutzerDatenbank();
			Benutzer benutzer = new Benutzer();
			benutzer.zeigeLoginFenster();
		
		} catch (SQLException exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(null, "Es konnte keine Verbindung zur Datenbak hergestellt werden.");
			System.exit(0);
		}
	}
}
