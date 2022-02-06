package gui.kalender_bilder_gross;

import business.Kalender;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class KalenderBildGrossAnzeigenController {

	private Kalender kalender;

	@FXML
	private Pane bildGrossAnzeigenPane;

	@FXML
	private ImageView grossesBildImageView;

	public KalenderBildGrossAnzeigenController(Kalender kalender) {
		this.kalender = kalender;
	}

	public void initialize() {
		grossesBildImageView.setImage(new Image(getClass().getResource(kalender.getBildPfad()).toString()));
	}

}
