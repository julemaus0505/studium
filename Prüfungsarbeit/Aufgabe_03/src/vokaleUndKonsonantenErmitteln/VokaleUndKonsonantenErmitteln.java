package vokaleUndKonsonantenErmitteln;

import java.util.Scanner;

public class VokaleUndKonsonantenErmitteln {

	public static void main(String[] args) {

		// Variablen für r Vokale
		int vokale = 0;
		int konsonanten = 0;

		// ein Objekt von Scanner erstellt
		Scanner scanner = new Scanner(System.in);
		
		// Bitte geben Sie einen Text in der Console ein
		System.out.println("Bitte geben sie einen Text ein.");

		// Text wird vom Anwender in die Console eingegeben 
		String text = scanner.nextLine();

		// der Text in Kleinbuchstaben umwandeln
		text = text.toLowerCase();

		// zählen wieviel Vokale und wieviel Konsonanten
		for (int i = 0; i < text.length(); i++) {
			switch (text.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				++vokale;
				break;

			default:
				++konsonanten;
				break;
			}

		}

		// Ausgabe auf der Console wieviel Vokale und wieviel Konsonanten
		System.out.println("Anzahl der Vokale: " + vokale);
		System.out.println("Anzahl der Konsonaten: " + konsonanten);
	}
}
