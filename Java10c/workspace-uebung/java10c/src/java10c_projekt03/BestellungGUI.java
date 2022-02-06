package java10c_projekt03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class BestellungGUI extends JFrame {
	// automatisch über Eclipse erzeugt
	private static final long serialVersionUID = 664815886756071722L;

	// für das ausgewählte Essen und die Beilage
	private String essen, beilage;

	// die verfügbaren Essen werden in einem Array ablegt
	private String[] essenAuswahl = { "Schnitzel", "Currywurst", "Bratwurst", "Bockwurst", "Fischstäbchen" };

	// die Komponenten
	// für die Auswahl der Beilage
	private JCheckBox beilage1, beilage2;
	// für das Hauptessen
	// diesmal als Listenfeld
	private JList<String> auswahlListe;
	// für die Bestellung und das Beenden
	private JButton schaltflaecheBestellen, schaltflaecheBeenden;

	// die innere Klasse für die Listener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// für die Bestellung
			if (e.getActionCommand().equals("Bestellen")) {
				// das Essen aus dem aktuellen Eintrag des Listenfeldes bestimmen
				// ist überhaupt ein Eintrag in der Liste markiert?
				if (auswahlListe.getSelectedIndex() == -1) {
					// wenn nicht, zeigen wir eine Fehler-Meldung an und verlassen die Methode
					// sofort wieder
					JOptionPane.showMessageDialog(BestellungGUI.this, "Bitte wählen Sie ein Essen aus", "Fehler",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				essen = essen + auswahlListe.getSelectedValue();
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
		auswahlListe = new JList<String>(essenAuswahl);

		// die Schaltfläche
		schaltflaecheBestellen = new JButton("Bestellen");
		schaltflaecheBeenden = new JButton("Beenden");

		// ein Gridlayout mit 2 Spalten und etwas Abstand
		setLayout(new GridLayout(0, 2, 10, 10));
		// die Komponenten hinzufügen
		// erst einmal zwei beschreibende Labels
		add(new JLabel("Ihr Esssen"));
		add(new JLabel("Ihre Beilage"));
		// das Listenfeld eingefügen
		add(auswahlListe);
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
