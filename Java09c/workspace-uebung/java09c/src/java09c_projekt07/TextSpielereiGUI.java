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
	
	//die ID wurde automatisch mit Eclipse ergänzt
	private static final long serialVersionUID = 8907842394954376100L;

	//ein Label und zwei Schaltflächen als Instanzvariablen
	private JLabel ausgabe;
	private JButton schaltflaecheGroesser, schaltflaecheKleiner;
	
	//für die aktuelle Schriftgröße
	private int schriftGroesse;
	
	//eine innere Klasse für den WindowListener und den ActionListener
	//die Klasse ist von WindowAdapter abgeleitet und
	//implementiert die Schnittstelle ActionListener
	class MeinKompakterListener extends WindowAdapter implements ActionListener{
	
		//für das Öffnen des Fensters
		@Override
		public void windowOpened(WindowEvent e) {
		
			//für die Eingabe
			String eingabe;
			eingabe = JOptionPane.showInputDialog("Geben Sie einen Text ein");
			
			//den Text in das Label setzen
			ausgabe.setText(eingabe);
		}

		//für die Schaltflächen
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//wurde auf Größer geklickt
			if (e.getActionCommand().equals("Größer")) 
			
				//die Schriftgröße um 1 erhöhen
				schriftGroesse++;
			
			//wurde auf Kleiner geklickt
			if (e.getActionCommand().equals("Kleiner")) 
			
				//die Schriftgröße um 1 verringern
				schriftGroesse--;
			
			//und neu setzen
			ausgabe.setFont(new Font("Arial", Font.PLAIN, schriftGroesse));
		}
	}

	//der Konstruktor
	//er erzeugt die Komponenten und setzt die Fenstereinstellungen
	public TextSpielereiGUI(String titel) {
		
		//den Konstruktor der Basisklasse aufrufen und den Fenstertitel übergeben
		super(titel);
		
		//die beiden Schaltflächen
		schaltflaecheGroesser = new JButton("Größer");
		schaltflaecheKleiner = new JButton("Kleiner");
		JButton schaltflaecheBeenden = new JButton("Beenden");
		
		//die Bildschirmtipps für die Schaltflächen setzen
		schaltflaecheGroesser.setToolTipText("Schrift vergrößern");
		schaltflaecheKleiner.setToolTipText("Schrift verkleinern");
		schaltflaecheBeenden.setToolTipText("Beenden");
		
		//ein leeres Label
		ausgabe = new JLabel();
		
		//die Größe für die Schrift setzen
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
		
		//die Größe des Fensters fest setzen
		//hier auf 600 * 100
		setSize(600, 300);
		
		//danach aber nicht mehr "packen", sonst wird die Größe direkt wieder verändert
		//pack();
		//die Standardaktion beim Schließen festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//automatisch eine gute Position suchen lassen
		//setLocationByPlatform(true);
		//zentriert auf dem Desktop darstellen
		//die Bildschirmauflösung beschaffen und in einer Variablen vom Typ Dimension speichern
		Dimension bGroesse= Toolkit.getDefaultToolkit().getScreenSize();
		
		//das Fenster positionieren
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);
	
		//das Fenster anzeigen
		setVisible(true);
	}
}

