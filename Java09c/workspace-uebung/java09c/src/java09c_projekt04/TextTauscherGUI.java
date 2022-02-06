package java09c_projekt04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextTauscherGUI extends JFrame {
	//die ID wurde automatisch mit Eclipse erg�nzt
	private static final long serialVersionUID = -6104907653187043005L;

	//zwei Labels und zwei Schaltfl�chen als Instanzvariablen
	private JLabel ausgabe1, ausgabe2;
	private JButton schaltflaeche1, schaltflaeche2;
	
	//eine innere Klasse f�r den ActionListener
	//der komplette Quelltext der Klasse befindet sich
	//innerhalb der Klasse TextTauscherGUI
	class SchaltflaechListenerInner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//Welche Schaltfl�che wurde angeklickt?
			//Dazu beschaffen wir uns den Text auf der
			//angeklickten Schaltfl�che
			//wenn Tauschen angeklickt wurde, tauschen wir
			//die Texte �ber eine eigene Methode
			//das geht jetzt direkt �ber den Aufruf der
			//Methode
			//denn die innere Klasse kennt auch die
			//Methoden der �u�eren Klassen
			if (e.getActionCommand().equals("Text tauschen"))
				texteTauschen();
				//wenn Beenden angeklickt wurde, beenden wir
				//die Anwendung
			if (e.getActionCommand().equals("Beenden"))
				System.exit(0);

			//hier endet die innere Klasse
			//SchaltflaechenListenerInner
			
		}
		
	}
	
	//der Konstruktor
	//er erzeugt die Komponenten und setzt die Fenstereinstellungen
	public TextTauscherGUI(String titel) {
		
		//den Konstruktor der Basisklasse aufrufen und den Fenstertitel �bergeben
		super(titel);
		
		//die Komponenten erzeugen und hinzuf�gen
		ausgabe1 = new JLabel("Ich stehe eigentlich links");
		ausgabe2 = new JLabel("Und ich stehe eigentlich rechts");
		schaltflaeche1 = new JButton("Text tauschen");
		schaltflaeche2 = new JButton("Beenden");
		
		//ein Layout anwenden
		setLayout(new FlowLayout());
		add(ausgabe1);
		add(ausgabe2);
		add(schaltflaeche1);
		add(schaltflaeche2);
		
		//beide Schaltfl�chen werden mit demselben Listener verbunden
		//dabei wird die Referenz auf die Instanz �bergeben
		SchaltflaechenListener listener = new SchaltflaechenListener(this); 
		schaltflaeche1.addActionListener(listener);
		schaltflaeche2.addActionListener(listener);
		
		//das Fenster packen
		pack();
		
		//die Standardaktion beim Schlie�en festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//das Fenster anzeigen
		setVisible(true);
	}
	
	//die Methode tauscht die Texte in den beiden Labels
	public void texteTauschen() {
		//zum Sichern des Textes
		String sichern;
		
		//den Text des ersten Labels zwischenspeichern
		sichern = ausgabe1.getText();
		
		//das erste Label bekommt den Text des zweiten
		ausgabe1.setText(ausgabe2.getText());
		
		//und das zweite Label den gesicherten Text
		ausgabe2.setText(sichern);
	}
}

