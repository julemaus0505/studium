package gui.buchhandel;

import business.Kategorie;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.Pane;
import repository.BuchRepository;

public class BuchhandelController {

	private BuchRepository buchhandelRepository = new BuchRepository();

	@FXML
	private ComboBox<Kategorie> kategorieComboBox;

	@FXML
	private Pane contentPane;

	@FXML
	private ToolBar navigationToolBar;

	public void initialize() {

		kategorieComboBox.setItems(buchhandelRepository.liefertKategorien());
		BuchhandelStore.setContentPane(contentPane);

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/startseite/startseite.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

	@FXML
	public void homeSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/startseite/startseite.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}
	}

	@FXML
	public void buecherSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buecher_navi/StartSeiteBuecherHome.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldeung");
			e.printStackTrace();

		}

	}

	@FXML
	public void eBooksSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buchhandel_ebooks/Ebooks.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldeung");
			e.printStackTrace();
		}

	}

	public void schuleLernenSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schuleLernen/SchuleLernen.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldeung");
			e.printStackTrace();
		}

	}

	public void kalenderSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buchhandel_kalender/Kalender.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

	public void hoerbuecherSeiteOeffnen() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buchhandel_hoerbuecher/Hoerbuecher.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}
	}

	public void filmeSerienSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buchhandel_filmeSerien/FilmeSerien.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

	public void spielwarenSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buchhandel_spielwaren/Spielwaren.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

	public void weihnachtenSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/buchhandel_weihnachten/Weichnachten.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

	public void schreibwarenSeiteOeffnen() {

		try {
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schreibwaren/Schreibwaren.fxml"));
			Pane pane = loader.load();
			contentPane.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
