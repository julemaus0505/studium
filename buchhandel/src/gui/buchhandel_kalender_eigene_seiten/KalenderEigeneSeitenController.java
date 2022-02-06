package gui.buchhandel_kalender_eigene_seiten;

import business.Kalender;
import gui.buch_bilder_gross.BuchGrossAnzeigenController;
import gui.kalender_bilder_gross.KalenderBildGrossAnzeigenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KalenderEigeneSeitenController {

	private Kalender kalender;

	@FXML
	private Pane eigendeKalenderPane;

	@FXML
	private ImageView eigendeSeiteKalenderImageView;

	@FXML
	private Label ueberschriftLabel;

	@FXML
	private Label eigendeSeiteAutorenLabel;

	@FXML
	private TextArea einleitungTextArea;

	@FXML
	private TextArea beschreibungTextArea;

	@FXML
	private TextArea produktdetailsTextArea;

	@FXML
	private Pane preisPane;

	@FXML
	private Label preisLabel;

	@FXML
	private Text mehrwertsteuerText;

	@FXML
	private Text sofortLieferbarText;

	@FXML
	private Label buchGebundenLabel;

	@FXML
	private ImageView oblieferbarImageView;

	public KalenderEigeneSeitenController(Kalender kalender) {
		this.kalender = kalender;
	}

	public void initialize() {
		eigendeSeiteKalenderImageView.setImage(new Image(getClass().getResource(kalender.getBildPfad()).toString()));

		if (kalender.isBuchLieferbar()) {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/gruen.jpg").toString()));

		} else {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/rot.jpg").toString()));
		}

		ueberschriftLabel.setText(kalender.getTitel());
		eigendeSeiteAutorenLabel.setText(kalender.getAutor());
		einleitungTextArea.setText(kalender.getBeschreibung());
		beschreibungTextArea.setText(kalender.getBeschreibung());
		produktdetailsTextArea.setText(kalender.getProduktdetails());
		preisLabel.setText(String.format("€ %.2f", kalender.getPreis()));
		mehrwertsteuerText.setText(kalender.getMehrwertsteuer());
		sofortLieferbarText.setText(kalender.getSofortLieferbar());

	}

	public void grossesBildOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/kalender_bilder_gross/KalenderBildGrossAnzeigen.fxml"));
			KalenderBildGrossAnzeigenController controller = new KalenderBildGrossAnzeigenController(kalender);
			loader.setController(controller);
			Pane pane = loader.load();
			Stage stage = new Stage();
			Scene scene = new Scene(pane);
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
