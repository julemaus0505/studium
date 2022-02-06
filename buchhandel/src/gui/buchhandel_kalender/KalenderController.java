package gui.buchhandel_kalender;

import business.Kalender;

import gui.buchhandel.BuchhandelController;

import gui.buchhandel_kalender_empfehlung.KalenderEmpfehlungController;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.layout.Pane;

import repository.KalenderRepository;

public class KalenderController extends BuchhandelController {

	@FXML
	private Pane kalenderVorschlag1Pane;

	@FXML
	private Pane kalenderVorschlag2Pane;

	@FXML
	private Pane kalenderVorschlag3Pane;

	@FXML
	private Pane kalenderVorschlag4Pane;

	@FXML
	private Pane kalenderVorschlag5Pane;

	@FXML
	private Pane kalenderVorschlag6Pane;

	@FXML
	private Pane kalenderVorschlag7Pane;

	@FXML
	private Pane kalenderVorschlag8Pane;

	public KalenderRepository kalenderRepository = new KalenderRepository();

	public void initialize() {

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag1();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag1Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag2();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag2Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag3();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag3Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag4();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag4Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag5();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag5Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag6();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag6Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag7();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag7Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Kalender kalender = kalenderRepository.getKalenderVorschlag8();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_kalender_empfehlung/KalenderEmpfehlung.fxml"));
			KalenderEmpfehlungController controllerKalender = new KalenderEmpfehlungController(kalender);
			loader.setController(controllerKalender);
			Pane pane = loader.load();
			kalenderVorschlag8Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
