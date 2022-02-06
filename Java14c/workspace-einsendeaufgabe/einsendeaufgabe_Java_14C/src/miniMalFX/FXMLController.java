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

	// für die Zeichenfläche
	@FXML
	private Canvas zeichenflaeche;

	// für die Farbauswahl
	@FXML
	private ColorPicker farbauswahl;

	// für den Grafikkontext
	private GraphicsContext gc;

	// für die Position
	private int xPos, yPos;

	// für das Werkzeug
	private int werkzeug;

	// für die Farbe
	private Color farbe;

	// die Methode zum Beenden
	@FXML
	protected void beendenClick(ActionEvent event) {
		Platform.exit();
	}

	// die Methode setzt die Initialwerte
	// sie wird automatisch ausgeführt
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

	// für die Symbole mit dem Zeichenwerkzeug
	// gesetzt wird ein Wert für das jeweilige Werkzeug
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
	 * Wird ausgeführt wenn der gefüllte Kreis-Button in der Symbolleiste angeklickt wird 
	 */
	@FXML
	protected void gefuellterKreisKlick(ActionEvent event) {
		werkzeug = 4;
	}

	// die Methode für das Drücken der Maustaste
	@FXML
	protected void mausGedrueckt(MouseEvent event) {

		// die Koordinate als Startpunkt speichern
		// aber nur, wenn die linke Maustaste gedrückt wurde
		if (event.getButton() == MouseButton.PRIMARY) {
			xPos = (int) event.getX();
			yPos = (int) event.getY();
		}
	}

	// die Methode für das Loslassen der Maustaste
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

				// der Gefüllte Kreis
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
	// Der Endpunkt wird als Parameter übergeben
	protected void linie(int x2, int y2) {

		// die Figur zeichnen
		gc.strokeLine(xPos, yPos, x2, y2);

	}

	// die Methode zeichnet einen Kreis
	// die Breite und Höhe des umgebenden
	// Rechtecks werden als Parameter übergeben
	protected void kreis(int breite, int hoehe) {

		// die Figur zeichnen
		gc.strokeOval(xPos, yPos, breite, hoehe);

	}

	// die Methode zeichnet ein Rechteck
	// die Breite und Höhe werden als Parameter übergeben

	protected void rechteck(int breite, int hoehe) {

		// die Figur zeichnen
		gc.strokeRect(xPos, yPos, breite, hoehe);

	}

	// die Methode zeichnet einen gefüllten Kreise
	// die Breite und Höhe werden als Parameter übergeben
	protected void kreisGefuellt(int breite, int hoehe) {

		// Füllfarbe des Kreises setzen
		gc.setFill(Color.DEEPPINK);

		// den gefüllten Kreise zeichnen
		gc.fillOval(xPos, yPos, breite, hoehe);
	}
}
