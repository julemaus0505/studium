package aufgaben;

/*  ################################################
Ein komplexeres Beispiel für Variablen
################################################# */

public class Java02c_03_4 {

	public static void main(String[] args) {
		//Vereinbarung der Variablen
				int zahl1 = 1;
				int zahl2, zahl3, zahl4;

				//Zuweisungen
				//zahl2 erhält das Ergebnis des Ausdrucks 1+1, also 2 
				zahl2 = 1 + 1;
				//zahl3 erhält den aktuellen Wert von Zahl2 * 5, also 10
				zahl3 = zahl2 * 5;
				
				//Ausgaben
				System.out.println("zahl1 hat den Wert " + zahl1);
				System.out.println("zahl2 hat den Wert " + zahl2);
				System.out.println("zahl3 hat den Wert " + zahl3);
				
				//Hier beginnt der Ringtausch
				//Die Werte von zahl1 und zahl2 werden getauscht
				//zuerst wird der Wert von zahl1 in zahl4 gesichert
				zahl4 = zahl1;
				//dann erhält zahl1 den Wert von zahl2
				zahl1 = zahl2;
				//und zum Schluss wird zahl2 der gesicherte Wert von zahl1
				//aus zahl4 zugewiesen
				zahl2 = zahl4;
				
				//Ausgaben nach dem Tausch
				System.out.println("zahl1 hat jetzt den Wert " + zahl1);
				System.out.println("zahl2 hat jetzt den Wert " + zahl2);

	}

}
