module Aufgabe_09 {
	exports umrechner;

	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires java.base;
	requires javafx.controls;
	
	opens umrechner to javafx.graphics, javafx.fxml;

	
}