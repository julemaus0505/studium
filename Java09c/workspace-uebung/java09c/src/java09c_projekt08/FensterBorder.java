package java09c_projekt08;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FensterBorder extends JFrame{
	
	//die ID wurde automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = 7661252556514353510L;

	public FensterBorder(String titel) {
		super(titel);
		JButton schaltflaeche1 = new JButton("Schaltfl�che 1");
		JButton schaltflaeche2 = new JButton("Schaltfl�che 2");
		JButton schaltflaeche3 = new JButton("Schaltfl�che 3");
		JButton schaltflaeche4 = new JButton("Schaltfl�che 4");
		JButton schaltflaeche5 = new JButton("Schaltfl�che 5");

		//ein neues Border-Layout mit je 10 Pixeln Abstand setzen
		setLayout(new BorderLayout(10,10));
		
		//die Schaltfl�che einf�gen
		//dabei muss die "Himmelsrichtung" bzw. die Mitte angegeben werden
		add(BorderLayout.NORTH,schaltflaeche1);
		add(BorderLayout.EAST,schaltflaeche2);
		add(BorderLayout.CENTER,schaltflaeche3);
		add(BorderLayout.SOUTH,schaltflaeche4);
		add(BorderLayout.WEST,schaltflaeche5);
		
		//die Fenstergr��e setzen
		setSize(600,600);
		
		//automatisch anordnen
		//die Bildschirmaufl�sung beschaffen und in einer
		//Variablen vom Typ Dimension speichern
		//bitte jeweils als eine Zeile eingeben
		Dimension bGroesse= Toolkit.getDefaultToolkit().getScreenSize();
		
		//das Fenster positionieren
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);
		
		//und anzeigen
		setVisible(true);
	}
}

