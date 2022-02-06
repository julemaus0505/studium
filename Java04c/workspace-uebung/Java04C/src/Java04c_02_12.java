
/* #################################################
Machen Sie sich das Programmiererleben mit Arrays
leichter :)
################################################# */

//für die Klasse Arrays
import java.util.Arrays;

public class Java04c_02_12 {
	// die Methode gibt alle Werte im Array in einem Rutsch aus
	static void ausgabeInEinemRutsch() {
		int[] zahlen = { 1, 2, 3, 4, 5 };
		// das klappt nicht, da nur die Referenz ausgegeben wird
		System.out.println(zahlen);
		// das auch nicht, da die Referenz als Zeichenkette ausgegeben wird
		System.out.println(zahlen.toString());
		// aber das!!!
		System.out.println(Arrays.toString(zahlen));
	}

	// die Methode liefert zwei Werte über ein Array zurück
	static int[] zweiZurueck(int wert1, int wert2) {
		int[] werte = new int[2];
		werte[0] = wert1 - wert2;
		werte[1] = wert1 + wert2;
		return werte;
	}

	public static void main(String[] args) {
		// für die beiden Ergebnisse aus der Methode
		int[] zweiErgebnisse = new int[2];
		ausgabeInEinemRutsch();
		// das Array aus der Methode in das Array zweiErgebnisse kopieren
		zweiErgebnisse = Arrays.copyOf(zweiZurueck(10, 20), 2);
		System.out.println(Arrays.toString(zweiErgebnisse));
	}
}
