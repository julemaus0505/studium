module lagerverwaltung {
	exports lagerverwaltung;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens lagerverwaltung to javafx.graphics, javafx.fxml;
}