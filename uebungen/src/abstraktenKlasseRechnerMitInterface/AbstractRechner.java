package abstraktenKlasseRechnerMitInterface;

public abstract class AbstractRechner implements Rechner {

	protected double ergebnis;
	
	@Override
	public void ergebnisAusgeben() {
		System.out.println("Das Ergebnis lautet " + ergebnis);
		
	}
	
}
