package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class HangmanFX extends Application  {

	@Override
	public void start(Stage meineStage) throws Exception {
		
		//eine Instanz von FXMLLoader erzeugen
		FXMLLoader meinLoader = new FXMLLoader(getClass().getResource("sb_hangman.fxml"));
		
		//die Datei laden
		Parent root = meinLoader.load();
		
		//den Controller beschaffen
		FXMLController meinController = meinLoader.getController();
		
		//und die Bühne übergeben
		meinController.setStage(meineStage);
		
		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene(root, 350, 450);
		
		//den Titel über stage setzen
		meineStage.setTitle("Hangman");
		
		//die Szene setzten
		meineStage.setScene(meineScene);
		
		//und anzeigen lassen
		meineStage.show();
		
		//hier muss noch die übergabe erfolgen
		Score meinScore = new Score(meineStage);
		meinScore.listeZeigen();
		meinScore.neuerEintrag();
	}

	public static void main(String[] args) throws IOException {
		
		//der Start
		launch(args);

	}
	
}
