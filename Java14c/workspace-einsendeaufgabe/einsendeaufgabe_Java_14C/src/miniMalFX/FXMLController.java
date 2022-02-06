package miniMalFX;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

/**
 * @author julia
 *
 */
public class FXMLController {

	// f�r die Zeichenfl�che
	@FXML
	private Canvas zeichenflaeche;

	// f�r die Farbauswahl
	@FXML
	private ColorPicker farbauswahl;

	// f�r den Grafikkontext
	private GraphicsContext gc;

	// f�r die Position
	private int xPos, yPos;

	// f�r das Werkzeug
	private int werkzeug;

	// f�r die Farbe
	private Color farbe;

	// die Methode zum Beenden
	@FXML
	protected void beendenClick(ActionEvent event) {
		Platform.exit();
	}

	// die Methode setzt die Initialwerte
	// sie wird automatisch ausgef�hrt
	@FXML
	void initialize() {

		// die Standard-Farbe ist Schwarz
		farbe = Color.BLACK;
		farbauswahl.setValue(farbe);

		// das Standardwerkzeug ist die Linie
		werkzeug = 1;

		// den Grafikkontext beschaffen
		gc = zeichenflaeche.getGraphicsContext2D();
	}

	// f�r die Symbole mit dem Zeichenwerkzeug
	// gesetzt wird ein Wert f�r das jeweilige Werkzeug
	@FXML
	protected void linieKlick(ActionEvent event) {
		werkzeug = 1;
	}

	@FXML
	protected void kreisKlick(ActionEvent event) {
		werkzeug = 2;
	}

	@FXML
	protected void rechteckKlick(ActionEvent event) {
		werkzeug = 3;
	}

	/*
	 * Wird ausgef�hrt wenn der gef�llte Kreis-Button in der Symbolleiste angeklickt wird 
	 */
	@FXML
	protected void gefuellterKreisKlick(ActionEvent event) {
		werkzeug = 4;
	}

	// die Methode f�r das Dr�cken der Maustaste
	@FXML
	protected void mausGedrueckt(MouseEvent event) {

		// die Koordinate als Startpunkt speichern
		// aber nur, wenn die linke Maustaste gedr�ckt wurde
		if (event.getButton() == MouseButton.PRIMARY) {
			xPos = (int) event.getX();
			yPos = (int) event.getY();
		}
	}

	// die Methode f�r das Loslassen der Maustaste
	@FXML
	protected void mausLos(MouseEvent event) {

		// wenn die linke Taste losgelassen wird, zeichnen wir
		// von der alten zur aktuellen Position
		// je nach Werkzeug wird etwas anderes gezeichnet
		if (event.getButton() == MouseButton.PRIMARY) {

			// die Linie
			if (werkzeug == 1) {
				linie((int) event.getX(), (int) event.getY());

				// der Kreis
			} else if (werkzeug == 2) {
				kreis((int) (event.getX() - xPos), (int) (event.getY() - yPos));

				// das Rechteck
			} else if (werkzeug == 3) {
				rechteck((int) (event.getX() - xPos), (int) (event.getY() - yPos));

				// der Gef�llte Kreis
			} else {
				kreisGefuellt((int) (event.getX() - xPos), (int) (event.getY() - yPos));

			}
		}
	}

	// die Methode setzen die neuen Farbe
	@FXML
	protected void farbAuswahlZeigen() {
		farbe = farbauswahl.getValue();
		gc.setStroke(farbe);
	}

	// die Methode zeichnet eine Linie
	// Der Endpunkt wird als Parameter �bergeben
	protected void linie(int x2, int y2) {

		// die Figur zeichnen
		gc.strokeLine(xPos, yPos, x2, y2);

	}

	// die Methode zeichnet einen Kreis
	// die Breite und H�he des umgebenden
	// Rechtecks werden als Parameter �bergeben
	protected void kreis(int breite, int hoehe) {

		// die Figur zeichnen
		gc.strokeOval(xPos, yPos, breite, hoehe);

	}

	// die Methode zeichnet ein Rechteck
	// die Breite und H�he werden als Parameter �bergeben

	protected void rechteck(int breite, int hoehe) {

		// die Figur zeichnen
		gc.strokeRect(xPos, yPos, breite, hoehe);

	}

	// die Methode zeichnet einen gef�llten Kreise
	// die Breite und H�he werden als Parameter �bergeben
	protected void kreisGefuellt(int breite, int hoehe) {

		// F�llfarbe des Kreises setzen
		gc.setFill(Color.DEEPPINK);

		// den gef�llten Kreise zeichnen
		gc.fillOval(xPos, yPos, breite, hoehe);
	}
}
