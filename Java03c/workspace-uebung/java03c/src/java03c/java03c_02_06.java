package java03c;

import javax.swing.JOptionPane;

/* #################################################
geschachtelte switch-case-Konstruktion
################################################# */

public class java03c_02_06 {

	public static void main(String[] args) {
		String eingabe;
		char essenWahl, beilagenWahl;

		System.out.println("Sie haben folgende Auswahl: \n");
		System.out.println("a  Schweineschnitzel");
		System.out.println("b  Wiener Schnitzel\n");
		// als Zeichenkette einlesen
		eingabe = JOptionPane.showInputDialog("Was möchten Sie essen? ");
		// dann nur das erste Zeichen nehmen
		essenWahl = eingabe.charAt(0);

		System.out.println("Sie können folgende Beilagen wählen: \n");
		System.out.println("c  Pommes");
		System.out.println("d  Reis\n");
		// als Zeichenkette einlesen
		eingabe = JOptionPane.showInputDialog("Welche Beilage möchten Sie? ");
		// dann nur das erste Zeichen nehmen
		beilagenWahl = eingabe.charAt(0);

		// die Auswertung von essenWahl
		switch (essenWahl) {
		case 'A':
		case 'a':
			// die Auswertung von beilagenWahl
			switch (beilagenWahl) {
			case 'C':
			case 'c':
				System.out.println("Sie haben Schweineschnitzel mit Pommes gewählt!");
				break;
			case 'D':
			case 'd':
				System.out.println("Sie haben Schweineschnitzel mit Reis gewählt!");
				break;
			default:
				System.out.println("Diese Beilage gibt es nicht.");
			} // hier endet die Auswertung von beilagenWahl
			break; // hier enden die case-Marken für a und A
		case 'B':
		case 'b':
			// die Auswertung von beilagenWahl
			switch (beilagenWahl) {
			case 'C':
			case 'c':
				System.out.println("Sie haben Wiener Schnitzel mit Pommes gewählt!");
				break;
			case 'D':
			case 'd':
				System.out.println("Sie haben Wiener Schnitzel mit Reis gewählt!");
				break;
			default:
				System.out.println("Diese Beilage gibt es nicht.");
			} // hier endet die Auswertung von beilagenWahl
			break; // hier enden die case-Marken für b und B
		default: // für die Auswertung von essenWahl
			System.out.println("Dieses Gericht steht nicht auf der Karte.");
		} // hier endet die Auswertung von essenWahl
		System.exit(0);

	}

}
