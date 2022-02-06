package studium.aufgabe3_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFX_BuntOderNicht extends Application {
	@Override
	public void start(Stage meineStage) throws Exception {
		// die Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("sb_buntodernicht.fxml"));

		// die Szene erzeugen
		// an den Konstruktor werden der oberste Knoten und die Gr��e �bergeben
		Scene meineScene = new Scene(root, 400, 150);

		// den Titel �ber stage setzen
		meineStage.setTitle("Wie h�tten Sie es denn gerne? Mit JavaFX");
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
