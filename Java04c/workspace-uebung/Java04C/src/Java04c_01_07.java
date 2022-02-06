
/* ################################################
Beispiel f�r eine Klassenvariable
################################################# */

public class Java04c_01_07 {
	// die Vereinbarung von varA als Klassenvariable
	// die Vereinbarung muss au�erhalb jeder Methode, aber innerhalb der Klasse
	// erfolgen
	// die Angabe static ist zwingend erforderlich
	static int varA;

	static void gibVarAus() {
		// die Klassenvariable varA erh�lt den Wert 4
		varA = 4;
		System.out.println("Der Wert der Variablen ist " + varA);
	}

	public static void main(String[] args) {
		// die Klassenvariable varA erh�lt den Wert 5
		varA = 5;
		System.out.println("Der Wert der Variablen ist " + varA);
		gibVarAus();
		System.out.println("Der Wert der Variablen ist " + varA);
	}
}
