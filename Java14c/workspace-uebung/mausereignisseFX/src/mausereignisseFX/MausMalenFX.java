package mausereignisseFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MausMalenFX extends Application {

	// zum Zwischenspeichern der Position
	private int xPos, yPos;

	@Override
	public void start(Stage meineStage) throws Exception {

		// den obersten Knoten erzeugen
		// hier verwenden wir ein FlowPane
		FlowPane rootNode = new FlowPane();

		// Canvas erzeugen
		Canvas meinCanvas = new Canvas(400, 400);

		// die Zeichenfläche hinzufügen
		rootNode.getChildren().add(meinCanvas);

		// den Grafikkontext beschaffen
		GraphicsContext gc = meinCanvas.getGraphicsContext2D();

		// die Eventhandler für die Maus
		// eine Maustaste wird gedrückt
		meinCanvas.setOnMousePressed((EventHandler<? super MouseEvent>) new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {

				// die Koordinate als Startpunkt speichern
				// aber nur, wenn die linke Maustaste gedrückt wurde
				if (e.getButton() == MouseButton.PRIMARY) {
					xPos = (int) e.getX();
					yPos = (int) e.getY();
				}
			}
		});

		// eine Maustaste wird losgelassen
		meinCanvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				
				// wenn die linke Taste losgelassen wird, zeichnen wir von der alten
				// zur aktuellen Position eine Linie
				if (e.getButton() == MouseButton.PRIMARY) {
					gc.strokeLine(xPos, yPos, e.getX(), e.getY());
				}
			}
		});

		// die Szene erzeugen
		// an den Konstruktor werden der oberste Knoten und die Größe übergeben
		Scene meineScene = new Scene(rootNode, 400, 400);

		// den Titel über stage setzen
		meineStage.setTitle("Ein sehr einfaches Malprogramm");
		
		// die Szene setzen
		meineStage.setScene(meineScene);
		
		// und anzeigen
		meineStage.show();
	}

	public static void main(String[] args) {
		// der Start
		launch(args);
	}

}
