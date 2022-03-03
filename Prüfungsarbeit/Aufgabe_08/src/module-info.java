module Aufgabe_08 {
	exports einarmigenBanditen;
	
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires javafx.controls;
	
	opens einarmigenBanditen to javafx.graphics, javafx.fxml;
	
}