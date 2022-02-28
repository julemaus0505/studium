package taschenrechner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

	@FXML
	private Button neunButton;

	@FXML
	private Button divisionButton;

	@FXML
	private Button zweiButton;

	@FXML
	private Button fuenfButton;

	@FXML
	private Button achtButton;

	@FXML
	private Button nullButton;

	@FXML
	private Button einsButton;

	@FXML
	private Button vierButton;

	@FXML
	private Button siebenButton;

	@FXML
	private Button subtraktionButton;

	@FXML
	private Button dreiButten;

	@FXML
	private Button additionButton;

	@FXML
	private Button sechsButton;

	@FXML
	private Button multiplikationButton;

	@FXML
	private Button loeschenEingabeButton;

	@FXML
	private Button ergebnisButton;

	@FXML
	private TextField eingabeTextField;

	private char operator;

	@FXML
	void addition(ActionEvent event) {

		tauscheOperant('+');

		operator = '+';

	}

	@FXML
	void subtraktion(ActionEvent event) {

		tauscheOperant('-');

		operator = '-';
	}

	@FXML
	void multiplikation(ActionEvent event) {

		tauscheOperant('*');

		operator = '*';
	}

	@FXML
	void division(ActionEvent event) {

		tauscheOperant('/');

		operator = '/';

	}

	@FXML
	void berechneErgebnis(ActionEvent event) {

		double ergebnis = 0;

		if (operator == '+') {
			String[] teilen = eingabeTextField.getText().split("\\+");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);
			ergebnis = zahl1 + zahl2;

		} else if (operator == '-') {
			String[] teilen = eingabeTextField.getText().split("-");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);
			ergebnis = zahl1 - zahl2;

		} else if (operator == '*') {
			String[] teilen = eingabeTextField.getText().split("\\*");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);
			ergebnis = zahl1 * zahl2;

		} else if (operator == '/') {
			String[] teilen = eingabeTextField.getText().split("/");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);

			if (zahl2 != 0) {
				ergebnis = zahl1 / zahl2;

			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setContentText("Bitte geben Sie eine andere zweite Zahle als die 0 ein.");
				alert.setHeaderText("Durch 0 darf nicht geteilt werden.");
				alert.showAndWait();
			}
		}
		eingabeTextField.setText("" + ergebnis);
	}

	@FXML
	void eingabeLoeschen(ActionEvent event) {

		eingabeTextField.clear();
	}

	@FXML
	void nullTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("0");

	}

	@FXML
	void einsTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("1");
	}

	@FXML
	void zweiTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("2");
	}

	@FXML
	void dreiTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("3");
	}

	@FXML
	void vierTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("4");
	}

	@FXML
	void fuenfTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("5");
	}

	@FXML
	void sechsTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("6");
	}

	@FXML
	void siebenTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("7");
	}

	@FXML
	void achtTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("8");
	}

	@FXML
	void neunTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("9");
	}

	private void fuegeZahlHinzu(final String neueZahl) {

		String bisherigerText = eingabeTextField.getText();

		eingabeTextField.setText(bisherigerText + neueZahl);

	}

	private void tauscheOperant(char neuerOperator) {

		String bisherigerText = eingabeTextField.getText();

		if (bisherigerText.contains(Character.toString(operator))) {
			eingabeTextField.setText(bisherigerText.replace(operator, neuerOperator));

		} else {
			eingabeTextField.setText(bisherigerText + neuerOperator);

		}

	}
}
