package abstraktenKlasseRechnerMitInterface;

public class TaschenrechnerMain {

	public static void main(String[] args) {

		rechnen(new AdditionsRechner(), 12, 23);
		rechnen(new SubtraktionRechner(), 26, 65);
		rechnen(new MulipikationRechner(), 85, 45);
		rechnen(new DivisionsRechner(), 74, 54);

	}

	public static void rechnen(Rechner rechner, double zahl1, double zahl2) {
		rechner.rechnen(zahl1, zahl2);
		rechner.ergebnisAusgeben();

	}

}
