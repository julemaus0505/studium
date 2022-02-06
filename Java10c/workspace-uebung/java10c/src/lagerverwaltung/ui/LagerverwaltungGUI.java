package lagerverwaltung.ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;

import lagerverwaltung.fachlogik.Lager;
import net.miginfocom.swing.MigLayout;

public class LagerverwaltungGUI {

	private JTable table;

	private final String[] AUSWAHL_OPTION = { "Eingabe einer neuen Kiste", "Löschen der Daten vorhandenen Kiste",
			"Ändern der Daten einer vorhandenen Kiste", "Anzeigen der Daten einer vorhandenen Kiste",
			"Listenfunktion die die Daten aller vorhandenen Kisten anzeigt" };

	private final String[] AKTIONS_BUTTON_TEXT = { "Neue Kiste erstellen", "Löschen", "Daten einer Kiste ändern",
			"Kiste anzeigen", "Daten aller Kisten anzeigen" };

	// Variablen in Klassenvariablen angelegt
	private JTextField breiteFeld;

	private JTextField hoeheFeld;

	private JTextField laengeFeld;

	private JFrame hauptFenster;

	private JComboBox<String> optionComboBox;

	private JComboBox<Integer> kistennummerComboBox;

	private JButton aktionsButton;

	private Lager lager;

	public LagerverwaltungGUI(String titel, Lager lager) {

		// Der Konstruktor
		this.lager = lager;
		kistennummerComboBox = new JComboBox<Integer>();
		kistennummerComboBox.setEnabled(false);
		optionComboBox = new JComboBox<String>(AUSWAHL_OPTION);

		hauptFenster = new JFrame(titel);
		hauptFenster.setLayout(new MigLayout());
		hauptFenster.setSize(800, 800);
		hauptFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("", "20[]50[fill]", "20[]20[]"));

		// Label und Textfelder erzeugt
		JLabel optionLabel = new JLabel("Bitte Wählen Sie aus...");
		JLabel kistennummerLabel = new JLabel("Wähle einen Kistennummer aus, die Sie löschen oder Bearbeiten möchten!");
		JLabel breiteLabel = new JLabel("Bitte geben Sie die Breite ein.");
		breiteFeld = new JTextField();
		JLabel hoeheLabel = new JLabel("Bitte geben sie die Höhe ein.");
		hoeheFeld = new JTextField();
		JLabel laengeLabel = new JLabel("Bitte geben Sie die Länge ein.");
		laengeFeld = new JTextField();
		aktionsButton = new JButton(AKTIONS_BUTTON_TEXT[0]);

		// Componenten hinzugefügt
		addListenerToComponents();

		hauptFenster.add(panel);

		panel.add(optionLabel);
		panel.add(optionComboBox, "wrap");

		panel.add(kistennummerLabel);
		panel.add(kistennummerComboBox, "wrap");

		panel.add(breiteLabel);
		panel.add(breiteFeld, "wrap");
		panel.add(hoeheLabel);
		panel.add(hoeheFeld, "wrap");

		panel.add(laengeLabel);
		panel.add(laengeFeld, "wrap 20");
		panel.add(aktionsButton);

