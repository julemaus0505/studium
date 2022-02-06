package gui.buchhandel_buecher_navi;

import business.Buch;
import business.Kategorie;
import gui.buchhandel_buch_empfehlung.BuchEmpfehlungController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;

import javafx.scene.control.Alert.AlertType;

import javafx.scene.layout.Pane;
import repository.BuchRepository;

public class StartSeiteBuecherHomeController {

	@FXML
	private Pane buchvorschlag6Pane;

	@FXML
	private Pane buchvorschlag7Pane;

	@FXML
	private Pane buchvorschlag8Pane;

	@FXML
	private Pane buchvorschlag9Pane;

	@FXML
	private Pane buchvorschlag10Pane;

	@FXML
	private Pane buchvorschlag11Pane;

	@FXML
	private Pane buchvorschlag12Pane;

	@FXML
	private Pane buchvorschlag13Pane;

	public BuchRepository buchhandelRepository = new BuchRepository();

	public void initialize() {

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag6();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag6Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag7();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag7Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag8();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag8Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag9();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag9Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag10();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag10Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag11();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag11Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag12();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag12Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = buchhandelRepository.getBuchvorschlag13();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_buch_empfehlung/Buch_Empfehlung.fxml"));
			BuchEmpfehlungController controllerEmpfehlung = new BuchEmpfehlungController(buch);
			loader.setController(controllerEmpfehlung);
			Pane pane = loader.load();
			buchvorschlag13Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}
	}

}