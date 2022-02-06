package gui.buchhandel_ebooks;

import business.Ebook;
import business.Kategorie;
import gui.buchhandel.BuchhandelController;
import gui.buchhandel_buch_empfehlung.BuchEmpfehlungController;
import gui.buchhandel_ebook_empfehlung.EbookEmpfehlungController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import repository.BuchRepository;
import repository.EbookRepository;

public class EbooksController {

	@FXML
	private Pane ebookVorschlag1Pane;

	@FXML
	private Pane ebookVorschlag2Pane;

	@FXML
	private Pane ebookVorschlag3Pane;

	@FXML
	private Pane ebookVorschlag4Pane;

	@FXML
	private Pane ebookVorschlag5Pane;

	@FXML
	private Pane ebookVorschlag6Pane;

	@FXML
	private Pane ebookVorschlag7Pane;

	@FXML
	private Pane ebookVorschlag8Pane;

	public EbookRepository ebookRepository = new EbookRepository();

	public void initialize() {

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag1();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag1Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag2();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag2Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag3();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag3Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag4();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag4Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag5();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag5Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag6();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag6Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag7();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag7Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

		try {
			Ebook ebook = ebookRepository.getEbookVorschlag8();
			FXMLLoader loader = new FXMLLoader(
					getClass().getResource("/gui/buchhandel_ebook_empfehlung/EbookEmpfehlung.fxml"));
			EbookEmpfehlungController controllerEbook = new EbookEmpfehlungController(ebook);
			loader.setController(controllerEbook);
			Pane pane = loader.load();
			ebookVorschlag8Pane.getChildren().add(pane);

		} catch (Exception e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Fehlermeldung");
			e.printStackTrace();
		}

	}

}
