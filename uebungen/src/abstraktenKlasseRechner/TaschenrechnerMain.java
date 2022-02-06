package abstraktenKlasseRechner;

public class TaschenrechnerMain {

	public static void main(String[] args) {

		AdditionsRechner additionsRechner = new AdditionsRechner();
		additionsRechner.rechnen(12, 25);
		additionsRechner.ergebnisAusgeben();

		SubtraktionRechner subtraktionRechner = new SubtraktionRechner();
		subtraktionRechner.rechnen(11, 2);
		subtraktionRechner.ergebnisAusgeben();

		MulipikationRechner mulipikationRechner = new MulipikationRechner();
		mulipikationRechner.rechnen(78, 100);
		mulipikationRechner.ergebnisAusgeben();

		DivisionsRechner divisionsRechner = new DivisionsRechner();
		divisionsRechner.rechnen(44, 2);
		divisionsRechner.ergebnisAusgeben();

	}
}
