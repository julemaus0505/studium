package gui.buchhandel_schuleLernen;

import business.Buch;
import business.Ebook;
import gui.buchhandel_ebook_empfehlung.EbookEmpfehlungController;
import gui.buchhandel_schulBuchEmpfehlung.SchulBuchEmpfehlungController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import repository.EbookRepository;
import repository.SchulRepository;

public class SchuleLernenController {

	@FXML
	private Pane schulBuchVorschlag1Pane;

	@FXML
	private Pane schulBuchVorschlag2Pane;

	@FXML
	private Pane schulBuchVorschlag3Pane;

	@FXML
	private Pane schulBuchVorschlag4Pane;

	@FXML
	private Pane schulBuchVorschlag5Pane;

	@FXML
	private Pane schulBuchVorschlag6Pane;

	@FXML
	private Pane schulBuchVorschlag7Pane;

	@FXML
	private Pane schulBuchVorschlag8Pane;

	public SchulRepository schulRepository = new SchulRepository();

	public void initialize() {

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag1();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag1Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag2();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag2Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag3();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag3Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag4();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag4Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag5();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag5Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag6();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag6Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag7();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag7Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Buch buch = schulRepository.getSchulBuchVorschlag8();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_schulBuchEmpfehlung/SchulBuchEmpfehlung.fxml"));
			SchulBuchEmpfehlungController controllerSchulBuch = new SchulBuchEmpfehlungController(buch);
			loader.setController(controllerSchulBuch);
			Pane pane = loader.load();
			schulBuchVorschlag8Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}
}
