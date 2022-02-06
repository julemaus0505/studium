package studium.aufgabe3_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class FXMLController {
	// das Eingabefeld
	@FXML
	private TextField ausgabe;
	// für die Schriftgröße
	private int schriftgroesse = 12;

	// die Methode zum Vergrößern
	@FXML
	protected void groesserKlick(ActionEvent event) {
		// ist die Schriftgröße kleiner als 40?
		// dann vergrößern
		if (schriftgroesse < 40) {
			schriftgroesse++;
			ausgabe.setFont(new Font("System", schriftgroesse));
		}
	}

	// die Methode zum Verkleinern
	@FXML
	protected void kleinerKlick(ActionEvent event) {
		// ist die Schriftgröße größer als 6?
		// dann verkleinern wir den Text
		if (schriftgroesse > 6) {
			schriftgroesse--;
			ausgabe.setFont(new Font("System", schriftgroesse));
		}
	}
}
