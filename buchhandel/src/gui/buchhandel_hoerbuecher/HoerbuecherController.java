package gui.buchhandel_hoerbuecher;

import business.Hoerbuch;
import gui.buchhandel.BuchhandelController;
import gui.buchhandel_hoerbuch_empfehlung.HoerbuchEmpfehlungController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;

import repository.HoerbuchRepository;

public class HoerbuecherController {

	@FXML
	private Pane hoerbuchVorschlag1Pane;

	@FXML
	private Pane hoerbuchVorschlag2Pane;

	@FXML
	private Pane hoerbuchVorschlag3Pane;

	@FXML
	private Pane hoerbuchVorschlag4Pane;

	@FXML
	private Pane hoerbuchVorschlag5Pane;

	@FXML
	private Pane hoerbuchVorschlag6Pane;

	@FXML
	private Pane hoerbuchVorschlag7Pane;

	@FXML
	private Pane hoerbuchVorschlag8Pane;

	public HoerbuchRepository hoerbuchRepository = new HoerbuchRepository();

	public void initialize() {

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag1();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag1Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag2();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag2Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag3();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag3Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag4();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag4Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag5();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag5Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag6();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag6Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag7();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag7Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Hoerbuch hoerbuch = hoerbuchRepository.getHoerbuchVorschlag8();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_hoerbuch_empfehlung/HoerbuchEmpfehlung.fxml"));
			HoerbuchEmpfehlungController controllerHoerbuch = new HoerbuchEmpfehlungController(hoerbuch);
			loader.setController(controllerHoerbuch);
			Pane pane = loader.load();
			hoerbuchVorschlag8Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
