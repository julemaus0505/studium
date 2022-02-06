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

	// automatisch �ber Eclipse eingef�gt
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

	// zwei Schaltfl�chen
	private JButton schaltflaecheBerechnen;
	private JButton schaltflaecheBeenden;

	// ein Label f�r die Ausgabe
	private JLabel ausgabe;

	// die innere Klasse f�r die Ereignisverarbeitung
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// wurde auf Beenden geklickt?
			// dann das Programm beenden
			if (e.getActionCommand().equals("ende"))
				System.exit(0);

			// wurde auf Berechnen geklickt?
			// dann eine Methode f�r die Berechnung aufrufen
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

		// die Panels �ber die Methoden erstellen
		panelEinAus = panelEinAusErzeugen();
		panelBerechnung = panelBerechnungErzeugen();
		panelButtons = panelButtonErzeugen();

		// ein Gridlayout mit 3 Spalten
		setLayout(new GridLayout(0, 3));

		// die Panels hinzuf�gen
		add(panelEinAus);
		add(panelBerechnung);
		add(panelButtons);

		// die Standard-Aktion setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// packen und anzeigen
		pack();
		setVisible(true);

		// Gr��en�nderungen sind nicht zugelassen
		// damit das m�hsam erstellte Layout nicht durcheinander kommt
		setResizable(false);
	}

	// die Methode erzeugt das Panel f�r die Ein- und Ausgabe
	// und liefert es zur�ck
	private JPanel panelEinAusErzeugen() {
		JPanel tempPanel = new JPanel();

		// es enth�lt die Eingabefelder mit beschreibendem Text und die Ausgabe
		// die L�nge der Felder ist auf 10 Zeichen beschr�nkt
		eingabe1 = new JTextField(10);
		eingabe2 = new JTextField(10);
		ausgabe = new JLabel("");

		// das Panel bekommt ein GridLaoyut mit zwei Spalten und etwas Abstand
		tempPanel.setLayout(new GridLayout(0, 2, 10, 10));

		// ein beschreibendes Label f�r die erste Eingabe
		tempPanel.add(new JLabel("Zahl 1:"));

		// das erste Eingabefeld
		tempPanel.add(eingabe1);

		// und jetzt das zweite Eingabefeld
		tempPanel.add(new JLabel("Zahl 2: "));
		tempPanel.add(eingabe2);

		// und nun das Ausgabefeld f�r das Ergebnis
		tempPanel.add(new JLabel("Ergebnis: "));
		tempPanel.add(ausgabe);

		// einen Rahmen um das Panel ziehen
		tempPanel.setBorder(new TitledBorder("Ein- und Ausgabe"));

		// das Panel zur�ckliefern
		return tempPanel;
	}

	// die Methode erzeugt das Panel f�r die Auswahl
	// der Rechenoperation und liefert es zur�ck
	private JPanel panelBerechnungErzeugen() {
		JPanel tempPanel = new JPanel();

		// es enth�lt die Gruppe mit den Optionsfeldern
		addition = new JRadioButton("Addition");
		subtraktion = new JRadioButton("Subtraktion");
		division = new JRadioButton("Division");
		multiplikation = new JRadioButton("Multiplikation");

		ButtonGroup gruppe = new ButtonGroup();
		gruppe.add(addition);
		gruppe.add(subtraktion);
		gruppe.add(multiplikation);
		gruppe.add(division);

		// die Addition ist ausgew�hlt
		addition.setSelected(true);

		// das Panel bekommt ein GridLaoyut mit einer Spalte
		tempPanel.setLayout(new GridLayout(0, 1));
		tempPanel.add(addition);
		tempPanel.add(subtraktion);
		tempPanel.add(multiplikation);
		tempPanel.add(division);

		// und einen Rahmen
		tempPanel.setBorder(new TitledBorder("Operation: "));

		// das Panel zur�ckliefern
		return tempPanel;
	}

	// die Methode erzeugt das Panel f�r die Schaltfl�chen
	// und liefert es zur�ck
	private JPanel panelButtonErzeugen() {
		JPanel tempPanel = new JPanel();

		schaltflaecheBeenden = new JButton(" Beenden ");

		// das Aktion-Command setzen
		schaltflaecheBeenden.setActionCommand("ende");
		schaltflaecheBerechnen = new JButton("Berechnen");
		schaltflaecheBerechnen.setActionCommand("rechnen");

		// Zwischenpanel f�r die Schaltfl�chen
		// das Panel wird linksb�ndig ausgerichtet mit mehr Abstand
		tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		tempPanel.add(schaltflaecheBerechnen);
		tempPanel.add(schaltflaecheBeenden);

		// die Schaltfl�chen mit dem Listener verbinden
		MeinListener listener = new MeinListener();
		schaltflaecheBeenden.addActionListener(listener);
		schaltflaecheBerechnen.addActionListener(listener);

		// das Panel zur�ckliefern
		return tempPanel;
	}

	// die Methode berechnet das Ergebnis und liefert es als
	// Zeichenkette zur�ck
	private String berechnen() {

		// ergebnis muss initialisiert werden
		// obwohl es in jedem Fall einen Wert bekommt
		// das kann der Compiler aber nicht erkennen :)
		double zahl1;
		double zahl2;
		double ergebnis = 0;

		// f�r die Steuerung der R�ckgabe
		boolean fehlerFlag = false;

		// die Werte beschaffen, umformen und zuweisen
		zahl1 = Double.parseDouble(eingabe1.getText());
		zahl2 = Double.parseDouble(eingabe2.getText());

		// welche Operation ist ausgew�hlt?
		if (addition.isSelected())
			ergebnis = zahl1 + zahl2;
		if (subtraktion.isSelected())
			ergebnis = zahl1 - zahl2;
		if (multiplikation.isSelected())
			ergebnis = zahl1 * zahl2;

		// bei der Division �berpr�fen wir den zweiten Wert auf 0
		if (division.isSelected()) {
			if (zahl2 != 0)
				ergebnis = zahl1 / zahl2;
			else
				fehlerFlag = true;
		}
		// wenn es keine Probleme gegeben hat, liefern wir das Ergebnis zur�ck
		if (fehlerFlag == false)
			return Double.toString(ergebnis);
		else
			return ("Nicht definiert");
	}
}
