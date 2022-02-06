/* ################################################
Zugriff auf geerbte Instanzvariablen
Der Code l�sst sich so nicht ausf�hren
###################################################
Die Sichtbarkeit der Instanzvariablen ist in private
ge�ndert, die Sichtbarkeit der Methoden in public.
Au�erdem ist in der Klasse ElternBaer eine neue
Methode schock() erg�nzt.
################################################# */
package java07c_01_04;

//die Basisklasse Baer
class Baer {
	// die Instanzvariablen sind jetzt private
	protected int gewicht;
	protected int alter;

	// alle Methoden sind jetzt public
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
		System.out.println("Der B�r ist " + alter + " Jahre alt und wiegt " + gewicht + " Kilo.");
		System.out.println();
	}

	// die �berschriebene Methode toString() aus der Klasse Object
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
	// die Instanzvariable ist ebenfalls private
	private int anzahlKinder;

	// die Methoden sind ebenfalls public
	// ein eigener Konstruktor
	public ElternBaer(int gewicht, int alter, int anzahlKinder) {
		// der Aufruf des Konstruktors der �bergeordneten Klasse Baer
		// gewicht und alter werden "durchgereicht"
		super(gewicht, alter);
		this.anzahlKinder = anzahlKinder;
	}

	// die Methode liefert die Anzahl der Kinder
	public int getAnzahlKinder() {
		return anzahlKinder;
	}

	// die Methode zur Ausgabe der Werte
	// Sie �berschreibt die gleichnamige Methode der Basisklasse
	@Override
	public void ausgeben() {
		System.out.println("Die Ausgabe erfolgt aus " + this.getClass());
		System.out.println("Der B�r ist " + alter + " Jahre alt, wiegt " + gewicht + " Kilo und hat " + anzahlKinder + " Kinder.");
		System.out.println();
	}

	// die �berschriebene Methode toString() aus der Klasse Baer
	// die Methode ist in der Basisklasse selbst ebenfalls �berschrieben
	@Override
	public String toString() {
		String ausgabe;
		// die Daten mit der Methode aus der �bergeordneten Klasse beschaffen
		ausgabe = super.toString();
		ausgabe = ausgabe + " Kinder: " + anzahlKinder + "]";
		return ausgabe;
	}

	// die Eltern erleiden einen Schock und verlieren Gewicht
	public void schock() {
		gewicht--;
	}
}
