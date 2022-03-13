package berechnungGrundstueckspreise;

import java.net.URL;
import java.util.ResourceBundle;

import berechnungGrundstueckspreise.formatter.TextFormatterFactory;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

	// Konstanten
	static final int MEHRWERTSTEUER = 19;
	static final int PROVISION = 5;

	@FXML
	private Label laengeLabel;

	@FXML
	private Label breiteLabel;

	@FXML
	private Label preisLabel;

	@FXML
	private TextField laengeTextField;

	@FXML
	private TextField breiteTextField;

	@FXML
	private TextField preisTextField;

	@FXML
	private TextArea ausgabeTextArea;

	@FXML
	private Button berechnenButton;

	@FXML
	void berechnenButtonAction(ActionEvent event) {

		// Text in Double gewandelt
		double laenge = Double.parseDouble(laengeTextField.getText());
		double breite = Double.parseDouble(breiteTextField.getText());
		double preisProQuadratmeter = Double.parseDouble(preisTextField.getText());

		// Berechnung der Quadratmeter vom Grundstück
		double quadratmeter = laenge * breite;

		// Berechnung Grundstückspreis
		double preisGrundstueck = quadratmeter * preisProQuadratmeter;

		// Berechnung Grundstückspreis plus 5% Provision
		double preisGrundstueckProvision = preisGrundstueck + preisGrundstueck / 100 * PROVISION;

		// Berechnung Grundstückspreis plus 19% Mehrwertsteuer
		double preisGrundstueckMehrwertsteuer = preisGrundstueckProvision + preisGrundstueck / 100 * MEHRWERTSTEUER;

		// Ausgabe der Daten in einer TextArea
		ausgabeTextArea.setText(String.format("""
				Das Grundstück kostet %.2f Euro.
				Der Preis für das Grundstück mit Provision beträgt %.2f Euro.
				Der Preis für das Grundstück mit Mehrwertsteuer und Provision beträgt %.2f Euro.
				""", preisGrundstueck, preisGrundstueckProvision, preisGrundstueckMehrwertsteuer));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// Berechnen Button erst aktivieren wenn alle Text Felder gefüllt sind
		berechnenButton.disableProperty()
				.bind(Bindings.or(
						Bindings.or(laengeTextField.textProperty().isEmpty(), breiteTextField.textProperty().isEmpty()),
						preisTextField.textProperty().isEmpty()));

		// in den Text Felder können und dürfen nur Zahlen eingegeben werden
		laengeTextField.setTextFormatter(TextFormatterFactory.createDoubleTextFormatter());
		breiteTextField.setTextFormatter(TextFormatterFactory.createDoubleTextFormatter());
		preisTextField.setTextFormatter(TextFormatterFactory.createDoubleTextFormatter());
	}

}
