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

public class WortlisteXmldateiHandler {

	static List<String> leseWoerterAusXml() throws IOException {

		// Datei Zeilenweise aus der Xml Datei lesen
		List<String> woerterXml = Files.readAllLines(Paths.get("wortliste.xml"), StandardCharsets.ISO_8859_1);

		// Letzte Zeile, wegen Anzah der Wörter aus Xml Datei überspringen
		woerterXml.remove(woerterXml.size() - 1);

		// Aus einer Liste einen String machen
		String dateiInhalt = woerterXml.stream().collect(Collectors.joining(" "));

		woerterXml.clear();

		// die Wörter wieder in eine Liste packen
		StringTokenizer tokenizer = new StringTokenizer(dateiInhalt);

		while (tokenizer.hasMoreTokens()) {
			woerterXml.add(tokenizer.nextToken());
		}

		return woerterXml;
	}

	/*
	 * Überschreibt die Wortliste-Datei mit den neuen Wörtern woerter enthält die
	 * neuen Wörter IOException wird geworfen, wenn die Datei nicht zum Schreiben
	 * geöffnet werden kann
	 */
	static void xmlDateiUeberschreiben(String woerter) throws IOException {

		// geöffnet wird die Xml Datei wortliste.xml im Lese- und Schreibmodus
		try (FileWriter datei = new FileWriter("wortliste.xml", StandardCharsets.ISO_8859_1, false)) {

			// einen StringTokenizer erstellt, und die Wörter in die Variable tokenzizer
			// gespeichert
			StringTokenizer tokenzizer = new StringTokenizer("\n" + woerter + " " + "\n");

			// Wörter in eine Xml Datei schreiben
			datei.write(woerter + "\n");

			// Anzahl der Wörter in eine Xml Datei schreiben
			datei.write("Anzahl Wörter: " + tokenzizer.countTokens() + "\n");
		}
	}

	// Eränzt die XML Wortliste-Datei mit den neuen Wörtern
	static void xmlDateiErgaenzen(int anzahlWoerterTextArea, String woerter) throws FileNotFoundException, IOException {
		
		// 1. Anzahl der XML Wörter aus der Datei holen und merken
		int anzahlWoerterDatei = leseWoerterAusXml().size();

		try (RandomAccessFile datei = new RandomAccessFile("wortliste.xml", "rw")) {
			// Variable b erstellt
			byte b;

			// Variable length erstellt, und die Dateilänge -1 in die Variable length
			// gespeichert
			long length = datei.length() - 1;

			do {
				length -= 1;

				// ans Ende der xml Datei gehen
				datei.seek(length);

				// Datei in byte lesen, und in der Variable b speichern
				b = datei.readByte();

			} while (b != 10); // solange kein Zeilenumbruch gelesen

			datei.setLength(length + 1);

		}
		// 3. Neue Wörter in eine Xml Datei schreiben
		schreibeWoerterInXmlDatei(woerter);

		// 4. Wörter aus der TextArea in die Xml Datei schreiben
		int summeWoerter = anzahlWoerterDatei + anzahlWoerterTextArea;
		schreibeSummeInXmlDatei(summeWoerter);
	}

	private static void schreibeSummeInXmlDatei(int summeWoerter) throws FileNotFoundException, IOException {
		try (RandomAccessFile datei = new RandomAccessFile("wortliste.txt", "rw")) {
			datei.seek(datei.length());

			// in die Xml Datei schreiebn
			datei.writeBytes("Anzahl Wörter: " + summeWoerter + "\n");
		}
	}

	private static void schreibeWoerterInXmlDatei(String woerter) throws IOException {
		try (RandomAccessFile datei = new RandomAccessFile("wortliste.txt", "rw")) {

			// zum Ende der Xml Datei gehen
			datei.seek(datei.length());

			// ein StringTokenizer mit der Variable tokenizer erstellt und die Variable mit
			// den Werten aus der JTextArea gefüllt
			StringTokenizer tokenizer = new StringTokenizer(woerter);

			// Anzahl der Xml Wörter löschen
			while (tokenizer.hasMoreTokens()) {
				String zuSchreibenedeZeile = tokenizer.nextToken() + "\n";
				datei.writeBytes(zuSchreibenedeZeile);
			}
		}

	}
}
