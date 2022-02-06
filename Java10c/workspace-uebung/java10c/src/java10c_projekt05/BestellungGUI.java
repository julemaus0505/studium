package java10c_projekt05;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class BestellungGUI extends JFrame {

	// automatisch über Eclipse erzeugt
	private static final long serialVersionUID = 6962138456296124598L;

	// für das ausgewählte Essen und die Beilage
	private String essen, beilage;

	// die Komponenten für die Auswahl der Beilage
	private JCheckBox beilage1, beilage2;

	// für das Hauptessen die ButtonGroup
	private ButtonGroup gruppe;

	// für die RadioButtons
	private JRadioButton essen1, essen2;

	// für die Bestellung und das Beenden
	private JButton schaltflaecheBestellen, schaltflaecheBeenden;

	// für die innenliegenden Container
	private JPanel panelCheckBoxen, panelRadioButtons, panelSchaltflaecheBestellen, panelSchaltflaecheBeenden;

	// die innere Klasse für die Listener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// für die Bestellung
			if (e.getActionCommand().equals("Bestellen")) {
				if (essen1.isSelected())
					essen = essen + "Schnitzel";
				if (essen2.isSelected())
					essen = essen + "Currywurst";
				if (beilage1.isSelected())
					beilage = beilage + " Pommes";
				if (beilage2.isSelected())
					beilage = beilage + " Reis";

				// wenn keine Beilage ausgewählt wurde
				if (beilage1.isSelected() == false && beilage2.isSelected() == false)
					beilage = beilage + " keine";

				// eine Meldung mit dem Essen anzeigen mitten auf dem Bildschirm
				JOptionPane.showMessageDialog(null, "Bitte sehr!\n" + essen + beilage);
				// oder über dem Fenster der Anwendung
				// JOptionPane.showMessageDialog(BestellungGUI.this, "Bitte sehr!\n" + essen +
				// beilage);

				// das Essen und die Beilage wieder zurücksetzen
				// sonst wird das Essen immer länger
				essen = "Ihr Essen: ";
				beilage = " Beilage: ";
			}
			if (e.getActionCommand().equals("Beenden"))
				System.exit(0);
		}
	}

	// der Konstruktor
	public BestellungGUI(String titel) {
		super(titel);

		// den Text für die Beilage und das Essen setzen
		essen = "Ihr Essen: ";
		beilage = " Beilage: ";

		// die Checkboxen für die Beilagen
		beilage1 = new JCheckBox("Pommes");
		beilage2 = new JCheckBox("Reis");

		// ein neues Panel erzeugen und die beiden Checkboxen in das Panel setzen
		panelCheckBoxen = new JPanel();
		panelCheckBoxen.add(beilage1);
		panelCheckBoxen.add(beilage2);

		// das Panel bekommt einen Rahmen mit Titel
		panelCheckBoxen.setBorder(new TitledBorder("Ihre Beilagen:"));

		// die ButtonGroup erzeugen
		gruppe = new ButtonGroup();

		// die RadioButtons
		essen1 = new JRadioButton("Schnitzel");
		essen2 = new JRadioButton("Currywurst");

		// als Standard ist das Schnitzel ausgewählt
		essen1.setSelected(true);

		// zur Gruppe hinzufügen
		gruppe.add(essen1);
		gruppe.add(essen2);

		// jetzt werden auch die RadioButtons in ein eigenes Panel gesetzt
		// das geht ebenfalls nicht für die Gruppe
		panelRadioButtons = new JPanel();
		panelRadioButtons.add(essen1);
		panelRadioButtons.add(essen2);

		// und auch dieses Panel bekommt einen Rahmen mit Titel
		panelRadioButtons.setBorder(new TitledBorder("Ihr Essen:"));

		// die Schaltflächen
		schaltflaecheBestellen = new JButton("Bestellen");
		schaltflaecheBeenden = new JButton("Beenden");

		// ein Gridlayout mit 2 Spalten und etwas Abstand
		// das Layout gilt jetzt nur für den "äußeren" Container
		setLayout(new GridLayout(0, 2, 10, 10));

		// die Komponenten hinzufügen
		// nach links oben kommt das erste Panel
		add(panelRadioButtons);

		// daneben das zweite Panel
		add(panelCheckBoxen);

		// die Schaltflächen werden jetzt ebenfalls in Panels gesetzt (eigener
		// Container)
		panelSchaltflaecheBestellen = new JPanel();
		panelSchaltflaecheBestellen.add(schaltflaecheBestellen);

		panelSchaltflaecheBeenden = new JPanel();
		panelSchaltflaecheBeenden.add(schaltflaecheBeenden);

		// die Panels für die Schaltflächen einfügen
		add(panelSchaltflaecheBestellen);
		add(panelSchaltflaecheBeenden);

		// den Listener verbinden
		MeinListener listener = new MeinListener();
		schaltflaecheBestellen.addActionListener(listener);
		schaltflaecheBeenden.addActionListener(listener);

		// die Standard-Aktion für das Schließen-Symbol setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// das Fenster packen und anzeigen
		pack();
		setVisible(true);
	}
}