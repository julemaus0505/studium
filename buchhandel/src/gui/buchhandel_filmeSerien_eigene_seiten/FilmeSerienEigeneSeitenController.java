package gui.buchhandel_filmeSerien_eigene_seiten;

import business.FilmeSerien;
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

public class FilmeSerienEigeneSeitenController {

	private FilmeSerien filmeSerien;

	@FXML
	private Pane eigendeFilmeSerienPane;

	@FXML
	private ImageView eigendeSeiteFilmeSerienImageView;

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

	public FilmeSerienEigeneSeitenController(FilmeSerien filmeSerien) {
		this.filmeSerien = filmeSerien;
	}

	public void initialize() {
		eigendeSeiteFilmeSerienImageView
				.setImage(new Image(getClass().getResource(filmeSerien.getBildPfad()).toString()));

		if (filmeSerien.isBuchLieferbar()) {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/gruen.jpg").toString()));

		} else {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/rot.jpg").toString()));
		}

		ueberschriftLabel.setText(filmeSerien.getTitel());
		eigendeSeiteAutorenLabel.setText(filmeSerien.getAutor());
		einleitungTextArea.setText(filmeSerien.getBeschreibung());
		beschreibungTextArea.setText(filmeSerien.getBeschreibung());
		produktdetailsTextArea.setText(filmeSerien.getProduktdetails());
		preisLabel.setText(String.format("€ %.2f", filmeSerien.getPreis()));
		mehrwertsteuerText.setText(filmeSerien.getMehrwertsteuer());
		sofortLieferbarText.setText(filmeSerien.getSofortLieferbar());

	}

	public void grossesBildOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buch_bilder_gross/buchGrossAnzeigen.fxml"));
			BuchGrossAnzeigenController controller = new BuchGrossAnzeigenController(filmeSerien);
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
