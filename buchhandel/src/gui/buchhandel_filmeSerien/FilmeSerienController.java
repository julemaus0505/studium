package gui.buchhandel_filmeSerien;

import business.FilmeSerien;
import gui.buchhandel_filmeSerien_empfehlung.FilmeSerienEmpfehlungController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import repository.FilmeSerienRepository;

public class FilmeSerienController {

	@FXML
	private Pane filmeSerienVorschlag1Pane;

	@FXML
	private Pane filmeSerienVorschlag2Pane;

	@FXML
	private Pane filmeSerienVorschlag3Pane;

	@FXML
	private Pane filmeSerienVorschlag4Pane;

	@FXML
	private Pane filmeSerienVorschlag5Pane;

	@FXML
	private Pane filmeSerienVorschlag6Pane;

	@FXML
	private Pane filmeSerienVorschlag7Pane;

	@FXML
	private Pane filmeSerienVorschlag8Pane;

	public FilmeSerienRepository filmeSerienRepository = new FilmeSerienRepository();

	public void initialize() {

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag1();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag1Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag2();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag2Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag3();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag3Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag4();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag4Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag5();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag5Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag6();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag6Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag7();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag7Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			FilmeSerien filmeSerien = filmeSerienRepository.getFilmeSerienVorschlag8();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_filmeSerien_empfehlung/FilmeSerienEmpfehlung.fxml"));
			FilmeSerienEmpfehlungController controllerFilmeSerien = new FilmeSerienEmpfehlungController(filmeSerien);
			loader.setController(controllerFilmeSerien);
			Pane pane = loader.load();
			filmeSerienVorschlag8Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
