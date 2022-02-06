module UIControls {
	
	exports listView;
	exports tableView;

	
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens listView to javafx.graphics, javafx.fxml;
	opens tableView to javafx.graphics, javafx.fxml;
	
}