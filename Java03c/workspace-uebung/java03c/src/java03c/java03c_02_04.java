package java03c;

import javax.swing.JOptionPane;

/* #################################################
Entscheidungsketten mit if-else
################################################# */

public class java03c_02_04 {

	public static void main(String[] args) {
		int zahl;

		zahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));

		if (zahl == 5)
			System.out.println("Sie haben die 5 eingegeben");
		else if (zahl < 5)
			System.out.println("Sie haben eine Zahl kleiner als 5 eingegeben");
		else
			System.out.println("Sie haben eine Zahl gr��er als 5 eingegeben");

		System.out.println("Die Zahl war " + zahl);

		System.exit(0);

	}

}
