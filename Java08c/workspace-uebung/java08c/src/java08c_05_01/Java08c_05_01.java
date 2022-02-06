package java08c_05_01;

/*##############################
 * Eine Division durch 0 führt 
 * zum abrupten Ende
 ###############################*/

//für den Dialog
import javax.swing.JOptionPane;
public class Java08c_05_01 {

	public static void main(String[] args) {
		int zahl1, zahl2, ergebnis;
		zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein."));
		zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein."));
		ergebnis = zahl1 / zahl2;
		System.out.println("Das Ergebnis ist " + ergebnis);
	}
}
