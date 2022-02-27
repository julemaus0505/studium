module Aufgabe_06 {
	exports berechnungGrundstueckspreise;

	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires java.base;
	requires javafx.controls;
	
	opens berechnungGrundstueckspreise to javafx.graphics, javafx.fxml;
}