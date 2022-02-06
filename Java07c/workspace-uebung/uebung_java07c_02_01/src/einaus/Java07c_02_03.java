package einaus;

/*############################
Der Zugriff auf eine Klasse
in einem eigenen Paket
#############################*/

import einaus.EinAus;
import einaus.EinAusVersion2;

public class Java07c_02_03 {

	public static void main(String[] args) {
		// eine Instanz für EinAus erstellen
		
		EinAus ersterversuch = new EinAus();
		EinAusVersion2 zweiterversuch = new EinAusVersion2();
		// der Aufruf der beiden Methoden
		
		ersterversuch.einlesen();
		ersterversuch.aufgeben();
		zweiterversuch.einlesen();
		zweiterversuch.ausgeben();
		System.exit(0);
		
		

	}

}
