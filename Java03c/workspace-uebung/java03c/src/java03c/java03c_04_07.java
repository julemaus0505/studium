package java03c;

/* #################################################
Eine Methode mit Argument
################################################# */

//für die Eingabe
import javax.swing.*;

public class java03c_04_07 {

	static int quadrat(int zahl) {
		int ergebnis;
		//zahl ist aus der Parameterliste bekannt
		ergebnis = zahl * zahl;
		return ergebnis;
	}

	public static void main(String[] args) {
		int einVariable;
		einVariable = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));

		//einVariable wird als Argument an die Methode übergeben
		System.out.println("Das Quadrat der Zahl " + einVariable + " ist " + quadrat(einVariable));
		System.exit(0);
	}
}
