package java03c;

import javax.swing.JOptionPane;

/* #################################################
Die umgebaute Schleife
################################################# */

public class java03c_03_03 {

	public static void main(String[] args) {
		int schleifenVariable = 0;

		// der Fuß wird jetzt zum Kopf
		// Denken Sie daran, das Semikolon zu löschen!
		while (schleifenVariable <= 10) {
			schleifenVariable = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie einen Wert größer als 10 ein. "));
		}
		System.out.println("Danke.");
		System.exit(0);

	}

}
