module java12c_aufgabe4_1 {

	exports studium.aufgabe4_1;

	requires javafx.base;
	requires javafx.controls;
	requires transitive javafx.graphics;
	requires javafx.fxml;

	// Damit der FXML-Loader auf die private Klassenvariablen im Controller
	// zugreifen darf
	opens studium.aufgabe4_1 to javafx.fxml;

}