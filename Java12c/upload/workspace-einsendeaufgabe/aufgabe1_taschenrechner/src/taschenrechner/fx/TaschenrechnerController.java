package taschenrechner.fx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import taschenrechner.Taschenrechner;
import taschenrechner.TaschenrechnerDivisionException;

public class TaschenrechnerController {

	@FXML
	// Klassen Variable für das TextField 1 angelegt
	private TextField zahl1TextField;

	@FXML
	// Klassen Variable für das TextField 2 angelegt
	private TextField zahl2TextField;

	@FXML
	// Klassen Variable für das ergebnis TextField angelegt
	private TextField ergebnisTextField;

	@FXML
	// KLassen Variable für die ComboBox angelegt
	private ComboBox<String> operatorenComboBox;

	@FXML
	// Hier wird der ComboBox die Einträge hinzugefügt
	public void initialize() {
		operatorenComboBox.getItems().add("Addition");
		operatorenComboBox.getItems().add("Subtraktion");
		operatorenComboBox.getItems().add("Multiplikation");
		operatorenComboBox.getItems().add("Division");
	}

	@FXML
	// Methode berechnen erstellt
	public void berechnen() {

		// Variable ergebnis angelegt
		int ergebnis;

		// try und catch Block erstellt
		try {
			// Variable eingabe1 und eingabe2 angelegt
			int eingabe1 = Integer.parseInt(zahl1TextField.getText());
			int eingabe2 = Integer.parseInt(zahl2TextField.getText());

			// Hier wird geprüft ob in der ComboBox (Addition) ausgewählt wurde
			if ("Addition".equals(operatorenComboBox.getValue())) {
				ergebnis = Taschenrechner.berechneAddition(eingabe1, eingabe2);

			// Hier wird geprüft ob in der ComboBox (Subtraktion) ausgewählt wurde
			} else if ("Subtraktion".equals(operatorenComboBox.getValue())) {
				ergebnis = Taschenrechner.berechneSubtraktion(eingabe1, eingabe2);

			// Hier wird geprüft ob in der ComboBox (Multiplikation) ausgewählt wurde
			} else if ("Multiplikation".equals(operatorenComboBox.getValue())) {
				ergebnis = Taschenrechner.berechneMultiplikation(eingabe1, eingabe2);

			// Hier bleibt dann nur noch die (Division) übrig
			} else {
				ergebnis = Taschenrechner.berechneDivision(eingabe1, eingabe2);
			}
			
			String ergebnisString = String.valueOf(ergebnis);
			ergebnisTextField.setText(ergebnisString);

			// Wenn der Anwender in der 2ten Eingabe eine 0 eingibt bekommt er eine Meldeung.
		} catch (TaschenrechnerDivisionException exception) {
			Alert meinDialog = new Alert(AlertType.INFORMATION, exception.getMessage());
			meinDialog.show();
		
			// Wenn der Anwender keine Zahlen eingibt dann bekommt er eine Fehlermeldung.
		} catch (Exception exception) {
			Alert alert = new Alert(AlertType.WARNING, "Bitte geben Sie Zahlen ein.");
			alert.show();
		}
	}

}
