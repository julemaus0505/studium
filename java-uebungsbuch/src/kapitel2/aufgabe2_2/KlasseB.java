package kapitel2.aufgabe2_2;

public class KlasseB extends KlasseA {

	private static int zaehlerInstanzenB = 0;

	public KlasseB() {

		zaehlerInstanzenB++;

	}

	public static int anzeigeZaehler() {

		return zaehlerInstanzenB;
	}

}
