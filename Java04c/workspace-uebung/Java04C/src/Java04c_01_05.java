
/* ################################################
Beispiel für einen sehr engen Bezugsrahmen
Das Programm lässt sich so nicht übersetzen!
################################################# */
//für das Einlesen
import javax.swing.*;

public class Java04c_01_05 {
	public static void main(String[] args) {
		int zahl1, zahl2;
		zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die erste Zahl ein:"));
		zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die zweite Zahl ein:"));

		if (zahl1 < zahl2) {
			// produkt wird mit sehr engem Bezugsrahmen vereinbart
			int produkt;
			produkt = zahl1 * zahl2;
			System.out.println("Das Produkt der beiden Zahlen ist " + produkt);

			// Hier ist produkt unbekannt
			System.out.println("Das Produkt der beiden Zahlen ist " + produkt);
			System.exit(0);
		}
	}
}
