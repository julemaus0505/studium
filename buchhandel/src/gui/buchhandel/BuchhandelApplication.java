package gui.buchhandel;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BuchhandelApplication extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent buchhandel = FXMLLoader.load(getClass().getResource("Buchhandel.fxml"));	
		primaryStage.setScene(new Scene(buchhandel));
		primaryStage.setTitle("Online Buchhandel");
		primaryStage.show();

	}

}
