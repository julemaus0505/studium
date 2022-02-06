package abstractKlasseWaehrung;

// Diese Klasse modelliert die amerikanische Waehrung
public class USDollar extends Waehrung {

	// Instanzvariable: Wert in Dollar
	private double wert;

	// Konstruktor
	public USDollar(double wert) {
		this.wert = wert;
	}

	public double dollarBetrag() {

		return wert;
	}

}
