package java03c;

/* #################################################
Unterschiedliche Typen in einer Methode
Der Code l�sst sich ebenfalls nicht �bersetzen
################################################# */

//f�r die Eingabe
import javax.swing.*;

public class java03c_04_05 {
		static int eingabe() {
			int einVariable;
			einVariable = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
			return einVariable;
		}

		public static void main(String[] args) {
			System.out.println("Die Methode eingabe() liefert den Wert " + eingabe());
			System.exit(0);

	}

}
