package lagerverwaltung;

import java.lang.ModuleLayer.Controller;
import java.net.URL;
import java.util.ResourceBundle;

import domain.KeinLagerplatzFreiException;
import domain.Kiste;
import domain.Lager;
import domain.Lagerplatz;
import domain.Lagerplatznummer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LagerverwaltungController implements EventHandler<ActionEvent> {

	@FXML
	private TextField eingabeBreiteTextField;

	@FXML
	private TextField eingabeLaengeTextField;

	@FXML
	private TextField eingabeHoeheTextField;

	@FXML
	private ComboBox<String> waehleFunktionenComboBox;

	@FXML
	private Button bestaetigungButton;

	@FXML
	private TextArea datenDerKistenAnzeigenTextArea;

	@FXML
	private TextField lagerplatznummernTextField;

	

	// Liste erstellt für die Einträge der ComboBox
	ObservableList<String> list = FXCollections.observableArrayList("Eingabe einer neuen Kiste",
			"Löschen der Daten einer vorhandenen Kiste", "Ändern der Daten einer vorhandenen Kiste",
			"Anzeigen der Daten einer vorhandenen Kiste",
			"Listenfunktion, die die Daten aller vorhandenen Kisten anzeigen");

	public void initialize() {

		waehleFunktionenComboBox.setItems(list);
		

	}

	@Override
	public void handle(ActionEvent arg0) {
		bestaetigungButton.setOnAction(this);
		if (arg0.getSource() == bestaetigungButton) {
			

		}
		
		String breite = eingabeBreiteTextField.getText();
		String laenge = eingabeLaengeTextField.getText();
		String hoehe = eingabeHoeheTextField.getText();
		//String lagerplatznummer = lagerplatznummernComboBox.getItems().get(0);

		Lager lager = new Lager(10);
		if (waehleFunktionenComboBox.getSelectionModel().isSelected(0)) {
			try {
					
					lager.pruefeFreienLagerplatz();
					Lagerplatz lagerplatz = new Lagerplatz(null);
					Kiste kiste = null;
					lagerplatz.einlagern(kiste);
					datenDerKistenAnzeigenTextArea.setText("Sie lagern eine neue Kiste ein. Die Kiste ist, " + breite + " cm Breit, " + laenge + " cm Lang, " + hoehe + " cm Hoch. " + 
							"\n"  +  "Ihre Kiste wurde erfolgreich eingelagert.");
				
			} catch (KeinLagerplatzFreiException e) {
				datenDerKistenAnzeigenTextArea.setText("Es ist kein Lagerplatz mehr frei.");
				e.printStackTrace();
			}
				
			
			
		} else if (waehleFunktionenComboBox.getSelectionModel().isSelected(1)) {
			//datenDerKistenAnzeigenTextArea.setText("Ihr Kiste mit der Breite " + breite + " und Länge " + laenge + " und Höhe " + 
		//hoehe + " auf dem Lagerplatz mit der Lagerplatznummer " + lagerplatznummer + " wurde gelöscht.");

		} else if (waehleFunktionenComboBox.getSelectionModel().isSelected(2)) {
			System.out.println("Ändern der Daten einer vorhandenen Kiste");
		
		} else if (waehleFunktionenComboBox.getSelectionModel().isSelected(3)) {
			
			System.out.println("Anzeigen der Daten einer vorhandenen Kiste");
		
		} else {
			System.out.println("Listenfunktion, die die Daten aller vorhandenen Kisten anzeigt ");
		}

	}

}
