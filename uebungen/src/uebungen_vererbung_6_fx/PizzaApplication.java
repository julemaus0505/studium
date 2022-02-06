package uebungen_vererbung_6_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class PizzaApplication extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Hier wird eine neue Bühne erzeugt
		Parent pizza = FXMLLoader.load(getClass().getResource("Pizzadienst.fxml"));
		primaryStage.setScene(new Scene(pizza));
		primaryStage.show();
//
//		Alert alert = new Alert(AlertType.INFORMATION, "Sie müssen eine Pizza auswählen.", ButtonType.OK);
//		alert.setTitle("Meldung");
//		alert.setContentText("Sie müssen eine Pizza auswählen.");
	}

}
