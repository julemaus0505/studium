package java03c;

import javax.swing.JOptionPane;

/* #################################################
Schleifenabbruch über eine Flag-Variable
################################################# */

public class java03c_03_09 {

	public static void main(String[] args) {
		int summe, schleifenVariable, eingabe;
		// die Flag-Variable vom Typ boolean
		boolean weiter = true;
		// Initialisierung
		summe = 0;
		schleifenVariable = 1;
		eingabe = 1;
		while ((schleifenVariable <= 10) && (weiter == true)) {
			eingabe = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));
			// wenn 0 eingegeben wurde, wird flagVariable auf false gesetzt
			// andernfalls wird gerechnet
			if (eingabe == 0)
				weiter = false;
			else {
				summe = eingabe + summe;
				schleifenVariable++;
			}
		}
		System.out.println("Das Einlesen ist beendet.");
		System.out.println("Die Summe der Zahlen ist " + summe);

		System.exit(0);

	}

}
