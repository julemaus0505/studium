package uebung_vererbung_9;

public class RabattierteRechnung extends Rechnung {

	private double rabatt;

	public double getRabatt() {
		return rabatt;

	}

	public RabattierteRechnung(double rabatt, double gesamtbetrag, double mehrwertsteuer) {
		super(gesamtbetrag, mehrwertsteuer);
		this.rabatt = rabatt;

	}

	/*
	 * bruttobetrag - bruttobetrag / 100 * rabatt
	 */
	@Override
	public double bruttobetragBerechen() {
		double bruttobetrag = super.bruttobetragBerechen();
		return bruttobetrag - bruttobetrag / 100 * rabatt;

	}

}
