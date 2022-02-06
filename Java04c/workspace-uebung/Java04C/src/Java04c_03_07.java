
/* #################################################
Zeichenketten durchsuchen
################################################# */

//für das Einlesen
import javax.swing.*;

public class Java04c_03_07 {
	public static void main(String[] args) {
		String zKette;
		char zeichen;
		int index = 0;
		int zaehler = 0;

		// die Zeichenkette einlesen
		zKette = JOptionPane.showInputDialog("Bitte geben Sie die Zeichenkette ein:");

		// das zu suchende Zeichen einlesen
		zeichen = (JOptionPane.showInputDialog("Nach welchem Zeichen soll gesucht werden?")).charAt(0);

		// die erste Suche
		index = zKette.indexOf(zeichen);

		// wenn das Zeichen gefunden wurde, wird weitergesucht
		while (index >= 0) {
			index++;
			zaehler++;
			index = zKette.indexOf(zeichen, index);
		}
		System.out.println(
				"In der Zeichenkette " + zKette + " kommt das Zeichen " + zeichen + " " + zaehler + " Mal vor.");
		System.exit(0);
	}
}
