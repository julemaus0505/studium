package kleineEinmaleins;

public class KleineEinmaleins {

	public static void main(String[] args) {

		// Zweidimensionales Array für das kleine 1 * 1
		int[][] array = new int[10][10];

		// 10 zählen nach rechts
		for (int i = 1; i <= 10; i++) {

			// 10 zählen nach unten
			for (int j = 1; j <= 10; j++) {

				array[i - 1][j - 1] = i * j;
			}
		}

		// laufe einmal über die ganze zeilen
		for (int i = 0; i < array.length; i++) {

			// laufe einmal über die ganze Spalten
			for (int j = 0; j < array[i].length; j++) {

				// 1*1 Ausgabe in der Console
				System.out.print(array[i][j] + "\t");

			}
			// für den Zeilenumbuch eine leere Zeile
			System.out.println();
		}
	}
}
