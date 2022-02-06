package java03c;

/* #################################################
Zwei Methoden mit Rückgabe
################################################# */

//für die Eingabe
import javax.swing.*;

public class java03c_04_03 {
		// die Methode rueckgabe100() vom Typ int
		static int rueckgabe100() {
			return 100;
		}

		// die Methode rueckgabe10() vom Typ int
		static int rueckgabe10() {
			return 10;
		}

		public static void main(String[] args) {
			int ergebnis;

			// Aufruf der beiden Methoden in einer Ausgabe
			System.out.println("Die Methode rueckgabe100() liefert den Wert " + rueckgabe100());
			System.out.println("Die Methode rueckgabe10() liefert den Wert " + rueckgabe10());

			// Berechnungen gehen auch
			ergebnis = rueckgabe100() + rueckgabe10();
			System.out.println("Das Ergebnis ist " + ergebnis);

			// und in Bedingungen kann eine Methode auch eingesetzt werden
			ergebnis = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
			if (ergebnis < rueckgabe100())
				System.out.println("Ihre Eingabe war kleiner als 100.");
			System.exit(0);

	}

}
