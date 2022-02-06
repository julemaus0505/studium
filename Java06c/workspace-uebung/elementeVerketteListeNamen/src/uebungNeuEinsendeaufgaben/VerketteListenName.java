package uebungNeuEinsendeaufgaben;

public class VerketteListenName {

	public static void main(String[] args) {

		// Hier wird der anfang bestimmt und das erste Element mit dem Namen Jule erstellt.
		ElementName anfang = new ElementName("Jule");
		anfang.hinzufuegen("Lea");
		anfang.hinzufuegen("Sascha");
		anfang.hinzufuegen("Sonja");
		anfang.hinzufuegen("Susi");
		anfang.hinzufuegen("Nadine");
		anfang.hinzufuegen("Steven");
		anfang.hinzufuegen("Fabian");
		anfang.hinzufuegen("Christa");
		anfang.hinzufuegen("Tanja");
		anfang.hinzufuegen("Marcus");
		anfang.ausgeben();
		anfang.loeschen("Sonja");
		anfang.loeschen("Nadine");
		anfang.loeschen("Fabian");
		anfang.loeschen("Christa");
		anfang.ausgeben();
		
		
	}

}
