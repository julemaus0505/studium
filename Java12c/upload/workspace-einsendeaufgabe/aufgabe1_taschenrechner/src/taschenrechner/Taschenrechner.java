package taschenrechner;

public class Taschenrechner {

	// Methode zur Berechnung der Addition
	public static int berechneAddition(int zahl1, int zahl2) {
		int ergebnisAddition = zahl1 + zahl2;

		return ergebnisAddition;

	}

	// Methode zur Berechnung der Subtraktion
	public static int berechneSubtraktion(int zahl1, int zahl2) {
		int ergebnisSubtraktion = zahl1 - zahl2;

		return ergebnisSubtraktion;

	}

	// Methode zur Berechnung der Multiplikation
	public static int berechneMultiplikation(int zahl1, int zahl2) {
		int ergebnisMultiplikation = zahl1 * zahl2;

		return ergebnisMultiplikation;

	}

	// Methode zur Berechnung der Division
	public static int berechneDivision(int zahl1, int zahl2) throws TaschenrechnerDivisionException {

		if (zahl2 == 0) {
			throw new TaschenrechnerDivisionException("Division durch 0 ist nicht möglich.");
		}
		int ergebnisDivision = zahl1 / zahl2;

		return ergebnisDivision;

	}

}
