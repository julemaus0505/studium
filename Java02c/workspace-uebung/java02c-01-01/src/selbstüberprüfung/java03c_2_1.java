package selbst�berpr�fung;

import javax.swing.JOptionPane;

/*#########################################################
* Musterl�sung Aufgabe 2.1
##########################################################*/

public class java03c_2_1 {

	public static void main(String[] args) {
		//f�r die Eingaben
		int x, y;
		//die Werte einlesen
		//bitte jeweils in einer Zeile eingeben
		x = Integer.parseInt(JOptionPane.showInputDialog
		("Bitte geben Sie den Wert f�r x ein:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Wert f�r y ein:"));
		//der Vergleich
		if (x > y)
			System.out.println("x ist gr��er als y.");
		else
			System.out.println("y ist gr��er oder gleich x.");
		System.exit(0); 


	}

}
