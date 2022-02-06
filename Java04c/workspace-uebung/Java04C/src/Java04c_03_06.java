
/* #################################################
Zeichenketten verändern
################################################# */

public class Java04c_03_06 {
	public static void main(String[] args) {
		// Vereinbarung
		String zKette1 = "   Rätsel    ";

		// die Leerzeichen vorne und hinten entfernen
		System.out.println(zKette1);
		zKette1 = zKette1.trim();
		System.out.println(zKette1);

		// ersetzen geht auch
		// Bitte achten Sie auf die Anführungszeichen "
		zKette1 = zKette1.replace("ä", "ae");
		System.out.println(zKette1);

		// alles in Großbuchstaben
		zKette1 = zKette1.toUpperCase();
		System.out.println(zKette1);

		// und nun in Kleinbuchstaben
		zKette1 = zKette1.toLowerCase();
		System.out.println(zKette1);
	}
}
