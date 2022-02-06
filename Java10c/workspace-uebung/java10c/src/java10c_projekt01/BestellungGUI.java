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

	// für das ausgewählte Essen und die Beilage
	private String essen;
	private String beilage;

	// die Komponenten für die Auswahl der Beilage
	private JCheckBox beilage1;
	private JCheckBox beilage2;

	// für das Hauptessen die ButtonGroup
	private ButtonGroup gruppe;

	// für die JRadioButtons
	private JRadioButton essen1;
	private JRadioButton essen2;

	// für die Bestellung und das Beenden
	private JButton schaltflaecheBestellen;
	private JButton schaltflaecheBeenden;

	// die innere Klasse für die Listener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// für die Bestellung
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
				// wenn keine Beilage ausgewählt wurde
				// bitte in einer Zeile eingeben
				if (beilage1.isSelected() == false && beilage2.isSelected() == false) {
					beilage = beilage + " keine";
				}
				// eine Meldung mit dem Essen anzeigen mitten auf dem Bildschirm
				// JOptionPane.showMessageDialog(null, "Bitte sehr!\n" + essen + beilage);
				// oder über dem Fenster der Anwendung
				JOptionPane.showMessageDialog(BestellungGUI.this, "Bitte sehr!\n" + essen + beilage);

				// das Essen und die Beilage wieder zurücksetzen
				// sonst wird das Essen immer länger
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

		// den Text für die Beilage und das Essen setzen
		essen = " Ihr Essen: ";
		beilage = " Beilage: ";

		// die Checkboxen für die Beilagen erstellen
		beilage1 = new JCheckBox(" Pommes");
		beilage2 = new JCheckBox(" Reis");

		// die ButtonGroup erzeugen
		gruppe = new ButtonGroup();

		// die RadioButtons erstellen
		essen1 = new JRadioButton(" Schnitzel");
		essen2 = new JRadioButton(" Currywurst");

		// als Standard ist das Schnitzel ausgewählt
		essen1.setSelected(true);

		// zur Gruppe hinzufügen und anzeigen
		gruppe.add(essen1);
		gruppe.add(essen2);

		// die Schaltflächen Grafik erstellen(Button erstellen)
		schaltflaecheBestellen = new JButton(" Bestellen");
		schaltflaecheBeenden = new JButton(" Beenden");

		// ein Gridlayout mit zwei Spalten und etwas Abstand
		setLayout(new GridLayout(0, 2, 20, 20));

		// die Komponenten hinzufügen erst einmal zwei beschreibende Labels
		add(new JLabel(" Ihr Essen"));
		add(new JLabel(" Ihre Beilage"));

		// die Radiobuttons werden einzeln eingefügt (und nicht die Gruppe!!!)
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

		// die Standardaktion für das Schließensymbol setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// das Fenster packen und anzeigen
		pack();
		setVisible(true);

	}

}
