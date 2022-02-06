module taschenrechner {
	requires java.desktop;
	requires miglayout.swing;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;
	
	
	exports taschenrechner.fx to javafx.graphics, javafx.fxml;
	opens taschenrechner.fx to javafx.graphics, javafx.fxml;
}