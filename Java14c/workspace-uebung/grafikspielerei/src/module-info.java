module grafikspielerei {
	
		exports grafikspielerei;

		requires javafx.base;
		requires javafx.controls;
		requires javafx.fxml;
		requires javafx.graphics;
		requires java.desktop;
		
		opens grafikspielerei to javafx.graphics, javafx.fxml;
}