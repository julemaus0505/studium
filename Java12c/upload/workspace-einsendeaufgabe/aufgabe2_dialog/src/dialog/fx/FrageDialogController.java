package dialog.fx;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FrageDialogController {

	@FXML
	// Variable titleTextField erzeugt
	private TextField titleTextField;

	@FXML
	// Variable headerTextField erzeugt
	private TextField headerTextField;

	@FXML
	// Variable contentTextField erzeugt
	private TextField contentField;

	@FXML
	// Variable jaRadioButton erzeugt
	private RadioButton jaRadioButton;

	@FXML
	// Variable neinRadioButton erzeugt
	private RadioButton neinRadioButton;

	@FXML
	// Hier wurde eine Methode geschrieben das die Komponete deaktiviert ist
	public void initialize() {
		jaRadioButton.disableProperty().set(true);
		neinRadioButton.disableProperty().set(true);
	}

	@FXML
	// Hier wurde die Methode erzeugt die den Dialog anzeigen lässt
	public void dialogAnzeigen() {
		if (headerTextField.getText() == null || contentField.getText() == null || headerTextField.getText().isEmpty()
				|| contentField.getText().isEmpty()) {

			// Hier wurde über Alert eine Fehlermeldung erzeugt
			Alert fehlermeldung = new Alert(AlertType.WARNING, "Bitte die Felder ausfüllen", ButtonType.OK);
			fehlermeldung.show();

		} else {
			MeinAlert eingabeDialog = new MeinAlert(titleTextField.getText(), headerTextField.getText(),
					contentField.getText());

			Optional<ButtonType> result = eingabeDialog.showAndWait();

			// Prüfen ob Ergebnis vorhanden ist anstelle von Null
			if (result.isPresent()) {
				if (result.get().equals(ButtonType.YES)) {
					jaRadioButton.setSelected(true);
					neinRadioButton.setSelected(false);

				} else if (result.get().equals(ButtonType.NO)) {
					neinRadioButton.setSelected(true);
					jaRadioButton.setSelected(false);

				}

			}
		}

	}

}
