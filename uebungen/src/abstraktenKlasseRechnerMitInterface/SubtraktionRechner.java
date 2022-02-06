package abstraktenKlasseRechnerMitInterface;

public class SubtraktionRechner extends AbstractRechner {

	@Override
	public void rechnen(double zahl1, double zahl2) {
		ergebnis = zahl1 - zahl2;

	}

}
