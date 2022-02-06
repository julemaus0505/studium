module uebung_taschenrechner {
	requires java.desktop;
	requires miglayout.swing;
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	
	exports uebung_taschenrechner.fx to javafx.graphics, javafx.fxml;
	opens uebung_taschenrechner.fx to javafx.graphics, javafx.fxml;
}