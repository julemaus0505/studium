package studium.aufgabe2_2;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class FXMLController {
	//die Vereinbarung ist nur als Instanzvariable m�glich
	//die Schaltfl�chen
	@FXML private Button buttonDrehen, buttonZoomen, buttonBlenden;
	//das Label
	@FXML private Label ausgabe;
	
	
	private boolean isZoomed = false;
	private double rotation = 0;

	//die Methode f�r die erste Schaltfl�che
	@FXML protected void rotateKlick(ActionEvent event) {
		//um 90 Grad weiterdrehen
		rotation = rotation + 90;
		buttonDrehen.setRotate(rotation);
	}
	
	@FXML protected void rotateAutoKlick(ActionEvent event) {
		//die Rotation soll f�nf Sekunden dauern und auf die Schaltfl�che wirken
		RotateTransition autoRotation = new RotateTransition(Duration.millis(5000), buttonDrehen);
		//die Drehung erfolgt um 360 Grad
		autoRotation.setByAngle(360);
		//und wird viermal wiederholt
		autoRotation.setCycleCount(4);
		//und los geht es
		autoRotation.play();
	}
	
	
	@FXML protected void zoomKlick(ActionEvent event) {
		//wenn die Darstellung vergr��ert ist, verkleinern wir wieder
		if (isZoomed == true) {
			buttonZoomen.setScaleX(1);
			buttonZoomen.setScaleY(1);
			isZoomed = false;
		}
		//sonst vergr��ern wir die Schaltfl�che
		else {
			buttonZoomen.setScaleX(2);
			buttonZoomen.setScaleY(2);
			isZoomed = true;
		}
	}

	@FXML protected void zoomAutoKlick(ActionEvent event) {
		//die Animation soll f�nf Sekunden dauern
		ScaleTransition autoZoom = new ScaleTransition(Duration.millis(5000), buttonZoomen);
	    //die Vergr��erung soll jeweils um den Faktor 3 erfolgen 
		autoZoom.setByX(3);
		autoZoom.setByY(3);
		//die Animation soll viermal wiederholt werden
		autoZoom.setCycleCount(4);
		//und automatisch r�ckw�rts laufen
	    autoZoom.setAutoReverse(true);
	    //los geht es
	    autoZoom.play();		
	}
	
	@FXML protected void labelMausRein(MouseEvent event) {
		ausgabe.setScaleX(2);
		ausgabe.setScaleY(2);
	}

	@FXML protected void labelMausRaus(MouseEvent event) {
		ausgabe.setScaleX(1);
		ausgabe.setScaleY(1);
	}

	@FXML protected void blendenKlick(ActionEvent event) {
		//eine Zeitschiene erzeugen
		Timeline zeitschiene = new Timeline();
		//der Effekt soll endlos wiederholt werden
		zeitschiene.setCycleCount(Timeline.INDEFINITE);
		//den Schl�sselwert setzen - hier die Transparenz
		KeyValue schluesselwert = new KeyValue(buttonBlenden.opacityProperty(), 0);
		//dem Schl�sselframe setzen - hier zwei Sekunden
		KeyFrame schluesselFrame = new KeyFrame(Duration.millis(2000), schluesselwert);
		//den Schl�sselframe hinzuf�gen
		zeitschiene.getKeyFrames().add(schluesselFrame);
		//und abspielen
		zeitschiene.play();
	}
}