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
	//�bergibt den Titel des Fensters,
	//erzeugt die Komponenten und setzt weitere
	//Eigenschaften des Fensters
	
	public HalloWeltGUI (String fenstertitel) {
		super (fenstertitel);
		
		// ein neues Label erzeugen
		ausgabe = new JLabel("Hallo Welt");

		
		//ein weiteres Label erzeugen
		ausgabe2 = new JLabel("Es begr��t Dich Jule Petersen");
	
		
		// eine Schaltfl�che erzeugen
		schaltflaeche = new JButton("Beenden");
		
		//ein Layout anwenden
		setLayout(new FlowLayout());
		
		// die Komponenten hinzuf�gen
		add(ausgabe);
		add(ausgabe2);
		add(schaltflaeche);
		
		//die Verbindung zwischen der Schaltfl�che und dem
		//Listener herstellen
		//�bergeben wird eine neue Instanz unserer eigenen
		//Listener-Klasse
		schaltflaeche.addActionListener(new SchaltflaecheListener());
		
		//die Verbindung zwischen dem Fenster und dem Listener herstellen
		//�bergeben wird eine neue Instanz unserer Listener-Klasse f�r die Fenster-Ereignisse
		this.addWindowListener(new FensterListener());
		
		//das Fenster packen
		pack();
	
		
		// das Verhalten beim Schlie�en setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//das Fenster sichtbar machen
		setVisible(true);
	}
	
	//die Methode setzt den Text im zweiten Label
	public void setAusgabe2Text(String text) {
		ausgabe2.setText("Es gr��t Dich " + text);
		
		//das Fenster neu packen
		pack();
	}
}
