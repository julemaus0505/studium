
/* #################################################
Eine "unechte" Kopie eines Arrays
################################################# */

public class Java04c_02_08 {
	public static void main(String[] args) {
		int[] aArray;
		int[] bArray = new int[5];

		// bArray mit Werten füllen
		for (int element = 0; element < bArray.length; element++)
			bArray[element] = 5 * element;

		// die Kopie erstellen
		aArray = bArray;

		// die Werte zur Kontrolle ausgeben
		System.out.println("Die Werte in aArray sind:");
		for (int element : aArray)
			System.out.println(element);
		System.out.println("Die Werte in bArray sind:");
		for (int element : bArray)
			System.out.println(element);

		// je einen Wert verändern
		aArray[0] = 200;
		bArray[4] = 1000;

		// die Änderung erfolgt in beiden Arrays
		System.out.println("Die Werte in aArray sind:");
		for (int element : aArray)
			System.out.println(element);
		System.out.println("Die Werte in bArray sind:");
		for (int element : bArray)
			System.out.println(element);
	}
}
