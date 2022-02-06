package uebung_taschenrechner.fx;


import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import uebung_taschenrechner.Taschenrechner;

public class TaschenrechnerController {

	@FXML
	private TextField zahl1TextField;
	
	@FXML
	private TextField zahl2TextField;
	
	@FXML
	private TextField ergebnisTextField;
	
	@FXML
	private ComboBox<String> operatorenComboBox;
	
	 @FXML
	 public void initialize() {
		 operatorenComboBox.getItems().add("Addition");
		 operatorenComboBox.getItems().add("Subtraktion");
		 operatorenComboBox.getItems().add("Multiplikation");
		 operatorenComboBox.getItems().add("Division");
	 }
	
	@FXML 
	public void berechnen() {
		
		int ergebnis;
		
		int eingabe1 = Integer.parseInt(zahl1TextField.getText());
		int eingabe2 = Integer.parseInt(zahl2TextField.getText());
		
		if("Addition".equals(operatorenComboBox.getValue())) {
			ergebnis = Taschenrechner.berechneAddition(eingabe1, eingabe2);
			
		} else if ("Subtraktion".equals(operatorenComboBox.getValue())) {
			ergebnis = Taschenrechner.berechneSubtraktion(eingabe1, eingabe2);
		
		} else if ("Multiplikation".equals(operatorenComboBox.getValue())) {
			ergebnis = Taschenrechner.berechneMultiplikation(eingabe1, eingabe2);
			
		} else {
			ergebnis = Taschenrechner.berechneDivision(eingabe1, eingabe2);
		}
		
		String ergebnisString = String.valueOf(ergebnis);
		ergebnisTextField.setText(ergebnisString);
	}
	
}
