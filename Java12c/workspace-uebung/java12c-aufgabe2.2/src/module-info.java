module java12c_aufgabe2_2 {
	
	exports studium.aufgabe2_2;
	
	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	//Damit der FXML-Loader auf die private Klassenvariablen im Controller zugreifen darf
	opens studium.aufgabe2_2 to javafx.fxml;
}