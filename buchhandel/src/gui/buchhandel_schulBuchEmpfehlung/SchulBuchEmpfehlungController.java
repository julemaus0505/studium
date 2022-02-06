package gui.buchhandel_schulBuchEmpfehlung;

import business.Buch;
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

public class SchulBuchEmpfehlungController extends BuchhandelController {

	private Buch buch;

	@FXML
	private ImageView buchImagView;

	@FXML
	private Label buchGebundenLabel;

	@FXML
	private Label autorenLabel;

	@FXML
	private Label titelLabel;

	@FXML
	private Label preisLabel;

	@FXML
	private Button kaufenButton;

	public SchulBuchEmpfehlungController(Buch buch) {
		this.buch = buch;

	}

	public void initialize() {

		buchImagView.setImage(new Image(getClass().getResource(buch.getBildPfad()).toString(), true));

		if (buch.isGebunden()) {
			buchGebundenLabel.setText("Buch ist gebunden");

		} else {
			buchGebundenLabel.setText("Buch ist nicht gebunden");
		}

		autorenLabel.setText(buch.getAutor());
		titelLabel.setText(buch.getTitel());
		preisLabel.setText(String.format("Der Preis ist %.2f €", buch.getPreis()));
		kaufenButton.setText(buch.getKaufen());

	}

	@FXML
	public void eigeneBuchseiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass()
					.getResource("/gui/buchhandel_schule_lernen_buch_eigene_seiten/SchulBuchEigeneSeiten.fxml"));
			BuchEigeneSeitenController controllerEigeneSeite = new BuchEigeneSeitenController(buch);
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
