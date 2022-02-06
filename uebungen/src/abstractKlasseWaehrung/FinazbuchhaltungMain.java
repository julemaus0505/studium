package abstractKlasseWaehrung;

public class FinazbuchhaltungMain {

	public static void main(String[] args) {

		Yen safeInhalt = new Yen(2000000);
		safeInhalt.dollarBetrag();

		Waehrung[] Geld = new Waehrung[3];
		Geld[0] = new USDollar(2500);
		Geld[1] = new Yen(200000);
		Geld[2] = new USDollar(20);

		// AllgemeineKlasse a = new AllgemeineKlasse();
		// SpezielleKlasse s = a; // unzulaessig!!

		// AllgemeineKlasse s = a;

		SpezielleKlasse a = new SpezielleKlasse();
		SpezielleKlasse s = (SpezielleKlasse) a;

		DM dm = new DM(13.20);
		System.out.println("Der Betrag in DM ist " + dm.dmBetrag() + " DM.");

		Euro euro = new Euro(dm.eruoBetrag());
		System.out.println("Der Betrag in Euro ist " + euro.eruoBetrag() + " Euro.");

		Lire lire = new Lire(euro);
		System.out.println("Der Betrag in Lire ist " + lire.lireBetrag() + " Lire.");

		Franc franc = new Franc(euro);
		System.out.println("Der Betrag in Franc ist " + franc.francBetrag() + " Franc.");

	}

}
