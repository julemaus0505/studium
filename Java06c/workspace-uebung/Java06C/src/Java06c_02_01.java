
/* ################################################
/* Beispiele für überladene Methoden
################################################# */

//die Klasse Produkt
//benutzt werden überladene Klassenmethoden
class Produkt {
	// mit zwei int-Parametern
	static int rechnung(int wert1, int wert2) {
		System.out.println("Rechnung mit zwei Parametern");
		System.out.println();
		return (wert1 * wert2);
	}

	// mit drei int-Parametern
	static int rechnung(int wert1, int wert2, int wert3) {
		System.out.println("Rechnung mit drei Parametern");
		System.out.println();
		return (wert1 * wert2 * wert3);
	}

	// mit zwei float-Parametern
	static float rechnung(float wert1, float wert2) {
		System.out.println("Rechnung mit zwei float-Parametern");
		System.out.println();
		return (wert1 * wert2);
	}

	// diese Methode wäre nicht zulässig, da sie sich nur
	// im Rückgabewert von einer bereits vorhandenen
	// unterscheidet
	// float rechnung(int wert1, int wert2)
}

public class Java06c_02_01 {
	public static void main(String[] args) {
		float wert1 = 10.02F;
		float wert2 = 10.09F;
		// Aufruf der überladenen Methoden
		System.out.println("Der Aufruf mit zwei int-Argumenten: " + Produkt.rechnung(10, 20));
		System.out.println("Der Aufruf mit drei int-Argumenten: " + Produkt.rechnung(10, 20, 30));
		System.out.println("Der Aufruf mit zwei float-Argumenten: " + Produkt.rechnung((float) 10.5, (float) 20.5));
		// folgender Aufruf geht nicht, da es keine Methode für die Verarbeitung von
		// double-Typen gibt
		// System.out.println("Der Aufruf mit zwei double-Argumenten: " +
		// Produkt.rechnung(10.5, 20.5));
		// so geht es, weil es sich um zwei float-Argumente handelt
		System.out.println("Der Aufruf mit zwei float-Argumenten: " + Produkt.rechnung(wert1, wert2));
	}
}
