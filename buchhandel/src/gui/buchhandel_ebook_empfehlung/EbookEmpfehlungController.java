package gui.buchhandel_ebook_empfehlung;

import business.Buch;
import business.Ebook;
import gui.buchhandel.BuchhandelController;
import gui.buchhandel.BuchhandelStore;
import gui.buchhandel_buch_eigene_seiten.BuchEigeneSeitenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class EbookEmpfehlungController extends BuchhandelController {

	private Ebook ebook;

	@FXML
	private ImageView ebookImagView;

	@FXML
	private Label autorenLabel;

	@FXML
	private Label titelLabel;

	@FXML
	private Label preisLabel;

	@FXML
	private Button kaufenButton;

	public EbookEmpfehlungController(Ebook ebook) {
		this.ebook = ebook;

	}

	public void initialize() {

		ebookImagView.setImage(new Image(getClass().getResource(ebook.getBildPfad()).toString(), true));

		autorenLabel.setText(ebook.getAutor());
		titelLabel.setText(ebook.getTitel());
		preisLabel.setText(String.format("Der Preis ist %.2f €", ebook.getPreis()));
		kaufenButton.setText(ebook.getKaufen());

	}

	@FXML
	public void eigeneEbookseiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_eigene_seiten/BuchEigeneSeiten.fxml"));
			BuchEigeneSeitenController controllerEigeneSeite = new BuchEigeneSeitenController(ebook);
			loader.setController(controllerEigeneSeite);
			Pane pane = loader.load();
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
