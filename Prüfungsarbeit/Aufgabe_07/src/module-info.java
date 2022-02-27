module Aufgabe_07 {
	exports taschenrechner;
	
	requires javafx.base;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires java.base;
	requires javafx.controls;
	
	
	opens taschenrechner to javafx.graphics, javafx.fxml;
}