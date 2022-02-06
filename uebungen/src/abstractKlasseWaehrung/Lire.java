package abstractKlasseWaehrung;

public class Lire extends Euro {

	public Lire(double wertLire) {
		super(wertLire / 1936.27);

	}

	public Lire(Euro euro) {
		super(euro.eruoBetrag());
	}

	public double lireBetrag() {
		return eruoBetrag() * 1936.27;

	}

}
