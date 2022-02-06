package grafikspielerei;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class EigeneSpielerein extends Application {

	// Spielerein

	@Override

	public void start(Stage meineStage) throws Exception {

		FlowPane rootNode = new FlowPane(1000, 1000);
		
		// Canvas erzeugen
		Canvas meinCanvas = new Canvas(400, 400);

		// Grafikkontext beschaffen
		GraphicsContext gc = meinCanvas.getGraphicsContext2D();

		// die Zeichenfläche hinzufügen

		//TextFlow rootNode = new TextFlow();
		//rootNode.setLayoutX(40);
		//rootNode.setLayoutY(40);

		Rechteck neuesRechteck = new Rechteck(0, 0, 100, 100);
		Text text1 = new Text("Ich liebe dich");
		text1.setFont(Font.font("family", 16));

		Stop[] stoppt = new Stop[] { new Stop(0, Color.MAGENTA), new Stop(1, Color.BLACK) };
		LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stoppt);
		
		LinearGradient lg2 = new LinearGradient(125, 0, 225, 0, false, CycleMethod.NO_CYCLE, stoppt);

		text1.setFill(Color.MAGENTA);
//		gc.setFill(Color.YELLOW);
//		gc.setFill(Color.AQUAMARINE);
		
		
		gc.setFont(new Font("Arial", 20));
		gc.strokeText("Ich liebe dich", 100, 350);
		gc.setStroke(Color.BLUE);
	

		//gc.setFill(lg1);
		gc.setFill(lg2);

		rootNode.getChildren().add(meinCanvas);
		rootNode.getChildren().add(text1);
		
		rootNode.setBackground(new Background(new BackgroundFill(Color.CHARTREUSE, null, null)));

		zeichne(gc, meinCanvas);
		
		meineStage.setMaxHeight(800);
		meineStage.setMaxWidth(800);
		
		Scene meineScene = new Scene(rootNode, 800, 800);
		meineStage.setScene(meineScene);
		meineStage.show();
	}

	public static void zeichne(GraphicsContext gc, Canvas meinCanvas) {

		Circle kreis1 = new Circle();
		// gc.strokeOval(20, 20, 100, 100);
		// gc.fillOval(80, 80, 100, 100);
		// gc.strokeRect(50, 200, 100, 100);
		gc.fillRect(10, 10, 300, 300);

	}

	public static void main(String[] args) {
		launch(args);
	}
}
