package abstractKlasseWaehrung;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class WaehrungController {

	@FXML
	private TextField dmBetragTextField;

	@FXML
	private TextField euroBetragTextField;

	@FXML
	private TextField lireBetragTextField;

	@FXML
	private TextField francTextField;

	@FXML
	private Button betragBerechnenButton;

	@FXML
	public void initialize() {
		euroBetragTextField.editableProperty().set(false);
		lireBetragTextField.editableProperty().set(false);
		francTextField.editableProperty().set(false);

	}

	@FXML
	public void betraegeBerechen() {

		if (dmBetragTextField.getText() == null || dmBetragTextField.getText().isEmpty()) {
			Alert fehlermeldung = new Alert(AlertType.WARNING,
					"Bitte geben Sie einen gültigen DM Betrag ein. Nur Zahlen.", ButtonType.OK);
			fehlermeldung.show();

		} else {
			double dmBetrag = Double.parseDouble(dmBetragTextField.getText());
			DM dm = new DM(dmBetrag);
			euroBetragTextField.setText(String.format("%.2f", dm.eruoBetrag()));

			Euro euro = new Euro(dm.eruoBetrag());

			Lire lire = new Lire(euro);
			lireBetragTextField.setText(String.format("%.2f", lire.lireBetrag()));

			Franc franc = new Franc(euro);
			francTextField.setText(String.format("%.2f", franc.francBetrag()));
		}

	}

}
