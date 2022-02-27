package kleineEinmaleins;

public class KleineEinmaleins {

	public static void main(String[] args) {

		// Zweidimensionales Array f�r das kleine 1 * 1
		int[][] array = new int[10][10];

		// 10 z�hlen nach rechts
		for (int i = 1; i <= 10; i++) {

			// 10 z�hlen nach unten
			for (int j = 1; j <= 10; j++) {

				array[i - 1][j - 1] = i * j;
			}
		}

		// laufe einmal �ber die ganze zeilen
		for (int i = 0; i < array.length; i++) {

			// laufe einmal �ber die ganze Spalten
			for (int j = 0; j < array[i].length; j++) {

				// 1*1 Ausgabe in der Console
				System.out.print(array[i][j] + "\t");

			}
			// f�r den Zeilenumbuch eine leere Zeile
			System.out.println();
		}
	}
}
