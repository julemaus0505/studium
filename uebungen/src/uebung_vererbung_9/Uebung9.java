package uebung_vererbung_9;

public class Uebung9 {

	public static void main(String[] args) {

		Rechnung rechnung1 = new Rechnung(110.00, 16);

		System.out.println("Der Betrag den Sie zahlen müssen ist " + rechnung1.bruttobetragBerechen() + " Euro.");

		System.out.println();

		Rechnung rechnung2 = new Rechnung(25.00, 5);

		System.out.println("Der Betrag den Sie zahlen müssen ist " + rechnung2.bruttobetragBerechen() + " Euro.");

		System.out.println();

		Rechnung rechnung3 = new Rechnung(458.45, 10);

		System.out.println("Der Betrag den Sie zahlen müssen ist " + rechnung3.bruttobetragBerechen() + " Euro.");

		System.out.println();

		RabattierteRechnung rabattierteRechnung1 = new RabattierteRechnung(15, 200, 16);
		System.out.println("Sie haben einen Rabatt " + rabattierteRechnung1.getRabatt() + " der Gesamtbetrag ist "
				+ rabattierteRechnung1.getGesamtbetrag() + " die Mehrwertsteuer liegt bei "
				+ rabattierteRechnung1.getMehrwertsteuer() + " %.");
	}

}
