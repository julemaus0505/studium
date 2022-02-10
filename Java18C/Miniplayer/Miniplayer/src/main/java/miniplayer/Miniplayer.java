package miniplayer;

import java.io.File;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Miniplayer extends Application {
	@Override
	public void start(Stage meineStage) throws Exception {
		// den obersten Knoten erzeugen
		// hier verwenden wir ein StackPane
		BorderPane rootNode = new BorderPane();

		// die Datei, die abgespielt werden soll
		// den Pfad müssen Sie anpassen
		File datei = new File("C:\\Users\\julia\\Desktop\\Michael_Patrick_Kelly.mp4");

		// das Medium, den Mediaplayer und die MediaView erzeugen
		Media medium = new Media(datei.toURI().toString());
		MediaPlayer mediaplayer = new MediaPlayer(medium);
		MediaView mediaview = new MediaView(mediaplayer);

		// die MediaView hinzufügen
		rootNode.setCenter(mediaview);

		// drei Schaltflächen erzeugen
		Button start = new Button("Wiedergabe");
		start.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mediaplayer.play();
			}
		});

		Button stop = new Button("Anhalten");
		stop.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mediaplayer.stop();
			}
		});

		Button pause = new Button("Pause");
		pause.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mediaplayer.pause();
			}
		});

		// eine horizontale Box erzeugen
		HBox meineHBox = new HBox();
		// die Schaltflächen hinzufügen
		meineHBox.getChildren().addAll(start, stop, pause);

		// die Schaltflächen unten einfügen
		rootNode.setBottom(meineHBox);

		// die Szene erzeugen
		// an den Konstruktor werden der oberste Knoten und
		// die Größe übergeben
		Scene meineScene = new Scene(rootNode, 1350, 850);

		// den Titel über stage setzen
		meineStage.setTitle("Ein einfacher Multimedia-Player");
		// die Szene setzen
		meineStage.setScene(meineScene);
		// und anzeigen
		meineStage.show();
	}

	public static void main(String[] args) {
		// der Start
		launch(args);
	}
}
