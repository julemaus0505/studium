package selbstüberprüfung;

import javax.swing.JOptionPane;

/*#########################################################
* Musterlösung Aufgabe 2.1
##########################################################*/

public class java03c_2_1 {

	public static void main(String[] args) {
		//für die Eingaben
		int x, y;
		//die Werte einlesen
		//bitte jeweils in einer Zeile eingeben
		x = Integer.parseInt(JOptionPane.showInputDialog
		("Bitte geben Sie den Wert für x ein:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie den Wert für y ein:"));
		//der Vergleich
		if (x > y)
			System.out.println("x ist größer als y.");
		else
			System.out.println("y ist größer oder gleich x.");
		System.exit(0); 


	}

}
