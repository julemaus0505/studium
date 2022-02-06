package dialog.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DialogApplication extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception  {

		Parent dialog = FXMLLoader.load(getClass().getResource("FrageDialog.fxml"));
		primaryStage.setScene(new Scene(dialog));
		primaryStage.show();
	}
}
