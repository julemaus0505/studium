package gui.hoerbuch_bilder_gross;

import business.Hoerbuch;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HoerbuchBildGrossAnzeigenController {

	private Hoerbuch hoerbuch;

	@FXML
	private Pane bildGrossAnzeigenPane;

	@FXML
	private ImageView grossesBildImageView;

	public HoerbuchBildGrossAnzeigenController(Hoerbuch hoerbuch) {
		this.hoerbuch = hoerbuch;
	}

	public void initialize() {
		grossesBildImageView.setImage(new Image(getClass().getResource(hoerbuch.getBildPfad()).toString()));
	}

}
