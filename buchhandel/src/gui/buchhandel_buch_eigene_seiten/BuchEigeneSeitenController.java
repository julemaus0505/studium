package gui.buchhandel_buch_eigene_seiten;

import business.Buch;
import gui.buch_bilder_gross.BuchGrossAnzeigenController;
import gui.buchhandel.BuchhandelStore;
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

public class  BuchEigeneSeitenController{

	private Buch buch;

	@FXML
	private Pane eigendeBuchPane;

	@FXML
	private ImageView eigendeSeiteBuchImageView;

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

	public BuchEigeneSeitenController(Buch buch) {
		this.buch = buch;
	}

	public void initialize() {
		eigendeSeiteBuchImageView.setImage(new Image(getClass().getResource(buch.getBildPfad()).toString()));

		if (buch.isBuchLieferbar()) {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/gruen.jpg").toString()));

		} else {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/rot.jpg").toString()));
		}

		if (buch.isGebunden()) {
			buchGebundenLabel.setText("Buch ist gebunden");

		} else {
			buchGebundenLabel.setText("Buch ist nicht gebunden");
		}

		ueberschriftLabel.setText(buch.getTitel());
		eigendeSeiteAutorenLabel.setText(buch.getAutor());
		einleitungTextArea.setText(buch.getBeschreibung());
		beschreibungTextArea.setText(buch.getBeschreibung());
		produktdetailsTextArea.setText(buch.getProduktdetails());
		preisLabel.setText(String.format("€ %.2f", buch.getPreis()));
		mehrwertsteuerText.setText(buch.getMehrwertsteuer());
		sofortLieferbarText.setText(buch.getSofortLieferbar());

	}

	public void grossesBildOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buch_bilder_gross/buchGrossAnzeigen.fxml"));
			BuchGrossAnzeigenController controller = new BuchGrossAnzeigenController(buch);
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
