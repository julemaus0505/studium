package java08c_01_03;

/*##########################
 * Ein weiterer Fehler
 ##########################*/

//für das Einlesen
import javax.swing.JOptionPane;

public class Java08c_01_03 {
	public static void main(String[] args) {
		int zahl;
		//eine ganze Zahl einlesen
		zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine ganze Zahl ein."));
		if (zahl == 5)
			zahl = zahl + 10;
		if (zahl <= 5)
			zahl = zahl + 20;
		if (zahl > 5)
			zahl = zahl + 30;
		System.out.println("Zahl hat den Wert " + zahl);
	}
}