
/* #################################################
Zeichenweise Ausgabe von Zeichenketten
################################################# */

public class Java04c_03_01 {
	public static void main(String[] args) {
		// Vereinbarung
		String zKette1, zKette2, zKette3;

		// die Zeichenketten erhalten Werte
		zKette1 = "Ich bin";
		zKette2 = " eine Zeichenkette.";

		// die beiden Zeichenketten werden verbunden
		zKette3 = zKette1 + zKette2;

		// die Ausgabe der Länge
		System.out.println("Die Zeichenkette enthält " + zKette3.length() + " Zeichen.");

		// die komplette Ausgabe
		System.out.println("In der Zeichenkette steht " + zKette3);

		// Ausgabe einzelner Zeichen über die Methode charArt() und for
		for (int element = 0; element < zKette3.length(); element++)
			System.out.print(zKette3.charAt(element));
	}

}