		hauptFenster.pack();
		hauptFenster.setVisible(true);

	}

	private void addListenerToComponents() {
		optionComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				/*
				 * Wenn gleich viele Einträge bei beiden Arrays AUSWAHL_OPTION und
				 * AKTIONS_BUTTON_TEXT vorliegen und die Einträge vom Index her zueinander
				 * passen (AUSWAHL_OPTION[0] gehört zu AKTIONS_BUTTON_TEXT[0], usw.) dann kann
				 * anstelle des Switch-Case diese Kurz-Lösung gewählt werden
				 */

				// Lösung:
//				aktionsButton.setText(AKTIONS_BUTTON_TEXT[optionComboBox.getSelectedIndex()]);

				switch (optionComboBox.getSelectedIndex()) {
				case 0:
					aktionsButton.setText(AKTIONS_BUTTON_TEXT[0]);
					kistennummerComboBox.setEnabled(false);
					breiteFeld.setEditable(true);
					hoeheFeld.setEditable(true);
					laengeFeld.setEditable(true);
					break;
				case 1:
					aktionsButton.setText(AKTIONS_BUTTON_TEXT[1]);
					kistennummerComboBox.setEnabled(true);
					breiteFeld.setEditable(false);
					hoeheFeld.setEditable(false);
					laengeFeld.setEditable(false);
					break;
				case 2:
					aktionsButton.setText(AKTIONS_BUTTON_TEXT[2]);
					kistennummerComboBox.setEnabled(true);
					breiteFeld.setEditable(true);
					hoeheFeld.setEditable(true);
					laengeFeld.setEditable(true);
					break;
				case 3:
					aktionsButton.setText(AKTIONS_BUTTON_TEXT[3]);
					kistennummerComboBox.setEnabled(true);
					breiteFeld.setEditable(false);
					hoeheFeld.setEditable(false);
					laengeFeld.setEditable(false);
					break;
				case 4:
					aktionsButton.setText(AKTIONS_BUTTON_TEXT[4]);
					kistennummerComboBox.setEnabled(false);
					breiteFeld.setEditable(false);
					hoeheFeld.setEditable(false);
					laengeFeld.setEditable(false);
					break;
				default:

					break;
				}

			}
		});

		breiteFeld.addFocusListener(getZahlenListener());
		hoeheFeld.addFocusListener(getZahlenListener());
		laengeFeld.addFocusListener(getZahlenListener());

		aktionsButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				if (optionComboBox.getSelectedIndex() == 0) {
					behandleOptionNeueKisteEinlagern();
				} else if (optionComboBox.getSelectedIndex() == 1) {
					behandleOptionLoeschen(0);
				} else if (optionComboBox.getSelectedIndex() == 2) {
					behandleOptionAendern();
				} else if (optionComboBox.getSelectedIndex() == 3) {
					behandleOptionAnzeigen();
				} else {
					behandleOptionListenfunktionAnzeigen();
				}
			}
		});
	}

	private FocusListener getZahlenListener() {
		return new FocusListener() {

			@Override
			public void focusLost(FocusEvent event) {
				JTextField textField = (JTextField) event.getSource();

				if (textField.getText() != null && textField.getText().isEmpty() == false) {
					try {
						Integer.parseInt(textField.getText());
					} catch (NumberFormatException exception) {
						JOptionPane.showMessageDialog(hauptFenster, "Bitte eine Zahl eingeben.");
						textField.requestFocus();
					}
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
			}
		};
	}

	public void behandleOptionNeueKisteEinlagern() {
		if (breiteFeld.getText().equals("") || hoeheFeld.getText().equals("") || laengeFeld.getText().equals("")) {
			JOptionPane.showMessageDialog(hauptFenster, "Bitte geben Sie die Breite, die Höhe, und die Länge ein.");

		} else {

			int kistennummer = lager.einlagernEinerNeuenKiste(Integer.parseInt(breiteFeld.getText()),
					Integer.parseInt(hoeheFeld.getText()), Integer.parseInt(laengeFeld.getText()));

			if (kistennummer == 0) {
				JOptionPane.showMessageDialog(hauptFenster, "Es ist kein freier Lagerplatz mehr vorhanden.");

			} else {
				JOptionPane.showMessageDialog(hauptFenster,
						"Ihre Kiste wurde erfolgreich eingelagert und hat die Kistennummer  " + kistennummer);
				kistennummerComboBox.setModel(new DefaultComboBoxModel<Integer>(
						lager.berechneVorhandeneKistennummern().toArray(new Integer[] {})));
			}
			breiteFeld.setText(null);
			hoeheFeld.setText(null);
			laengeFeld.setText(null);
		}
	}

	public void behandleOptionLoeschen(int kistennummer) {
		boolean loeschenErfolgreich = lager.loescheDatenEinerKistennummer((int) kistennummerComboBox.getSelectedItem());
		if (loeschenErfolgreich) {
			JOptionPane.showMessageDialog(hauptFenster, "Die Kiste mit der Kistennummer "
					+ kistennummerComboBox.getSelectedItem() + " wurde erfolgreich gelöscht.");
			kistennummerComboBox.setModel(new DefaultComboBoxModel<Integer>(
					lager.berechneVorhandeneKistennummern().toArray(new Integer[] {})));

		} else {
			JOptionPane.showMessageDialog(hauptFenster, "Die Kiste konnte nicht gelöscht werden.");
		}

	}

	private void behandleOptionAendern() {
		boolean erfolgreichGeändert = lager.aendern((int) kistennummerComboBox.getSelectedItem(),
				Integer.parseInt(breiteFeld.getText()), Integer.parseInt(hoeheFeld.getText()),
				Integer.parseInt(laengeFeld.getText()));
		if (erfolgreichGeändert) {
			JOptionPane.showMessageDialog(hauptFenster, "Die Kiste mir der Kistennummer "
					+ kistennummerComboBox.getSelectedItem() + " wurde erfolgreich geändert.");
		} else {
			JOptionPane.showMessageDialog(hauptFenster, "Die Kiste mit der Kistennummer "
					+ kistennummerComboBox.getSelectedItem() + " konnte nicht geändert werden.");
		}
		breiteFeld.setText(null);
		hoeheFeld.setText(null);
		laengeFeld.setText(null);
	}

	private void behandleOptionAnzeigen() {

		int[] datenAnzeigen = lager.beschaffeDatenEinerKiste((int) kistennummerComboBox.getSelectedItem());

		breiteFeld.setText(Integer.toString(datenAnzeigen[0]));
		hoeheFeld.setText(Integer.toString(datenAnzeigen[1]));
		laengeFeld.setText(Integer.toString(datenAnzeigen[2]));
	}

	public void behandleOptionListenfunktionAnzeigen() {
		JFrame alleDatenAnzeigenFenster = new JFrame("Hier werden alle Daten aus dem Lager angezeigt.");

		Integer[][] rowData = lager.beschaffeDatenAllerVorhandenenKisten();

		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		JTable anzeigenTabelle = new JTable(lager.beschaffeDatenAllerVorhandenenKisten(),
				new String[] { "Kistennummer", "Breite", "Höhe", "Länge" });
		alleDatenAnzeigenFenster.add(new JScrollPane(anzeigenTabelle));

		alleDatenAnzeigenFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		alleDatenAnzeigenFenster.setSize(500, 500);
		alleDatenAnzeigenFenster.setVisible(true);

	}

}