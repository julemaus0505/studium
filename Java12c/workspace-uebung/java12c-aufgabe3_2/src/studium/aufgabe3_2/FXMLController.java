package studium.aufgabe3_2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.ComboBox;

public class FXMLController {
	// das Label
	@FXML
	private Label ausgabe;
	// das Kombinationsfeld
	@FXML
	private ComboBox<String> auswahl;
	// das Kontrollk�stchen
	@FXML
	private CheckBox gross;

	// die Methode zum Beenden
	@FXML
	protected void beendenKlick(ActionEvent event) {
		Platform.exit();
	}

	// die Methode zum Vergr��ern oder Verkleinern
	@FXML
	protected void grossKlick(ActionEvent event) {
		if (gross.isSelected() == true)
			ausgabe.setFont(new Font(36));
		else
			ausgabe.setFont(new Font(24));
	}

	@FXML
	protected void buntKlick(ActionEvent event) {
		// das Kombinationsfeld aktivieren
		auswahl.setDisable(false);
	}

	@FXML
	protected void einfarbigKlick(ActionEvent event) {
		// das Kombinationsfeld deaktivieren
		auswahl.setDisable(true);
		// den ersten Eintrag wieder markieren
		auswahl.getSelectionModel().selectFirst();
		// die Farbe auf Schwarz setzen
		ausgabe.setTextFill(Color.BLACK);
	}

	@FXML
	protected void auswahlNeu(ActionEvent event) {
		// zum Zwischenspeichern
		// die Auswahl beschaffen und zwischenspeichern
		String tempAuswahl = auswahl.getSelectionModel().getSelectedItem();
		if (tempAuswahl.equals("Schwarz"))
			ausgabe.setTextFill(Color.BLACK);
		if (tempAuswahl.equals("Rot"))
			ausgabe.setTextFill(Color.RED);
		if (tempAuswahl.equals("Gr�n"))
			ausgabe.setTextFill(Color.GREEN);
		if (tempAuswahl.equals("Blau"))
			ausgabe.setTextFill(Color.BLUE);
	}

	// die Methode wird nach dem Verarbeiten der FXML-Anweisungen ausgef�hrt
	@FXML
	void initialize() {
		// die Eintr�ge im Kombinationsfeld setzen
		auswahl.getItems().addAll("Schwarz", "Rot", "Gr�n", "Blau");
		// den ersten Eintrag ausw�hlen
		auswahl.getSelectionModel().selectFirst();
	}
}
