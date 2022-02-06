
/* #################################################
VORSICHT! Die Arraygrenzen werden überschritten
################################################# */

public class Java04c_02_02 {
	public static void main(String[] args) {
		// die Vereinbarung des Arrays mit Initialisierung der Werte
		int[] zahlen = { 1, 2, 3, 4, 5 };

		// die Ausgabe mit einer Überschreitung der Arraygrenzen
		for (int index = 0; index < 7; index++)
			System.out.println("Der Wert des Elements " + index + " ist: " + zahlen[index]);
	}

}
