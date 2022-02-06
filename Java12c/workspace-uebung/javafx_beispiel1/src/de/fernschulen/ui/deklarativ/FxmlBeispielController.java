package de.fernschulen.ui.deklarativ;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class FxmlBeispielController {
	
	@FXML
	private Label ausgabe;
	
	@FXML
	private Label ausgabe2;
	
	
	@FXML
	public void farbeAendern() {
		ausgabe.setTextFill(Color.AQUA);
		ausgabe2.setTextFill(Color.BLUE);
	}
	
	@FXML
	public void beenden() {
		Platform.exit();
	}
}
