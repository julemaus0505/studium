package java08c_05_01;

/*##############################
 * Eine Division durch 0 führt 
 * zum abrupten Ende
 ###############################*/

//für den Dialog
import javax.swing.JOptionPane;
public class Java08c_05_01_Erweitert {

	public static void main(String[] args) {
		int ergebnis = 0;
			
		//Die Division wird versucht
		try {
			int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein."));
			int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein."));
			ergebnis = zahl1 / zahl2;			
		}
		//wenn es beim Konvertieren ein Problem gegeben hat
		catch (NumberFormatException e) {
			verarbeiteteAusnahme(ergebnis);
			ergebnis = 0;
		}
		//eine Division durch null wurde versucht
		catch (ArithmeticException e) {
			System.out.println("Eine Division druch null ist nicht definiert.");
		}
		//alle anderen Ausnahmen
		catch (Exception e) {
			verarbeiteteAusnahme(ergebnis);	
			ergebnis = 0;
			String wort = null;
			System.out.println(wort.length()); 
			}
		System.out.println("Das Ergebnis ist " + ergebnis);
		
	}
	
	//In Methoden ausgelagert, und die Methoden Aufgerufen....
	public static int verarbeiteteAusnahme(int ergebnis) {
		System.out.println("Sie haben einen ungültigen Wert eingegeben.");
		System.out.println("Das Ergebnis wird auf 0 gesetzt.");
		return ergebnis;
		
	}
}
