
	/*#########################
	 * Einführung in Klassen
	##########################*/
	package java05c_02_01;

	//die Vereinbarung der Klasse Autoklasse
	//Sie erfolgt außerhalb der Klasse für das Programm
	class Autoklasse{
		
		//eine Instanzvariable
		static int geschwindigkeit;

		//die Methoden zum Initialisieren
		void initialisiere(int standard) {
			geschwindigkeit = standard;
		}

		//zum Bremsen
		void bremsen(int aenderung) {
			if ((geschwindigkeit - aenderung < 0))
				geschwindigkeit = 0;
			else
				geschwindigkeit = geschwindigkeit - aenderung;
		}

		//zum Gasgeben
		void gasgeben(int aenderung) {
			geschwindigkeit = geschwindigkeit + aenderung;
		}

		//zur Ausgabe der Geschwindigkeit
		void ausgeben() {
			System.out.println("Die aktuelle Geschwindigkeit beträgt " + geschwindigkeit);
		}
		
		public class Java05c_02_01 {

			public void main(String[] args) {
				
				//zwei neue Instanzen für Autoklasse erzeugen
				Autoklasse auto1 = new Autoklasse();
				Autoklasse auto2 = new Autoklasse();

				//die Methode initialisiere() für die beiden Autos aufrufen
				auto1.initialisiere(0);
				auto2.initialisiere(10);

				//die Geschwindigkeit ausgeben
				System.out.println("Nach der Initialisierung");
				auto1.ausgeben();
				auto2.ausgeben();

				//Methode gasgeben() aufrufen
				auto1.gasgeben(30);
				auto2.gasgeben(130);

				System.out.println("Nach Gasgeben");
				auto1.ausgeben();
				auto2.ausgeben();

				//Methode bremsen() aufrufen
				auto1.bremsen(10);
				auto2.bremsen(50);

				System.out.println("Nach Bremsen");
				auto1.ausgeben();
				auto2.ausgeben();

			}

		}

	}

	
