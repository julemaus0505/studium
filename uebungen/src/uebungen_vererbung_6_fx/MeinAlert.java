package uebungen_vererbung_6_fx;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class MeinAlert extends Alert {

	public MeinAlert(String title, String contentText, String headerText) {
		super(AlertType.INFORMATION);

		Alert alert = new Alert(AlertType.INFORMATION, contentText, ButtonType.OK);

		alert.setTitle(title);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);

		alert.showAndWait();
	}

}
