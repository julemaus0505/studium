module xml_uebung {
	exports hangmanFXSpiel;
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	
	opens hangmanFXSpiel to javafx.graphics, javafx.fxml;
}