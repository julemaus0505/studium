package grafikspielerei;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Rechteck1 {

	// die statische Methode zum zeichnen
	// sei erhält den Grafikkontext
	public static void zeichne(GraphicsContext gc) {
		gc.strokeRect(10, 10, 100, 100);
		
	}
	
	// ein Rechteck in der maximalen Größe zeichnen
	// dazu wird auch die Zeichenfläche übergeben
	public static void zeichneMax(GraphicsContext gc, Canvas meinCanvas) {
		gc.strokeRect(1, 1, meinCanvas.getWidth() -2 , meinCanvas.getHeight() - 2);
	}
	

}
