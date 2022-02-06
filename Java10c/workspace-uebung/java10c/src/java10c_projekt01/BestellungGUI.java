package java10c_projekt01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class BestellungGUI extends JFrame {

	private static final long serialVersionUID = 3880289585051026931L;

	// f�r das ausgew�hlte Essen und die Beilage
	private String essen;
	private String beilage;

	// die Komponenten f�r die Auswahl der Beilage
	private JCheckBox beilage1;
	private JCheckBox beilage2;

	// f�r das Hauptessen die ButtonGroup
	private ButtonGroup gruppe;

	// f�r die JRadioButtons
	private JRadioButton essen1;
	private JRadioButton essen2;

	// f�r die Bestellung und das Beenden
	private JButton schaltflaecheBestellen;
	private JButton schaltflaecheBeenden;

	// die innere Klasse f�r die Listener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// f�r die Bestellung
			if (e.getActionCommand().equals(" Bestellen")) {
				if (essen1.isSelected()) {
					essen = essen + " Schnitzel";
				}
				if (essen2.isSelected()) {
					essen = essen + " Currywurst";
				}
				if (beilage1.isSelected()) {
					beilage = beilage + " Pommes";

					if (beilage2.isSelected()) {
						beilage = beilage + " Reis";
					}
				}
				// wenn keine Beilage ausgew�hlt wurde
				// bitte in einer Zeile eingeben
				if (beilage1.isSelected() == false && beilage2.isSelected() == false) {
					beilage = beilage + " keine";
				}
				// eine Meldung mit dem Essen anzeigen mitten auf dem Bildschirm
				// JOptionPane.showMessageDialog(null, "Bitte sehr!\n" + essen + beilage);
				// oder �ber dem Fenster der Anwendung
				JOptionPane.showMessageDialog(BestellungGUI.this, "Bitte sehr!\n" + essen + beilage);

				// das Essen und die Beilage wieder zur�cksetzen
				// sonst wird das Essen immer l�nger
				essen = " Ihr Essen: ";
				beilage = " Ihre Beilage: ";
			}
			if (e.getActionCommand().equals(" Beenden")) {
				System.exit(0);
			}
		}
	}

	// der Konstruktor
	public BestellungGUI(String titel) {
		super(titel);

		// den Text f�r die Beilage und das Essen setzen
		essen = " Ihr Essen: ";
		beilage = " Beilage: ";

		// die Checkboxen f�r die Beilagen erstellen
		beilage1 = new JCheckBox(" Pommes");
		beilage2 = new JCheckBox(" Reis");

		// die ButtonGroup erzeugen
		gruppe = new ButtonGroup();

		// die RadioButtons erstellen
		essen1 = new JRadioButton(" Schnitzel");
		essen2 = new JRadioButton(" Currywurst");

		// als Standard ist das Schnitzel ausgew�hlt
		essen1.setSelected(true);

		// zur Gruppe hinzuf�gen und anzeigen
		gruppe.add(essen1);
		gruppe.add(essen2);

		// die Schaltfl�chen Grafik erstellen(Button erstellen)
		schaltflaecheBestellen = new JButton(" Bestellen");
		schaltflaecheBeenden = new JButton(" Beenden");

		// ein Gridlayout mit zwei Spalten und etwas Abstand
		setLayout(new GridLayout(0, 2, 20, 20));

		// die Komponenten hinzuf�gen erst einmal zwei beschreibende Labels
		add(new JLabel(" Ihr Essen"));
		add(new JLabel(" Ihre Beilage"));

		// die Radiobuttons werden einzeln eingef�gt (und nicht die Gruppe!!!)
		add(essen1);
		add(beilage1);
		add(essen2);
		add(beilage2);
		add(schaltflaecheBestellen);
		add(schaltflaecheBeenden);

		// den Listener verbinden type name = new type();
		MeinListener listener = new MeinListener();
		schaltflaecheBestellen.addActionListener(listener);
		schaltflaecheBeenden.addActionListener(listener);

		// die Standardaktion f�r das Schlie�ensymbol setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// das Fenster packen und anzeigen
		pack();
		setVisible(true);

	}

}
