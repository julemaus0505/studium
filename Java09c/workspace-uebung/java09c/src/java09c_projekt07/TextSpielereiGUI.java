package java09c_projekt07;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;


public class TextSpielereiGUI extends JFrame{
	
	//die ID wurde automatisch mit Eclipse erg�nzt
	private static final long serialVersionUID = 8907842394954376100L;

	//ein Label und zwei Schaltfl�chen als Instanzvariablen
	private JLabel ausgabe;
	private JButton schaltflaecheGroesser, schaltflaecheKleiner;
	
	//f�r die aktuelle Schriftgr��e
	private int schriftGroesse;
	
	//eine innere Klasse f�r den WindowListener und den ActionListener
	//die Klasse ist von WindowAdapter abgeleitet und
	//implementiert die Schnittstelle ActionListener
	class MeinKompakterListener extends WindowAdapter implements ActionListener{
	
		//f�r das �ffnen des Fensters
		@Override
		public void windowOpened(WindowEvent e) {
		
			//f�r die Eingabe
			String eingabe;
			eingabe = JOptionPane.showInputDialog("Geben Sie einen Text ein");
			
			//den Text in das Label setzen
			ausgabe.setText(eingabe);
		}

		//f�r die Schaltfl�chen
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//wurde auf Gr��er geklickt
			if (e.getActionCommand().equals("Gr��er")) 
			
				//die Schriftgr��e um 1 erh�hen
				schriftGroesse++;
			
			//wurde auf Kleiner geklickt
			if (e.getActionCommand().equals("Kleiner")) 
			
				//die Schriftgr��e um 1 verringern
				schriftGroesse--;
			
			//und neu setzen
			ausgabe.setFont(new Font("Arial", Font.PLAIN, schriftGroesse));
		}
	}

	//der Konstruktor
	//er erzeugt die Komponenten und setzt die Fenstereinstellungen
	public TextSpielereiGUI(String titel) {
		
		//den Konstruktor der Basisklasse aufrufen und den Fenstertitel �bergeben
		super(titel);
		
		//die beiden Schaltfl�chen
		schaltflaecheGroesser = new JButton("Gr��er");
		schaltflaecheKleiner = new JButton("Kleiner");
		JButton schaltflaecheBeenden = new JButton("Beenden");
		
		//die Bildschirmtipps f�r die Schaltfl�chen setzen
		schaltflaecheGroesser.setToolTipText("Schrift vergr��ern");
		schaltflaecheKleiner.setToolTipText("Schrift verkleinern");
		schaltflaecheBeenden.setToolTipText("Beenden");
		
		//ein leeres Label
		ausgabe = new JLabel();
		
		//die Gr��e f�r die Schrift setzen
		schriftGroesse = 10;
		
		//die Schriftart im Label setzen
		ausgabe.setFont(new Font("Arial",Font.PLAIN, schriftGroesse));
		
		//einen Rahmen um das Label setzen
		ausgabe.setBorder(new BevelBorder(BevelBorder.LOWERED));

		//ein Layout anwenden
		setLayout(new FlowLayout());
		
		add(schaltflaecheGroesser);
		add(schaltflaecheKleiner);
		add(schaltflaecheBeenden);
		add(ausgabe);
		
		//den Listener verbinden
		addWindowListener(new MeinKompakterListener());
		schaltflaecheGroesser.addActionListener(new MeinKompakterListener());
		schaltflaecheKleiner.addActionListener(new MeinKompakterListener());
		schaltflaecheBeenden.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//die Gr��e des Fensters fest setzen
		//hier auf 600 * 100
		setSize(600, 300);
		
		//danach aber nicht mehr "packen", sonst wird die Gr��e direkt wieder ver�ndert
		//pack();
		//die Standardaktion beim Schlie�en festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//automatisch eine gute Position suchen lassen
		//setLocationByPlatform(true);
		//zentriert auf dem Desktop darstellen
		//die Bildschirmaufl�sung beschaffen und in einer Variablen vom Typ Dimension speichern
		Dimension bGroesse= Toolkit.getDefaultToolkit().getScreenSize();
		
		//das Fenster positionieren
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);
	
		//das Fenster anzeigen
		setVisible(true);
	}
}

