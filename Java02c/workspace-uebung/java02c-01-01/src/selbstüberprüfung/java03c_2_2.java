package selbst�berpr�fung;

import javax.swing.JOptionPane;

/*#########################################################
* Musterl�sung Aufgabe 2.2
##########################################################*/

public class java03c_2_2 {

	public static void main(String[] args) {
		int essenWahl;
		System.out.println("Bitte w�hlen Sie ein Essen aus:\n");
		System.out.println("1 J�gerschnitzel mit Pommes");
		System.out.println("2 Currywurst mit Pommes");
		System.out.println("3 Bratwurst mit Br�tchen");
		essenWahl = Integer.parseInt(JOptionPane.
		showInputDialog("Was m�chten Sie essen?"));
		switch (essenWahl) {
			case 1:
				System.out.println("Sie haben ein J�gerschnitzel mit Pommes gew�hlt.");
				break;
			case 2:
				System.out.println("Sie haben eine Currywurst mit Pommes gew�hlt.");
				break;
			case 3:
				System.out.println("Sie haben eine Bratwurst mit Br�tchen gew�hlt.");
				break;
		}
		System.exit(0);

	}

}
