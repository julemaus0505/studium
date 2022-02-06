
/* #################################################
Ein Array als Argument für eine Methode
################################################# */

//für das Einlesen
import javax.swing.*;

public class Java04c_02_07 {
	static void eingabe(int[] argArray) {
		// das Einlesen in das Array
		for (int index = 0; index < argArray.length; index++)
			argArray[index] = Integer.parseInt(JOptionPane.showInputDialog("Bitte die " + (index + 1) + ". Zahl eingeben"));
	}

	static void quadrat(int[] argArray) {
		for (int element : argArray)
			System.out.println("Das Quadrat von " + element + " ist " + (element * element));
	}

	public static void main(String[] args) {
		// die Vereinbarung des Array
		int[] zahlenArray = new int[5];

		// das Einlesen in einer Methode
		eingabe(zahlenArray);

		// das Berechnen und die Ausgabe über eine Methode
		quadrat(zahlenArray);
		System.exit(0);
	}
}
