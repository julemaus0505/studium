package java07c_01_05;

/*###############################
/* Private Klassenmethode
 * und Klassenvariable
 * Das Listing lässt sich nicht
 * übersetzen
 ################################*/

//die selbst erstellte Klasse
class Quadrat {
	//eine private Klassenvariable
	public static int ergebnis;

	//eine private Klassenmethode
	public static int berechnen(int wert) {
		ergebnis = wert * wert;
		return ergebnis;
	}
}
public class Java07c_01_05 {
	public static void main(String[] args) {
		//der Aufruf der Klassenmethode
		System.out.println("Das Quadrat von 4 ist " + Quadrat.berechnen(4));
		System.out.println("Das Ergebnis der Rechnung ist " + Quadrat.ergebnis);
	}
}
