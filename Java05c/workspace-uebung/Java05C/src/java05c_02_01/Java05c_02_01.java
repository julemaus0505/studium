package java05c_02_01;

public class Java05c_02_01 {

	public static void main(String[] args) {
		
		//zwei neue Instanzen für Autoklasse erzeugen
		Autoklasse auto1 = new Autoklasse();
		Autoklasse auto2 = new Autoklasse();

		//die Methode initialisiere() für die beiden Autos aufrufen
		auto1.initialisiere(0);
		auto2.initialisiere(10);

		//die Geschwindigkeit ausgeben
		System.out.println("Nach der Initialisierung");
		auto1.ausgeben();
		auto2.ausgeben();

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
