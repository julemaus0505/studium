package java06c_03_01;

public class Java06c_03_01 {
	public static void main(String[] args) {
		// einen B�ren mit dem Standardkonstruktor erzeugen
		Baer alterBaer = new Baer();
		// einen Papab�ren mit dem Standardkonstruktor erzeugen
		ElternBaer papaBaer = new ElternBaer();

		// Werte �ber die jeweiligen Methoden anzeigen
		System.out.println(alterBaer.toString());
		System.out.println();
	}
}
