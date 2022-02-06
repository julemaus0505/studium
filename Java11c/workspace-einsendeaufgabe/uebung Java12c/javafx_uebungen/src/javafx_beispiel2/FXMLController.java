package javafx_beispiel2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
	//das Label
	//die Vereinbarung ist nur als Instanzvariable m�glich
	@FXML private Label ausgabe;

	//die Methode f�r die erste Schaltfl�che
	@FXML protected void schaltflaecheKlick(ActionEvent event) {
		Platform.exit();
	}
	
	@FXML protected void schaltflaeche2Klick(ActionEvent event) {
		ausgabe.setText("Ich wurde automatisch bef�llt");
	}
}
