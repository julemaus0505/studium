
/*##########################
 * Überladene Konstruktoren
 ##########################*/

//die Klasse Sherry
class Sherry {
	// die Instanzvariablen
	int alter;
	int liter;

	// die Methoden
	// der Konstruktor mit zwei Parametern
	Sherry(int alter, int liter) {
		this.alter = alter;
		this.liter = liter;
	}

	// der Konstruktor mit einem Parameter
	Sherry(int alter) {
		this.alter = alter;
		// hier könnte this auch entfallen, da es keine gleichnamige lokale Variable
		// mehr gibt
		this.liter = 1;
	}

	// der neue Standard-Konstruktor
	Sherry() {
		// this könnte hier ebenfalls entfallen
		this.alter = 10;
		this.liter = 1;
	}

	// zum Ansehen
	void ansehen() {
		System.out.println("Der Sherry ist " + alter + " Jahre alt.");
		System.out.println("Die Flasche enthält " + liter + " Liter.");
	}

	public static void main(String[] args) {
		// verschiedene Instanzen mit unterschiedlichen Konstruktoren erzeugen
		Sherry flasche1 = new Sherry(20, 2);
		Sherry flasche2 = new Sherry(15);
		Sherry flasche3 = new Sherry();

		// die Werte ausgeben
		flasche1.ansehen();
		flasche2.ansehen();
		flasche3.ansehen();

	}

}
