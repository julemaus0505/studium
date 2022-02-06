package java09c_projekt08;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FensterFlow extends JFrame{
	
	private static final long serialVersionUID = -803559619873961619L;

	public FensterFlow(String titel) {
		super(titel);
		JButton schaltflaeche1 = new JButton("Schaltfläche 1");
		JButton schaltflaeche2 = new JButton("Schaltfläche 2");
		JButton schaltflaeche3 = new JButton("Schaltfläche 3");
		JButton schaltflaeche4 = new JButton("Schaltfläche 4");
		JButton schaltflaeche5 = new JButton("Schaltfläche 5");
		
		//die Fenstergröße setzen
		setSize(250,400);
		
		//das Flow-Layout setzen
		FlowLayout layout = new FlowLayout();
		
		//die Komponenten sollen linksbündig ausgerichtet werden
		layout.setAlignment(FlowLayout.LEFT);
		
		//und mit 30 Pixeln Abstand nach oben und unten
		layout.setHgap(30);
		layout.setVgap(30);
		setLayout(layout);

		//die Schaltfläche einfügen
		add(schaltflaeche1);
		add(schaltflaeche2);
		add(schaltflaeche3);
		add(schaltflaeche4);
		add(schaltflaeche5);
		
		
		//automatisch anordnen
		Dimension bGroesse = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);
		
		//und anzeigen
		setVisible(true);
	}
}

