package gui.buchhandel_kalender_empfehlung;

import business.Kalender;
import gui.buchhandel.BuchhandelController;
import gui.buchhandel.BuchhandelStore;
import gui.buchhandel_buch_eigene_seiten.BuchEigeneSeitenController;
import gui.buchhandel_kalender_eigene_seiten.KalenderEigeneSeitenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class KalenderEmpfehlungController extends BuchhandelController {

	private Kalender kalender;

	@FXML
	private ImageView kalenderImagView;

	@FXML
	private Label autorenLabel;

	@FXML
	private Label titelLabel;

	@FXML
	private Label preisLabel;

	@FXML
	private Button kaufenButton;

	public KalenderEmpfehlungController(Kalender kalender) {
		this.kalender = kalender;

	}

	public void initialize() {

		kalenderImagView.setImage(new Image(getClass().getResource(kalender.getBildPfad()).toString(), true));

		autorenLabel.setText(kalender.getAutor());
		titelLabel.setText(kalender.getTitel());
		preisLabel.setText(String.format("Der Preis ist %.2f €", kalender.getPreis()));
		kaufenButton.setText(kalender.getKaufen());

	}

	@FXML
	public void eigeneKalenderseiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_eigene_seiten/KalenderEigeneSeiten.fxml"));
			KalenderEigeneSeitenController controllerEigeneSeite = new KalenderEigeneSeitenController(kalender);
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
