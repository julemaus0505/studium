package gui.startseite;

import java.io.IOException;

import business.Buch;
import gui.buchhandel.BuchhandelStore;
import gui.buchhandel_buch_eigene_seiten.BuchEigeneSeitenController;
import gui.buchhandel_buch_empfehlung.BuchEmpfehlungController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import repository.BuchRepository;

public class StartseiteController {

	@FXML
	private Pane buchvorschlag1Pane;

	@FXML
	private Pane buchvorschlag2Pane;

	@FXML
	private Pane buchvorschlag3Pane;

	@FXML
	private Pane buchvorschlag4Pane;

	@FXML
	private Pane buchBarackObama;

	private BuchRepository buchhandelModel = new BuchRepository();

	public void initialize() {

		try {
			Buch buch = buchhandelModel.getBuchvorschlag1();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag1Pane.getChildren().add(pane);

		} catch (IOException e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelModel.getBuchvorschlag2();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag2Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelModel.getBuchvorschlag3();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag3Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelModel.getBuchvorschlag4();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag4Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

	public void eigeneSeiteBarackObamaOeffen() {
		try {
			Buch buch = buchhandelModel.getBuchBarackObama();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_eigene_seiten/BuchEigeneSeiten.fxml"));
			BuchEigeneSeitenController controllerEigeneSeite = new BuchEigeneSeitenController(buch);
			loader.setController(controllerEigeneSeite);
			Pane pane = loader.load();
			buchBarackObama.getChildren().add(pane);
			BuchhandelStore.contentPaneAustauchen(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}
	}

}
