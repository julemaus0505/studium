package berechnungGrundstueckspreise;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GrundstuecksrechnerMain extends Application {

	@Override
	public void start(Stage meineStage) {

		try {
			// die Datei laden
			Parent root = FXMLLoader.load(getClass().getResource("Controller.fxml"));

			// die Szene erzeugen
			// an den Konstruktor werden der oberste Knoten und die Größe übergeben
			Scene meineScene = new Scene(root, 900, 800);

			// den Titel über stage setzen
			meineStage.setTitle("Grundstücksrechner");

			// die Szene setzen
			meineStage.setScene(meineScene);

			// Größenänderungen verhindern
			meineStage.setResizable(false);

			// und anzeigen
			meineStage.show();

		} catch (IOException exception) {
			// TODO Auto-generated catch block
			exception.printStackTrace();
		}

	}

	public static void main(String[] args) {

		launch(args);

	}

}
