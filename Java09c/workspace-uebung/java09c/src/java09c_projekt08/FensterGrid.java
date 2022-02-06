package java09c_projekt08;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FensterGrid extends JFrame {
	
	//die ID wurde über Eclipse hinzugefügt
	private static final long serialVersionUID = -3329150831599445770L;

	//der Konstruktor
	public FensterGrid(String titel) {
		super(titel);
		JButton schaltflaeche1 = new JButton("Schaltfläche 1");
		JButton schaltflaeche2 = new JButton("Schaltfläche 2");
		JButton schaltflaeche3 = new JButton("Schaltfläche 3");
		JButton schaltflaeche4 = new JButton("Schaltfläche 4");
		JButton schaltflaeche5 = new JButton("Schaltfläche 5");
		

		//ein neues Grid-Layout mit 2 Spalten erstellen
		//der Abstand nach oben und unten beträgt jeweils 10 Pixel
		setLayout(new GridLayout(0,2,10,10));
		
		//die Schaltfläche einfügen
		add(schaltflaeche1);
		add(schaltflaeche2);
		add(schaltflaeche3);
		add(schaltflaeche4);
		add(schaltflaeche5);

		//die Fenstergröße setzen
		setSize(400,400);
		
		//automatisch anordnen
		Dimension bGroesse = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);
		
		//und anzeigen
		setVisible(true);
	}
}

