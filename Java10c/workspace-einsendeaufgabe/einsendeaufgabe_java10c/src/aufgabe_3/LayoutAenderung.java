package aufgabe_3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 
 * Schritte: 
 *    1. Frame mit inliegenden Panels und Komponenten erstellen
 *    2. Array mit den Layouts erstellen
 *    3. MeinListener erstellen um die Ereignisbehandlung zu implementieren
 *    4. Listener bei ComboBox hinzufügen
 */

public class LayoutAenderung {

	private JPanel panelAnmeldung;

	// RadioButton für die Layoutauswahl
	private JRadioButton orginalLayoutRadioButton;
	private JRadioButton flowLayoutRadioButton;
	private JRadioButton gridLayout1RadioButton;
	private JRadioButton gridLayout2RadioButton;

	// Hauptfenser für die Anwendung
	private JFrame fenster;

	public static void main(String[] args) {
		new LayoutAenderung();

	}

	/*
	 * Grafische Komponenten initialisieren, Layout setzen und Listener registrieren. 
	 */
	private LayoutAenderung() {
		fenster = new JFrame("Anmeldung");
		fenster.setLayout(new GridLayout(2, 1));
		
		orginalLayoutRadioButton = new JRadioButton("Orginal Layout") ;
		flowLayoutRadioButton = new JRadioButton("FlowLayout");
		gridLayout1RadioButton = new JRadioButton("GridLayout 1");
		gridLayout2RadioButton = new JRadioButton("GridLayout 2");
		
		ButtonGroup gruppe = new ButtonGroup();
		
		gruppe.add(orginalLayoutRadioButton);
		gruppe.add(flowLayoutRadioButton);
		gruppe.add(gridLayout1RadioButton);
		gruppe.add(gridLayout2RadioButton);
		
		Label vornameLabel = new Label("Vorname");

		JTextField vornameField = new JTextField();
		vornameField.setColumns(15);

		Label nachnameLabel = new Label("Nachname");

		JTextField nachnameField = new JTextField();
		nachnameField.setColumns(15);

		Label emailLabel = new Label("E-Mail");

		JTextField emailField = new JTextField();
		emailField.setColumns(30);

		JPanel panelLayout = new JPanel();

		panelAnmeldung = new JPanel();
		panelAnmeldung.setLayout(new GridLayout(3, 2, 30, 30));

		fenster.add(panelLayout);
		fenster.add(panelAnmeldung);
		panelAnmeldung.add(nachnameLabel);
		panelAnmeldung.add(nachnameField);
		panelAnmeldung.add(vornameLabel);
		panelAnmeldung.add(vornameField);
		panelAnmeldung.add(emailLabel);
		panelAnmeldung.add(emailField);
		panelLayout.add(orginalLayoutRadioButton);
		panelLayout.add(flowLayoutRadioButton);
		panelLayout.add(gridLayout1RadioButton);
		panelLayout.add(gridLayout2RadioButton);
		
		ActionListener listener = new MeinListener();
		orginalLayoutRadioButton.addActionListener(listener);
		flowLayoutRadioButton.addActionListener(listener);
		gridLayout1RadioButton.addActionListener(listener);
		gridLayout2RadioButton.addActionListener(listener);

		fenster.setPreferredSize(new Dimension(600, 400));
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fenster.pack();
		fenster.setVisible(true);
	}

	// die innere Klasse für die Ereignisverarbeitung
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// Erst der Vergleich über equals, dann bei dem panelAnmeldung das Layout
			// setzen.
			if (flowLayoutRadioButton.isSelected()) {
				panelAnmeldung.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

			} else if (gridLayout1RadioButton.isSelected()) {
				panelAnmeldung.setLayout(new GridLayout(6, 1));

			} else if (gridLayout2RadioButton.isSelected()) {
				panelAnmeldung.setLayout(new GridLayout(5, 2));

			} else {
				panelAnmeldung.setLayout(new GridLayout(3, 2, 10, 10));

			}
			fenster.pack();

		}

	}
}
