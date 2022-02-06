package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class WortlisteJaxbHandler {

	/**
	 * Liest die Wörter aus der Xmldatei
	 * @return Liste der Wörter
	 * @throws JAXBException 
	 * @throws IOException wird geworfen, wenn die Datei nicht zum lesen geöffnet werden kann.
	*/
	static List<String> leseWoerterAusXml() throws JAXBException {
		
		// Erzeugen vom JaxbContext um zwischen der Klasse Wortliste und der wortliste.xml zu wandeln.
		JAXBContext jaxbContext = JAXBContext.newInstance(Wortliste.class);
		
		// wandelt wortliste.xml in Klasse Wortliste
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		// Pfad zur Wortliste angeben
		Source source = new StreamSource(new File("wortliste.xml"));
		
		// Durchführen umwandel von xml in Klasse
		JAXBElement<Wortliste> wortliste = unmarshaller.unmarshal(source, Wortliste.class);
		
		// Prüfung falls Wandlung fehlgeschlagen
		if (wortliste != null) {
			return wortliste.getValue().getWoerter();
		}
		
		// Leere Liste zurückgeben
		return Collections.emptyList();
	}
	
	/*
	 * Überschreibt die Wortliste-Datei mit den neuen Wörtern woerter enthält die
	 * neuen Wörter IOException wird geworfen, wenn die Datei nicht zum Schreiben
	 * geöffnet werden kann
	 */
	
	static void xmlDateiUeberschreiben(String woerter) throws JAXBException {
		
		List<String> woerterList = new  ArrayList<String>();
		
		StringTokenizer tokenizer = new StringTokenizer(woerter);
		
		while(tokenizer.hasMoreTokens()) {
			woerterList.add(tokenizer.nextToken());
		}
		
		Wortliste wortliste = new Wortliste();
		wortliste.setAnzahlWoerter(woerterList.size());
		wortliste.setWoerter(woerterList);
		
		// Erzeugen vom JaxbContext um zwischen der Klasse Wortliste und der wortliste.xml zu wandeln.
		JAXBContext jaxbContext = JAXBContext.newInstance(Wortliste.class);
		
		// Mashaller erzeugen um Wortliste in xml zu wandeln.
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		// Ausgabe formatieren
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		
		// Durchführen umwandeln von Klasse in xml
		marshaller.marshal(wortliste, new File("wortliste.xml"));
	}
	
}
