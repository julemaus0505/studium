
/* ######################################
 * Initialisierung mit der Methode init()
 #######################################*/

//die Klasse Sherry
class Sherry2 {
	// die Instanzvariablen
	int alter;
	int liter;

	// die Methoden
	// zur Initialisierung
	// die Instanzvariablen werden über this angesprochen
	void init(int alter, int liter) {
		this.alter = alter;
		this.liter = liter;
	}

	// zum Ansehen
	void ansehen() {
		System.out.println("Der Sherry ist " + alter + " Jahre alt.");
		System.out.println("Die Flasche enthält " + liter + " Liter.");
	}
}

public class Java06c_01_01 {
	public static void main(String[] args) {
		// Instanz flasche1 erzeugen
		Sherry2 flasche1 = new Sherry2();

		// die Instanzvariablen initialisieren
		flasche1.init(10, 1);

		// die Werte ausgeben
		flasche1.ansehen();
	}
}
