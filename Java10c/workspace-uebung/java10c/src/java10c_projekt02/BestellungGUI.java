package java10c_projekt02;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BestellungGUI extends JFrame {

	private static final long serialVersionUID = -7733155589752098986L;

	// für das ausgewählte Essen und die Beilage
	private String essen, beilage;

	// die verfügbaren Essen werden in einem Array ablegt
	// bitte in einer Zeile eingeben
	private String[] essenAuswahl = { "Schnitzel", "Currywurst", "Bratwurst", "Bockwurst", "Fischstäbchen" };

	// die Komponenten
	// für die Auswahl der Beilage
	private JCheckBox beilage1, beilage2;
	// für das Hauptessen
	// diesmal ein Kombinationsfeld
	private JComboBox<String> auswahl;
	// für die Bestellung und das Beenden
	private JButton schaltflaecheBestellen, schaltflaecheBeenden;

	// die innere Klasse für die Listener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// für die Bestellung
			if (e.getActionCommand().equals("Bestellen")) {
				// das Essen aus dem aktuellen Eintrag des Kombinationsfeldes bestimmen
				essen = essen + auswahl.getSelectedItem().toString();
				if (beilage1.isSelected())
					beilage = beilage + " Pommes";
				if (beilage2.isSelected())
					beilage = beilage + " Reis";
				// wenn keine Beilage ausgewählt wurde
				if (beilage1.isSelected() == false && beilage2.isSelected() == false)
					beilage = beilage + " keine";
				// eine Meldung mit dem Essen anzeigen
				JOptionPane.showMessageDialog(BestellungGUI.this, "Bitte sehr!\n" + essen + beilage);
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

		beilage1 = new JCheckBox("Pommes");
		beilage2 = new JCheckBox("Reis");

		// die Liste erzeugen
		// die Daten kommen aus dem Array essenAuswahl
		auswahl = new JComboBox<String>(essenAuswahl);

		// die Schaltfläche
		schaltflaecheBestellen = new JButton("Bestellen");
		schaltflaecheBeenden = new JButton("Beenden");

		// ein Gridlayout mit 2 Spalten und etwas Abstand
		setLayout(new GridLayout(0, 2, 10, 10));
		// die Komponenten hinzufügen
		// erst einmal zwei beschreibende Labels
		add(new JLabel("Ihr Essen"));
		add(new JLabel("Ihre Beilage"));
		// das Kombinationsfeld einfügen
		add(auswahl);
		// die erste Beilage
		add(beilage1);
		// ein leeres Label, damit das Layout nicht durcheinander kommt
		add(new JLabel());
		// die zweite Beilage
		add(beilage2);
		add(schaltflaecheBestellen);
		add(schaltflaecheBeenden);

		// den Listener verbinden
		MeinListener listener = new MeinListener();
		schaltflaecheBestellen.addActionListener(listener);
		schaltflaecheBeenden.addActionListener(listener);

		// die Standard-Aktion setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// das Fenster "packen" und anzeigen
		pack();
		setVisible(true);
	}
}