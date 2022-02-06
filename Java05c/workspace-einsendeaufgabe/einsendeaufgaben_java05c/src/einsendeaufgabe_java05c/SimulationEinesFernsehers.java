package einsendeaufgabe_java05c;

/*#############################################################################
 * Einsendeaufgabe 5.1
 * #############################################################################*/
public class SimulationEinesFernsehers {

	public static void main(String[] args) {

		// eine Instanz für Fernseher erzeugen
		Fernseher fernseher = new Fernseher();

		// Fernseher einschalten
		fernseher.einschalten();
		statusAusgeben(fernseher);

		// Lautstärke Ändern
		fernseher.lautstaerkeAendern(10);
		System.out.println("Die Lautstärke hat jetzt den Wert: " + fernseher.aktuelleLautstaerke());
		fernseher.lautstaerkeAendern(26);
		System.out.println("Die Lautstärke hat jetzt den Wert: " + fernseher.aktuelleLautstaerke());
		System.out.println();

		// Programm 3 X wechseln
		fernseher.programmAendern(23);
		System.out.println("Das aktuelle Programm ist: " + fernseher.aktuellesProgramm());
		fernseher.programmAendern(75);
		System.out.println("Das aktuelle Programm ist: " + fernseher.aktuellesProgramm());
		fernseher.programmAendern(4);
		System.out.println("Das aktuelle Programm ist: " + fernseher.aktuellesProgramm());
		fernseher.programmAendern(111);
		System.out.println("Das aktuelle Programm ist: " + fernseher.aktuellesProgramm());
		System.out.println();

		// Fernseher ausschalten
		fernseher.ausschalten();
		statusAusgeben(fernseher);
	}

	private static void statusAusgeben(Fernseher fernseher) {
		if (fernseher.isEingesachaltet()) {
			System.out.println("Der Fernseher ist eingeschaltet.");
		} else {
			System.out.println("Der Fernseher ist ausgeschaltet.");
		}
		System.out.println();
	}
}
