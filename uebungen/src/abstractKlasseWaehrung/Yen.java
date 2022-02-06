package abstractKlasseWaehrung;

// Die japanische Landeswaehrung
public class Yen extends Waehrung {

	// Ein Yen ist sovielDollar wert
	public static double kurs;

	// Instanzvariable: Wert in Yen
	private double wert;

	// Konstruktor
	public Yen(double wert) {
		this.wert = wert;
	}

	// Deklaration der sonst abstrakten Methode dollarBetrag
	public double dollarBetrag() {
		return wert * kurs;

	}

	// Zugriff auf die private Klassenvariable
	public static void setKurs(double kurs) {

		Yen.kurs = kurs;
	}

}
