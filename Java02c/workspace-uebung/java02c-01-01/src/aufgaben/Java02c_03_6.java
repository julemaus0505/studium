package aufgaben;

/*  ################################################
Konstanten (das Programm lässt sich nicht übersetzen)
################################################# */

public class Java02c_03_6 {

	public static void main(String[] args) {
		//die Vereinbarung der Konstanten
				final int KONSTANTE = 25;
				// Vereinbarung der Variablen
				int zahl2 = 15;
				int ausgabe;

				//Ausgabe der Konstante
				System.out.println("KONSTANTE hat den Wert " + KONSTANTE);
				//Rechnung mit der Konstanten
				ausgabe = zahl2 + KONSTANTE;
				//Ausgabe des Ergebnisses
				System.out.println("ausgabe hat den Wert " + ausgabe);
				//DAS GEHT NICHT, den die Variable kann nur bei final einmal gesetzt werden.
				//KONSTANTE = 5;

	}

}
