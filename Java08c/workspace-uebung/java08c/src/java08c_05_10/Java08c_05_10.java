package java08c_05_10;

/*########################
 * die Anweisung finally 
 ########################*/

public class Java08c_05_10 {
	public static void main(String[] args) {
		//ein Array mit 10 Elementen erzeugen
		int testArray[] = new int[10];
		int index = 0;
		//ein ungültiger Zugriff
		try {
			for (;index < 100; index++)
				testArray[index] = index;
		}
		//Ausnahme IndexOutOfBoundsException abfangen
		catch (IndexOutOfBoundsException e) {
			System.out.println("Der Index " + index + " ist nicht gültig.");
		}
		//die Ausgabe erfolgt in jedem Fall
		finally {
			System.out.println("Dieser Text erscheint immer.");
		}
	}
}
