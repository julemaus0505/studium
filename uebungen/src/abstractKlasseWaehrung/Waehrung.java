package abstractKlasseWaehrung;

//Die Klasse symbolisiert eine beliebige Waehrung
public abstract class Waehrung {

	// Gibt den Wertdes Objekts in US-Dollar zurück
	public abstract double dollarBetrag();

	// Berechne 8 Prozent des im Feld gespeichert Geldes
	public static double berechneSteuer(Waehrung[] geld) {

		// Variable für den Gesamtbetrag
		double summe = 0;

		// wird in einer Schleife summiert und anschliessend mit 8% (=0.08)
		// multipliziert
		for (Waehrung waehrung : geld) {
			summe += waehrung.dollarBetrag();
		}

		return summe * 1.08;

	}

}
