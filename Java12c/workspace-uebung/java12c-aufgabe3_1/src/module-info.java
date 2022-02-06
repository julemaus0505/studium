module java12c_aufgabe3_1 {
	
exports studium.aufgabe3_1;
	
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	//Damit der FXML-Loader auf die private Klassenvariablen im Controller zugreifen darf
	opens studium.aufgabe3_1 to javafx.fxml;
}