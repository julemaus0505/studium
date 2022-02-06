package java09c_projekt08;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FensterNull extends JFrame{

	//die ID wurde �ber Eclipse eingef�gt
	private static final long serialVersionUID = 4646725498369891798L;

	//der Konstruktor
	public FensterNull(String titel) {
		super(titel);
		JButton schaltflaeche1 = new JButton("Schaltfl�che 1");
		JButton schaltflaeche2 = new JButton("Schaltfl�che 2");
		JButton schaltflaeche3 = new JButton("Schaltfl�che 3");
		JButton schaltflaeche4 = new JButton("Schaltfl�che 4");
		JButton schaltflaeche5 = new JButton("Schaltfl�che 5");

		//den Layout-Manager abschalten
		setLayout(null);
		
		//die Schaltfl�chen "per Hand"  positionieren
		schaltflaeche1.setBounds(20, 20, 100, 25);
		add(schaltflaeche1);
		
		schaltflaeche2.setBounds(20, 50, 200, 25);
		add(schaltflaeche2);
		
		schaltflaeche3.setBounds(20, 100, 300, 25);
		add(schaltflaeche3);
		
		schaltflaeche4.setBounds(20, 200, 200, 75);
		add(schaltflaeche4);
		
		schaltflaeche5.setBounds(10, 10, 300, 25);
		add(schaltflaeche5);

		//die Fenstergr��e setzen
		setSize(400,400);
		
		//automatisch anordnen
		setLocationByPlatform(true);
		
		// oder wenn es mittig sein soll
		Dimension bGroesse = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);
		
		//und anzeigen
		setVisible(true);
	}
}

