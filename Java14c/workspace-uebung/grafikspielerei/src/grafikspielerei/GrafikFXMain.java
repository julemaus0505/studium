package grafikspielerei;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class GrafikFXMain extends Application {

	@Override
	public void start(Stage meineStage) throws Exception {

		// den obersten Knoten erzeugen
		// hier verwenden wir ein FlowPane
		FlowPane rootNode = new FlowPane();

		// Canvas erzeugen
		Canvas meinCanvas = new Canvas(400, 400);

		// Grafikkontext beschaffen
		GraphicsContext gc = meinCanvas.getGraphicsContext2D();

		// die Zeichenfl�che hinzuf�gen
		rootNode.getChildren().add(meinCanvas);

		// das Rechteck �ber eine eigende Klasse zeichenen
		
		// Rechteck1bis zum Rand zeichnen
		// Rechteck1.zeichne(gc);
		// Rechteck1.zeichneMax(gc, meinCanvas);
		
		// Rechteck2 ein erster Effekt
		// Rechteck2.zeichne(gc, meinCanvas);
		
		// ein Gitternetz zeichnen
		// Linie1.zeichne(gc, meinCanvas);
		
		// Linie3 hinzuf�gen
		//Linie3.zeichne(gc, meinCanvas);
		
		// einen Kreis zeichnen
		 Kreis.zeichne(gc);
		
		// ein Polygon zeichnen
		// Polygon.zeichne(gc);
		
		// Farbe2 hinzuf�gen
		// Farbe1.zeichne(gc, meinCanvas);
		// Farbe2.zeichne(gc, meinCanvas);
		
		
		

		// die Szene erzeugen
		// an den Konstruktor werden der oberste Knoten und die Gr��e �bergeben
		Scene meineScene = new Scene(rootNode, 400, 400);

		// den Titel �ber Stage setzen
		meineStage.setTitle("Grafikspielereien");

		// die Szene setzen
		meineStage.setScene(meineScene);

		// und anzeigen lassen
		meineStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
