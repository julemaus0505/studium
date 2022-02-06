package studium.aufgabe2_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFX_Spielereien extends Application {
	@Override
	public void start(Stage meineStage) throws Exception {
		// die Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("sb_spielerein.fxml"));

		// die Szene erzeugen
		// an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene(root, 600, 600);

		// den Titel über stage setzen
		meineStage.setTitle("Spielereien mit FXML");
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
