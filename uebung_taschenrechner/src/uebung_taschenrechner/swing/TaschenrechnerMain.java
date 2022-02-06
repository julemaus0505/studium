package uebung_taschenrechner.swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import uebung_taschenrechner.Taschenrechner;

public class TaschenrechnerMain {

	public static void main(String[] args) {

		JFrame fenster = new JFrame();
		fenster.setLayout(new MigLayout("fill, insets 0 0 0 0", "fill", "fill"));
		fenster.setTitle("Taschenrechner");
		fenster.setSize(900, 600);

		JPanel panelAnzeigeUeberschrift = new JPanel();
		panelAnzeigeUeberschrift.setLayout(new MigLayout("fill,insets 10 20 0 20", "", ""));
		fenster.add(panelAnzeigeUeberschrift, "wrap");

		JLabel ueberschrift = new JLabel("Taschenrechner");
		ueberschrift.setFont(new Font("Arial", Font.ITALIC, 25));
		panelAnzeigeUeberschrift.add(ueberschrift, "center, wrap");

		JPanel panelZahl1Eingeben = new JPanel();
		panelZahl1Eingeben.setLayout(new MigLayout());

		JLabel labelZahl1 = new JLabel("Bitte Zahl 1 eingeben");
		panelZahl1Eingeben.add(labelZahl1, "wrap");

		JTextField textFieldZahl1Eingeben = new JTextField();
		panelZahl1Eingeben.add(textFieldZahl1Eingeben);
		textFieldZahl1Eingeben.setColumns(10);
		fenster.add(panelZahl1Eingeben);

		JPanel panelZahl2Eingeben = new JPanel();
		panelZahl2Eingeben.setLayout(new MigLayout());

		JLabel labelZahl2 = new JLabel("Bitte Zahl 2 eingeben");
		panelZahl2Eingeben.add(labelZahl2, "wrap");

		JTextField textFieldZahl2Eingeben = new JTextField();
		panelZahl2Eingeben.add(textFieldZahl2Eingeben, "wrap");
		textFieldZahl2Eingeben.setColumns(10);
		fenster.add(panelZahl2Eingeben);

		JPanel panelOperatorenAuswaehlen = new JPanel();
		panelOperatorenAuswaehlen.setLayout(new MigLayout());

		JComboBox<String> cmbOperatorenAuswaehlen = new JComboBox<>();
		cmbOperatorenAuswaehlen.addItem("Addition");
		cmbOperatorenAuswaehlen.addItem("Subtraktion");
		cmbOperatorenAuswaehlen.addItem("Multiplikation");
		cmbOperatorenAuswaehlen.addItem("Division");
		panelOperatorenAuswaehlen.add(cmbOperatorenAuswaehlen, "wrap");
		fenster.add(panelOperatorenAuswaehlen);

		JPanel panelErgebnis = new JPanel();
		panelErgebnis.setLayout(new MigLayout());
		fenster.add(panelErgebnis);

		JLabel labelErgebnis = new JLabel("Das Ergebnis ist ");
		panelErgebnis.add(labelErgebnis);

		JLabel labelErgebnisAusgeben = new JLabel();

		panelErgebnis.add(labelErgebnisAusgeben, "wrap");

		JButton buttonBerechnen = new JButton("Berechen");
		panelErgebnis.add(buttonBerechnen);

		fenster.setVisible(true);
		buttonBerechnen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int ergebnis;

				int eingabe1 = Integer.parseInt(textFieldZahl1Eingeben.getText());
				int eingabe2 = Integer.parseInt(textFieldZahl2Eingeben.getText());
				

				if (cmbOperatorenAuswaehlen.getSelectedItem().equals("Addition")) {

					ergebnis = Taschenrechner.berechneAddition(eingabe1, eingabe2);


				} else if (cmbOperatorenAuswaehlen.getSelectedItem().equals("Subtraktion")) {

					ergebnis = Taschenrechner.berechneSubtraktion(eingabe1, eingabe2);

				} else if (cmbOperatorenAuswaehlen.getSelectedItem().equals("Multiplikation")) {

					ergebnis = Taschenrechner.berechneMultiplikation(eingabe1, eingabe2);

				} else {

					ergebnis = Taschenrechner.berechneDivision(eingabe1, eingabe2);
				}
				
				String ergebnisString = String.valueOf(ergebnis);
				labelErgebnisAusgeben.setText(ergebnisString);
			}
		});


	}

	

}
