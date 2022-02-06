package uebung_vererbung_9;

public class Rechnung {

	private double gesamtbetrag;
	private double mehrwertsteuer;

	public Rechnung(double gesamtbetrag, double mehrwertsteuer) {
		this.gesamtbetrag = gesamtbetrag;
		this.mehrwertsteuer = mehrwertsteuer;
	}

	public double getGesamtbetrag() {
		return gesamtbetrag;

	}

	public double getMehrwertsteuer() {
		return mehrwertsteuer;
	}

	public double bruttobetragBerechen() {
		return gesamtbetrag + gesamtbetrag * mehrwertsteuer;
	}

}
