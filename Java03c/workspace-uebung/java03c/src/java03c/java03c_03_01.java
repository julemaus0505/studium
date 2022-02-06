package java03c;

/* #################################################
while-Schleife
################################################# */

public class java03c_03_01 {

	public static void main(String[] args) {
		int schleifenVariable = 0;

		// die Schleife
		while (schleifenVariable <= 10) {
			// der aktuelle Wert wird ausgegeben
			System.out.println("Die Variable hat jetzt den Wert " + schleifenVariable);
			// schleifenVariable wird immer um einen erhöht
			schleifenVariable++;
		}
	}

}
