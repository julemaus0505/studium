module hangman_Spiel {
	exports hangmanSpiel;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	
	opens hangmanSpiel to javafx.graphics, javafx.fxml;
}