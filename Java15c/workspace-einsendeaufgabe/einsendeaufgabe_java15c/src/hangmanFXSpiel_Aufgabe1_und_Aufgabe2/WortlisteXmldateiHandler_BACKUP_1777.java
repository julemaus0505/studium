package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

<<<<<<< HEAD
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
=======
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
>>>>>>> bdd90de5cc9a645c5d0e7f6c4cd2391b615e4490
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collection;
=======
>>>>>>> bdd90de5cc9a645c5d0e7f6c4cd2391b615e4490
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

<<<<<<< HEAD
import javax.swing.JOptionPane;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.OutputKeys;

import javafx.scene.control.TextArea;

public class WortlisteXmldateiHandler {

	/**
	 * Liest die Wörter aus der Xmldatei
	 * @return Liste der Wörter
	 * @throws IOException wird geworfen, wenn die Datei nicht zum lesen geöffnet werden kann.
	 * @throws XMLStreamException wird geworfen wenn die Struktur nicht richtig ist.
	 */
	static List<String> leseWoerterAusXml() throws IOException, XMLStreamException {

		List<String> woerter = new ArrayList<>();
		
		// für die Ereignisse
		int ereignis;

		// zum Lesen der XML-Datei
		// für den Stream
		InputStream eingabeStream;

		// die "Fabrik"
		XMLInputFactory xmlInput;

		// für den Parser
		XMLStreamReader xmlParserIn;

		// zur Zwischenspeicherung der Zeichenkette für den
		// Namen eines Tags
		String tagName = null;

		// die Ausnahmebehandlung ist zwingend erforderlich
		// try {
		// einen Eingabestream für die Datei erzeugen
		// die Datei muss im Projektordner liegen
		eingabeStream = new FileInputStream("wortliste.xml");

		// eine neue Instanz für die Factory
		xmlInput = XMLInputFactory.newInstance();
		
		// für den Parser einen StreamReader erzeugen
		xmlParserIn = xmlInput.createXMLStreamReader(eingabeStream);
		
		// solange es noch weitere Elemente gibt
		while(xmlParserIn.hasNext()) {
			
			// das nächste Ereignis holen und verarbeiten
			ereignis = xmlParserIn.next();
			
			switch(ereignis) {
			
			// das Ende
			case XMLStreamConstants.END_DOCUMENT:
				
				// schließen
				xmlParserIn.close();
				break;
			
				// der Start eines Elements
			case XMLStreamConstants.START_ELEMENT:
				
				// den Namen lesen und ablegen
				tagName = xmlParserIn.getLocalName();
				break;
				
				// die Zeichen
			case XMLStreamConstants.CHARACTERS:
				
				if("wort".equals(tagName)) {
					woerter.add(xmlParserIn.getText());
				}
				break;
			}
		}
		return woerter;
=======
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
>>>>>>> bdd90de5cc9a645c5d0e7f6c4cd2391b615e4490
	}

	/*
	 * Überschreibt die Wortliste-Datei mit den neuen Wörtern woerter enthält die
	 * neuen Wörter IOException wird geworfen, wenn die Datei nicht zum Schreiben
	 * geöffnet werden kann
	 */
<<<<<<< HEAD
	static void xmlDateiUeberschreiben(String woerter) throws IOException, XMLStreamException {

		// zum Schreiben der XML-Datei für den Stream
		OutputStream ausgabeStream;

		// die "Fabrik"
		XMLOutputFactory xmlOutput;

		// für den "Schreiber"
		XMLStreamWriter xmlWriter;

		// einen Ausgabestream für die Datei erzeugen
		ausgabeStream = new FileOutputStream("wortliste.xml");

		// eine neue Instanz für die Factory
		xmlOutput = XMLOutputFactory.newInstance();

		// für den "Schreiber" einen Stream-Writer erzeugen
		// hier wird explizit UTF-8 gesetzt als Format
		xmlWriter = xmlOutput.createXMLStreamWriter(ausgabeStream, "UTF-8");

		// der XML-Prolog wird erzeugt
		xmlWriter.writeStartDocument("UTF-8", "1.0");

		// das Start-Tag für wortliste
		xmlWriter.writeStartElement("wortliste");

		StringTokenizer tokenizer = new StringTokenizer(woerter);

		// Anzahl der Wörter merken
		int anzahlWoerter = tokenizer.countTokens();

		while (tokenizer.hasMoreTokens()) {

			// das Start-Tag für wort
			xmlWriter.writeStartElement("wort");

			// den Text des Elements schreiben
			xmlWriter.writeCharacters(tokenizer.nextToken());

			// das Ende-Tag für das Element wort
			xmlWriter.writeEndElement();
		}

		// das Start-Tag für Anzahl Wörter
		xmlWriter.writeStartElement("anzahlWoerter");

		// den Text des Elements schreiben
		xmlWriter.writeCharacters(Integer.toString(anzahlWoerter));

		// das Ende-Tag für Anzahl Wörter
		xmlWriter.writeEndElement();

		// das Ende-Tag für Wortliste
		xmlWriter.writeEndElement();

		xmlWriter.writeEndDocument();

		// den "Schreiber" schließen
		xmlWriter.close();

		// und den Stream
		ausgabeStream.close();

	}

