module javafx_uebungen {
	exports javafx_beispiel2;
	exports javafx_beispiel1;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens javafx_beispiel2 to javafx.fxml;
}