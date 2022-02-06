/*#################################
 * Kombination von Klassenvariablen 
 * und Instanzvariablen
 ##################################*/
package java05c_03_03;

//die Vereinbarung der Klasse Autoklasse
//Sie erfolgt außerhalb der Klasse für das Programm
class Autoklasse {
	//die Klassenvariable
	static int autoZaehler;
	//die Instanzvariable
	int geschwindigkeit;

	//die Methoden
	
	//eine Klassenmethode, die die Anzahl der Instanzen liefert
	static int getAutoZaehler() {
		return autoZaehler;
	}
	
	//die "echten" Methoden
	//zum Initialisieren
	//hier wird jetzt auch die Klassenvariable
	//autoZaehler um den Wert 1 erhöht
	void initialisiere(int standard) {
		geschwindigkeit = standard;
		autoZaehler++;
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
}


public class Java05c_03_03 {
	public static void main(String[] args) {
		//zwei neue Instanzen für Autoklasse erzeugen
		Autoklasse auto1 = new Autoklasse();
		Autoklasse auto2 = new Autoklasse();
	

		//die Methode initialisiere() für die beiden Autos aufrufen
		auto1.initialisiere(0);
		auto2.initialisiere(10);
		

		//die Anzahl der Autos über die Klassenmethode ausgeben
		System.out.println("Es gibt " + Autoklasse.getAutoZaehler() + " Autos.");
		
		//Methode gasgeben() aufrufen
		auto1.gasgeben(20);
		auto2.gasgeben(100);

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
