package java03c;

/* #################################################
Undefinierte R�ckgabe aus einer Methode
Das Beispiel l�sst sich nicht �bersetzen
################################################# */

//f�r die Eingabe
import javax.swing.*;

	public class Java03c_04_04 {
		static int eingabe() {
			int einVariable;
			int eingabe;
			einVariable = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
			if (einVariable <= 20)
				return einVariable;
			return einVariable;
		}

		public static void main(String[] args) {
			System.out.println("Die Methode eingabe() liefert den Wert " + eingabe());
			System.exit(0);
		}
	}		
		
