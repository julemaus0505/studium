
/* ######################################
 * Initialisierung mit einem Konstruktor
 #######################################*/

//die Klasse Sherry
class Sherry3 {
	// die Instanzvariablen
	int alter;
	int liter;

	// die Methoden
	// der Konstruktor
	Sherry3(int alter,int liter) {
		this.alter = alter;
		this.liter = liter;
	}

	// zum Ansehen
	void ansehen() {
		System.out.println("Der Sherry ist " + alter + " Jahre alt.");
		System.out.println("Die Flasche enthält " + liter + " Liter.");
	}
}

public class Java06c_01_02 {
	public static void main(String[] args) {
		// Instanz flasche1 erzeugen
		// die Werte werden über den Konstruktor gesetzt
		Sherry3 flasche1 = new Sherry3(10, 1);

		// die Werte ausgeben
		flasche1.ansehen();
	}
}
