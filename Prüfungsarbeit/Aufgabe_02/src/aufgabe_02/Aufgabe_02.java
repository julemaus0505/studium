package aufgabe_02;

import java.util.Scanner;

public class Aufgabe_02 {

	public static void main(String[] args) {

		// Variablen für Zahl1 und Zahl2 und die Anzahl der Durchläufe
		int zahl1;
		int zahl2;
		int anzahlDruchlaeufe = 0;

		// ein Objekt von Scanner erstellt für die Eingabe in der Console
		Scanner scanner = new Scanner(System.in);

		do {

			// Bitte geben Sie Zahl1 ein
			System.out.println("Bitte geben Sie die erste Zahl ein.");

			// einlesen der Eingabe vom Anwender von Zahl1
			zahl1 = (int) einlesenZahlen(scanner);

			// Bitte geben Sie Zahl2 ein
			System.out.println("Bitte geben Sie zweite Zahl ein.");

			// einlesen der Eingabe vom Anwender von Zahl2
			zahl2 = (int) einlesenZahlen(scanner);

			// Sind Zahl1 und Zahl2 gleich soll die Eingabe wiederholt werden
		} while (zahl1 == zahl2);

		// wenn Zahl1 kleiner als Zahl2 geht es in die for Schleife
		if (zahl1 < zahl2) {

			// ist die Zahl1 kleiner als Zahl2 dann zähle die Durchläufe
			for (int i = zahl1; i <= zahl2; i++) {
				anzahlDruchlaeufe++;

			}
			// Ausgabe wieviele Durchläufe gebaucht worden sind von Zahl1 bis Zahl2
			System.out.println("Anzahl der Durchläufe der ermittelt wurde " + anzahlDruchlaeufe);

		} else {
			// ist die Zahl1 kleiner als Zahl2 dann zähle die Durchläufe
			for (int i = zahl2; i <= zahl1; i++) {
				anzahlDruchlaeufe++;

			}
			// Ausgabe wieviele Durchläufe gebaucht worden sind von Zahl2 bis Zahl1
			System.out.println("Anzahl der Durchläufe der ermittelt wurde " + anzahlDruchlaeufe);
		}
	}

	private static double einlesenZahlen(Scanner scanner) {
		// Variable für Rückgabewert
		Integer zahl = null;
		do {
			try {
				// das Einlesen
				String wert = scanner.nextLine();
				zahl = Integer.parseInt(wert);

				// NumberFormatException fängt den Fehler ab wenn keine Zahl eingeben wurde
			} catch (NumberFormatException exception) {
				System.out.println("Bitte geben Sie eine ganz Zahl ein.");
			}
			// die schleife soll weiter laufen wenn zahl == null ist
		} while (zahl == null);

		// Rückgabewert: zahl
		return zahl;
	}
}
