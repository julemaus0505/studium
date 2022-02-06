package gui.buchhandel_filmeSerien_empfehlung;

import business.FilmeSerien;
import gui.buchhandel.BuchhandelController;
import gui.buchhandel.BuchhandelStore;
import gui.buchhandel_filmeSerien_eigene_seiten.FilmeSerienEigeneSeitenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class FilmeSerienEmpfehlungController extends BuchhandelController {

	private FilmeSerien filmeSerien;

	@FXML
	private ImageView filmeSerienImagView;

	@FXML
	private Label autorenLabel;

	@FXML
	private Label titelLabel;

	@FXML
	private Label preisLabel;

	@FXML
	private Button kaufenButton;

	public FilmeSerienEmpfehlungController(FilmeSerien filmeSerien) {
		this.filmeSerien = filmeSerien;

	}

	public void initialize() {

		filmeSerienImagView.setImage(new Image(getClass().getResource(filmeSerien.getBildPfad()).toString(), true));

		autorenLabel.setText(filmeSerien.getAutor());
		titelLabel.setText(filmeSerien.getTitel());
		preisLabel.setText(String.format("Der Preis ist %.2f €", filmeSerien.getPreis()));
		kaufenButton.setText(filmeSerien.getKaufen());

	}

	@FXML
	public void eigeneFilmeSerienseiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_eigene_seiten/FilmeSerienEigeneSeiten.fxml"));
			FilmeSerienEigeneSeitenController controllerEigeneSeite = new FilmeSerienEigeneSeitenController(
					filmeSerien);
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
