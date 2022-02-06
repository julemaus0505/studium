package java09c_projekt01;

import javax.swing.JFrame;
import javax.swing.JLabel;

//das Swing-Fenster
//die Klasse erbt von der Swing-Klasse JFrame
//JFrame bildet ein Anwendungsfenster ab
public class SwingFenster extends JFrame {
	
	//der Konstruktor
	//er ruft den Konstruktor der Basisklasse auf,
	//übergibt den Titel des Fensters
	//und erzeugt ein Label mit dem Text "Hallo Welt"
	
	public  SwingFenster(String fenstertitel) {
		super (fenstertitel);
		//ein neues Label erzeugen
		JLabel ausgabe = new JLabel("Hallo Welt");
		//das Label hinzufügen
		add(ausgabe);
	}

}