	// Eränzt die XML Wortliste-Datei mit den neuen Wörtern
	static void xmlDateiErgaenzen(int anzahlWoerterTextArea, String woerter)
			throws FileNotFoundException, IOException, XMLStreamException {

		// 1. Anzahl der XML Wörter aus der Datei holen und merken
		//int anzahlWoerterDatei = leseWoerterAusXml.size();
=======
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
>>>>>>> bdd90de5cc9a645c5d0e7f6c4cd2391b615e4490

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
<<<<<<< HEAD
		//int summeWoerter = anzahlWoerterDatei + anzahlWoerterTextArea;
		//schreibeSummeInXmlDatei(summeWoerter);
=======
		int summeWoerter = anzahlWoerterDatei + anzahlWoerterTextArea;
		schreibeSummeInXmlDatei(summeWoerter);
>>>>>>> bdd90de5cc9a645c5d0e7f6c4cd2391b615e4490
	}

	private static void schreibeSummeInXmlDatei(int summeWoerter) throws FileNotFoundException, IOException {
		try (RandomAccessFile datei = new RandomAccessFile("wortliste.txt", "rw")) {
			datei.seek(datei.length());

			// in die Xml Datei schreiebn
			datei.writeBytes("Anzahl Wörter: " + summeWoerter + "\n");
		}
	}

<<<<<<< HEAD
	// zum Schreiben der XML-Datei für den Stream
	private static void schreibeWoerterInXmlDatei(String woerter) throws IOException, XMLStreamException {

		// zum Schreiben der XML-Datei für den Stream
		OutputStream ausgabeStream;

		// die "Fabrik"
		XMLOutputFactory xmlOutput;

		// für den "Schreiber"
		XMLStreamWriter xmlWriter;

		// einen Ausgabestream für die Datei erzeugen
		ausgabeStream = new FileOutputStream("wortliste.xml");

		// eine neue Instanz für die Factory
		xmlOutput = XMLOutputFactory.newInstance();

		// für den "Schreiber" einen Stream-Writer erzeugen
		// hier wird explizit UTF-8 gesetzt als Format
		xmlWriter = xmlOutput.createXMLStreamWriter(ausgabeStream, "UTF-8");

		// der XML-Prolog wird erzeugt
		xmlWriter.writeStartDocument("UTF-8", "1.0");

		// das Start-Tag für wortliste
		xmlWriter.writeStartElement("wortliste");

		StringTokenizer tokenizer = new StringTokenizer(woerter);

		// Anzahl der Wörter merken
		int anzahlWoerter = tokenizer.countTokens();

		while (tokenizer.hasMoreTokens()) {

			// das Start-Tag für wort
			xmlWriter.writeStartElement("wort");

			// den Text des Elements schreiben
			xmlWriter.writeCharacters(tokenizer.nextToken());

			// das Ende-Tag für das Element wort
			xmlWriter.writeEndElement();
		}

		// das Start-Tag für Anzahl Wörter
		xmlWriter.writeStartElement("anzahlWoerter");

		// den Text des Elements schreiben
		xmlWriter.writeCharacters(Integer.toString(anzahlWoerter));

		// das Ende-Tag für Anzahl Wörter
		xmlWriter.writeEndElement();

		// das Ende-Tag für Wortliste
		xmlWriter.writeEndElement();

		xmlWriter.writeEndDocument();

		// den "Schreiber" schließen
		xmlWriter.close();

		// und den Stream
		ausgabeStream.close();

=======
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

>>>>>>> bdd90de5cc9a645c5d0e7f6c4cd2391b615e4490
	}
}
