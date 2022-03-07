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

	// wurde auf Button addition geklickt
	@FXML
	void addition(ActionEvent event) {

		tauscheOperant('+');

		operator = '+';
		
		additionButton.setDisable(true);
	}

	// wurde auf Button subtraktion geklickt
	@FXML
	void subtraktion(ActionEvent event) {

		tauscheOperant('-');

		operator = '-';
		
		subtraktionButton.setDisable(true);
	}

	// wurde auf Button multiplikation geklickt
	@FXML
	void multiplikation(ActionEvent event) {

		tauscheOperant('*');

		operator = '*';
		
		multiplikationButton.setDisable(true);
	}

	// wurde auf Button division geklickt
	@FXML
	void division(ActionEvent event) {

		tauscheOperant('/');

		operator = '/';

		divisionButton.setDisable(true);
	}

	@FXML
	// Berechnen Methoden die erst den String nach dem Rechenoperator teilt und 
	// dann den ersten teil mit Zahl1 und Zahl2 zusammen rechnet.
	void berechneErgebnis(ActionEvent event) {

		double ergebnis = 0;

		// Rechnung mit addition
		if (operator == '+') {
			String[] teilen = eingabeTextField.getText().split("\\+");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);
			ergebnis = zahl1 + zahl2;

		// Rechnung mit subtraktion
		} else if (operator == '-') {
			String[] teilen = eingabeTextField.getText().split("-");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);
			ergebnis = zahl1 - zahl2;

		// Rechnung mit multiplikation
		} else if (operator == '*') {
			String[] teilen = eingabeTextField.getText().split("\\*");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);
			ergebnis = zahl1 * zahl2;

		// Rechnung mit division
		} else if (operator == '/') {
			String[] teilen = eingabeTextField.getText().split("/");
			double zahl1 = Double.parseDouble(teilen[0]);
			double zahl2 = Double.parseDouble(teilen[1]);

			// die Zahl2 darf in der division keine 0 sein
			// Durch 0 darf nicht geteilt werden
			if (zahl2 != 0) {
				ergebnis = zahl1 / zahl2;

			// Ausgabe zum teilen durch 0
			} else {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setContentText("Bitte geben Sie eine andere zweite Zahle als die 0 ein.");
				alert.setHeaderText("Durch 0 darf nicht geteilt werden.");
				alert.showAndWait();
			}
		}
		// ergebnis in das TextField schreiben
		eingabeTextField.setText("" + ergebnis);
		
		// die Berechnungsbutton aktivieren
		berechnungsButtonAktivieren();
	}

	@FXML
	void eingabeLoeschen(ActionEvent event) {

		// der Anwender im Taschenrechner auf das C klickt dann wird alles im TextField gelöscht
		eingabeTextField.clear();
		
		// die Berechnungsbutton aktivieren
		berechnungsButtonAktivieren();
	}

	@FXML
	// wenn auf 0 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void nullTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("0");

	}

	@FXML
	// wenn auf 1 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void einsTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("1");
	}

	@FXML
	// wenn auf 2 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void zweiTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("2");
	}

	@FXML
	// wenn auf 3 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void dreiTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("3");
	}

	@FXML
	// wenn auf 4 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void vierTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("4");
	}

	@FXML
	// wenn auf 5 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void fuenfTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("5");
	}

	@FXML
	// wenn auf 6 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void sechsTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("6");
	}

	@FXML
	// wenn auf 7 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void siebenTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("7");
	}

	@FXML
	// wenn auf 8 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void achtTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("8");
	}

	@FXML
	// wenn auf 9 Button geklickt wird, wird die Zahl dem TextField hinzugefügt
	void neunTextFieldHinzufuegen(ActionEvent event) {

		fuegeZahlHinzu("9");
	}

	// mit der Methode werden die Zahl1 und Zahl2 zusammen gefügt
	private void fuegeZahlHinzu(final String neueZahl) {
	
		String bisherigerText = eingabeTextField.getText();
	
		eingabeTextField.setText(bisherigerText + neueZahl);
	}

	// die Methode tauscht die Operatoren
	private void tauscheOperant(char neuerOperator) {

		String bisherigerText = eingabeTextField.getText();

		if (bisherigerText.contains(Character.toString(operator))) {
			eingabeTextField.setText(bisherigerText.replace(operator, neuerOperator));

		} else {
			eingabeTextField.setText(bisherigerText + neuerOperator);

		}

	}
	
	// die Button deaktivieren
	private void berechnungsButtonAktivieren() {
		additionButton.setDisable(false);
		subtraktionButton.setDisable(false);
		multiplikationButton.setDisable(false);
		divisionButton.setDisable(false);	
	}
}
