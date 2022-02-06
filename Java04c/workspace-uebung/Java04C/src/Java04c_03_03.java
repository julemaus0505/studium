
/* #################################################
Ein echter Vergleich von Zeichenketten
################################################# */

public class Java04c_03_03 {
	public static void main(String[] args) {
		
		// zwei Zeichenketten mit konstanten Werten
		String zKette1 = "Versuch";
		String zKette2 = "Versuch";

		// eine dynamisch erzeugte Zeichenkette mit dem Inhalt Versuch
		String zKette3 = new String("Versuch");

		System.out.println("Das ist zKette1: " + zKette1);
		System.out.println("Das ist zKette2: " + zKette2);
		System.out.println("Das ist zKette3: " + zKette3);

		if (zKette1 == zKette2)
			System.out.println("Die Zeichenketten zKette1 und zKette2 sind gleich.");
		else
			System.out.println("Die Zeichenketten zKette1 und zKette2 sind nicht gleich.");

		// das liefert ungleich, da die Referenzen unterschiedlich sind
		if (zKette1 == zKette3)
			System.out.println("Die Zeichenketten zKette1 und zKette3 sind gleich.");
		else
			System.out.println("Die Zeichenketten zKette1 und zKette3 sind nicht gleich.");

		// jetzt klappt auch der Vergleich
		if (zKette1.equals(zKette3))
			System.out.println("Mit equals() sind die Zeichenketten zKette1 und zKette3 gleich.");
		else
			System.out.println("Mit equals() sind die Zeichenketten zKette1 und zKette 3 nicht gleich.");
	}
}
