package selbstüberprüfung;

import javax.swing.JOptionPane;

/*#########################################################
* Musterlösung Aufgabe 2.2
##########################################################*/

public class java03c_2_2 {

	public static void main(String[] args) {
		int essenWahl;
		System.out.println("Bitte wählen Sie ein Essen aus:\n");
		System.out.println("1 Jägerschnitzel mit Pommes");
		System.out.println("2 Currywurst mit Pommes");
		System.out.println("3 Bratwurst mit Brötchen");
		essenWahl = Integer.parseInt(JOptionPane.
		showInputDialog("Was möchten Sie essen?"));
		switch (essenWahl) {
			case 1:
				System.out.println("Sie haben ein Jägerschnitzel mit Pommes gewählt.");
				break;
			case 2:
				System.out.println("Sie haben eine Currywurst mit Pommes gewählt.");
				break;
			case 3:
				System.out.println("Sie haben eine Bratwurst mit Brötchen gewählt.");
				break;
		}
		System.exit(0);

	}

}
