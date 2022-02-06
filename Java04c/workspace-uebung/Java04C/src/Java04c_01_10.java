
/* #################################################
Die Klassenvariablen werden durch lokale Variablen
ersetzt
################################################# */

//für die Eingabe
import javax.swing.*;

public class Java04c_01_10 {
	// die Methode liefert einen Wert zurück und erhält einen Wert
	static int berechnung(int zahl) {
		// quadrat ist jetzt lokal
		int quadrat;
		quadrat = zahl * zahl;
		return quadrat;
	}

	public static void main(String[] args) {
		// zahl ist ebenfalls lokal
		int zahl;
		zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein:"));
		// die Methode wird mit zahl als Argument aufgerufen
		// und das Ergebnis direkt ausgegeben
		System.out.println("Das Quadrat der Zahl ist " + berechnung(zahl));
		System.exit(0);
	}
}
