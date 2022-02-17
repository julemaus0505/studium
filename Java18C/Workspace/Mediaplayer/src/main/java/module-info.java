module mediaplayer {
	exports mediaplayer;
    
	requires javafx.controls;
    requires javafx.fxml;
	requires javafx.media;
	requires javafx.graphics;

    opens mediaplayer to javafx.fxml, javafx.graphics;
}
