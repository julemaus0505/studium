package einsendeaufgaben_java06c;

//Basisklasse
class Insekt {
	int laenge;
	int gewicht;

	//der Konstruktor
	Insekt(int laenge, int gewicht) {
		this.laenge = laenge;
		this.gewicht = gewicht;
	}

	//die Methode zum Essen
	void essen() {
		laenge = laenge + 1;
		gewicht = gewicht + 1;
	}

	//die Methode zur Ausgabe
	void ausgabe() {
		System.out.println("Das Insekt ist " + laenge + " cm lang und wiegt " + gewicht + " Gramm.");
	}

}
