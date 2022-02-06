package aufgabe_4;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GrafikFXShapesMain extends Application {

	@Override
	public void start(Stage meineStage) throws Exception {
		
		// obersten Knoten erzeugen
		// GridPane erzeugt
		GridPane rootNode = new GridPane() ;
		
		//Die H�he der vertikalen L�cken zwischen den Zeilen.
		rootNode.setVgap(50);
		
		//Die Breite der horizontalen L�cken zwischen den Spalten.
		rootNode.setHgap(50);
		
		rootNode.setPrefWidth(150);
		
		//die Szene erzeugen
		Scene meineScene = new Scene(rootNode, 800, 800);
		
		
		//den Titel �ber die Stage setzen
		meineStage.setTitle("Mein kleines Programm");
		
		//die Scene setzen
		meineStage.setScene(meineScene);
		
		//ein Quadrat zeichnen
		Rectangle quadrat = new Rectangle(100, 100);
		quadrat.setLayoutX(20);
		quadrat.setLayoutY(20);
		
		
		//Quadrat f�llen
		quadrat.setFill(Color.DEEPPINK);
		
		//einen Kreis zeichnen
		Circle kreis = new Circle(30);
		
		
		//kreis f�llen
		kreis.setFill(Color.CHARTREUSE);
		
		//die Shapes hinzuf�gen
		rootNode.add(quadrat, 4, 2);
		rootNode.add(kreis, 4, 4);
		
		//eine Animation von dem Quadrat und dem Kreis
		ScaleTransition zoomNachAussen =  new ScaleTransition(Duration.millis(1000), kreis);
		ScaleTransition zoomNachInnen = new ScaleTransition(Duration.millis(1000), quadrat);
	
		//die Vergr��erung soll in Y und X Richtung um den Faktor 3 erfolgen
		zoomNachAussen.setByX(3);
		zoomNachAussen.setByY(3);
		
		//die Verkleinerung soll in Y und X Richtung um den Faktor -1 erfolgen
		zoomNachInnen.setByX(-1);
		zoomNachInnen.setByY(-1);
		
		//Automatisch zur�ck laufen
		zoomNachAussen.setAutoReverse(true);
		zoomNachInnen.setAutoReverse(true);
	
		//die Animation soll 10 mal wiederholt werden
		zoomNachAussen.setCycleCount(20);
		zoomNachInnen.setCycleCount(20);
		
		//los geht es
		zoomNachAussen.play();
		zoomNachInnen.play();
		
		//meine Stage anzeigen
		meineStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
