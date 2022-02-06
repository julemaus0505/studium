package dialog.fx;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class MeinAlert extends Alert {

	// Hier wird eine Methode erzeugt MeinAlert
	public MeinAlert(String title, String headerText, String contentText) {
		super(AlertType.CONFIRMATION, contentText, ButtonType.YES, ButtonType.NO);

		this.setTitle(title);
		this.setHeaderText(headerText);
	}

}
