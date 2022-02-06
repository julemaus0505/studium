package grafikspielerei;

import javafx.css.converter.PaintConverter.LinearGradientConverter;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;

public class Farbe2 {

	public static void zeichne(GraphicsContext gc, Canvas meinCanvas) {

		// für die Position, Breite und Höhe
		int xPos, yPos, breite, hoehe;

		// für die Farbanteile
		int rot, gruen, blau;
		int xMax = (int) meinCanvas.getWidth() - 1;
		int yMax = (int) meinCanvas.getHeight() - 1;

		for (int durchlauf = 0; durchlauf < 20; durchlauf++) {

			// die Positionen und Farben zufällig ermitteln
			// links und oben bewegen sich zwischen 0 und 50
			xPos = (int) (Math.random() * 51);
			yPos = (int) (Math.random() * 51);

			// die Breite und Höhe werden abhängig von der linken oberen Ecke ermittelt
			// dazu wird die Position von der maximalen Breite bzw. Höhe abgezogen

			breite = (int) (Math.random() * (xMax - xPos));
			hoehe = (int) (Math.random() * (yMax - yPos));

			// die Farben liegen im Bereich bis 255
			rot = (int) (Math.random() * 256);
			gruen = (int) (Math.random() * 256);
			blau = (int) (Math.random() * 256);

			// die Farbe setzen
			gc.setFill(Color.rgb(rot, gruen, blau));

			// ein gefülltes Rechteck zeichnen
			gc.fillRect(xPos, yPos, breite, hoehe);
			
			
			
		}

	}

}
