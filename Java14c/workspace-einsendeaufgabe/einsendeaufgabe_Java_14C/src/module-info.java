module einsendeaufgabe_Java_14C {
	exports miniMalFX;
	exports aufgabe_4;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

	opens aufgabe_4 to javafx.graphics, javafx.fxml;
	opens miniMalFX to javafx.graphics, javafx.fxml;
}

