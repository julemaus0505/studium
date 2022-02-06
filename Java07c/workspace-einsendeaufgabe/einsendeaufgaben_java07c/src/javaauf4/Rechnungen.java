package javaauf4;

/* ######################################################################
					Einsendeaufgabe Java07c Aufgabe 4
###################################################################### */

public class Rechnungen {

	/**
	 * Berechnung der QuadratWurzel, sie nimmt einen Double Wert auf,
	 * und berechnet über die Methode Math.sprt den Double Wert.
	 * @param wert dessen Wurzel berechnet werden soll.
	 * @return Ergebnis der Rechnung.
	 */
	public static double wurzel(double wert) {
		return Math.sqrt(wert);
	}

	/**
	 * Bei der Methode Quadrat erwartet man ein Int zurück, man erkennt es an den
	 * Parameter(int wert).
	 * Der wert wird wert * wert berechnet und über return zurückgegeben.
	 * @param wert dessen Quadrat berechnet werden soll.
	 * @return Ergebnis der Rechnung.
	 */
	public static int quadrat(int wert) {
		return wert * wert;
	}

	
	/**
	 * Quadrat in Double zurückgeben, das man auch wieder an den Parametern(double wert) erkennt.
	 * Der wert wird wert * wert berechnet und über return zurückgegeben.
	 * @param wert dessen Quadrat berechnet werden soll.
	 * @return Ergebnis der Rechnung.
	 */
	public static double quadrat(double wert) {
		return wert * wert;
	}

}
