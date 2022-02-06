package java03c;

import javax.swing.JOptionPane;

/* #################################################
if-Verzweigung mit Anweisungsblock
################################################# */

public class java03c_02_02 {

	public static void main(String[] args) {
		int zahl;

		zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));

		// die Verzweigung, diesmal mit einem Anweisungsblock
		if (zahl > 5) {
			System.out.println("Sie haben eine Zahl größer als 5 eingegeben");
			System.out.println("Die Differenz zwischen " + zahl + " und 5 ist " + (zahl - 5));
		}
		System.out.println("Die Zahl war " + zahl);

		System.exit(0);
	}

}
