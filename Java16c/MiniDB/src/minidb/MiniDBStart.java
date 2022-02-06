package minidb;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiniDBStart extends JFrame{
	
	//automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = -1513747909912632173L;

	//die innere Klasse f�r den ActionListener
	class MeinListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			//wurde auf Listenanzeige geklickt?
			if (event.getActionCommand().equals("liste")) {
				
				//dann die Listenanzeige starten
				anzeigeListe();
			
				//wurde auf Einzelanzeige geklickt?
			} else if (event.getActionCommand().equals("einzel")) {
				
				//dann die Einzelanzeige starten
				anzeigeEinzel();
			
				//wurde auf Neuer Eintrag geklickt?
			} else if (event.getActionCommand().equals("neu")) {
				
				//dann das Anlegen starten
				neuerEintrag();
			
				//wurde auf Beenden geklickt?
			} else if (event.getActionCommand().equals("ende")) {
				
				//dann beenden
				beenden();
			}
		}
	}
	
	//der Konstruktor
	public MiniDBStart(String titel) {
		super(titel);
		
		//ein FlowLayout
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//die Schaltfl�chen
		JButton liste = new JButton("Listenanzeige");
		liste.setActionCommand("liste");
		JButton einzel = new JButton("Einzelanzeige");
		einzel.setActionCommand("einzel");
		JButton neu = new JButton("Neuer Eintrag");
		neu.setActionCommand("neu");
		JButton beenden = new JButton("Beenden");
		beenden.setActionCommand("ende");
		
		MeinListener listener = new MeinListener();
		liste.addActionListener(listener);
		einzel.addActionListener(listener);
		neu.addActionListener(listener);
		beenden.addActionListener(listener);
	
		add(liste);
		add(einzel);
		add(neu);
		add(beenden);
		
		//Gr��e setzen, Standardverhalten festlegen und anzeigen
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	//die Methoden
	private void anzeigeListe() {
		new ListenAnzeige(this, true);
	}
	
	private void anzeigeEinzel() {
		new BearbeitenEintrag(this, true);
	}
	
	private void neuerEintrag() {
		new NeuerEintrag(this, true);
	}
	
	private void beenden() {
		System.exit(0);
	}
}
