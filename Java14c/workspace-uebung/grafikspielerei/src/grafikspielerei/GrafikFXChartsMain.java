package grafikspielerei;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class GrafikFXChartsMain extends Application{

	@Override
	public void start(Stage meineStage) throws Exception {
		
		//den obersten Knoten erzeugen
		//hier verwenden wir ein FlowPane
		FlowPane rootNode = new FlowPane();
		
		//die Szene erzeugen und Größe übergeben
		Scene meineScene = new Scene(rootNode, 500, 400);
		
		//den Titel setzen
		meineStage.setTitle("Ein Kreisdiagramm");
		
		//die Szene setzen
		meineStage.setScene(meineScene);
		
		//die Daten für das Diagramm
		ObservableList<PieChart.Data> diagrammDaten = FXCollections.observableArrayList(new PieChart.Data("Filiale 1", 30),
				new PieChart.Data("Filiale 2", 20),
				new PieChart.Data("Filiale 3", 45),
				new PieChart.Data("Filiale 4", 5));
		
		//das Diagramm erzeugen
		PieChart diagramm = new PieChart(diagrammDaten);
		
		//den Titel setzen
		diagramm.setTitle("Umsätze");
		
		rootNode.getChildren().add(diagramm);
		
		meineStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
