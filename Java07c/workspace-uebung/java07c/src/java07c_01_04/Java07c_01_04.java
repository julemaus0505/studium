package java07c_01_04;

public class Java07c_01_04 {
	public static void main(String[] args) {
		//einen B�ren erzeugen
		Baer alterBaer = new Baer(200,3);
		//einen Papab�ren erzeugen
		ElternBaer papaBaer = new ElternBaer(500,5,20);

		//Werte �ber die Methoden ausgeben() anzeigen
		alterBaer.ausgeben();
		papaBaer.ausgeben();
		
		//Papab�r erleidet einen Schock
		papaBaer.schock();

		//und nun die kompakte Ausgabe �ber die �berschriebene Methode toSring()
		System.out.println(alterBaer.toString());
		System.out.println(papaBaer.toString());
	}
}
