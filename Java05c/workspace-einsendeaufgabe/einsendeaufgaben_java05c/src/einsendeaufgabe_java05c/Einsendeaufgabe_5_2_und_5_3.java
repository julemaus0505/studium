/*######################################
* Einsendeaufgabe 5.2
 ######################################*/
package einsendeaufgabe_java05c;

//die Klasse für die Listenelemente
//jetzt auch mit Methoden
class Listenelement {
	String daten;
	Listenelement naechster;

	// die Methode zum Setzen der Daten
	void setDaten(String datenNeu) {
		// die Zeichenkette setzen
		daten = datenNeu;
		// das Ende markieren
		naechster = null;
	}

	// die Methode zum Anhängen eines neuen Elements
	// sie ruft sich rekursiv auf, bis das Ende erreicht ist
	Listenelement anhaengen(String datenNeu) {
		// wenn das Ende erreicht ist, ein neues Element erzeugen
		if (naechster == null) {
			naechster = new Listenelement();
			naechster.setDaten(datenNeu);
		}
		return naechster;
	}

	// die Methode zur Ausgabe der Liste
	// sie ruft sich ebenfalls rekursiv auf, bis das Ende erreicht ist
	void ausgeben() {
		System.out.println(daten);
		if (naechster != null)
			naechster.ausgeben(); // rekursiv
	}

	/*
	 * ###################################### 
	 * Einsendeaufgabe 5.3
	 * ######################################
	 */

	void ausgabeRueckwaerts() {
		if (naechster != null) {
			naechster.ausgabeRueckwaerts();
		}

		System.out.println(daten);
	}
}

public class Einsendeaufgabe_5_2_und_5_3 {
	public static void main(String[] args) {
		// ein neues Listenelement erzeugen
		Listenelement listenAnfang = new Listenelement();

		// die Daten im ersten Listenelement setzen
		listenAnfang.setDaten("Element 1");

		Listenelement listenende = listenAnfang;
		// weitere Elemente in einer Schleife einfügen
		for (int element = 2; element <= 27; element++) {
			listenende = listenende.anhaengen("Element " + element);
		}
		// listenAnfang.anhaengen("Element 4");

		// die Liste ausgeben
		listenAnfang.ausgeben();
		System.out.println();
		listenAnfang.ausgabeRueckwaerts();
	}
}
