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
	
	//die ID wurde automatisch mit Eclipse erg�nzt
	private static final long serialVersionUID = 9101793356610287754L;

	//ein Label und zwei Schaltfl�chen als Instanzvariablen
	private JLabel ausgabe, schriftGroesseAnzeigen, schriftAnzeige;
	private JButton schaltflaecheGroesser, schaltflaecheKleiner;
	
	//Variable f�r die aktuelle Schriftgr��e
	private int schriftGroesse;
	String schrift;
	
	//eine innere Klasse f�r den WindowListener und den ActionListener
	//die Klasse ist von WindowAdapter abgeleitet und
	//implementiert die Schnittstelle ActionListener
	class MeinKompakterListener extends WindowAdapter implements ActionListener{
		
		
		//f�r das �ffnen des Fensters
		@Override
		public void windowOpened(WindowEvent e) {
			
			//Variable f�r die Eingabe
			String eingabe = JOptionPane.showInputDialog("Geben Sie einen Text ein");
			
			//den Text in das Label setzen
			ausgabe.setText(eingabe);
			schriftGroesseAnzeigen.setText("" + schriftGroesse);;
			
			
			
			//das Fenster neu "packen"
			setSize(600, 300);
		}

		//f�r die Schaltfl�chen
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//wurde auf Gr��er geklickt
			if (e.getActionCommand().equals("Gr��er")) {
				//die Schriftgr��e um 1 erh�hen
				schriftGroesse++;		
			}
				
			//wurde auf Kleiner geklickt
			else if (e.getActionCommand().equals("Kleiner")) {
				//die Schriftgr��e um 1 verringern
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
		
		//den Konstruktor der Basisklasse aufrufen und den Fenstertitel �bergeben
		super(titel);
		
		//die drei Schaltfl�chen
		schaltflaecheGroesser = new JButton("Gr��er");
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
		schriftAnzeige = new JLabel("Schriftgr��e");
		
		
		//die Gr��e f�r die Schrift setzen
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
		
		//die Standardaktion beim Schlie�en festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//das Fenster anzeigen
		setVisible(true);
	}
}

