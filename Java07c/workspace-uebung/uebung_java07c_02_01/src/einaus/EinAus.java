
/* ##################################
Eine Klasse in einem eigenen Paket
###################################*/
//die Anweisung f�r die Bekanntgabe des Pakets
package einaus;

//der Import f�r die Eingabe
import javax.swing.JOptionPane;

// Die Klasse EinAus
public class EinAus {

	// eine private Instanzvariable
	private String eingabe;
	
	//die beiden �ffentlichen Methoden zum Einlesen
	
	public void einlesen() {
		eingabe = JOptionPane.showInputDialog("Bitte machen Sie Ihre Eingabe.");
	}
	
	public void aufgeben() {
		System.out.println("Ihre eingabe war: " + eingabe);
	}
}
