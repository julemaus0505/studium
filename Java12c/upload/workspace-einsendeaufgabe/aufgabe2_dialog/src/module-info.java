module aufgabe2_dialog {

	requires java.desktop;
	requires miglayout.swing;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	requires javafx.controls;

	exports dialog.fx to javafx.graphics, javafx.fxml;

	opens dialog.fx to javafx.graphics, javafx.fxml;
}