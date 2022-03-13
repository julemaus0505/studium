package hangmanSpiel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman_Spiel {

	public static void main(String[] args) {

		// Objekt zum Einlesen der Benutzereingaben
		Scanner scanner = new Scanner(System.in);

		// Array f�r die W�rter
		String[] woerter = { "Reisen", "Auto", "Versuche", "Hund", "Katze", "Ziege", "Pool", "Elefant", "Kinderwagen",
				"Schwimmbad" };

		// Objekt zum Erzeugen von Zuhallszahlen
		Random zufall = new Random();

		// zuf�lligen index ermitteln
		int zufallsIndex = zufall.nextInt(woerter.length);

		// zufalls Wort ermitteln
		String zufallsWort = woerter[zufallsIndex];

		// Array zum Speichern des Spielzustandes
		char[] spielzustand = new char[zufallsWort.length()];

		// den Anfangszustand herstellen
		for (int i = 0; i < spielzustand.length; i++) {
			spielzustand[i] = '_';

		}

		// Versuche von Spielbeginn
		int versuche = 10;

		System.out.println("Hangman_Spiel, das Spiel beginnt.");
		System.out.println();
		System.out.println("Viel Gl�ck");
		System.out.println();

		ausgebenDesSpielzustandes(spielzustand);

		// hilfsvariable ob Wort gel�st wurde
		boolean zufallsWortGeloest = false;

		// laufe solange bis Versuche 0 ist
		while (versuche != 0 && zufallsWortGeloest == false) {

			System.out.println("Anzahl der Versuche: " + versuche);
			System.out.println("Bitte geben Sie einen Buchstaben ein:");

			// Eingabe von Console lesen
			String eingabe = scanner.nextLine();

			// f�r den eingegebenden Buchstaben vom Anwender
			char buchstabe = eingabe.charAt(0);

			boolean buchstabeGefunden = false;

			// Spielzusatand �ndern
			for (int i = 0; i < spielzustand.length; i++) {

				if (Character.toLowerCase(zufallsWort.charAt(i)) == Character.toLowerCase(buchstabe)) {
					spielzustand[i] = zufallsWort.charAt(i);
					buchstabeGefunden = true;
				}

			}

			// wenn Buchstabe nicht gefunden, dann 1 Versuch abziehen
			if (buchstabeGefunden == false) {
				versuche--;
			} else if (!Arrays.toString(spielzustand).contains("_")) {
				zufallsWortGeloest = true;
			}
			ausgebenDesSpielzustandes(spielzustand);

		}
		//Den Scanner schlie�en
		scanner.close();
		
		if (zufallsWortGeloest == false ) {
			System.out.println("Leider verloren....");
			
		} else {
			System.out.println("Sie haben gewonnen....");
		}
		
	}

	// Spielzustand in der Console ausgeben
	private static void ausgebenDesSpielzustandes(char[] spielzustand) {

		for (char zeichen : spielzustand) {

			System.out.print(zeichen);
			System.out.print(' ');
		}
		System.out.println("\n");

	}

}
