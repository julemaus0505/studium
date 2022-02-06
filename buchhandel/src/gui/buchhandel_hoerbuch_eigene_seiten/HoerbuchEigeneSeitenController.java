package gui.buchhandel_hoerbuch_eigene_seiten;

import business.Hoerbuch;
import gui.buch_bilder_gross.BuchGrossAnzeigenController;
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

public class HoerbuchEigeneSeitenController {

	private Hoerbuch hoerbuch;

	@FXML
	private Pane eigendeHoerbuchPane;

	@FXML
	private ImageView eigendeSeiteHoerbuchImageView;

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

	public HoerbuchEigeneSeitenController(Hoerbuch hoerbuch) {
		this.hoerbuch = hoerbuch;
	}

	public void initialize() {
		eigendeSeiteHoerbuchImageView.setImage(new Image(getClass().getResource(hoerbuch.getBildPfad()).toString()));

		if (hoerbuch.isBuchLieferbar()) {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/gruen.jpg").toString()));

		} else {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/rot.jpg").toString()));
		}

		ueberschriftLabel.setText(hoerbuch.getTitel());
		eigendeSeiteAutorenLabel.setText(hoerbuch.getAutor());
		einleitungTextArea.setText(hoerbuch.getBeschreibung());
		beschreibungTextArea.setText(hoerbuch.getBeschreibung());
		produktdetailsTextArea.setText(hoerbuch.getProduktdetails());
		preisLabel.setText(String.format("€ %.2f", hoerbuch.getPreis()));
		mehrwertsteuerText.setText(hoerbuch.getMehrwertsteuer());
		sofortLieferbarText.setText(hoerbuch.getSofortLieferbar());

	}

	public void grossesBildOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buch_bilder_gross/buchGrossAnzeigen.fxml"));
			BuchGrossAnzeigenController controller = new BuchGrossAnzeigenController(hoerbuch);
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
