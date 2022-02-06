package javaauf04;

import javax.swing.JOptionPane;

import javaauf4.Rechnungen;

public class Testklasse {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Das Quadrat von 26 ist " + Rechnungen.quadrat(26));

		JOptionPane.showMessageDialog(null, "Das Quadrat von 8.9 ist " + Rechnungen.quadrat(8.9));

		JOptionPane.showMessageDialog(null, "Die Quadratwurzel von 5  ist " + Rechnungen.quadrat(5));

	}

	
	/*
	 * 1. Rechte Maustaste auf das Projekt einsendeaufgabe4 -> Build Path -> Link Source 
	 * 2. Linked folder location: Ordner auswählen: Der Ordner der verlinkt werden soll.  
	 * 3. Folder name: Den 'src Ordner' erweitern, da Eclipse ein Fehler anzeigt dass das Projekt bereits einen 'src Ordner' hat.
	 * 4. Da die Klassen Rehnungen und Testklasse in unterschieldichen Paketen liegen, muss in Testklasse noch die Klasse Rechnungen importiert werden.
	 *  
	 */
}
