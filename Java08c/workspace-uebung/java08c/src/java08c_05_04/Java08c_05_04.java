package java08c_05_04;

/*##############################################
 * jetzt werden die Ausnahmen getrennt behandelt 
 ###############################################*/

//für den Eingabedialog
import javax.swing.JOptionPane;

public class Java08c_05_04 {
	public static void main(String[] args) {
		int zahl1, zahl2, ergebnis;
		try {
			//zum Test für den letzten catch-Block
			//String wort = null;
			//System.out.println(wort.length());
			zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein."));
			zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein."));
			ergebnis = zahl1 / zahl2;
		}
		//wenn es beim Konvertieren ein Problem gegeben hat
		catch (NumberFormatException e) {
			System.out.println("Sie haben einen ungültigen Wert eingegeben.");
			System.out.println("Das Ergebnis wird auf 0 gesetzt.");
			ergebnis = 0;
		}
		//eine Division durch null wurde versucht
		catch (ArithmeticException e) {
			System.out.println("Eine Division durch 0 ist nicht definiert.");
			System.out.println("Das Ergebnis wird auf 0 gesetzt.");
			ergebnis = 0;
		}
		//alle anderen Ausnahmen
		catch (Exception e) {
			System.out.println("Es ist ein Fehler aufgetreten.");
			System.out.println("Das Ergebnis wird auf 0 gesetzt.");
			ergebnis = 0;
		}
		System.out.println("Das Ergebnis ist " + ergebnis);
	}
}

