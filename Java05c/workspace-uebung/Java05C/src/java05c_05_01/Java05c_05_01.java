/*##########################################
 * Eine verkettete Liste Version 1
############################################ */
package java05c_05_01;

//die Klasse für die Listenelemente
//Sie enthält nur Instanzvariablen für die Daten und den
//Nachfolger, aber keine Methoden
class Listenelement {
		String daten;
		Listenelement naechster;
}

public class Java05c_05_01 {
	//Klassenmethoden für die Verarbeitung der Liste

	//die Daten für ein Element setzen
	//übergeben wird die Zeichenkette und das Element der Liste
	static void setDaten(String datenNeu, Listenelement element) {
		
		//die Zeichenkette setzen
		element.daten = datenNeu;
		
		//das Ende markieren
		element.naechster = null;
	}

	//ein neues Element am Ende der Liste einfügen
	//übergeben wird die Zeichenkette und der Listenanfang
	//das eigentliche Einfügen erfolgt über die Methode setDaten()
	static void listeAnhaengen(String datenNeu, Listenelement listenAnfang) {
		
		//eine Hilfskonstruktion zum Wandern in der Liste
		Listenelement hilfsKonstruktion;
		hilfsKonstruktion = listenAnfang;
		
		//durch die Liste gehen, bis das Ende erreicht ist
		while (hilfsKonstruktion.naechster != null)
			hilfsKonstruktion = hilfsKonstruktion.naechster;

		//neues Element am Ende der Liste einfügen
		hilfsKonstruktion.naechster = new Listenelement();

		//Hilfskonstruktion auf das neue Element setzen
		hilfsKonstruktion = hilfsKonstruktion.naechster;

		//die Daten eintragen
		setDaten(datenNeu, hilfsKonstruktion);
	}

	//die Ausgabe der kompletten Liste
	static void listeAusgeben(Listenelement listenAnfang) {
		
		//die Hilfskonstruktion
		Listenelement hilfsKonstruktion;
		hilfsKonstruktion = listenAnfang;
		
		//erstes Element ausgeben
		System.out.println(hilfsKonstruktion.daten);

		//und nun den Rest
		while (hilfsKonstruktion.naechster != null) {
			hilfsKonstruktion = hilfsKonstruktion.naechster;
			System.out.println(hilfsKonstruktion.daten);
		}
	}

	public static void main(String[] args) {
		//ein neues Listenelement erzeugen
		Listenelement listenAnfang = new Listenelement();

		//die Daten im ersten Listenelement setzen
		setDaten("Element 1", listenAnfang);

		//weitere Elemente in einer Schleife einfügen
		for (int element = 2; element < 4; element++)
			listeAnhaengen("Element " + element, listenAnfang);

		//die Liste ausgeben
		listeAusgeben(listenAnfang);
	}
}

