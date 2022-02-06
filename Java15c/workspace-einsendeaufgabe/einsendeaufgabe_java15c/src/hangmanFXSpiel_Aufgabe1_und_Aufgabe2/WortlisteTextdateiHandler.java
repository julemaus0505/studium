package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Die Klasse stellt Methoden zur Verfügung um die Wortliste 
 * aus einer Textdatei zu lesen, zu ergänzen oder zu überschreiben
 */
class WortlisteTextdateiHandler {

	/**
	 * Liest die Wörter aus der Textdatei
	 * @return Liste der Wörter
	 * @throws IOException wird geworfen, wenn die Datei nicht zum Lesen geöffnet werden kann
	 */
	static List<String> leseWoerterAusDatei() throws IOException {

		// Datei Zeilenweise lesen
		List<String> woerterText = Files.readAllLines(Paths.get("wortliste.txt"), StandardCharsets.ISO_8859_1);

		// Letzte Zeile, wegen Anzahl der Wörter überspringen
		woerterText.remove(woerterText.size() - 1);

		// Aus einer Liste einen String machen
		String dateiInhalt = woerterText.stream().collect(Collectors.joining(" "));

		woerterText.clear();

		// die Wörter wieder eine Liste packen
		StringTokenizer tokenizer = new StringTokenizer(dateiInhalt);

		while (tokenizer.hasMoreTokens()) {
			woerterText.add(tokenizer.nextToken());
		}

		return woerterText;
	}

	/**
	 * Überschreibt die Wortliste-Datei mit den neuen Wörtern
	 * @param woerter enthält die neuen Wörter
	 * @throws IOException wird geworfen, wenn die Datei nicht zum Schreiben geöffnet werden kann
	 */
	static void textDateiUeberschreiben(String woerter) throws IOException {

		// geöffnet wird die Datei wortliste.txt im Lese- und Schreibmodus
		try (FileWriter datei = new FileWriter("wortliste.txt", StandardCharsets.ISO_8859_1, false)) {

			// einen StringTokenizer erstellt, und die Wörter ind die Variable tokenzizer
			// gespeichert
			StringTokenizer tokenzizer = new StringTokenizer("\n" + woerter + " " + "\n");

			// Wörter in Datei schreiben
			datei.write(woerter + "\n");

			// Anzahl der Wörter in Datei schreiben
			datei.write("Anzahl Wörter: " + tokenzizer.countTokens() + "\n");
		}
	}

	/**
	 * Eränzt die Wortliste-Datei mit den neuen Wörtern
	 * 
	 * @param anzahlWoerterTextArea Anzahl der neuen Wörter (aus der TextArea)
	 * @param woerter enthält die neuen Wörter
	 * @throws FileNotFoundException wird geworfen, wenn die Datei nicht gefunden wird
	 * @throws IOException wird geworfen wenn die Datei nicht zum Schreiben geöffnet werden kann
	 */
	static void textDateiErgaenzen(int anzahlWoerterTextArea, String woerter) throws FileNotFoundException, IOException {
		// 1. Anzahl der Wörter aus der Datei holen und merken
		int anzahlWoerterDatei = leseWoerterAusDatei().size();

		try (RandomAccessFile datei = new RandomAccessFile("wortliste.txt", "rw")) {
			// Variable b erstellt
			byte b;

			// Variable length erstellt, und die Dateilänge -1 in die Variable length
			// gespeichert
			long length = datei.length() -1;

			do {
				length -= 1;

				// ans Ende der Datei gehen
				datei.seek(length);

				// Datei in byte lesen, und in der Variable b speichern
				b = datei.readByte();

			} while (b != 10); // solange kein Zeilenumbruch gelesen

			datei.setLength(length + 1);

		}
		// 3. Neue Wörter in Datei schreiben
		schreibeWoerterInDatei(woerter);

		// 4. Wörter aus der TextArea in die Datei schreiben
		int summeWoerter = anzahlWoerterDatei + anzahlWoerterTextArea;
		schreibeSummeInDatei(summeWoerter);
	}

	// die Methode schreibe die Wörter in die Datei
	private static void schreibeWoerterInDatei(String woerter) throws FileNotFoundException, IOException {
		try (RandomAccessFile datei = new RandomAccessFile("wortliste.txt", "rw")) {

			// zum Ende der Datei gehen
			datei.seek(datei.length());

			// ein StringTokenizer mit der Variable tokenizer erstellt und die Variable mit
			// den Werten aus der JTextArea gefüllt
			StringTokenizer tokenizer = new StringTokenizer(woerter);

			// Anzahl der Wörter löschen
			while (tokenizer.hasMoreTokens()) {
				String zuSchreibenedeZeile = tokenizer.nextToken() + "\n";
				datei.writeBytes(zuSchreibenedeZeile);
			}
		}
	}

	// die Methode schreibe die Summe in die Datei
	private static void schreibeSummeInDatei(int summeWoerter) throws FileNotFoundException, IOException {
		
		try (RandomAccessFile datei = new RandomAccessFile("wortliste.txt", "rw")) {
			datei.seek(datei.length());
		
			// in die Datei schreiebn
			datei.writeBytes("Anzahl Wörter: " + summeWoerter + "\n");
		}
	}
}
