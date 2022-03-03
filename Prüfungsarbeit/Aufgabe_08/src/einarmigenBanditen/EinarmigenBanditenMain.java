package einarmigenBanditen;


	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

	public class EinarmigenBanditenMain extends Application{

		@Override
		public void start(Stage meineStage) {
			
			try {
				
				// die Datei laden
				Parent root = FXMLLoader.load(getClass().getResource("Controller.fxml"));
				//Parent root = FXMLLoader.load(getClass().getResource("Controller.fxml"));
				
				// die Szene erzeugen
				// an den Konstruktor werden der oberste Knoten Groeße an
				Scene meineScene = new Scene(root, 1000, 1000);
				
				// den Titel �ber die Stage setzen
				meineStage.setTitle("Einarmiger Bandit");
				
				// die Szene setzen
				meineStage.setScene(meineScene);
				
				// G��en�nderung verhindern
				meineStage.setResizable(false);

				// und anzeigen
				meineStage.show();
					
				
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			
		}
		
		
		public static void main(String[] args) {
			 
			launch(args);

		}

	

	
}
