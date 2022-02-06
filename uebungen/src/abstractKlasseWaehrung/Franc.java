package abstractKlasseWaehrung;

public class Franc extends Euro {

	public Franc(double wertFranc) {
		super(wertFranc / 6.55957);

	}

	public Franc(Euro euro) {
		super(euro.eruoBetrag());

	}

	public double francBetrag() {
		return eruoBetrag() * 6.55957;

	}
}
