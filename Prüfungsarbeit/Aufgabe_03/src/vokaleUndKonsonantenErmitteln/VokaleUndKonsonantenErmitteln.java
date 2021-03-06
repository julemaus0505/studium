package vokaleUndKonsonantenErmitteln;

import java.util.Scanner;

public class VokaleUndKonsonantenErmitteln {

	public static void main(String[] args) {

		// Variablen f?r r Vokale
		int vokale = 0;
		int konsonanten = 0;

		// ein Objekt von Scanner erstellt
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben sie einen Text ein.");

		// Text wird vom Anwender in die Console eingegeben 
		String text = scanner.nextLine();

		//Den Scanner schlie?en
		scanner.close();
		
		// der Text in Kleinbuchstaben umwandeln
		text = text.toLowerCase();

		// z?hlen wieviel Vokale und wieviel Konsonanten
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

		System.out.println("Anzahl der Vokale: " + vokale);
		System.out.println("Anzahl der Konsonanten: " + konsonanten);
	}
}
