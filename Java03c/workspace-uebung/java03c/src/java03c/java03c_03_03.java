package java03c;

import javax.swing.JOptionPane;

/* #################################################
Die umgebaute Schleife
################################################# */

public class java03c_03_03 {

	public static void main(String[] args) {
		int schleifenVariable = 0;

		// der Fu� wird jetzt zum Kopf
		// Denken Sie daran, das Semikolon zu l�schen!
		while (schleifenVariable <= 10) {
			schleifenVariable = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie einen Wert gr��er als 10 ein. "));
		}
		System.out.println("Danke.");
		System.exit(0);

	}

}
