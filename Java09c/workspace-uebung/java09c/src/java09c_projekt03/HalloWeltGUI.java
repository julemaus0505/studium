package java09c_projekt03;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java09c_projekt03.FensterListener;

//das Swing-Fenster
//die Klasse erbt von der Swing-Klasse JFrame
//JFrame bildet ein Anwendungsfenster ab

public class HalloWeltGUI extends JFrame{
	
	//die Komponenten sind jetzt private Instanzvariablen
	private JLabel ausgabe, ausgabe2;
	private JButton schaltflaeche;

	//der Konstruktor
	//er ruft den Konstruktor der Basisklasse auf,
	//übergibt den Titel des Fensters,
	//erzeugt die Komponenten und setzt weitere
	//Eigenschaften des Fensters
	
	public HalloWeltGUI (String fenstertitel) {
		super (fenstertitel);
		
		// ein neues Label erzeugen
		ausgabe = new JLabel("Hallo Welt");

		
		//ein weiteres Label erzeugen
		ausgabe2 = new JLabel("Es begrüßt Dich Jule Petersen");
	
		
		// eine Schaltfläche erzeugen
		schaltflaeche = new JButton("Beenden");
		
		//ein Layout anwenden
		setLayout(new FlowLayout());
		
		// die Komponenten hinzufügen
		add(ausgabe);
		add(ausgabe2);
		add(schaltflaeche);
		
		//die Verbindung zwischen der Schaltfläche und dem
		//Listener herstellen
		//übergeben wird eine neue Instanz unserer eigenen
		//Listener-Klasse
		schaltflaeche.addActionListener(new SchaltflaecheListener());
		
		//die Verbindung zwischen dem Fenster und dem Listener herstellen
		//übergeben wird eine neue Instanz unserer Listener-Klasse für die Fenster-Ereignisse
		this.addWindowListener(new FensterListener());
		
		//das Fenster packen
		pack();
	
		
		// das Verhalten beim Schließen setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//das Fenster sichtbar machen
		setVisible(true);
	}
	
	//die Methode setzt den Text im zweiten Label
	public void setAusgabe2Text(String text) {
		ausgabe2.setText("Es grüßt Dich " + text);
		
		//das Fenster neu packen
		pack();
	}
}
