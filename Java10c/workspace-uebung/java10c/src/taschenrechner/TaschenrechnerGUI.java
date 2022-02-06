package taschenrechner;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TaschenrechnerGUI extends JFrame {

	// automatisch über Eclipse eingefügt
	private static final long serialVersionUID = 3006212012028893840L;

	// die Komponente
	// zwei Eingabefelder
	private JTextField eingabe1;
	private JTextField eingabe2;

	// vier RadioButtons und eine Gruppe
	private JRadioButton addition;
	private JRadioButton subtraktion;
	private JRadioButton multiplikation;
	private JRadioButton division;

	// zwei Schaltflächen
	private JButton schaltflaecheBerechnen;
	private JButton schaltflaecheBeenden;

	// ein Label für die Ausgabe
	private JLabel ausgabe;

	// die innere Klasse für die Ereignisverarbeitung
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// wurde auf Beenden geklickt?
			// dann das Programm beenden
			if (e.getActionCommand().equals("ende"))
				System.exit(0);

			// wurde auf Berechnen geklickt?
			// dann eine Methode für die Berechnung aufrufen
			// und das Ergebnis anzeigen
			if (e.getActionCommand().equals("rechnen")) {
				ausgabe.setText(berechnen());
			}
		}
	}

	// der Konstruktor
	public TaschenrechnerGUI(String titel) {

		super(titel);

		// insgesamt drei Panels
		JPanel panelEinAus, panelBerechnung, panelButtons;

		// die Panels über die Methoden erstellen
		panelEinAus = panelEinAusErzeugen();
		panelBerechnung = panelBerechnungErzeugen();
		panelButtons = panelButtonErzeugen();

		// ein Gridlayout mit 3 Spalten
		setLayout(new GridLayout(0, 3));

		// die Panels hinzufügen
		add(panelEinAus);
		add(panelBerechnung);
		add(panelButtons);

		// die Standard-Aktion setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// packen und anzeigen
		pack();
		setVisible(true);

		// Größenänderungen sind nicht zugelassen
		// damit das mühsam erstellte Layout nicht durcheinander kommt
		setResizable(false);
	}

	// die Methode erzeugt das Panel für die Ein- und Ausgabe
	// und liefert es zurück
	private JPanel panelEinAusErzeugen() {
		JPanel tempPanel = new JPanel();

		// es enthält die Eingabefelder mit beschreibendem Text und die Ausgabe
		// die Länge der Felder ist auf 10 Zeichen beschränkt
		eingabe1 = new JTextField(10);
		eingabe2 = new JTextField(10);
		ausgabe = new JLabel("");

		// das Panel bekommt ein GridLaoyut mit zwei Spalten und etwas Abstand
		tempPanel.setLayout(new GridLayout(0, 2, 10, 10));

		// ein beschreibendes Label für die erste Eingabe
		tempPanel.add(new JLabel("Zahl 1:"));

		// das erste Eingabefeld
		tempPanel.add(eingabe1);

		// und jetzt das zweite Eingabefeld
		tempPanel.add(new JLabel("Zahl 2: "));
		tempPanel.add(eingabe2);

		// und nun das Ausgabefeld für das Ergebnis
		tempPanel.add(new JLabel("Ergebnis: "));
		tempPanel.add(ausgabe);

		// einen Rahmen um das Panel ziehen
		tempPanel.setBorder(new TitledBorder("Ein- und Ausgabe"));

		// das Panel zurückliefern
		return tempPanel;
	}

	// die Methode erzeugt das Panel für die Auswahl
	// der Rechenoperation und liefert es zurück
	private JPanel panelBerechnungErzeugen() {
		JPanel tempPanel = new JPanel();

		// es enthält die Gruppe mit den Optionsfeldern
		addition = new JRadioButton("Addition");
		subtraktion = new JRadioButton("Subtraktion");
		division = new JRadioButton("Division");
		multiplikation = new JRadioButton("Multiplikation");

		ButtonGroup gruppe = new ButtonGroup();
		gruppe.add(addition);
		gruppe.add(subtraktion);
		gruppe.add(multiplikation);
		gruppe.add(division);

		// die Addition ist ausgewählt
		addition.setSelected(true);

		// das Panel bekommt ein GridLaoyut mit einer Spalte
		tempPanel.setLayout(new GridLayout(0, 1));
		tempPanel.add(addition);
		tempPanel.add(subtraktion);
		tempPanel.add(multiplikation);
		tempPanel.add(division);

		// und einen Rahmen
		tempPanel.setBorder(new TitledBorder("Operation: "));

		// das Panel zurückliefern
		return tempPanel;
	}

	// die Methode erzeugt das Panel für die Schaltflächen
	// und liefert es zurück
	private JPanel panelButtonErzeugen() {
		JPanel tempPanel = new JPanel();

		schaltflaecheBeenden = new JButton(" Beenden ");

		// das Aktion-Command setzen
		schaltflaecheBeenden.setActionCommand("ende");
		schaltflaecheBerechnen = new JButton("Berechnen");
		schaltflaecheBerechnen.setActionCommand("rechnen");

		// Zwischenpanel für die Schaltflächen
		// das Panel wird linksbündig ausgerichtet mit mehr Abstand
		tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		tempPanel.add(schaltflaecheBerechnen);
		tempPanel.add(schaltflaecheBeenden);

		// die Schaltflächen mit dem Listener verbinden
		MeinListener listener = new MeinListener();
		schaltflaecheBeenden.addActionListener(listener);
		schaltflaecheBerechnen.addActionListener(listener);

		// das Panel zurückliefern
		return tempPanel;
	}

	// die Methode berechnet das Ergebnis und liefert es als
	// Zeichenkette zurück
	private String berechnen() {

		// ergebnis muss initialisiert werden
		// obwohl es in jedem Fall einen Wert bekommt
		// das kann der Compiler aber nicht erkennen :)
		double zahl1;
		double zahl2;
		double ergebnis = 0;

		// für die Steuerung der Rückgabe
		boolean fehlerFlag = false;

		// die Werte beschaffen, umformen und zuweisen
		zahl1 = Double.parseDouble(eingabe1.getText());
		zahl2 = Double.parseDouble(eingabe2.getText());

		// welche Operation ist ausgewählt?
		if (addition.isSelected())
			ergebnis = zahl1 + zahl2;
		if (subtraktion.isSelected())
			ergebnis = zahl1 - zahl2;
		if (multiplikation.isSelected())
			ergebnis = zahl1 * zahl2;

		// bei der Division überprüfen wir den zweiten Wert auf 0
		if (division.isSelected()) {
			if (zahl2 != 0)
				ergebnis = zahl1 / zahl2;
			else
				fehlerFlag = true;
		}
		// wenn es keine Probleme gegeben hat, liefern wir das Ergebnis zurück
		if (fehlerFlag == false)
			return Double.toString(ergebnis);
		else
			return ("Nicht definiert");
	}
}
