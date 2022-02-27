package aufgabe_02;

import java.util.Scanner;

public class Aufgabe_02 {

	public static void main(String[] args) {

		// Variablen f�r Zahl1 und Zahl2 und die Anzahl der Durchl�ufe
		int zahl1;
		int zahl2;
		int anzahlDruchlaeufe = 0;

		// ein Objekt von Scanner erstellt
		Scanner scanner = new Scanner(System.in);

		do {

			// Bitte geben Sie Zahl1 ein
			System.out.println("Bitte geben Sie die erste Zahl ein.");

			// eingabe vom Anwender von Zahl1
			zahl1 = (int) einlesenZahlen(scanner);

			// Bitte geben Sie Zahl2 ein
			System.out.println("Bitte geben Sie zweite Zahl ein.");

			// Eingabe vom Anwender von Zahl2
			zahl2 = (int) einlesenZahlen(scanner);

			// Sind Zahl1 und Zahl2 gleich sind soll die Eingabe wiederholt werden
		} while (zahl1 == zahl2);

		// wenn Zahl1 kleiner als Zahl2 ist
		if (zahl1 < zahl2) {

			// ist die Zahl1 kleiner als Zahl2 dann z�hle die Durchl�ufe
			for (int i = zahl1; i <= zahl2; i++) {
				anzahlDruchlaeufe++;

			}
			// Ausgabe wieviele Durchl�ufe gebaucht worden sind von Zahl1 bis Zahl2
			System.out.println("Anzahl der Durchl�ufe der ermittelt wurde " + anzahlDruchlaeufe);

		} else {
			// ist die Zahl1 kleiner als Zahl2 dann z�hle die Durchl�ufe
			for (int i = zahl2; i <= zahl1; i++) {
				anzahlDruchlaeufe++;

			}
			// Ausgabe wieviele Durchl�ufe gebaucht worden sind von Zahl2 bis Zahl1
			System.out.println("Anzahl der Durchl�ufe der ermittelt wurde " + anzahlDruchlaeufe);
		}
	}

	private static double einlesenZahlen(Scanner scanner) {
		// Variable f�r R�ckgabewert
		Integer zahl = null;
		do {
			try {
				// das Einlesen
				String wert = scanner.nextLine();
				zahl = Integer.parseInt(wert);

			} catch (NumberFormatException exception) {
				System.out.println("Bitte geben Sie eine ganz Zahl ein.");
			}
			// die schleife soll weiter laufen wenn zahl == null ist
		} while (zahl == null);

		// R�ckgabewert: zahl
		return zahl;
	}
}
