module lagerverwaltung {
	exports lagerverwaltung;
	
	requires javafx.base;
	//requires javafx.controls;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens lagerverwaltung to javafx.fxml, javafx.graphics;
}