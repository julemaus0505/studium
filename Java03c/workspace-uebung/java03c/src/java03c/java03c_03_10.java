package java03c;

import javax.swing.JOptionPane;

/* #################################################
continue in einer Schleife
################################################# */

public class java03c_03_10 {

	public static void main(String[] args) {
		int quadrat, schleifenVariable, eingabe;

		// Initialisierung
		quadrat = 0;
		schleifenVariable = 1;
		eingabe = 1;

		while (schleifenVariable <= 10) {
			eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));

			// die Schleifenvariable muss jetzt vor der Auswertung verändert werden
			schleifenVariable++;
			if (eingabe == 0)
				continue;
			// die folgenden Anweisungen werden nur ausführt, wenn eingabe nicht 0 ist
			quadrat = eingabe * eingabe;
			System.out.println("Das Quadrat der Zahl ist " + quadrat);
		}
		System.out.println("Das Einlesen ist beendet.");

		System.exit(0);

	}

}
