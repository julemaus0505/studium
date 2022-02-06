package text2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Text2 {

	// der Konstruktor
	public Text2() {

		datenSchreiben();
		datenLesen();

	}

	// die Mehtode zum Lesen
	private void datenLesen() {

		// gelesen wird als int!!
		int zeichen = 0;

		// eine Instanz der Klasse FileRedader mit der Datei daten.txt
		try (FileReader datei = new FileReader("daten.txt")) {

			// solange das Ende der Datei nicht erreicht ist, werden die Zeichen einzln
			// gelesen
			// und auf der Konsole ausgegeben
			zeichen = datei.read();

			while (zeichen != -1) {
				// zeichen wird in den Typ char umgewandelt
				System.out.println((char) zeichen);
				zeichen = datei.read();
			}

		} catch (Exception e) {
			System.out.println("Beim Laden ist ein Problem aufgetreten");
		}
	}

	// die Methode zum Schreiben
	private void datenSchreiben() {

		// eine Instanz der Klasse FileWriter der Datei daten.txt
		try (FileWriter datei = new FileWriter("daten.txt")) {

			// geöffnet wird
			// die Zeichenkette wird direkt in die Datei geschrieben
			datei.write("Das ist ein Test für die direkte Verarbeitung.");
		
		} catch (IOException e) {
			System.out.println("Beim Schreiben ist ein Problem aufgetreten");
		}
	}
}
