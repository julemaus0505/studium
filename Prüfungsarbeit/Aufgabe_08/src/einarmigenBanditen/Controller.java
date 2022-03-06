package einarmigenBanditen;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	private static final String[] BILDER_WUERFEL = { "eins.png", "zwei.png", "drei.png", "vier.png", "fuenf.png",
			"sechs.png" };

	private static final int EINSATZ = 10;

	private static final int GEWINN_2_GLEICHE = 20;

	private static final int GEWINN_3_GLEICHE = 100;

	private int guthaben = 100;

	@FXML
	private Label jedesSpielKostetLabel;

	@FXML
	private ImageView wuerfel1Bild;

	@FXML
	private ImageView wuerfel2Bild;

	@FXML
	private ImageView wuerfel3Bild;

	@FXML
	private TextField guthabenTextField;

	@FXML
	private Label ausgabeLabel;

	@FXML
	private Button losButton;

	@FXML
	void wuerfelnUndAuswaerten(ActionEvent event) {

		// würfeln
		Random zufall = new Random();

		int wuerfel1 = zufall.nextInt(6) + 1;
		int wuerfel2 = zufall.nextInt(6) + 1;
		int wuerfel3 = zufall.nextInt(6) + 1;
		
		

		// würfel Bilder zufällig anzeigen
		wuerfel1Bild.setImage(new Image(getClass().getResourceAsStream(BILDER_WUERFEL[wuerfel1 - 1])));
		wuerfel2Bild.setImage(new Image(getClass().getResourceAsStream(BILDER_WUERFEL[wuerfel2 - 1])));
		wuerfel3Bild.setImage(new Image(getClass().getResourceAsStream(BILDER_WUERFEL[wuerfel3 - 1])));

		// den ersten Einsatz vom Guthaben abziehen
		guthaben -= EINSATZ;

		// neu errechnetes Guthaben im Textfield gesetzt
		guthabenTextField.setText(" " + guthaben);

		// wurden drei gleiche gewürfelt, dann wird der Gewinn dem Guthaben hinzugefügt
		// und das aktuelle Guthaben im TextField gesetzt, und Ausgabe über das Label
		if (wuerfel1 == wuerfel2 && wuerfel2 == wuerfel3 && wuerfel1 == wuerfel3) {
			guthaben += GEWINN_3_GLEICHE;
			guthabenTextField.setText(" " + guthaben);
			ausgabeLabel.setText(
					"Glückwunsch! \n  3 gleiche Zahlen! \n" + "Ihr Gewinn betraegt: " + GEWINN_3_GLEICHE + " Euro");

		// wurden zwei gleiche gewürfelt, dann wird der Gewinn dem Guthaben hinzugefügt
		// und das aktuelle Guthaben im TextField gesetzt, und Ausgabe über das Label
		} else if (wuerfel1 == wuerfel2 || wuerfel2 == wuerfel3 || wuerfel1 == wuerfel3) {
			guthaben += GEWINN_2_GLEICHE;
			guthabenTextField.setText("" + guthaben);
			ausgabeLabel.setText(
					"Glückwunsch! 2 gleiche Zahlen! \n " + "Ihr Gewinn betraegt: " + GEWINN_2_GLEICHE + " Euro");

		// Ausgabe wenn es zwei oder drei gleiche gibt
		} else {
			ausgabeLabel.setText("Leider haben Sie dismal kein Glück gehabt. \n " + " Versuchen Sie es erneut.");

		}

		// ist noch genug guthaben vorhanden zum weiter spielen
		if (guthaben >= EINSATZ) {
			guthabenTextField.setText("" + guthaben);

		} else {
			// ausgabe wenn kein Guthaben mehr vorhanden ist
			ausgabeLabel.setText("Leider kein Guthaben mehr....");
			System.exit(0);

		}

	}

}
