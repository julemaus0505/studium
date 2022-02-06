package abstractKlasseWaehrung;

// Die Waehrung Europas
public class Euro extends Waehrung {

	// Ein Euro ist soviel Dollar wert (Stand Dezember 1999)
	private static double kurs = 1;

	// Instanzvariable: Wert in Euro
	private double wert;

	// Konstuktor
	public Euro(double wert) {
		this.wert = wert;
	}

	// Deklaration der sonst abstrakten Methode dooarBetrag
	public double dollarBetrag() {
		return wert * kurs;
	}

	// Gibt den Wert der Waehrung in Euro zurück
	public double eruoBetrag() {
		return wert;
	}

	// Zugriff auf die private Klassenvariable
	public static void setEuroKurs(double kurs) {
		Euro.kurs = kurs;
	}

}
