package aufgabe_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

/**
 * Schritte:
 * 1. Austausch von RadioButtons nach ComboBox mit Array
 * 2. In der Methode berechnen() Rechenart �ber selektierten Index der ComboBox ermittelt
 * 3. MeinListener um einen ItemListener erweitert und diesen der ComboBox hinzugef�gt. In diesem die Berechnung angesto�en, wenn sich der Eintrag �ndert
 */
public class TaschenrechnerGUILookAndFeel extends JFrame {

	// �nderung auf eine KlassenVariable
	JPanel tempPanel;

	// automatisch �ber Eclipse eingef�gt
	private static final long serialVersionUID = -3091095238202017352L;

	// die Komponente
	// zwei Eingabefelder
	private JTextField eingabe1;
	private JTextField eingabe2;

	// ***�nderung*** Array f�r die Operatoren erstellt.
	private String[] optionsAuswahl = { "Addition", "Subtraktion", "Multiplikation", "Division" };

	// ***�nderung*** Neue ComboBox erstellt f�r die Auswahl der Operatoren.
	private JComboBox<String> auswahlOperatorenComboBox = new JComboBox<String>(optionsAuswahl);

	// ***Hinzugef�gt*** Neues Array f�r Layout erstellt.
	private String[] layoutAuswahl = { "Orginal Layout", "FlowLayout", "GridLayout 1", "GridLayout 2" };

	// ***Hinzugef�gt*** Neue ComboBox f�r Layout erstellt.
	private JComboBox<String> auswahlLayoutComboBox = new JComboBox<String>(layoutAuswahl);

	// zwei Schaltfl�chen
	private JButton schaltflaecheBerechnen;
	private JButton schaltflaecheBeenden;

	// ein Label f�r die Ausgabe
	private JLabel ausgabe;

