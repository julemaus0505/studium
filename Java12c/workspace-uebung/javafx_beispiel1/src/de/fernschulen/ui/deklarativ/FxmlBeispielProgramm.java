package de.fernschulen.ui.deklarativ;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlBeispielProgramm extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Die Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("fxml_beispiel.fxml"));
		
		// Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene(root, 400, 250);
		
		//den Titel über stage setzen
		primaryStage.setTitle("Hallo Welt mit FXML!");
		
		//die Szene setzen
		primaryStage.setScene(meineScene);
		
		//und anzeigen
		primaryStage.show();
	}

	public static void main(String[] args) {
		//der Start
		launch(args);

	}

}
