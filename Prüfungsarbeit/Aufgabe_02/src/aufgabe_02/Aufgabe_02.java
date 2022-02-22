package aufgabe_02;


import java.util.Scanner;

public class Aufgabe_02 {

	public static void main(String[] args) {
		
		// ein Objekt von Scanner erstellt
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die erste Zahl ein.");
		
		int zahl1 = scanner.nextInt();
		
		System.out.println("Bitte geben Sie zweite Zahl ein.");

		int zahl2 = scanner.nextInt();
		
		if (zahl1 != zahl2) {
			for(int i = 0 ; zahl1 < zahl2; i++) {
				System.out.println("Sie haben " + i + "Durchläufe gehabt ");
			}
		} else {
			System.out.println("Beide Zahlen sind gleich groß, noch ein Versuch");
			
			System.out.println("-------------------------------------------------------------------------------------------------------------------\n");
			
			System.out.println("Bitte geben Sie die erste Zahl ein.");
			
			zahl1 = scanner.nextInt();
			
			System.out.println("Bitte geben Sie zweite Zahl ein.");

			zahl2 = scanner.nextInt();
		}

	}
	
	

}
