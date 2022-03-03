package hangmanSpiel;

import java.util.Random;
import java.util.Scanner;

public class Hangman_Spiel {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] woerter = { "Reisen", "Auto", "Versuche", "Hund", "Katze", "Ziege", "Pool", "Elefant", "Kinderwagen",
				"Schwimmbad" };

		Random zufall = new Random();

		int zufallsIndex = zufall.nextInt(woerter.length);

		String zufallsWort = woerter[zufallsIndex];

		System.out.println("Hangman_Spiel, das spiel beginnt.");
		System.out.println();
		System.out.println("Viel Glück");
		System.out.println();

		for (int i = 0; i < woerter.length; i++) {
			System.out.print(" _ ");
		}

		int versuche = 10;
		do {

			laufeUeberJedenBuchstaben(zufallsWort, woerter, ' ');
			
			aktuellenStandAusgeben(woerter);

		} while (versuche != 0);

		System.out.println("Leider verloren");
	}

	public static void laufeUeberJedenBuchstaben(String zufallsWort, String[] loesung, char buchstabe) {

		loesung = new String[zufallsWort.length()];

		for (int i = 0; i < loesung.length; i++) {

			if (zufallsWort.charAt(i) == buchstabe) {
				loesung[i] = " _ ";

			}

		}

	}

	private static void aktuellenStandAusgeben(String[] loesung) {
		
		System.out.println();
		
		
	}

}
