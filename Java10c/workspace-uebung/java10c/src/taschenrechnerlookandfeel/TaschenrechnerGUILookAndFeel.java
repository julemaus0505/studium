package taschenrechnerlookandfeel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class TaschenrechnerGUILookAndFeel extends JFrame {

	// automatisch über Eclipse eingefügt
	private static final long serialVersionUID = -3091095238202017352L;

	// die Komponente
	// zwei Eingabefelder
	private JTextField eingabe1, eingabe2;
	
	// vier RadioButtons und eine Gruppe
	private JRadioButton addition, subtraktion, multiplikation, division;
	
	// zwei Schaltflächen
	private JButton schaltflaecheBerechnen, schaltflaecheBeenden;
	
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
			if (e.getActionCommand().equals("rechnen"))
				ausgabe.setText(berechnen());
		}
	}

	// der Konstruktor
	// er bekommt jetzt auch das Look & Feel
	public TaschenrechnerGUILookAndFeel(String titel, String lookAndFeel) {

		super(titel);

		// das Look & Feel setzen
		// die Ausnahmebehandlung ist zwingend erforderlich
		try {
			UIManager.setLookAndFeel(lookAndFeel);
		}
		
		// wenn es nicht geht, bleibt alles wie es ist
		catch (Exception e) {
		}

		// insgesamt vier Panels
		JPanel panelEinAus, panelBerechnung, panelButtons, gross;

		// die Panels über die Methoden erstellen
		panelEinAus = panelEinAusErzeugen();
		panelBerechnung = panelBerechnungErzeugen();
		panelButtons = panelButtonErzeugen();

		// das Border-Layout benutzen
		// es ist Standard und muss nicht gesetzt werden

		// die Panels hinzufügen
		// die beiden größeren Panel fassen wir noch einmal zusammen
		gross = new JPanel();
		gross.add(panelEinAus);
		gross.add(panelBerechnung);
		
		// die beiden kommen in die Mitte
		add(gross, BorderLayout.CENTER);
		
		// das Panel mit den Buttons nach rechts
		add(panelButtons, BorderLayout.EAST);

		// die Standard-Aktion setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// packen und anzeigen
		// die Position wird vom Betriebssystem festgelegt
		pack();
		setLocationByPlatform(true);
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
		// ebenfalls ein GridLayout
		tempPanel.setLayout(new GridLayout(0, 1));
		tempPanel.add(schaltflaecheBerechnen);
		
		// ein leeres Label einfügen
		tempPanel.add(new JLabel());
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
		double zahl1, zahl2, ergebnis = 0;
		boolean fehlerFlag = false;

		// jetzt mit Fehlerbehandlung und Ausgabe der Meldung durch eine eigene Methode
		try {
			zahl1 = Double.parseDouble(eingabe1.getText());
		} catch (Exception NumberFormatException) {
			fehlermeldung(eingabe1);
			return ("Nicht definiert");
		}

		try {
			zahl2 = Double.parseDouble(eingabe2.getText());
		} catch (Exception NumberFormatException) {
			fehlermeldung(eingabe2);
		
			// das Ergebnis ist nicht definiert
			return ("Nicht definiert");
		}
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
		if (fehlerFlag == false) {
			
			// die Formatvorgabe über die Klasse DecimalFormat
			DecimalFormat formatFolge = new DecimalFormat("0.##");
			
			// das Format anwenden, das Ergebnis ist eine Zeichenkette
			return (formatFolge.format(ergebnis));
		} else
			return ("Nicht definiert");
	}

	private void fehlermeldung(JTextField eingabefeld) {
		JOptionPane.showMessageDialog(this, "Ihre Eingabe ist nicht gültig", "Eingabefehler",
				JOptionPane.ERROR_MESSAGE);
		eingabefeld.requestFocus();
	}
}
