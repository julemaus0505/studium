package java03c;

import javax.swing.JOptionPane;

/* #################################################
Einfache if-Verzweigung
################################################# */

public class java03c_02_01 {

	public static void main(String[] args) {
		int zahl;

		zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));

		// die Verzweigung
		if (zahl > 5)
			System.out.println("Sie haben eine Zahl größer als 5 eingegeben");

		System.out.println("Die Zahl war " + zahl);

		System.exit(0);

	}

}
