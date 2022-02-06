package grafikspielerei;

import javax.swing.text.GapContent;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Linie3 {

	public static void zeichne(GraphicsContext gc, Canvas meinCanvas) {
		
		// zum Wandern
		int yPos = 1;
		
		//für die maximalen Koordinaten
		int xMax = (int)meinCanvas.getWidth();
		int yMax = (int)meinCanvas.getHeight();
		
		//für die Linienbreite
		int breite = 1;
	
		//Linien von links nach rechts bis zum unteren Rand
		//die Linien werden dabei immer dicker
		while (yPos < yMax) {

			//die Linienstärke setzen
			gc.setLineWidth(breite);
			gc.strokeLine(0, yPos, xMax, yPos);
			yPos = yPos +20;
			
			//die Breite erhöhen
			breite = breite +1;
			
			gc.setLineWidth(2);
			
			gc.setStroke(Color.BLUE);
			
		}
		
		
		
		
		
	}
	
}
