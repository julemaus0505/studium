package gui.buchhandel_ebook_eigene_seiten;


import business.Ebook;
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

public class EbookEigeneSeitenController {

	private Ebook ebook;

	@FXML
	private Pane eigendeEbookPane;

	@FXML
	private ImageView eigendeSeiteEbookImageView;

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

	public EbookEigeneSeitenController(Ebook ebook) {
		this.ebook = ebook;
	}

	public void initialize() {
		eigendeSeiteEbookImageView.setImage(new Image(getClass().getResource(ebook.getBildPfad()).toString()));

		if (ebook.isBuchLieferbar()) {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/gruen.jpg").toString()));

		} else {
			oblieferbarImageView.setImage(new Image(getClass().getResource("img/rot.jpg").toString()));
		}

		ueberschriftLabel.setText(ebook.getTitel());
		eigendeSeiteAutorenLabel.setText(ebook.getAutor());
		einleitungTextArea.setText(ebook.getBeschreibung());
		beschreibungTextArea.setText(ebook.getBeschreibung());
		produktdetailsTextArea.setText(ebook.getProduktdetails());
		preisLabel.setText(String.format("€ %.2f", ebook.getPreis()));
		mehrwertsteuerText.setText(ebook.getMehrwertsteuer());
		sofortLieferbarText.setText(ebook.getSofortLieferbar());

	}

	public void grossesBildOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buch_bilder_gross/buchGrossAnzeigen.fxml"));
			BuchGrossAnzeigenController controller = new BuchGrossAnzeigenController(ebook);
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
