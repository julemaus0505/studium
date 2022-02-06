
/* ##################################
Eine Klasse in einem eigenen Paket
###################################*/
//die Anweisung für die Bekanntgabe des Pakets
package einaus;

//der Import für die Eingabe
import javax.swing.JOptionPane;

// Die Klasse EinAus
public class EinAus {

	// eine private Instanzvariable
	private String eingabe;
	
	//die beiden öffentlichen Methoden zum Einlesen
	
	public void einlesen() {
		eingabe = JOptionPane.showInputDialog("Bitte machen Sie Ihre Eingabe.");
	}
	
	public void aufgeben() {
		System.out.println("Ihre eingabe war: " + eingabe);
	}
}
