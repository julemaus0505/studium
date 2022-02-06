package grafikspielerei;

import javafx.scene.canvas.GraphicsContext;


public class Polygon {

	public static void zeichne(GraphicsContext gc) {
		
		// ein Array für die x-Koordinaten
		double[] xPunkt = {10, 60, 110, 270, 200};
		
		// ein Array für die y-Koordinaten
		double[] yPunkt = {10, 20, 90, 150, 20};
		
		// ein Polygon
		gc.strokePolygon(xPunkt, yPunkt, 5);
		
		// Linie über mehrre Punkte
		gc.strokePolygon(xPunkt, yPunkt, 5);
		
		gc.fillPolygon(xPunkt, yPunkt, 5);
		
		
		
	}
	
}
