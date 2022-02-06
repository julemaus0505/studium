
/* #################################################
gemeinsame Verwendung von lokalen Variablen
und Klassenvariablen
################################################# */

public class Java04c_01_08 {
	static int varA; // Vereinbarung von varA als Klassenvariable, Kassenvariablen sind blau und Kursiv

	static void aendereA() {
		int varA; // lokale Vereinbarung von varA, werden im blassen lila dargestellt

		varA = 0;

		if (varA == 0) {
			// hier wird eine noch lokalere Vereinbarung vom Compiler verhindert
			// int varA=42;
			System.out.println("Der Wert der Variablen ist " + varA);
		}
	}

	public static void main(String[] args) {
		varA = 5;
		System.out.println("Der Wert der Variablen ist " + varA);
		if (varA == 5) {
			int varA = 43; // hier ist varA nur für den if-Block gültig
			System.out.println("Der Wert der Variablen ist " + varA);
		}
		aendereA();
		System.out.println("Der Wert der Variablen ist " + varA);
	}
}
