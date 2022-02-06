package uebungen_vererbung_6_fx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import uebungen_vererbung_6.Pizza;
import uebungen_vererbung_6.PizzaSpecial2012;

public class PizzaController {

	@FXML
	private Label pizzaAuswaehlenLabel;

	@FXML
	private ComboBox<Pizza> pizzaAuswaehlenComboBox;

	@FXML
	private Label saucentypLabel;

	@FXML
	private ComboBox<Saucen> saucentypComboBox;

	@FXML
	private Label schaerfegradLabel;

	@FXML
	private Button bestellenButton;

	@FXML
	private ComboBox<Schaerfegrad> schaerfegradComboBox;

	private PizzaModel pizzaModel = new PizzaModel();

	private SaucentypModel saucenModel = new SaucentypModel();

	private SchaerfegradModel schaerfegradModel = new SchaerfegradModel();

	@FXML
	public void initialize() {

		pizzaAuswaehlenComboBox.setItems(pizzaModel.lieferPizzen());
		saucentypComboBox.setItems(saucenModel.lieferSaucen());
		schaerfegradComboBox.setItems(schaerfegradModel.lieferSchaerfegrad());
		schaerfegradComboBox.disableProperty().set(true);
		saucentypComboBox.disableProperty().set(true);

	}

	@FXML
	public void pizzaAusgewaehlt() {
		if (pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem() instanceof PizzaSpecial2012) {
			schaerfegradComboBox.disableProperty().set(false);
			saucentypComboBox.disableProperty().set(false);

		} else {
			schaerfegradComboBox.disableProperty().set(true);
			saucentypComboBox.disableProperty().set(true);
		}

	}

	@FXML
	public void bestellungAbschicken() {
		if (pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem() instanceof PizzaSpecial2012) {

			Alert alertPizzaSpecial = new Alert(AlertType.INFORMATION,
					"Sie haben bestellt." + pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem()
							+ saucentypComboBox.getSelectionModel().getSelectedItem()
							+ schaerfegradComboBox.getSelectionModel().getSelectedItem());

			alertPizzaSpecial.setTitle("Besondere Bestellung");
			alertPizzaSpecial.setContentText("Vielen Dank für Ihren Bestellung, bis zum nächsten mal.");
			alertPizzaSpecial.setHeaderText(
					"Sie haben bestellt. " + pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem() + " "
							+ saucentypComboBox.getSelectionModel().getSelectedItem() + " "
							+ schaerfegradComboBox.getSelectionModel().getSelectedItem());

			alertPizzaSpecial.showAndWait();

		} else if (pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem() != null) {

			Alert alertBestellung = new Alert(AlertType.INFORMATION,
					"Sie haben bestellt." + pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem(),
					ButtonType.CLOSE);

			alertBestellung.setTitle("Bestellung");
			alertBestellung.setHeaderText(
					"Sie haben folgendes Bestellt: " + pizzaAuswaehlenComboBox.getSelectionModel().getSelectedItem());
			alertBestellung.setContentText("Vielen Dank für Ihren Bestellung, bis zum nächsten mal.");

			alertBestellung.showAndWait();

		} else {

			Alert alertSieMuessenWasAuswaehlen = new Alert(AlertType.INFORMATION, "Sie müssen eine Pizza auswählen.",
					ButtonType.OK);
			alertSieMuessenWasAuswaehlen.setTitle("Meldung");
			alertSieMuessenWasAuswaehlen.setHeaderText("Sie haben keine Auswahl getroffen.");
			alertSieMuessenWasAuswaehlen.setContentText("Bitte wählen Sie erst eine Pizza aus.");

			alertSieMuessenWasAuswaehlen.showAndWait();
		}

	}

}
