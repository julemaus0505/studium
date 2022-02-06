
/* #################################################
Ein mehrdimensionales Array
################################################# */

public class Java04c_02_06 {
	public static void main(String[] args) {

		// die Vereinbarung des Arrays mit Initialisierung der Werte
		int[][] tabellenArray = { { 3, 5, 7, 6 }, { 2, 1, 0, 9 } };

		// die Ausgabe in einer geschachtelten Schleife
		for (int indexAussen = 0; indexAussen < 2; indexAussen++)
			for (int indexInnen = 0; indexInnen < 4; indexInnen++)
				System.out.println("Das Wert des Elements " + indexAussen + " " + indexInnen + " ist "
						+ tabellenArray[indexAussen][indexInnen]);

		// durch einen kleinen Trick geht auch die sichere Verarbeitung
		// mit der Eigenschaft length
		for (int indexAussen = 0; indexAussen < tabellenArray.length; indexAussen++) {
			for (int indexInnen = 0; indexInnen < tabellenArray[indexAussen].length; indexInnen++)
				System.out.println("Das Wert des Elements " + indexAussen + " " + indexInnen + " ist "
						+ tabellenArray[indexAussen][indexInnen]);
		}
	}
}
