package java03c;

import javax.swing.JOptionPane;

/* #################################################
if-Abfrage statt continue
################################################# */

public class java03c_03_11 {

	public static void main(String[] args) {
		int quadrat, schleifenVariable, eingabe;

		// Initialisierung
		quadrat = 0;
		schleifenVariable = 1;
		eingabe = 1;

		while (schleifenVariable <= 10) {
			eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));

			// die Berechnungen werden nur ausgeführt, wenn ein Wert ungleich 0 eingegeben
			// wurde
			if (eingabe != 0) {
				quadrat = eingabe * eingabe;
				System.out.println("Das Quadrat der Zahl ist " + quadrat);
			}

			schleifenVariable++;
		}
		System.out.println("Das Einlesen ist beendet.");
		System.exit(0);

	}

}
