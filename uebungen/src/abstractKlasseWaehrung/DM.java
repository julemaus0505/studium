package abstractKlasseWaehrung;

public class DM extends Euro {

	public DM(double wertDM) {
		super(wertDM / 1.95583);

	}

	public DM(Euro euro) {
		super(euro.eruoBetrag());
	}

	public double dmBetrag() {
		return eruoBetrag() * 1.95583;

	}

}
