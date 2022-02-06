package amigo_uebung;

public class Haus {

	/*
	 * „Sind int a und int b Variablen und main und pi Methoden?“
	   „Genau.“
	   
	   „Kann es auch Klassen ohne Variablen geben?“  „Ja.“
	   „Und ohne Methoden?“

		„Ja. Aber ein Minimalprogramm muss mindestens eine Klasse enthalten, 
		die mindestens eine Methode/Funktion enthält, damit das Programm ausgeführt werden kann.
		Diese Methode muss den Namen ‚main‘ tragen. Ein Minimalprogramm sieht so aus:“
	 */
	
	public static double pi() {
		return 3.14;
		
	}
	
	public static void main(String[] args) {

		int a;

		int b;

		System.out.print("1");

	
		/*
		 *  „In der Sprache Java gibt es Befehle für jede Gelegenheit. 
		 *  Jeder Befehl beschreibt eine bestimmte Aktion. 
			Am Ende eines Befehls setzen wir ein Semikolon.“
		 */

	
		// *** Hier ein paar Befehl ***
		
		System.out.println(1);
		
		System.out.println("Amigo");
		
		System.out.println("Ritschie & Amigo");
		
		
		//*** Hier die Beschreibung (was er tut) ***
		
		// Gibt die Zahl 1 auf dem Bildschirm aus
		
		// Gibt „Amigo“ auf dem Bildschirm aus
		
		// Gibt „Ritschie & Amigo“ auf dem Bildschirm aus
		
		// „Eigentlich ist das nur ein Befehl, nämlich System.out.println. 
		// In den Klammern übergeben wir Parameter an den Befehl. 
		// Je nach dem Wert der Parameter kann der gleiche Befehl verschiedene Aktionen ausführen.“
	
		/**
		 * „Diesen Befehl gibt es in zwei Versionen: System.out.println() und System.out.print()"
			„Wenn du den Befehl System.out.println() ein paar Mal ausprobiert hast, 
			stellst du fest, dass der an den Befehl übergebene Text jedes Mal in einer 
			eigenen Zeile ausgegeben wird. Wenn du dagegen den Befehl System.out.print() verwendest, 
			wird der Text in derselben Zeile ausgegeben. Zum Beispiel:“
		 * 
		 */
	
		System.out.println("Amigo");
		System.out.println("ist der");
		System.out.println("Beste");	
		
		// *** 	Was auf dem Bildschirm angezeigt wird ***
		// Amigo
		// ist der
		// Beste
			
		System.out.print("Amigo");
		System.out.println("ist der");
		System.out.print("Beste");	
		
		// *** 	Was auf dem Bildschirm angezeigt wird ***
		//Amigoist der
		// Beste
	
		System.out.print("Amigo");
		System.out.print("ist der");
		System.out.print("Beste");
		
		// *** 	Was auf dem Bildschirm angezeigt wird ***
		// Amigoist der Beste
		
		/**
		 * „Nicht vergessen: bei println beginnt die Ausgabe von Text nicht in einer neuen Zeile. 
		 * Der Text wird in der aktuellen Zeile ausgegeben, aber so, dass der nächste 
		 * Text in einer neuen Zeile ausgegeben wird.“
		   unsichtbares ‚Zeilenvorschub-Zeichen‘. Dadurch beginnt der folgende Text in einer neuen Zeile.“
		 * 
		 */
		
		System.out.println("Ich glaube, Programmierer zu sein ist cool.");
	}
}
