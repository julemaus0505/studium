package javafx_beispiel2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFX_Beispiel2 extends Application{
	@Override
	public void start(Stage meineStage) throws Exception {
		//die Datei laden
		Parent root = FXMLLoader.load(getClass().getResource("sb_beispiel01.fxml"));		

		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene(root, 400, 250);
		
		//den Titel über stage setzen
		meineStage.setTitle("Hallo Welt mit FXML!");
		//die Szene setzen
		meineStage.setScene(meineScene);
		//und anzeigen
		meineStage.show();
	}
	
	public static void main(String[] args) {
		//der Start
		launch(args);
	}
}

