package grundstuecksBerechnung;

import java.util.Scanner;

public class GrundstuecksBerechnung {

	// Konstanten
	static final int MEHRWERTSTEUER = 19;
	static final int PROVISION = 5;

	public static void main(String[] args) {

		// ein Objekt von Scanner erstellt
		Scanner scanner = new Scanner(System.in);
		
		// Bitte geben Sie die L�nge ein
		System.out.println("Bitte geben sie die L�nge ein.");

		// Eingabe der L�nge in die Console
		double laenge = scanner.nextDouble();

		// Bitte geben sie die Breite ein
		System.out.println("Bitte geben Sie die Breite ein.");

		// Eingabe der Breite in die Console
		double breite = scanner.nextDouble();

		// Berechnung der Quadratmeter vom Grundst�ck
		double quadratmeter = laenge * breite;

		// Bitte geben die den Preis 
		System.out.println("Bitte geben Sie den Preis pro Quadratmeter ein.");

		// Eingabe vom Preis Pro Quadratmeter
		double preisProQuadratmeter = scanner.nextDouble();

		// Berechnung Grundst�ckspreis
		double preisGrundstueck = quadratmeter * preisProQuadratmeter;

		// Ausgabe in der Console was das Grundst�ck kostet
		System.out.println("Das Grundst�ck kostet " + preisGrundstueck + " Euro.");

		// Berechnung Grundst�ckspreis plus 5% Provision
		preisGrundstueck += preisGrundstueck / 100 * PROVISION;

		// Ausgabe in der Console was das Grunst�ck mit 5% Provision kostet
		System.out.println(
				"Der Preis f�r das Grundst�ck mit Provision betr�gt " + preisGrundstueck + " Euro.");

		// Berechnung Grundst�ckspreis plus 19% Mehrwertsteuer
		preisGrundstueck += preisGrundstueck / 100 * MEHRWERTSTEUER;

		// Ausgabe in der Console was das Grunst�ck mit 19% Mehrwertsteuer kostet
		System.out.println("Der Preis f�r das Grundst�ck mit Mehrwertsteuer und Provision betr�gt "
				+ preisGrundstueck + " Euro.");
	}
}
