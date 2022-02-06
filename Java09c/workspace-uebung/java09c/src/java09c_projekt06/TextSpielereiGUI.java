package java09c_projekt06;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class TextSpielereiGUI extends JFrame{
	
	//die ID wurde automatisch mit Eclipse ergänzt
	private static final long serialVersionUID = 9101793356610287754L;

	//ein Label und zwei Schaltflächen als Instanzvariablen
	private JLabel ausgabe, schriftGroesseAnzeigen, schriftAnzeige;
	private JButton schaltflaecheGroesser, schaltflaecheKleiner;
	
	//Variable für die aktuelle Schriftgröße
	private int schriftGroesse;
	String schrift;
	
	//eine innere Klasse für den WindowListener und den ActionListener
	//die Klasse ist von WindowAdapter abgeleitet und
	//implementiert die Schnittstelle ActionListener
	class MeinKompakterListener extends WindowAdapter implements ActionListener{
		
		
		//für das Öffnen des Fensters
		@Override
		public void windowOpened(WindowEvent e) {
			
			//Variable für die Eingabe
			String eingabe = JOptionPane.showInputDialog("Geben Sie einen Text ein");
			
			//den Text in das Label setzen
			ausgabe.setText(eingabe);
			schriftGroesseAnzeigen.setText("" + schriftGroesse);;
			
			
			
			//das Fenster neu "packen"
			setSize(600, 300);
		}

		//für die Schaltflächen
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//wurde auf Größer geklickt
			if (e.getActionCommand().equals("Größer")) {
				//die Schriftgröße um 1 erhöhen
				schriftGroesse++;		
			}
				
			//wurde auf Kleiner geklickt
			else if (e.getActionCommand().equals("Kleiner")) {
				//die Schriftgröße um 1 verringern
				schriftGroesse--;
				
			}
			
			schriftGroesseAnzeigen.setText(Integer.toString(schriftGroesse));
			    
			
			//und neu setzen
			ausgabe.setFont(new Font("Arial", Font.PLAIN, schriftGroesse));
			
			
			//das Fenster neu "packen"
			setSize(600, 300);
		}
	}

	//der Konstruktor
	//er erzeugt die Komponenten und setzt die Fenstereinstellungen
	public TextSpielereiGUI(String titel) {
		
		//den Konstruktor der Basisklasse aufrufen und den Fenstertitel übergeben
		super(titel);
		
		//die drei Schaltflächen
		schaltflaecheGroesser = new JButton("Größer");
		schaltflaecheKleiner = new JButton("Kleiner");
		JButton schaltflaecheBeenden = new JButton("Beenden");
		
		schaltflaecheBeenden.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} );
	
		
		//ein leeres Label
		ausgabe = new JLabel();
		schriftGroesseAnzeigen = new JLabel("" + schriftGroesse);
		schriftAnzeige = new JLabel("Schriftgröße");
		
		
		//die Größe für die Schrift setzen
		schriftGroesse = 20;
		
		//die Schriftart im Label setzen
		ausgabe.setFont(new Font("Arial",Font.PLAIN, schriftGroesse));
		schriftAnzeige.setFont(new Font("Arial",Font.PLAIN, schriftGroesse));
		schriftGroesseAnzeigen.setFont(new Font("Arial",Font.PLAIN, schriftGroesse));
		
		//ein Layout anwenden
		setLayout(new GridLayout(2,3));
		add(schaltflaecheGroesser);
		add(schaltflaecheKleiner);
		add(schaltflaecheBeenden);
		add(schriftAnzeige);
		add(schriftGroesseAnzeigen);
		add(ausgabe);
		
		//den Listener verbinden
		MeinKompakterListener listener = new MeinKompakterListener();
		addWindowListener(listener);
		schaltflaecheGroesser.addActionListener(listener);
		schaltflaecheKleiner.addActionListener(listener);
		schaltflaecheBeenden.addActionListener(listener);
		
		//das Fenster packen
		setSize(600, 300);
		
		//die Standardaktion beim Schließen festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//das Fenster anzeigen
		setVisible(true);
	}
}

