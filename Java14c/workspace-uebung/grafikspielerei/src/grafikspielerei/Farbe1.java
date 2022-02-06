package grafikspielerei;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Farbe1 {

	public static void zeichne(GraphicsContext gc, Canvas meinCanvas) {
		//zum Wandern
		int xPos = 1;
		int yPos = 1;
		
		//für die maximalen Koordinaten
		int xMax = (int)meinCanvas.getWidth();
		int yMax = (int)meinCanvas.getHeight();

		//die Linienfarbe wird rot
		gc.setStroke(Color.RED);
		
		//Linien von links nach rechts bis zum unteren Rand
		while (yPos < yMax) {
			gc.strokeLine(0, yPos, xMax, yPos);
			yPos = yPos + 10;
		}
		
		//und jetzt blau
		gc.setStroke(Color.BLUE);
		
		//Linien von oben nach unten bis zum rechten Rand
		while (xPos < xMax) {
			gc.strokeLine(xPos, 0, xPos, yMax);
			xPos = xPos + 10;
		}

		//nun mit gelber Füllfarbe
		gc.setFill(Color.YELLOW);
		
		//ein gefülltes Rechteck in die Mitte zeichnen
		yPos = (yMax/2) - 50;
		xPos = (xMax/2) - 50;
		gc.fillRect(xPos, yPos, 100, 100);
		
		//und in grüner Farbe
		gc.setStroke(Color.GREEN);
		
		//zwei diagonale Linien zeichnen
		gc.strokeLine(0, 0, xMax, yMax);
		gc.strokeLine(0, yMax, xMax, 0);
	}
	
}
