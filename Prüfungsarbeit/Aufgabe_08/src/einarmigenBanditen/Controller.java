package einarmigenBanditen;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

	private static final String[] BILDER_WUERFEL = { "eins.png", "zwei.png", "drei.png", 
			"vier.png", "fuenf.png",
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
	private Button losButton;

	@FXML
	void wuerfelnUndAuswaerten(ActionEvent event) {

		// würfeln
		Random zufall = new Random();

		 int wuerfel1 = zufall.nextInt(6) +1;
		 int wuerfel2 = zufall.nextInt(6) +1;
		 int wuerfel3 = zufall.nextInt(6) +1;
		
		 
		wuerfel1Bild.setImage(new Image(getClass().getResourceAsStream(BILDER_WUERFEL[wuerfel1-1])));
		wuerfel2Bild.setImage(new Image(getClass().getResourceAsStream(BILDER_WUERFEL[wuerfel2-1])));
		wuerfel3Bild.setImage(new Image(getClass().getResourceAsStream(BILDER_WUERFEL[wuerfel3-1])));
		 
		guthaben -= EINSATZ;

		guthabenTextField.setText(" " + guthaben);

		if (wuerfel1 == wuerfel2 && wuerfel2 == wuerfel3 && wuerfel1 == wuerfel3) {
			guthaben += GEWINN_3_GLEICHE;
			guthabenTextField.setText(" " + guthaben);
			Alert alert3 = new Alert(AlertType.INFORMATION);
			alert3.setHeaderText("Glückwunsch! 3 gleiche Zahlen!");
			alert3.setContentText("Ihr Gewinn betraegt: " + GEWINN_3_GLEICHE);
			alert3.showAndWait();

		} else if (wuerfel1 == wuerfel2 || wuerfel2 == wuerfel3 || wuerfel1 == wuerfel3) {
			guthaben += GEWINN_2_GLEICHE;
			guthabenTextField.setText("" + guthaben);
			Alert alert2 = new Alert(AlertType.INFORMATION);
			alert2.setHeaderText("Glückwunsch! 2 gleiche Zahlen!");
			alert2.setContentText("Glückwunsch! 2 gleiche Zahlen!");
			alert2.setHeaderText("Ihr Gewinn betraegt: " + GEWINN_2_GLEICHE);
			alert2.showAndWait();

		} else {
			Alert alert4 = new Alert(AlertType.INFORMATION);
			alert4.setHeaderText("Leider haben Sie dismal kein Glück gehabt.");
			alert4.setContentText("Versuchen Sie es erneut.");
			alert4.showAndWait();
		}
			
		if (guthaben >= EINSATZ) {
			guthabenTextField.setText("" + guthaben);
		

		} else {
			Alert alertVerloren = new Alert(AlertType.INFORMATION);
			alertVerloren.setHeaderText("Leider kein Guthaben mehr....");
			alertVerloren.showAndWait();
			System.exit(0);

		}

	}

}
