package java06c_03_02;

public class Java06c_03_02 {
	public static void main(String[] args) {
		// einen B�ren erzeugen
		Baer alterBaer = new Baer(200, 3);
		// einen Papab�ren erzeugen
		ElternBaer papaBaer = new ElternBaer(500, 5, 20);
		

		alterBaer.ausgeben();
		System.out.println();
		papaBaer.ausgeben();
		System.out.println();
		
		// Werte �ber die jeweiligen Methoden anzeigen
		System.out.println(alterBaer.toString());
		System.out.println();
		System.out.println(papaBaer.toString());
	}

}
