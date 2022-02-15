package mediaplayer;

import java.io.File;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class FXMLController {

	// für die Bühne
	private Stage meineStage;

	// für den Player
	private MediaPlayer mediaplayer;

	// für die MediaView
	@FXML
	private MediaView mediaview;

	// für die ImageView für Datei
	@FXML
	private ImageView symbolDateiAuswaehlen;

	// für die ImageView für Play
	@FXML
	private ImageView symbolPlay;

	// für die ImageView für Pause
	@FXML
	private ImageView symbolPause;

	@FXML
	private Button buttonDateiAuswaehlen;

	@FXML
	private Button buttonPlay;

	// @FXML
	// private Button buttonPause;

	// für das Listenfeld
	@FXML
	private ListView<String> liste;

	private String dateiname;

	// die Methode setzt die Bühne auf den übergebenen Wert
	public void setMeineStage(Stage meineStage) {
		this.meineStage = meineStage;

	}

	// die Methode zum Laden
	@FXML
	protected void ladenKlick(ActionEvent event) {

		// eine neue Instanz der Klasse FileChooser erzeugen
		FileChooser oeffnenDialog = new FileChooser();

		// den Titel für den Dialog setzen
		oeffnenDialog.setTitle("Datei öffnen");

		// die Filter setzen
		oeffnenDialog.getExtensionFilters().add(new ExtensionFilter("Audiodateien", "*.mp3"));
		oeffnenDialog.getExtensionFilters().add(new ExtensionFilter("Videodateien", "*.mp4"));

		// den Startordner auf den Benutzerordner setzen
		oeffnenDialog.setInitialDirectory(new File(System.getProperty("user.home")));

		// den Öffnendialog anzeigen und das Ergebnis beschaffen
		File datei = oeffnenDialog.showOpenDialog(meineStage);

		// wurde eine Datei ausgewählt
		if (datei != null) {

			// dann über eine eigene Methode laden
			dateiLaden(datei);

			// Teilaufgabe 2
			// die Grafik von Play auf Pause setzten
			buttonPlay.setGraphic(symbolPause);

		}

		// Tailaufgabe 2
		// symbole ausschallten

		buttonPlay.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {

				mediaplayer.pause();

				if (buttonPlay.getGraphic() != symbolPlay && datei != null) {
					mediaplayer.pause();
					buttonPlay.setGraphic(symbolPlay);
				} else {
					mediaplayer.play();
					buttonPlay.setGraphic(symbolPause);
				}
			}
		});

		// Teileaufgabe 1
		// wenn liste nicht null ist dann beim drauf klicken neu Laden
		liste.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {

				if (liste.getSelectionModel().getSelectedItem() != null) {
					titelNeuLaden(datei);

				}
			}
		});
	}

	// die Methode für die Pause
	@FXML
	protected void pauseKlick(ActionEvent event) {

		// gibt es überhaupt einen Mediaplayer?
		if (mediaplayer != null)

			// dann unterbrechen
			mediaplayer.pause();
	}

	// die Methode für die Wiedergabe
	@FXML
	protected void playKlick(ActionEvent event) {

		// gibt es überhaupt einen Mediaplayer?
		if (mediaplayer != null)

			// dann wiedergeben
			mediaplayer.play();
	}

	// die Methode zum Beenden
	@FXML
	protected void beendenKlick(ActionEvent event) {
		Platform.exit();
	}

	// die Methode lädt eine Datei
	public void dateiLaden(File datei) {

		titelNeuLaden(datei);

		// den Pfad in das Listenfeld eintragen
		liste.getItems().add(datei.toString());

	}

	// die Methode lädt eine Datei
	public void titelNeuLaden(File datei) {

		// läuft schon eine Wiedergabe?
		if (mediaplayer != null && mediaplayer.getStatus() == MediaPlayer.Status.PLAYING) {

			// dann anhalten
			mediaplayer.stop();
		}

		// das Medium, den Mediaplayer und die MediaView erzeugen
		try {
			Media medium = new Media(datei.toURI().toString());
			mediaplayer = new MediaPlayer(medium);
			mediaview.setMediaPlayer(mediaplayer);

			// die Wiedergabe starten
			mediaplayer.play();

			// und die Titelleiste anpassen
			meineStage.setTitle("JavaFX Multimedia-Player " + datei.toString());

		} catch (Exception exception) {

			// den Dialog erzeugen und anzeigen
			Alert meinDialog = new Alert(AlertType.INFORMATION,
					"Beim Laden hat es ein Problem gegeben.\n" + exception.getMessage());

			// den Text setzen
			meinDialog.setHeaderText("Bitte beachten");
			meinDialog.initOwner(meineStage);

			// den Dialog anzeigen
			meinDialog.showAndWait();
		}
	}
}
