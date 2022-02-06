package listView;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ListView.EditEvent;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

	// Variablen
	Button selectAll = new Button("Select All");
	Button clearAll = new Button("Clear All");
	Button selectFirst = new Button("selectFirst");
	Button selectLast = new Button("selectLast");
	Button selectNext = new Button("selectNext");
	Button selectPrevios = new Button("selectPrevios");

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Scene / root
		HBox root = new HBox(40);
		Scene scene = new Scene(root, 600, 400);

		// ListView - Liste erstellen
		ListView<String> listView = new ListView<String>();

		// Liste erstellen - ObservableList
		ObservableList<String> observableList = FXCollections.observableArrayList();
		observableList.addAll("Berlin", "Hamburg", "Bremen", "München", "Düsseldorf", "Nürnberg");

		// ListView Methoden
		listView.setItems(observableList);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//		listView.setOrientation(Orientation.HORIZONTAL);

		// Tracking der User Interaktion - Wo hat der User geklickt
//		listView.getSelectionModel().getSelectedIndex(); // Index des geklickten items
//		listView.getSelectionModel().getSelectedItem(); // Item / Inhalt welches gegklickt wurde 
//		listView.getFocusModel().getFocusedIndex(); // Index des fokussierten items
//		listView.getFocusModel().getFocusedItem(); // Item / Inhalt welches fokussiert wurde 

		// Eventhanlding - Tracking
		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				System.out.println("Index: " + listView.getSelectionModel().getSelectedIndex());
				System.out.println("Inhalt: " + listView.getSelectionModel().getSelectedItem());
				System.out.println("Index Fokus: " + listView.getFocusModel().getFocusedIndex());
				System.out.println("Inhalt Fokus: " + listView.getFocusModel().getFocusedItem());
			}
		});

		listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getButton().equals(MouseButton.SECONDARY)) {
					System.out.println("Kopieren");
				}

			}
		});

		// Buttongröße dynamisch anpassen
		VBox vBox = new VBox();
		vBox.getChildren().addAll(selectAll, clearAll, selectFirst, selectLast, selectNext, selectPrevios);

		selectAll.setMaxWidth(Double.MAX_VALUE);
		clearAll.setMaxWidth(Double.MAX_VALUE);
		selectFirst.setMaxWidth(Double.MAX_VALUE);
		selectLast.setMaxWidth(Double.MAX_VALUE);
		selectNext.setMaxWidth(Double.MAX_VALUE);
		selectPrevios.setMaxWidth(Double.MAX_VALUE);

		selectAll.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				listView.getSelectionModel().selectAll();
			}
		});

		clearAll.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				listView.getSelectionModel().clearSelection();
			}
		});

		selectFirst.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				listView.getSelectionModel().selectFirst();
			}
		});

		selectLast.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				listView.getSelectionModel().selectLast();
			}
		});

		selectNext.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				listView.getSelectionModel().selectNext();
			}
		});

		selectPrevios.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				listView.getSelectionModel().selectPrevious();
			}
		});

		// Button Eventhandling

		// Eventhandling mit der Liste
		listView.setEditable(true);
		listView.setCellFactory(TextFieldListCell.forListView());
		// listView.setCellFactory(ComboBoxListCell.forListView());
		// listView.setCellFactory(ChoiceBoxListCell.forListView());

		listView.setOnEditCommit(new EventHandler<ListView.EditEvent<String>>() {
			@Override
			public void handle(EditEvent<String> event) {
				System.out.println("Test");
				String newValue = event.getNewValue();
				int index = event.getIndex();
				System.out.println("neuer Wert: " + newValue + " Index: " + index);
				listView.getItems().set(index, newValue);
			}
		});

		listView.setOnEditStart(new EventHandler<ListView.EditEvent<String>>() {
			@Override
			public void handle(EditEvent<String> arg0) {
				System.out.println("Start von Edit");
			}
		});

		listView.setOnEditCancel(new EventHandler<ListView.EditEvent<String>>() {
			@Override
			public void handle(EditEvent<String> arg0) {
				System.out.println("Cancel von Edit");
				Stage stage = new Stage();
				StackPane root = new StackPane();
				Button button = new Button("Sind Sie sicher?");
				root.getChildren().add(button);

				button.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent arg0) {
						stage.close();
					}
				});

				Scene scene = new Scene(root, 200, 100);
				stage.setScene(scene);
				stage.show();
			}
		});

		// Elemente hinzufügen - Root Box
		root.getChildren().addAll(listView, vBox);

		root.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 4;"
				+ "-fx-border-radius: 5;" + "-fx-border-color: red;");

		// Stage
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
