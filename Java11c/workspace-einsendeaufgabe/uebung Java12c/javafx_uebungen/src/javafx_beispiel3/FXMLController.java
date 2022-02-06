package javafx_beispiel3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FXMLController {
	//die Vereinbarung ist nur als Instanzvariable m�glich
	//die Schaltfl�chen
	@FXML
	private Button buttonDrehen;
	@FXML
	private Button buttonZoomen;
	private boolean isZoomed = false;
	private double rotation = 0;

	//die Methode f�r die erste Schaltfl�che
	@FXML
	protected void rotateKlick(ActionEvent event) {
		//um 90 Grad weiterdrehen
		rotation = rotation + 90;
		buttonDrehen.setRotate(rotation);
	}

	@FXML
	protected void zoomKlick(ActionEvent event) {
	//wenn die Darstellung vergr��ert ist, verkleinern
	//wir wieder
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
}