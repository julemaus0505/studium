package lagerverwaltung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LagerverwaltungApplication extends Application {

	public static void main(String[] args) {

		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent lagerverwaltung = FXMLLoader.load(getClass().getResource("Lagerverwaltung.fxml"));
		primaryStage.setScene(new Scene(lagerverwaltung));
		primaryStage.show();

	}

}
