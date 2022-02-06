package gui.ebook_bilder_gross;

import business.Ebook;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class EbookGrossAnzeigenController {

	private Ebook ebook;

	@FXML
	private Pane bildGrossAnzeigePane;

	@FXML
	private ImageView grossesBildImageView;

	public EbookGrossAnzeigenController(Ebook ebook) {
		this.ebook = ebook;

	}

	public void initialize() {
		grossesBildImageView.setImage(new Image(getClass().getResource(ebook.getBildPfad()).toString()));

	}

}
