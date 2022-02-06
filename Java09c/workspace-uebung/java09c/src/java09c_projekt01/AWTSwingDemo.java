package java09c_projekt01;

import javax.swing.JFrame;

public class AWTSwingDemo {

	public static void main(String[] args) {

//		// ein neues AWT-Fenster erstellen
//		// bitte in einer Zeile eingeben
//		AWTFenster awtFenster = new AWTFenster("Hallo Welt mit AWT.");
//
//		// das Fenster "packen"
//		awtFenster.pack();
//		// und anzeigen
//		awtFenster.setVisible(true);
		
		//ein neues Swing-Fenster erstellen
		SwingFenster swingFenster = new SwingFenster("Hallo Welt mit Swing.");
		
		//die Standardaktion beim Schlieﬂen des Fensters setzen
		swingFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// das Fenster "packen"
		swingFenster.pack();
		// und anzeigen lassen
		swingFenster.setVisible(true);

	}

}