	// die innere Klasse f�r die Ereignisverarbeitung
	class MeinListener implements ActionListener, ItemListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			// wurde auf Beenden geklickt?
			// dann das Programm beenden
			if (event.getActionCommand().equals("ende")) {
				System.exit(0);

			}
			// wurde auf Berechnen geklickt?
			// dann eine Methode f�r die Berechnung aufrufen
			// und das Ergebnis anzeigen
			if (event.getActionCommand().equals("rechnen")) {
				ausgabe.setText(berechnen());

			}
		}
		//***Neue Methode erstellt*** 
		public void itemStateChanged(ItemEvent event) {
			if (event.getStateChange() == ItemEvent.SELECTED) { // <-- NEU

				// zum einfacheren Zugriff die Quelle in einem Object ablegen
				Object quelle = event.getSource();

				// Wer hat das Ereignis ausgel�st?
				// die Checkbox?
				if (quelle.equals(auswahlOperatorenComboBox)) {
					ausgabe.setText(berechnen());
				} else if (quelle.equals(auswahlLayoutComboBox)) {

					if (layoutAuswahl[1].equals(auswahlLayoutComboBox.getSelectedItem())) {
						tempPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

					} else if (layoutAuswahl[2].equals(auswahlLayoutComboBox.getSelectedItem())) {
						tempPanel.setLayout(new GridLayout(6, 1));

					} else if (layoutAuswahl[3].equals(auswahlLayoutComboBox.getSelectedItem())) {
						tempPanel.setLayout(new GridLayout(1, 6));

					} else {
						tempPanel.setLayout(new GridLayout(3, 2, 10, 10));

					}
					pack();
				}
			}
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
		JPanel panelBerechnung, panelButtons, hauptFenster, panelLayout, panelEinAus;

		// die Panels �ber die Methoden erstellen
		//***Neue Variable*** angelegt panelLaylout
		panelEinAus = panelEinAusErzeugen();
		panelBerechnung = panelBerechnungErzeugen();
		panelButtons = panelButtonErzeugen();
		panelLayout = panelLayoutErzeugen();


		// die Panels hinzuf�gen
		// die beiden gr��eren Panel fassen wir noch einmal zusammen
		hauptFenster = new JPanel();
		hauptFenster.add(panelEinAus);
		hauptFenster.add(panelBerechnung);
		hauptFenster.add(panelLayout);

		// die beiden kommen in die Mitte
		add(hauptFenster, BorderLayout.CENTER);

		// das Panel mit den Buttons nach rechts
		add(panelButtons, BorderLayout.EAST);

		// die Standard-Aktion setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// packen und anzeigen
		// die Position wird vom Betriebssystem festgeleg
		pack();
		setLocationByPlatform(true);
		setVisible(true);

		// Gr��en�nderungen sind nicht zugelassen
		// damit das m�hsam erstellte Layout nicht durcheinander kommt
		setResizable(false);

	}

	// die Methode erzeugt das Panel f�r die Ein- und Ausgabe
	// und liefert es zur�ck
	private JPanel panelEinAusErzeugen() {
		tempPanel = new JPanel();

		// es enth�lt die Eingabefelder mit beschreibendem Text und die Ausgabe
		// die L�nge der Felder ist auf 10 Zeichen beschr�nkt
		eingabe1 = new JTextField(10);
		eingabe2 = new JTextField(10);
		ausgabe = new JLabel("");

		// das Panel bekommt ein GridLaoyut mit zwei Spalten und etwas Abstand
		tempPanel.setLayout(new GridLayout(3, 2, 10, 10));

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

	private JPanel panelBerechnungErzeugen() {
		JPanel panelOperatoren = new JPanel();
		
		//***Variable umbenannt*** 
		// das Panel bekommt ein GridLaoyut mit einer Spalte
		panelOperatoren.setLayout(new GridLayout(2, 2, 10, 10));

		// ein beschreibendes Label f�r die erste Eingabe
		panelOperatoren.add(auswahlOperatorenComboBox);

		// und einen Rahmen
		panelOperatoren.setBorder(new TitledBorder("Operation: "));

		// das Panel zur�ckliefern
		return panelOperatoren;
	}

	private JPanel panelLayoutErzeugen() {
		JPanel panelLayout = new JPanel();

		// das Panel bekommt ein GridLaoyut mit einer Spalte
		panelLayout.setLayout(new GridLayout(2, 2, 10, 10));

		
		// ein beschreibendes Label f�r die erste Eingabe
		panelLayout.add(auswahlLayoutComboBox);

		// und einen Rahmen
		panelLayout.setBorder(new TitledBorder("Layout Ausw�hlen: "));

		// das Panel zur�ckliefern
		return panelLayout;
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
		// ebenfalls ein GridLayout
		// tempPanel.setLayout(new GridLayout(0, 1));
		tempPanel.add(schaltflaecheBerechnen);

		// ein leeres Label einf�gen
		tempPanel.add(new JLabel());
		tempPanel.add(schaltflaecheBeenden);

		// die Schaltfl�chen mit dem Listener verbinden
		MeinListener listener = new MeinListener();
		schaltflaecheBeenden.addActionListener(listener);
		schaltflaecheBerechnen.addActionListener(listener);
		auswahlOperatorenComboBox.addItemListener(listener);
		auswahlLayoutComboBox.addItemListener(listener);

		// das Panel zur�ckliefern
		return tempPanel;
	}

	// die Methode berechnet das Ergebnis und liefert es als
	// Zeichenkette zur�ck
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
		// welche Operation ist ausgew�hlt?
		if (0 == auswahlOperatorenComboBox.getSelectedIndex()) {
			ergebnis = zahl1 + zahl2;
		} else if (1 == auswahlOperatorenComboBox.getSelectedIndex()) {
			ergebnis = zahl1 - zahl2;
		} else if (2 == auswahlOperatorenComboBox.getSelectedIndex()) {
			ergebnis = zahl1 * zahl2;
		}
		// bei der Division �berpr�fen wir den zweiten Wert auf 0
		else if (3 == auswahlOperatorenComboBox.getSelectedIndex()) {
			if (zahl2 != 0) {
				ergebnis = zahl1 / zahl2;
			} else {
				fehlerFlag = true;
			}
		}
		// wenn es keine Probleme gegeben hat, liefern wir das Ergebnis zur�ck
		if (fehlerFlag == false) {

			// die Formatvorgabe �ber die Klasse DecimalFormat
			DecimalFormat formatFolge = new DecimalFormat("0.##");

			// das Format anwenden, das Ergebnis ist eine Zeichenkette
			return (formatFolge.format(ergebnis));
		} else
			return ("Nicht definiert");
	}

	private void fehlermeldung(JTextField eingabefeld) {
		if (eingabefeld.getText().equals("")) {
			JOptionPane.showMessageDialog(this, "Ihre Eingabe ist nicht g�ltig", "Eingabefehler",
					JOptionPane.ERROR_MESSAGE);

		}
		eingabefeld.requestFocus();

		pack();
		setVisible(true);

	}

}
