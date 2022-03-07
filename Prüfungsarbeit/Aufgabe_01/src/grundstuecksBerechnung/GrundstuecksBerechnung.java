package grundstuecksBerechnung;

import java.util.Scanner;

public class GrundstuecksBerechnung {

	// Konstanten
	static final int MEHRWERTSTEUER = 19;
	static final int PROVISION = 5;

	public static void main(String[] args) {

		// ein Objekt von Scanner erstellt f�r die Eingabe in der Console
		Scanner scanner = new Scanner(System.in);

		// Ausgabe in der Console: Bitte geben Sie die L�nge ein
		System.out.println("Bitte geben sie die L�nge in Meter ein:");

		// Eingabe der L�nge in die Console
		double laenge = einlesenZahlen(scanner);

		// Ausgabe in der Console: Bitte geben sie die Breite ein
		System.out.println("Bitte geben Sie die Breite in Meter ein:");

		// Eingabe der Breite in die Console
		double breite = einlesenZahlen(scanner);

		// Berechnung der Quadratmeter vom Grundst�ck
		double quadratmeter = laenge * breite;

		// Ausgabe in der Console: Bitte geben die den Preis
		System.out.println("Bitte geben Sie den Preis pro Quadratmeter ein:");

		// Eingabe vom Preis Pro Quadratmeter
		double preisProQuadratmeter = einlesenZahlen(scanner);

		// Berechnung Grundst�ckspreis
		double preisGrundstueck = quadratmeter * preisProQuadratmeter;

		// Ausgabe in der Console: Was das Grundst�ck kostet
		System.out.println("Das Grundst�ck kostet " + preisGrundstueck + " Euro.");

		// Berechnung Grundst�ckspreis plus 5% Provision
		preisGrundstueck += preisGrundstueck / 100 * PROVISION;

		// Ausgabe in der Console: Was das Grunst�ck mit 5% Provision kostet
		System.out.println("Der Preis f�r das Grundst�ck mit Provision betr�gt " + preisGrundstueck + " Euro.");

		// Berechnung Grundst�ckspreis plus 19% Mehrwertsteuer
		preisGrundstueck += preisGrundstueck / 100 * MEHRWERTSTEUER;

		// Ausgabe in der Console: Was das Grunst�ck mit 19% Mehrwertsteuer kostet
		System.out.println(
				"Der Preis f�r das Grundst�ck mit Mehrwertsteuer und Provision betr�gt " + preisGrundstueck + " Euro.");
	}

	private static double einlesenZahlen(Scanner scanner) {
		
		// Variable f�r R�ckgabewert
		Double zahl = null;
		do {
			try {
				// das Einlesen
				String wert = scanner.nextLine();
				zahl = Double.parseDouble(wert.replace(',', '.'));

				// Die NumberFormatException f�ngt den Fehler auf wenn keine Zahl eingegeben wurde
			} catch (NumberFormatException exception) {
				System.out.println("Bitte eine Zahl eingeben.");
			}

			// die schleife soll weiter laufen wenn zahl == null ist
		} while (zahl == null);

		// R�ckgabewert: zahl
		return zahl;
	}

}
