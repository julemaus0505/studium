
/* #################################################
SO BITTE NICHT!
################################################# */

//für die Eingabe
import javax.swing.*;

public class Java04c_01_09 {

	 static int berechnung(int zahl) {
		int quadrat;
		quadrat = zahl * zahl;
		return quadrat;
	}

	public static void main(String[] args) {
		int zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein:"));
		System.out.println("Das Quadrat der Zahl ist " + berechnung(zahl));
		System.exit(0);
	}
}
