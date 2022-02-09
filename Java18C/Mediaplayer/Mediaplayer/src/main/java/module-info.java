module mediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.media;

    opens mediaplayer to javafx.fxml;
    exports mediaplayer;
}
