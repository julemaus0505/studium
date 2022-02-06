package java08c_05_05;

/*#############################################
 * zur Demonstration der Methoden
 * getMessage() und printStackTrace()
 * die Methoden rufen weitere Methoden auf, 
 * um Daten für die Ausgabe zu erzeugen :)   
 ##############################################*/

public class Ausgabe {
	
	public void aufruf1() {
		aufruf2();
	}
	
	private void aufruf2() {
		System.out.println("Die Ausgabe mit Exception Handling");
		aufruf3();
		System.out.println();
		System.out.println("Die Ausgabe ohne Exception Handling");
		aufruf4();
	}
	
	private void aufruf3() {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			//eine eigene Meldung
			System.out.println("Das hat nicht geklappt");
			
			//den Originaltext der Meldung ausgeben
			System.out.println("Der Originaltext der Meldung: " + e.getMessage());
			
			//den Namen der Klasse und den Text der Meldung ausgeben
			System.out.println("Die Klasse und der Originaltext der Meldung: " + e.toString());
			
			//und den Stack Trace
			//die Ausgabe erfolgt immer unten in der Konsole
			e.printStackTrace();
		}
	}
	
	private void aufruf4() {
		System.out.println(10/0);
	}
}

