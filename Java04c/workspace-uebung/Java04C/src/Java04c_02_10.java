
/* #################################################
Sonderfunktionen f�r Arrays
################################################# */

//f�r das Einlesen
import javax.swing.*;
//f�r die Sonderfunktionen der Arrays
import java.util.Arrays;

public class Java04c_02_10 {
	public static void main(String[] args) {
		// ein Array f�r int mit 5 Elementen
		int[] zahlen = new int[5];
		// ein Array f�r int mit nur einem Element
		int[] zahlen2 = new int[1];

		// zwei int-Variablen f�r die Suche
		int suche, treffer;

		// die Werte einlesen
		for (int element = 0; element < zahlen.length; element++)
			zahlen[element] = Integer
					.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die " + (element + 1) + ". Zahl ein"));

		// die eingelesenen Werte in das zweite kleinere Array kopieren
		// die Gr��e des Ziels wird automatisch angepasst
		zahlen2 = Arrays.copyOf(zahlen, zahlen.length);

		// die Werte sortieren und ausgeben
		Arrays.sort(zahlen2);
		for (int element : zahlen2)
			System.out.println(element);

		// den Wert f�r die Suche einlesen
		suche = Integer.parseInt(JOptionPane.showInputDialog("Nach welcher Zahl m�chten Sie suchen?"));

		// und suchen
		treffer = Arrays.binarySearch(zahlen2, suche);
		if (treffer < 0)
			System.out.println("Das gesuchte Element wurde nicht gefunden");
		else
			System.out.println("Das gesuchte Element befindet sich an der Position " + (treffer + 1));
		System.exit(0);
	}
}
