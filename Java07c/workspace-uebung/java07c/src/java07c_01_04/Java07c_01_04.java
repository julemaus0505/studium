package java07c_01_04;

public class Java07c_01_04 {
	public static void main(String[] args) {
		//einen Bären erzeugen
		Baer alterBaer = new Baer(200,3);
		//einen Papabären erzeugen
		ElternBaer papaBaer = new ElternBaer(500,5,20);

		//Werte über die Methoden ausgeben() anzeigen
		alterBaer.ausgeben();
		papaBaer.ausgeben();
		
		//Papabär erleidet einen Schock
		papaBaer.schock();

		//und nun die kompakte Ausgabe über die überschriebene Methode toSring()
		System.out.println(alterBaer.toString());
		System.out.println(papaBaer.toString());
	}
}
