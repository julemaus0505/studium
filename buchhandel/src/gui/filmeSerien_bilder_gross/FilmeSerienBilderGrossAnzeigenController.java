package gui.filmeSerien_bilder_gross;

import business.FilmeSerien;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class FilmeSerienBilderGrossAnzeigenController {

	private FilmeSerien filmeSerien;

	@FXML
	private Pane bildGrossAnzeigenPane;

	@FXML
	private ImageView grossesBildImageView;

	public FilmeSerienBilderGrossAnzeigenController(FilmeSerien filmeSerien) {
		this.filmeSerien = filmeSerien;

	}

	public void initialize() {
		grossesBildImageView.setImage(new Image(getClass().getResource(filmeSerien.getBildPfad()).toString()));
	}

}
