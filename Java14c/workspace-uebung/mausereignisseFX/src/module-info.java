module mausereignisseFX {
		exports mausereignisseFX;

		requires javafx.base;
		requires javafx.controls;
		requires javafx.fxml;
		requires javafx.graphics;
		requires java.desktop;
		
		opens mausereignisseFX to javafx.graphics, javafx.fxml;
}