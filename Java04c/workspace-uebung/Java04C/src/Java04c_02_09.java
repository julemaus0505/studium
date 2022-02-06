
/* #################################################
Verschiedene Techniken zum echten Kopieren
eines Arrays
################################################# */

public class Java04c_02_09 {
	public static void main(String[] args) {
		
		// aArray muss jetzt mindestens genauso groß sein wie bArray
		int[] aArray = new int[5];
		int[] bArray = new int[5];
		
		// ein weiteres Array mit 10 Elementen
		int[] cArray = new int[10];
		int[] dArray;

		// und zweidimensionale Arrays
		int[][] aArray2 = { { 3, 5, 7, 6 }, { 2, 1, 0, 9 } };
		int[][] bArray2;

		// bArray mit Werten füllen
		for (int element = 0; element < bArray.length; element++)
			bArray[element] = 5 * element;

		// die echte Kopie zu Fuß
		for (int element = 0; element < bArray.length; element++)
			aArray[element] = bArray[element];

		// die Werte zur Kontrolle ausgeben
		System.out.println("Die Werte in aArray sind:");
		for (int element : aArray)
			System.out.print(element + " ");
		System.out.println();
		System.out.println("Die Werte in bArray sind:");
		for (int element : bArray)
			System.out.print(element + " ");
		System.out.println();

		// je einen Wert verändern
		aArray[0] = 200;
		bArray[4] = 1000;

		// die Änderung erfolgt nur in dem jeweiligen Array
		System.out.println("Die geänderten Werte in aArray sind:");
		for (int element : aArray)
			System.out.print(element + " ");
		System.out.println();
		System.out.println("Die geänderten Werte in bArray sind:");
		for (int element : bArray)
			System.out.print(element + " ");
		System.out.println();

		// eine echte Kopie über die Methode clone()
		dArray = cArray.clone();
		System.out.println("Die geklonten Werte in dArray sind:");
		for (int element : dArray)
			System.out.print(element + " ");
		System.out.println();

		// je einen Wert verändern
		dArray[0] = 200;
		cArray[4] = 1000;

		// und zur Kontrolle ausgeben
		System.out.println("Die geänderten Werte in cArray sind:");
		for (int element : cArray)
			System.out.print(element + " ");
		System.out.println();
		System.out.println("Die geänderten Werte im geklonten Array dArray sind:");
		for (int element : dArray)
			System.out.print(element + " ");
		System.out.println();

		// gezieltes Kopieren einzelner Elemente geht über System.arraycopy()
		System.arraycopy(aArray, 0, dArray, 5, aArray.length);
		System.out.println("Die kopierten Werte in dArray sind:");
		for (int element : dArray)
			System.out.print(element + " ");
		System.out.println();

		// bei mehrdimensionalen Arrays gibt es allerdings mit clone() Schwierigkeiten
		bArray2 = aArray2.clone();

		// Werte verändern
		bArray2[0][0] = 1000;
		aArray2[1][1] = 2000;

		// und ausgeben
		// jetzt bestehen wieder wechselseitige Abhängigkeiten
		System.out.println("Die geänderten Werte in aArray2 sind:");
		for (int aussen = 0; aussen < 2; aussen++)
			for (int innen = 0; innen < 4; innen++)
				System.out.print(aArray2[aussen][innen] + " ");
		System.out.println();

		System.out.println("Die geänderten Werte in bArray2 sind:");
		for (int aussen = 0; aussen < 2; aussen++)
			for (int innen = 0; innen < 4; innen++)
				System.out.print(bArray2[aussen][innen] + " ");
		System.out.println();
	}
}
