module javafx_beispiel1 {
	exports de.fernschulen.ui.programmatisch;
	exports de.fernschulen.ui.deklarativ;
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	//Damit der FXML-Loader auf die private Klassenvariablen im Controller zugreifen darf
	opens de.fernschulen.ui.deklarativ to javafx.fxml;
	
}