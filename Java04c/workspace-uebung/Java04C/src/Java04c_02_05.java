
/* ##################################
Sicherer Zugriff auf die Elemente
eines Arrays
###################################*/

public class Java04c_02_05 {
	public static void main(String[] args) {
		int[] zahlen = new int[10];
		int[] nummern = new int[10];

		// Zuweisung �ber eine Schleife und die Eigenschaft length
		for (int element = 0; element < zahlen.length; element++)
			zahlen[element] = element * element;

		// Ausgabe �ber die spezielle for-Schleife
		for (int element : zahlen)
			System.out.println("Der Wert ist " + element);

		// ein schreibender Zugriff �ber die spezielle for-Schleife
		// f�hrt in der Regel zu Schwierigkeiten
		// hier wird nur dem ersten Element von nummern der Wert 1 zugewiesen
		for (int element : nummern)
			nummern[element] = 1;
		// Ausgabe
		for (int element : nummern)
			System.out.println("Der Wert ist " + element);

		// hier wird nur der Wert der Variablen element ver�ndert,
		// aber nicht der Wert im Array
		// daher erzeugt Eclipse auch eine Warnung
		for (int element : nummern)
			element = 1;
		// Ausgabe
		for (int element : nummern)
			System.out.println("Der Wert ist " + element);

		// hier w�rde eine Ausnahme ausgel�st, da
		// die Arraygrenzen �berschritten werden
		// for (int element : zahlen)
		// zahlen[element] = 1;
	}
}
