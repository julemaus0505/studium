package abstraktenKlasseRechner;

public abstract class Rechner {

	protected double ergebnis;

	public abstract void rechnen(double zahl1, double zahl2);

	public void ergebnisAusgeben() {
		System.out.println("Das Ergebnis lautet " + ergebnis);
	}

}
