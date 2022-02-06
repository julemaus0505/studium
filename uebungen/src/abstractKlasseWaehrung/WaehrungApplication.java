package abstractKlasseWaehrung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WaehrungApplication extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent waehrung = FXMLLoader.load(getClass().getResource("Waehrung.fxml"));
		primaryStage.setScene(new Scene(waehrung));
		primaryStage.show();

	}

}
