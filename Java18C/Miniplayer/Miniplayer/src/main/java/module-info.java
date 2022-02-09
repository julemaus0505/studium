module miniplayer {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.media;

    opens miniplayer to javafx.fxml;
    exports miniplayer;
}
