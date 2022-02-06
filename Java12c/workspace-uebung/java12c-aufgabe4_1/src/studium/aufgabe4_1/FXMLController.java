package studium.aufgabe4_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class FXMLController {
	// das Textfeld
	@FXML
	private TextArea editor;
	// f�r die B�hne
	private Stage meineStage;

	// die Methode zum Beenden
	@FXML
	protected void beendenKlick(ActionEvent event) {
		Platform.exit();
	}

	// die Methode zum Anzeigen des �ffnendialogs
	@FXML
	protected void ladenKlick(ActionEvent event) {
		// eine neue Instanz der Klasse FileChooser erzeugen
		FileChooser oeffnenDialog = new FileChooser();

		// den Titel f�r den Dialog setzen
		oeffnenDialog.setTitle("Datei �ffnen");
		oeffnenDialog.setInitialDirectory(new File(System.getProperty("user.home")));

		// den Filter setzen
		oeffnenDialog.getExtensionFilters().add(new ExtensionFilter("Textdateien", "*.txt"));

		// den �ffnendialog anzeigen und das Ergebnis beschaffen
		File datei = oeffnenDialog.showOpenDialog(meineStage);

		// wurde eine Datei ausgew�hlt
		if (datei != null)

			// dann den Inhalt �ber eine eigene Methode lesen
			editor.setText(datenLesen(datei));
	}

	// die Methode zum Anlegen eines neuen Dokuments
	@FXML
	protected void neuKlick(ActionEvent event) {
		// den Dialog erzeugen und anzeigen
		Alert meinDialog = new Alert(AlertType.INFORMATION, "Die Daten werden gel�scht.");

		// den Text setzen
		meinDialog.setHeaderText("Bitte beachten");

		// den Dialog anzeigen
		meinDialog.showAndWait();

		// das Textfeld leeren
		editor.clear();
	}

	// die Methode zum Anzeigen des Speicherndialogs
	@FXML
	protected void speichernKlick(ActionEvent event) {
		// eine neue Instanz der Klasse FileChooser erzeugen
		FileChooser speichernDialog = new FileChooser();

		// den Titel f�r den Dialog setzen
		speichernDialog.setTitle("Datei speichern");

		// den Ordner setzen
		speichernDialog.setInitialDirectory(new File(System.getProperty("user.home")));

		// den Filter setzen
		speichernDialog.getExtensionFilters().add(new ExtensionFilter("Textdateien", "*.txt"));

		// den Speicherndialog anzeigen und das Ergebnis beschaffen
		File datei = speichernDialog.showSaveDialog(meineStage);

		// wurde eine Datei ausgew�hlt
		if (datei != null)

			// dann den Inhalt �ber eine eigene Methode speichern
			datenSchreiben(datei);
	}

	// die Methode zum Laden
	// Sie erh�lt die Datei, die gelesen werden soll
	// und liefert eine Zeichenkette mit dem Inhalt zur�ck
	private String datenLesen(File dateiLesen) {

		// gelesen wird als int!!
		int zeichen = 0;
		StringBuilder text = new StringBuilder();

		// eine Instanz der Klasse FileReader mit der Datei erzeugen
		try (FileReader tempDatei = new FileReader(dateiLesen)) {

			// solange das Ende der Datei nicht erreicht ist, werden die Zeichen einzeln
			// gelesen und
			// an einem StringBuilder angeh�ngt
			zeichen = tempDatei.read();
			while (zeichen != -1) {

				// zeichen wird in den Typ char umgewandelt
				text.append((char) zeichen);
				zeichen = tempDatei.read();
			}
		} catch (IOException e) {

			// bei Problemen einen Dialog erzeugen
			Alert meinDialog = new Alert(AlertType.INFORMATION, "Beim Laden ist ein Problem aufgetreten");
			meinDialog.setHeaderText("Bitte beachten");
			meinDialog.showAndWait();
		}
		return (text.toString());
	}

	// die Methode zum Schreiben
	// Sie erh�lt die Datei, die geschrieben werden soll
	private void datenSchreiben(File dateiSchreiben) {

		// eine Instanz der Klasse FileWriter mit der Datei erzeugen
		try (FileWriter tempDatei = new FileWriter(dateiSchreiben)) {

			// der Inhalt des Textfeldes wird direkt in die Datei geschrieben
			tempDatei.write(editor.getText());
		} catch (IOException e) {

			// bei Problemen einen Dialog erzeugen
			// bei Problemen einen Dialog erzeugen
			Alert meinDialog = new Alert(AlertType.INFORMATION, "Beim Schreiben ist ein Problem aufgetreten");
			meinDialog.setHeaderText("Bitte beachten");
			meinDialog.showAndWait();
		}
	}

	// die Methode setzt die B�hne auf den �bergebenen Wert
	public void setMeineStage(Stage meineStage) {
		this.meineStage = meineStage;
	}
}
