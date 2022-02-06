
/* #################################################
Beispiel für ein Array
################################################# */

//für das Einlesen
import javax.swing.*;

public class Java04c_02_01 {
	public static void main(String[] args) {

		// die Vereinbarung des Arrays
		int[] zahlen = new int[5];

		// das Einlesen in das Array
		for (int index = 0; index < 5; index++)
			zahlen[index] = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Zahl " + (index + 1) + " ein"));

		// die Berechnung und die Ausgabe
		for (int index = 0; index < 5; index++)
			System.out.println("Das Quadrat von " + zahlen[index] + " ist: " + zahlen[index] * zahlen[index]);
		System.exit(0);
	}
}

