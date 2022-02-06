
/* #################################################
Aufzählungen
################################################# */

public class Java04c_04_01 {
	// die Aufzählung
	enum Wochentage {
		MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG
	};

	public static void main(String[] args) {
		// eine Variable vom Typ der Aufzählung
		Wochentage tage;
		// die Wertzuweisung
		tage = Wochentage.MONTAG;
		System.out.println(tage);

		// der Einsatz in Vergleichen ist möglich
		if (tage == Wochentage.MONTAG)
			System.out.println("Heute ist " + tage);
		else
			System.out.println("Heute ist kein Montag.");

		// auch bei switch klappt der Vergleich
		// allerdings nur über die eigentliche Konstante
		switch (tage) {
		case MONTAG:
		case DIENSTAG:
		case MITTWOCH:
		case DONNERSTAG:
			System.out.println("Leider viel Arbeit.");
			break;
		case FREITAG:
			System.out.println("Bald ist es geschafft.");
			break;
		case SAMSTAG:
			System.out.println("Endlich Wochenende.");
			break;
		case SONNTAG:
			System.out.println("Schade, bald geht es wieder zur Arbeit.");
			break;
		}

		// das geht nicht!!
		// tage = Wochentage.FEIERTAG;
	}
}
