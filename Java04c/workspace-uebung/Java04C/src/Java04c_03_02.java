
/* #################################################
"Vergleich" von Zeichenketten
################################################# */

public class Java04c_03_02 {
	public static void main(String[] args) {

		// zwei Zeichenketten mit konstanten Werten
		// Wertzuweisung
		String zKette1 = "Versuch";
		String zKette2 = "Versuch";

		System.out.println("Das ist zKette1: " + zKette1);
		System.out.println("Das ist zKette2: " + zKette2);

		// und die beiden Zeichenketten "vergleichen"
		// das klappt auch scheinbar
		if (zKette1 == zKette2)
			System.out.println("Die Zeichenketten zKette1 und zKette 2 sind gleich.");
		else
			System.out.println("Die Zeichenketten zKette1 und zKette 2 sind nicht gleich.");
	}
}
