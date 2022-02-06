package grafikspielerei;

import javafx.css.converter.PaintConverter.LinearGradientConverter;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;

public class Farbe2 {

	public static void zeichne(GraphicsContext gc, Canvas meinCanvas) {

		// f�r die Position, Breite und H�he
		int xPos, yPos, breite, hoehe;

		// f�r die Farbanteile
		int rot, gruen, blau;
		int xMax = (int) meinCanvas.getWidth() - 1;
		int yMax = (int) meinCanvas.getHeight() - 1;

		for (int durchlauf = 0; durchlauf < 20; durchlauf++) {

			// die Positionen und Farben zuf�llig ermitteln
			// links und oben bewegen sich zwischen 0 und 50
			xPos = (int) (Math.random() * 51);
			yPos = (int) (Math.random() * 51);

			// die Breite und H�he werden abh�ngig von der linken oberen Ecke ermittelt
			// dazu wird die Position von der maximalen Breite bzw. H�he abgezogen

			breite = (int) (Math.random() * (xMax - xPos));
			hoehe = (int) (Math.random() * (yMax - yPos));

			// die Farben liegen im Bereich bis 255
			rot = (int) (Math.random() * 256);
			gruen = (int) (Math.random() * 256);
			blau = (int) (Math.random() * 256);

			// die Farbe setzen
			gc.setFill(Color.rgb(rot, gruen, blau));

			// ein gef�lltes Rechteck zeichnen
			gc.fillRect(xPos, yPos, breite, hoehe);
			
			
			
		}

	}

}
