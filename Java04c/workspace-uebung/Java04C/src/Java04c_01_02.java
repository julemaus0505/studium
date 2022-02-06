
/* ################################################
Beispiel für einen nicht erlaubten Zugriff
Der Code wird nicht übersetzt!
################################################# */

public class Java04c_01_02 {

	static int varA;

	static void gibVarAus() {
		// die Klassenvariable varA erhält den Wert 4
		varA = 4;
		System.out.println("Der Wert der Variablen ist " + varA);
	}

	public static void main(String[] args) {
		// die Klassenvariable varA erhält den Wert 5
		                   varA = 5;
		System.out.println("Der Wert der Variablen ist " + varA);
		gibVarAus();
		System.out.println("Der Wert der Variablen ist " + varA);
	}
}
