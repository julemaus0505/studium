package umrechner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UmrechnerMain extends Application {

	@Override
	public void start(Stage meineStage) {

		try {

			// die Datei laden
			Parent root = FXMLLoader.load(getClass().getResource("Controller.fxml"));

			// die Szene erzeugen
			Scene meineScene = new Scene(root, 900, 750);

			// den Titel über die Stage setzen
			meineStage.setTitle("Umrechner");

			// die Szene hinzufügen
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
