package java06c_03_01;

//die Basisklasse Baer
class Baer {
	int gewicht;
	int alter;

	//der Standardkonstruktor für Baer
	Baer() {
		gewicht = 100;
		alter = 5;
	}

	//die Methode liefert das Gewicht
	int getGewicht() {
		return gewicht;
	}

	//die Methode liefert das Alter
	int getAlter() {
		return alter;
	}
}

//die Klasse ElternBaer erbt von der Klasse Baer
class ElternBaer extends Baer {
	int anzahlKinder;
	

	//der Standardkonstruktor für ElternBaer
	ElternBaer() {
		anzahlKinder = 2;
	}

	//die Methode liefert die Anzahl der Kinder
	int getAnzahlKinder() {
		return anzahlKinder;
	}
}

