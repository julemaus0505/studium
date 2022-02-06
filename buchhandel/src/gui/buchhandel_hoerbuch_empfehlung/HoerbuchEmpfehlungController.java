package gui.buchhandel_hoerbuch_empfehlung;

import business.Hoerbuch;

import gui.buchhandel.BuchhandelController;
import gui.buchhandel.BuchhandelStore;
import gui.buchhandel_hoerbuch_eigene_seiten.HoerbuchEigeneSeitenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HoerbuchEmpfehlungController extends BuchhandelController {

	private Hoerbuch hoerbuch;

	@FXML
	private ImageView hoerbuchImagView;

	@FXML
	private Label autorenLabel;

	@FXML
	private Label titelLabel;

	@FXML
	private Label preisLabel;

	@FXML
	private Button kaufenButton;

	public HoerbuchEmpfehlungController(Hoerbuch hoerbuch) {
		this.hoerbuch = hoerbuch;

	}

	public void initialize() {

		hoerbuchImagView.setImage(new Image(getClass().getResource(hoerbuch.getBildPfad()).toString(), true));

		autorenLabel.setText(hoerbuch.getAutor());
		titelLabel.setText(hoerbuch.getTitel());
		preisLabel.setText(String.format("Der Preis ist %.2f €", hoerbuch.getPreis()));
		kaufenButton.setText(hoerbuch.getKaufen());

	}

	@FXML
	public void eigeneHoerbuchseiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_eigene_seiten/HoerbuchEigeneSeiten.fxml"));
			HoerbuchEigeneSeitenController controllerEigeneSeite = new HoerbuchEigeneSeitenController(hoerbuch);
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
