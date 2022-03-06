package umrechner;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import umrechner.formatter.TextFormatterFactory;

public class Controller implements Initializable {

	@FXML
	private TextField arabischeEingabeTextField;

	@FXML
	private TextField roemischeAusgabeTextField;

	@FXML
	private TextField arabischeAusgabeTextField;

	@FXML
	private TextField roemischeEingabeTextField;

	@FXML
	private Button umrechenRoemischeZahlButton;

	@FXML
	private Button umrechenArabischeZahlenButton;

	@FXML
	void umrechenInRoemischeZahlen(ActionEvent event) {

		int arabischeZahl = Integer.parseInt(arabischeEingabeTextField.getText());

		StringBuilder stringBuilder = new StringBuilder();

		while (arabischeZahl > 0) {

			if (arabischeZahl >= 1000) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 1000, "M");

			} else if (arabischeZahl >= 900) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 900, "CM");

			} else if (arabischeZahl >= 500) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 500, "D");

			} else if (arabischeZahl >= 400) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 400, "CD");

			} else if (arabischeZahl >= 100) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 100, "C");

			} else if (arabischeZahl >= 90) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 90, "XC");

			} else if (arabischeZahl >= 50) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 50, "L");

			} else if (arabischeZahl >= 40) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 40, "XL");

			} else if (arabischeZahl >= 10) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 10, "X");

			} else if (arabischeZahl >= 9) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 9, "IX");

			} else if (arabischeZahl >= 8) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 8, "VIII");

			} else if (arabischeZahl >= 7) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 7, "VII");

			} else if (arabischeZahl >= 6) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 6, "VI");

			} else if (arabischeZahl >= 5) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 5, "V");

			} else if (arabischeZahl >= 4) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 4, "IV");

			} else if (arabischeZahl >= 3) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 3, "III");

			} else if (arabischeZahl >= 2) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 2, "II");

			} else if (arabischeZahl >= 1) {
				arabischeZahl = rechneInRoemischeZahlUm(arabischeZahl, stringBuilder, 1, "I");
			}
		}

		roemischeAusgabeTextField.setText(stringBuilder.toString());

	}

	@FXML
	void umrechenInArabischeZahlen(ActionEvent event) {

		String roemischeZahl = roemischeEingabeTextField.getText();

		int arabischeZahl = 0;

		String umzuwandelndeBuchstaben = "";

		int index = roemischeZahl.length() - 1;

		while (index >= 0) {

			if (umzuwandelndeBuchstaben.length() != 1) {

				if (index == 0) {
					umzuwandelndeBuchstaben = "" + roemischeZahl.charAt(index);
				} else {
					umzuwandelndeBuchstaben = "" + roemischeZahl.charAt(index - 1) + roemischeZahl.charAt(index);
				}
			}

			if (umzuwandelndeBuchstaben.equals("M")) {
				arabischeZahl += 1000;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else if (umzuwandelndeBuchstaben.equals("CM")) {
				arabischeZahl += 900;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("D")) {
				arabischeZahl += 500;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else if (umzuwandelndeBuchstaben.equals("CD")) {
				arabischeZahl += 400;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("C")) {
				arabischeZahl += 100;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else if (umzuwandelndeBuchstaben.equals("XC")) {
				arabischeZahl += 90;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("L")) {
				arabischeZahl += 50;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else if (umzuwandelndeBuchstaben.equals("XL")) {
				arabischeZahl += 40;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("X")) {
				arabischeZahl += 10;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else if (umzuwandelndeBuchstaben.equals("IX")) {
				arabischeZahl += 9;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("VI")) {
				arabischeZahl += 6;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("V")) {
				arabischeZahl += 5;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else if (umzuwandelndeBuchstaben.equals("IV")) {
				arabischeZahl += 4;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("II")) {
				arabischeZahl += 2;
				index -= 2;

			} else if (umzuwandelndeBuchstaben.equals("I")) {
				arabischeZahl += 1;
				index -= 1;
				umzuwandelndeBuchstaben = "";

			} else {
				umzuwandelndeBuchstaben = "" + roemischeZahl.charAt(index);
			}

		}
		arabischeAusgabeTextField.setText("" + arabischeZahl);

	}

	private int rechneInRoemischeZahlUm(int arabischeZahl, StringBuilder stringBuilder, int teiler,
			String roemischeZahl) {

		int wieOftTeilbar = arabischeZahl / teiler;
		int rest = arabischeZahl % teiler;

		for (int i = 0; i < wieOftTeilbar; i++) {
			stringBuilder.append(roemischeZahl);
		}

		return rest;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		umrechenRoemischeZahlButton.disableProperty().bind(arabischeEingabeTextField.textProperty().isEmpty());
		umrechenArabischeZahlenButton.disableProperty().bind(roemischeEingabeTextField.textProperty().isEmpty());
		
	

		arabischeEingabeTextField.setTextFormatter(TextFormatterFactory.createIntegerTextFormatter());
		roemischeEingabeTextField.setTextFormatter(TextFormatterFactory.createRoemischeZahlenTextFormatter());

	}

}
