/*##########################
 * Behälter
 ###########################*/
package java05c_04_01;

//die Klasse für die Behälter
class Behaelter {
	// die Instanzvariablen
	int fuellstand;
	Behaelter andererBehaelter;

	// die Methoden
	void init(int menge) {
		fuellstand = menge;
	}

	void verbindenMit(Behaelter behaelter) {
		andererBehaelter = behaelter;
	}

	int getFuellstand() {
		return fuellstand;
	}

	int aufnehmen(int menge) {
		int rueckgabe;
		if (menge + fuellstand > 100) {
			rueckgabe = 100 - fuellstand;
			fuellstand = 100;
		} else {
			fuellstand = fuellstand + menge;
			rueckgabe = menge;
		}
		return rueckgabe;
	}

	void abgeben(int menge) {
		int gepumpt;
		if (menge > fuellstand)
			gepumpt = andererBehaelter.aufnehmen(fuellstand);
		else
			gepumpt = andererBehaelter.aufnehmen(menge);
		fuellstand = fuellstand - gepumpt;
	}
}

public class Java05c_04_01 {
	// ausgabe() ist eine Klassenmethode für die Klasse des Programms
	static void ausgabe(Behaelter behaelter1, Behaelter behaelter2) {
		System.out.println("Behälter 1 ----------------- Behaelter 2");
		System.out.print(behaelter1.getFuellstand());
		System.out.print("         ----------------- ");
		System.out.println(behaelter2.getFuellstand());
	}

	public static void main(String[] args) {
		// die Instanzen erzeugen und intialisieren
		Behaelter behaelter1 = new Behaelter();
		Behaelter behaelter2 = new Behaelter();

		behaelter1.init(60);
		behaelter2.init(60);

		// die "Leitungen" zwischen den Behältern legen
		behaelter1.verbindenMit(behaelter2);
		behaelter2.verbindenMit(behaelter1);

		// Ausgabe der Füllstände über die Klassenmethode
		ausgabe(behaelter1, behaelter2);

		// 10 Liter aus Behälter 1 umpumpen
		behaelter1.abgeben(10);
		ausgabe(behaelter1, behaelter2);

		// mehr umpumpen als passt
		behaelter1.abgeben(40);
		ausgabe(behaelter1, behaelter2);

		// 60 Liter aus Behälter 2 umpumpen
		behaelter2.abgeben(60);
		ausgabe(behaelter1, behaelter2);
	}
}
