package javafx_beispiel1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SchaltflaecheEventHandler implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent event) {
		Platform.exit();
	}
}

