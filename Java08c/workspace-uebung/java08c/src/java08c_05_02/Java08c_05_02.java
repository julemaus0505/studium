package java08c_05_02;

/*#########################################
 * Eine sehr einfache Ausnahmebehandlung
 ##########################################*/

//für den Eingabedialog
import javax.swing.JOptionPane;

public class Java08c_05_02 {
	public static void main(String[] args) {
		int zahl1, zahl2, ergebnis;
		zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein."));
		zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein."));
		//die Division wird versucht
		try {
			ergebnis = zahl1 / zahl2;
		}
		//wenn es nicht geklappt hat
		catch (Exception e) {
			System.out.println("Es ist ein Fehler aufgetreten.");
			System.out.println("Das Ergebnis wird auf 0 gesetzt.");
			ergebnis = 0;
		}
		System.out.println("Das Ergebnis ist " + ergebnis);
	}
}
