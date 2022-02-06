package java08c_01_06;

/*########################################
 * Ein Problem durch vertauschte Argumente
 * beim Aufruf einer Methode
######################################## */

public class Java08c_01_06 {
	//die Methode zur Subtraktion
	static int subtraktion(int wert1, int wert2) {
		System.out.println("Wert 1 hat den Wert: " + wert1);
		System.out.println("Wert 2 hat den Wert: " + wert2);
		return (wert1 - wert2);
	}
	
	public static void main(String[] args) {
		int zahl;
		//eigentlich soll 20-10 gerechnet werden
		zahl = subtraktion(10,20);
		System.out.println("Zahl hat den Wert: " + zahl);
	}
	
}
