module miniMalFX {
	
	
	requires javafx.graphics;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.controls;
	requires java.desktop;
	
	opens miniMalFX to javafx.graphics, javafx.fxml;
}