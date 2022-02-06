package aufgabe_1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * Schritte: Beim Selektieren von 'bunt' muss zus�tzlich erreicht werden, dass auch der ActionListener f�r die ComboBox 'auswahl' aufgerufen wird.
 * Hierzu wird in der itemStateChanged-Methode der selektierte Index der ComboBox neu gesetzt.
 *
 */
public class BuntOderNichtGUI extends JFrame {
	// automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = 2007237315429965675L;

	// die verf�gbaren Farben werden in einem Array abgelegt
	private String[] farbAuswahl = { "Rot", "Gelb", "Blau", "Gr�n", "Schwarz", "Magenta" };

	// die Komponenten
	// f�r die Auswahl farbig oder nicht �ber RadioButtons
	private JRadioButton bunt, nichtBunt;
	private ButtonGroup gruppe;

	//***�nderung vom Variablenname*** f�r die Auswahl gro� oder kleine
	private JCheckBox textGrossKlein;

	// f�r die Auswahl der Farben
	private JComboBox<String> auswahl;

	// f�r das Beenden
	private JButton schaltflaecheBeenden;

	// f�r die Anzeige
	private JLabel anzeige;

	// die innere Klasse f�r die Listener
	// Sie implementiert jetzt auch den ItemListener
	class MeinListener implements ActionListener, ItemListener {

		// die Methode des ActionListeners
		// f�r die Farbauswahl und die Schaltfl�che
		@Override
		public void actionPerformed(ActionEvent e) {

			// zum einfacheren Zugriff die Quelle in einem Object ablegen
			Object ausloeser = e.getSource();

			// Wer hat das Ereignis ausgel�st?
			// die ComboBox?
			if (ausloeser instanceof JComboBox) {

				// was ist auswgew�hlt?
				if (auswahl.getSelectedItem().toString().equals("Rot")) {
					anzeige.setForeground(Color.RED);
				}
				if (auswahl.getSelectedItem().toString().equals("Gelb")) {
					anzeige.setForeground(Color.YELLOW);
				}
				if (auswahl.getSelectedItem().toString().equals("Blau")) {
					anzeige.setForeground(Color.BLUE);
				}
				if (auswahl.getSelectedItem().toString().equals("Gr�n")) {
					anzeige.setForeground(Color.GREEN);
				}
				if (auswahl.getSelectedItem().toString().equals("Schwarz")) {
					anzeige.setForeground(Color.BLACK);
				}
				if (auswahl.getSelectedItem().toString().equals("Magenta")) {
					anzeige.setForeground(Color.MAGENTA);
				}
			}
			// die Schaltfl�che
			if (ausloeser instanceof JButton) {
				// eigentlich ist die Abfrage nicht n�tig
				// das macht uns das Leben aber leichter, wenn neue Schaltfl�chen dazu kommen
				if (e.getActionCommand().equals("Beenden"))
					System.exit(0);
			}
		}

		// f�r die CheckBox und die RadioButtons
		@Override
		public void itemStateChanged(ItemEvent e) {
			// zum einfacheren Zugriff die Quelle in einem Object ablegen
			Object ausloeser = e.getSource();

			// Wer hat das Ereignis ausgel�st?
			// die Checkbox?
			if (ausloeser instanceof JCheckBox) {

				// ist die CheckBox markiert?
				if (textGrossKlein.isSelected() == true)
					anzeige.setFont(new Font("Arial", Font.PLAIN, 25));
				else
					anzeige.setFont(new Font("Arial", Font.PLAIN, 20));
			}
			// oder waren es die RadioButtons
			if (ausloeser instanceof JRadioButton) {

				// ist bunt markiert?
				if (bunt.isSelected() == true) {
					auswahl.setEnabled(true);
					
					// �nderung: Farbe Rot wird jetzt gleich angezeigt wenn man auf bunt klickt.
					auswahl.setSelectedIndex(auswahl.getSelectedIndex());
				} else {
					auswahl.setEnabled(false);
				}
			}
		}
	}

	// der Konstruktor
	public BuntOderNichtGUI(String titel) {
		super(titel);

		textGrossKlein = new JCheckBox("Gr��er darstellen");

		// die Liste erzeugen
		// die Daten kommen aus dem Array farbAuswahl
		auswahl = new JComboBox<String>(farbAuswahl);
		
		// erst einmal nicht aktivieren
		auswahl.setEnabled(false);

		// die Schaltfl�che
		schaltflaecheBeenden = new JButton("Beenden");

		// die RadioButtons und die Gruppe
		bunt = new JRadioButton("bunt");
		nichtBunt = new JRadioButton("einfarbig");
		nichtBunt.setSelected(true);

		gruppe = new ButtonGroup();
		gruppe.add(bunt);
		gruppe.add(nichtBunt);

		// das Label
		anzeige = new JLabel("Der Text");

		// die Schriftart etc. setzen
		anzeige.setFont(new Font("Arial", Font.PLAIN, 14));

		// ein Gridlayout mit 2 Spalten und etwas Abstand
		setLayout(new GridLayout(0, 2, 20, 20));

		// die Komponenten hinzuf�gen
		// erst das Label
		add(anzeige);

		// daneben kommt die Checkbox
		add(textGrossKlein);

		// der erste RadioButton
		add(bunt);

		// daneben die ComboBox
		add(auswahl);

		// der zweite RadioButton
		add(nichtBunt);

		// und links unten die Schaltfl�che
		add(schaltflaecheBeenden);

		// die Listener verbinden
		MeinListener listener = new MeinListener();
		schaltflaecheBeenden.addActionListener(listener);
		textGrossKlein.addItemListener(listener);

		// f�r die RadioButtons muss das f�r jeden Button passieren, nicht f�r die
		// Gruppe!
		bunt.addItemListener(listener);
		nichtBunt.addItemListener(listener);

		auswahl.addActionListener(listener);

		// die Standard-Aktion setzen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// das Fenster "packen" und anzeigen
		pack();
		setVisible(true);
	}
}
