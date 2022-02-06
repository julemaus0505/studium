package uebung_taschenrechner.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TaschenrechnerApplication extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent taschenrechner = FXMLLoader.load(getClass().getResource("Taschenrechner.fxml"));
		primaryStage.setScene(new Scene(taschenrechner));
		primaryStage.show();
		
	}

}
