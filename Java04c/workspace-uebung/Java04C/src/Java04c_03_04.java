
/* #################################################
Zeichenketten vergleichen
################################################# */

//für das Einlesen
import javax.swing.*;

public class Java04c_03_04 {
	public static void main(String[] args) {
		// Vereinbarung
		String zKette1 = "Geheimnis";
		String zKette2;

		// die zweite Zeichenkette einlesen
		do {
			zKette2 = JOptionPane.showInputDialog("Raten Sie. Wie heißt das Wort?");
		} while (zKette2.isEmpty());

		// die beiden Zeichenketten vergleichen
		// ein Vergleich mit == geht hier ebenfalls nicht
		if (zKette1.equals(zKette2))
			System.out.println("Sie haben richtig geraten.");
		else
			System.out.println("Leider falsch.");
		System.exit(0);

		// die zweite Zeichenkette einlesen
		do {
			// bitte in einer Zeile eingeben
			zKette2 = JOptionPane.showInputDialog("Raten Sie. Wie heißt das Wort?");
			// ist zKette2 gleich null?
			// dann weisen wir ein Leerzeichen zu
			if (zKette2 == null)
				zKette2 = " ";
		} while (zKette2.isEmpty());
	}
}
