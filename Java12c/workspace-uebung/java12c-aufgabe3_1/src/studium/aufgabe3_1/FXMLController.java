package studium.aufgabe3_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class FXMLController {
	// das Eingabefeld
	@FXML
	private TextField ausgabe;
	// f�r die Schriftgr��e
	private int schriftgroesse = 12;

	// die Methode zum Vergr��ern
	@FXML
	protected void groesserKlick(ActionEvent event) {
		// ist die Schriftgr��e kleiner als 40?
		// dann vergr��ern
		if (schriftgroesse < 40) {
			schriftgroesse++;
			ausgabe.setFont(new Font("System", schriftgroesse));
		}
	}

	// die Methode zum Verkleinern
	@FXML
	protected void kleinerKlick(ActionEvent event) {
		// ist die Schriftgr��e gr��er als 6?
		// dann verkleinern wir den Text
		if (schriftgroesse > 6) {
			schriftgroesse--;
			ausgabe.setFont(new Font("System", schriftgroesse));
		}
	}
}
