package grafikspielerei;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Rechteck2 {

	public static void zeichne(GraphicsContext gc, Canvas meinCanvas) {
		int x = 1;
		int y = 1;
		int breite = (int)meinCanvas.getWidth() - 2;
		int hoehe = (int)meinCanvas.getHeight() - 2;
		
		// eine For Schleife
		for (int  durchlauf = 0; durchlauf < 30; durchlauf++) {
			
			// das Rechteck zeichnen
			gc.strokeRect(x, y, breite, hoehe);
			
			// die obere linke Ecke wandert immer weiter nach innen
			x = x + 5;
			y = y + 5;
			
			// die untere rechte Ecke auch
			breite = breite - 10;
			hoehe = hoehe - 10;
		}
	}
	
}
