
/* ################################################
Beispiel für zwei lokale Variablen
Auch dieser Code wird nicht übersetzt!
################################################# */

public class Java04c_01_03 {
	static void gibVarAus() {
		int varA = 4;
		System.out.println("Der Wert der Variablen ist " + varA);
	}

	public static void main(String[] args) {
		int varA = 0;
		gibVarAus();
		// DAS GEHT NICHT!
		System.out.printf("Der Wert der Variablen ist " , varA);
	}
}