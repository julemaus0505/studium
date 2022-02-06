package gui.buchhandel;

import javafx.scene.layout.Pane;

public class BuchhandelStore {

	public static Pane contentPane;

	static void setContentPane(Pane contentPane) {
		BuchhandelStore.contentPane = contentPane;
	}

	public static void contentPaneAustauchen(Pane pane) {
		contentPane.getChildren().clear();
		contentPane.getChildren().add(pane);
	}

}
