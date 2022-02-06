package gui.buch_bilder_gross;



import business.Buch;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;


public class BuchGrossAnzeigenController {
	
	
	private Buch buch;

	@FXML
	private Pane bildGrossAnzeigePane;
	
	@FXML
	private ImageView grossesBildImageView;

	
	
	public BuchGrossAnzeigenController(Buch buch) {
		this.buch = buch;
		
	}

	public void initialize() {
		grossesBildImageView.setImage(new Image(getClass().getResource(buch.getBildPfad()).toString()));
		
	}
	

	

}
