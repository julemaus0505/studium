package mausereignisseFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MausCanvasFX extends Application{

	@Override
	public void start(Stage meineStage) throws Exception {
		
		//den obersten Knoten erzeugen
		//hier verwenden wir ein FlowPane
		FlowPane rootNode = new FlowPane();
		
		//Label f�r die Anzeige
		Label ausgabe = new Label("Hier erscheinen die Mausausgaben");		
		
		//Canvas erzeugen
		Canvas meinCanvas = new Canvas(400, 400);
		
		//das Label hinzuf�gen
		rootNode.getChildren().add(ausgabe);
		
		//die Zeichenfl�che hinzuf�gen
		rootNode.getChildren().add(meinCanvas);
		
		//die Eventhandler f�r die Maus
		//die Ausgaben �berschreiben sich zum Teil gegenseitig
		//es wird geklickt
		meinCanvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				
				//einen String f�r die Ausgabe erzeugen
				String ausgabetext;
				
				//die Koordinate beschaffen und setzen
				ausgabetext = "X: " + Double.toString(e.getX()) + " Y: " + Double.toString(e.getY());
				
				//war es die linke Maustaste?
				if (e.getButton() == MouseButton.PRIMARY)
					ausgabetext = ausgabetext + " linke Taste";
				
				//oder die rechte?
				if (e.getButton() == MouseButton.SECONDARY)
					ausgabetext = ausgabetext + " rechte Taste";
				
				//Die Anzahl der Klicks ermitteln
				ausgabetext = ausgabetext + " mit " + e.getClickCount() + " Klick(s)";
				
				//und alles ausgeben
				ausgabe.setText(ausgabetext);
			}
		});

		//die Maus wird mit gedr�ckter Taste bewegt
		meinCanvas.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				ausgabe.setText("Die Maus wurde mit gedr�ckter Taste gezogen.");
			}
		});
		
		//die Maus betritt die Komponente
		meinCanvas.setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				ausgabe.setText("Die Maus hat die Komponente betreten.");
			}
		});

		//die Maus verl�sst die Komponente
		meinCanvas.setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				ausgabe.setText("Die Maus hat die Komponente verlassen.");
			}
		});

		//die Maus wird bewegt
		meinCanvas.setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				ausgabe.setText("Die Maus wurde an die Position X: " + Double.toString(e.getX()) + " Y: " + Double.toString(e.getY()) + " bewegt.");
			}
		});

		//Eine Maustaste wird gedr�ckt
		meinCanvas.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				ausgabe.setText("Eine Maustaste wurde gedr�ckt.");
			}
		});
		
		//Eine Maustaste wird losgelassen
		meinCanvas.setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				ausgabe.setText("Eine Maustaste wurde losgelassen.");
			}
		});
	
		//die Szene erzeugen
		//an den Konstruktor werden der oberste Knoten und die Gr��e �bergeben
		Scene meineScene = new Scene(rootNode, 400, 400);
		
		//den Titel �ber stage setzen
		meineStage.setTitle("Mausereignisse");
		
		//die Szene setzen
		meineStage.setScene(meineScene);
		
		//und anzeigen
		meineStage.show();
	}
	
	public static void main(String[] args) {
		//der Start
		launch(args);
	}
}