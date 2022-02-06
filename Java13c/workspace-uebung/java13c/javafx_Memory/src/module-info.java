module javafx_Memory {
	exports memory;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	
	opens memory to javafx.fxml, javafx.graphics; 
	
}