package kapitel2.aufgabe2_2;

public class KlasseA {

	private static int zaehlerInstanzen = 0;
	
	public KlasseA() {
		zaehlerInstanzen++;
	}
	
	public static int anzeigeZaehler() {
		return zaehlerInstanzen;
		
	}
	
}
