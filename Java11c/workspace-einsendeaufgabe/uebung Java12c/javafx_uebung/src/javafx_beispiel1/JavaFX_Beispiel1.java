package javafx_beispiel1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFX_Beispiel1 extends Application {
	@Override
	public void start(Stage meineStage) throws Exception {

		// zwei Labels �ber die Klasse Label erzeugen
		Label ausgabe = new Label("Hallo Welt");
		Label ausgabe2 = new Label();

		// den Text f�r das zweite Label getrennt setzen
		ausgabe2.setText("Es gr��t Dich Max Meier");

		// eine Schaltfl�che erzeugen
		// noch ohne Funktion
		Button schaltflaeche = new Button("Beenden");

		// den obersten Knoten erzeugen
		// hier verwenden wir ein FlowPane
		FlowPane rootNode = new FlowPane();

		// die untergeordneten Elemente der Reihe nach
		// hinzuf�gen
		rootNode.getChildren().add(ausgabe);
		rootNode.getChildren().add(ausgabe2);
		rootNode.getChildren().add(schaltflaeche);

		// die Szene erzeugen
		// an den Konstruktor werden der oberste Knoten und
		// die Gr��e �bergeben
		Scene meineScene = new Scene(rootNode, 200, 250);

		// den Titel �ber stage setzen
		meineStage.setTitle("Hallo Welt!");

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