/*######################################
 * Eine verkettete Liste Version 2
 ######################################*/
package java05c_05_02;

//die Klasse für die Listenelemente
//jetzt auch mit Methoden
class Listenelement {
		String daten, hilfeKonstruktion;
		Listenelement naechster;
		

		//die Methode zum Setzen der Daten
		void setDaten(String datenNeu) {
			
			//die Zeichenkette setzen
			daten = datenNeu;
			
			//das Ende markieren
			naechster = null;
		}

		//die Methode zum Anhängen eines neuen Elements
		//sie ruft sich rekursiv auf, bis das Ende erreicht ist
		void anhaengen(String datenNeu) {
			
			//wenn das Ende erreicht ist, ein neues Element erzeugen
			if (naechster == null) {
				naechster = new Listenelement();
				naechster.setDaten(datenNeu);
			}
			//sonst ruft sich die Methode selbst wieder auf
			else
				naechster.anhaengen(datenNeu);
			//nur zur Veranschaulichung
			System.out.println("Daten " + datenNeu + " wurden eingefügt.");
		}

		//die Methode zur Ausgabe der Liste
		//sie ruft sich ebenfalls rekursiv auf, bis das Ende erreicht ist
		void ausgeben() {
			// die Hilfkonstuktion
			Listenelement hilfeKonstruktion;
			
			// Hilfkonstuktion auf das eigene Objekt setzen
			hilfeKonstruktion = this;
			
			// die Daten ausgeben
			System.out.println(hilfeKonstruktion.daten);
			
			// und den Rest in einer Schleife ausgeben 
			while (hilfeKonstruktion.naechster != null) {
				hilfeKonstruktion = hilfeKonstruktion.naechster;
				System.out.println(hilfeKonstruktion.daten);
			}
		}
	}

public class Java05c_05_02 {
	public static void main(String[] args) {
		//ein neues Listenelement erzeugen
		Listenelement listenAnfang = new Listenelement();

		//die Daten im ersten Listenelement setzen
		listenAnfang.setDaten("Element 1");

		//weitere Elemente in einer Schleife einfügen
		for (int element = 2; element < 4; element++)
			listenAnfang.anhaengen("Element " + element);

		//die Liste ausgeben
		listenAnfang.ausgeben();
	}
}
