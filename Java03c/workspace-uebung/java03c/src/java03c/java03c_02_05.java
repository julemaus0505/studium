package java03c;

import javax.swing.JOptionPane;

/* #################################################
switch-case
################################################# */

public class java03c_02_05 {

	public static void main(String[] args) {
		String essenEinlesen;
		char essenWahl;

		System.out.println("Sie haben folgende Auswahl: \n");
		System.out.println("a  Schweineschnitzel mit Nudeln");
		System.out.println("b  Wiener Schnitzel mit Pommes");
		System.out.println("c  Vegetarische Hackb�llchen mit Reis\n");

		//als Zeichenkette einlesen
		essenEinlesen=JOptionPane.showInputDialog("Bitte treffen Sie Ihre Wahl: ");
		//dann nur das erste Zeichen nehmen
		essenWahl = essenEinlesen.charAt(0);

		//die Auswertung von essenWahl
		switch(essenWahl) {
			//der case-Zweig f�r a
			case 'a':
				System.out.println("Sie haben Schweineschnitzel mit Nudeln gew�hlt!");
				System.out.println("Kommt sofort!");
				break;
			//der case-Zweig f�r b
			case 'b':
				System.out.println("Sie haben Wiener Schnitzel mit Pommes gew�hlt!");
				System.out.println("Das dauert einen Moment!");
				break;
			//der case-Zweig f�r c
			case 'c':
				System.out.println("Sie haben Vegetarische Hackb�llchen mit Reis gew�hlt!");
				System.out.println("Einen Augenblick!");
				break;
			//f�r alles andere
			default:
				System.out.println("Sie haben keine g�ltige Auswahl getroffen!");
				System.out.println("Dann gibt es eben nichts.");
		}
		System.exit(0);

	}

}
