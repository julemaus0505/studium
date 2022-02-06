package java06c_03_02;

/* ################################################
Vererbung ohne Standard-Konstruktoren
Das Listing lässt sich nicht übersetzen
################################################# */

//die Basisklasse Baer
class Baer {
	int gewicht;
	int alter;

	// ein eigener Konstruktor
	public Baer(int gewicht, int alter) {
		this.gewicht = gewicht;
		this.alter = alter;

	}

	// die Methode liefert das Gewicht
	public int getGewicht() {
		return gewicht;
	}

	// die Methode liefert das Alter
	public int getAlter() {
		return alter;
	}

	// die Methode zur Ausgabe der Werte
	public void ausgeben() {
		System.out.println("Die Ausgabe erfolgt aus " + this.getClass());
		System.out.println("Der Bär ist " + alter + " Jahre alt und wiegt " + gewicht + " Kilo.");
	}

	// die überschriebene Methode toString() aus der Klasse Object
	@Override
	public String toString() {
		String ausgabe;
		ausgabe = "[" + this.getClass();
		ausgabe = ausgabe + " Alter: " + alter;
		ausgabe = ausgabe + " Gewicht: " + gewicht + "]";
		return ausgabe;
	}

}

//die Klasse ElternBaer erbt von der Klasse Baer
class ElternBaer extends Baer {
	private int anzahlKinder;

	// ein eigener Konstruktor
	public ElternBaer(int gewicht, int alter, int anzahlKinder) {
		super(gewicht, alter);
		this.anzahlKinder = anzahlKinder;
	}

	// die Methode liefert die Anzahl der Kinder
	public int getAnzahlKinder() {
		return anzahlKinder;
	}

	// die Methode zur ASusgabe der Werte
	// Sie überschreibt die gleichnamige Methode der Basisklasse
	@Override
	public void ausgeben() {
		System.out.println("Die Ausgabe erfolgt aus " + this.getClass());
		System.out.println("Der Bär ist " + alter + " Jahre alt und wiegt " + gewicht + " Kilo und hat " + anzahlKinder + " Kinder.");
	}

	// die überschriebene Methode toString() aus der Klasse Bär
	// die Methode ist in der Basisklasse selbst ebenfalls überschrieben
	@Override
	public String toString() {
		String ausgabe;
		// die DFaten mit der Methode aus der übergeordneten Klasse beschaffen
		ausgabe = super.toString();
		ausgabe = ausgabe + " Kinder: " + anzahlKinder + "]";
		return ausgabe;
	}

}
