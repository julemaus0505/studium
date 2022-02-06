
/*#####################
 * Ein Finalisierer
 ######################*/

//die Klasse Sherry
class Sherry1 {
	// die Instanzvariablen
	int alter;
	int liter;

	// die Methoden
	// der Konstruktor
	Sherry1(int alter, int liter) {
		this.alter = alter;
		this.liter = liter;
	}

	// zum Ansehen
	void ansehen() {
		System.out.println("Der Sherry ist " + alter + " Jahre alt.");
		System.out.println("Die Flasche enthält " + liter + " Liter.");
	}

	// der Finalisierer
	protected void finalize() {
		System.out.println("Eine Instanz von " + this.getClass() + " wurde zerstört.");
	}
}

public class Java06c_01_03 {
	public static void main(String[] args) {
		// Instanz flasche1 erzeugen
		// die Werte werden über den Konstruktor gesetzt
		Sherry1 flasche1 = new Sherry1(10, 1);

		// die Werte ausgeben
		flasche1.ansehen();

		// flasche1 auf null setzen, damit sie vom Garbage Collector
		// aufgeräumt wird
		flasche1 = null;
		// den Garbage Collector per Hand aufrufen
		System.gc();
	}
}
