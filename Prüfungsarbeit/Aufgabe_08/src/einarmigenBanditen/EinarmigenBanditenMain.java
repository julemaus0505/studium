package einarmigenBanditen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class EinarmigenBanditenMain extends Application {

	@Override
	public void start(Stage meineStage) {

		try {

			// die Datei laden
			Parent root = FXMLLoader.load(getClass().getResource("Controller.fxml"));

			// die Szene erzeugen
			// an den Konstruktor werden der oberste Knoten Groeße an
			Scene meineScene = new Scene(root, 850, 850);

			// den Titel über die Stage setzen
			meineStage.setTitle("Einarmiger Bandit");

			// die Szene setzen
			meineStage.setScene(meineScene);

			// Größenänderung verhindern
			meineStage.setResizable(false);

			// und anzeigen
			meineStage.show();

		} catch (Exception exception) {

		}
	}

	public static void main(String[] args) {
		launch(args);

	}
}
