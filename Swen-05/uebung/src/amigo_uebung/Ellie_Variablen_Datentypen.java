package amigo_uebung;

public class Ellie_Variablen_Datentypen {

	public static void main(String[] args) {
		
			// „Variablen sind spezielle Entitäten, in denen Daten gespeichert werden. 
			// Beliebige Daten. In Java werden alle Daten in Variablen gespeichert.
			// Das lässt sich am ehesten mit einer Schachtel vergleichen.“
		
			/**
			 * „Irgendeine Schachtel. Nehmen wir an, du schreibst die Zahl 13 auf einen
			 * Zettel und legst den in eine Schachtel. Dann können wir sagen, dass die Schachtel
			 * den Wert 13 speichert.“
			 */
		
			// „In Java hat jede Variable drei wichtige Eigenschaften: Typ, Name und Wert.“
			
			/**
			 * Wir benutzen einen Namen, um eine Variable von einer anderen zu unterscheiden.
			 * Das ist wie ein Etikett auf einer Schachtel.“
			   „Der Typ einer Variablen bestimmt, welche Arten von Werten/Daten in ihr gespeichert 
			   werden können. Einen Hut würden wir in eine Hutschachtel legen,
			   Schuhe in eine Schuhschachtel usw.“
			 */
			
			// „Der Wert ist das spezielle Objekt, die Daten bzw. Informationen, 
			// die in der Variablen gespeichert sind.“
		
			// „Um eine Variable anzulegen (bzw. zu deklarieren), benutzen wir den Namen des Typs: TypName variablenName."

			// ***„Hier ein paar Beispiele:“***
		
			int a;					// Eine int-Variable namens a erstellen.
			
			String s;				// Eine String-Variable namens s erstellen.
			
			double c;				// Eine double-Variable namens c erstellen.
			
			// „Die beiden gängigsten Typen sind ganze Zahlen (Integer-Zahlen, die mit dem Wort
			// int deklariert werden) und Text (der mit dem Wort String deklariert wird).“
			
			/**
			 * „Dazu kommen wir wieder auf den Vergleich mit der Schachtel zurück. 
			 * Stell dir vor, du nimmst einen Zettel, schreibst die Zahl 42 darauf und 
			 * legst ihn in die Schachtel. Jetzt speichert die Schachtel den Wert 42.“
			   „Wir benutzen eine spezielle Operation (Zuweisung), um Variablen Werte zuzuweisen. 
			   Durch die Zuweisung kopiert man Werte von einer Variablen in eine andere. 
			   Die Werte werden nicht verschoben. Sondern kopiert. Wie eine Datei auf einer Festplatte.
			    Das sieht dann so aus:“
			 */
			
				int i = 3; 				// Der Wert 3 wird der Variablen i zugewiesen.
				
				a = 1;					// Der Wert 1 wird der Variablen a zugewiesen.
				int b = a + 1;			// Der Wert 2 wird der Variablen b zugewiesen.
				
				int x = 3;				// Der Wert 3 wird der Variablen x zugewiesen.
				x = x + 1;				// In der nächsten Zeile wird der Wert von x um 1 erhöht, dadurch 
										// ist x also gleich 4.
				
				/**
				 * „Für die Zuweisungsoperation benutzen wir das Gleichheitszeichen (=).“
				   „Ich wiederhole: Das bedeutet nicht, dass wir einen Vergleich anstellen. 
				   Wir kopieren den Wert rechts vom Gleichheitszeichen in die Variable links davon. 
				   Für einen Vergleich wird in Java das doppelte Gleichheitszeichen (==) benutzt.“
				 */
				
				String k;				// Eine String-Variable namens k wird erstellt.
										// In dieser Variablen kann Text gespeichert werden.
				
				
				int y;					// Eine int-Variable namens y wird erstellt.
										// In dieser Variablen können ganze Zahlen (Integers) 
										// gespeichert werden.
				
				int d, e, f;			// int-Variablen namens d, e, f und g werden erstellt.
				int g;					// In diesen Variablen können ganze Zahlen gespeichert werden.
				
				/**
				 * „Du musst dazu wissen, dass du keine zwei Variablen mit identischen Namen 
				 * 
				 * innerhalb der gleichen Methode erstellen kannst.“

					„Und in verschiedenen Methoden?“
					
					„Ja, das geht. Das ist so, als ob du Schachteln in verschiedenen Häusern hättest.“
					
					„Kann ich einer Variablen jeden Namen geben, der mir einfällt?“
					
					„Fast. Variablennamen dürfen keine Leerzeichen oder Sonderzeichen wie +, - usw. 
					
					enthalten. Am besten benutzt man bei einem Variablennamen nur Buchstaben und Ziffern.“
					
					„Denk daran, dass Groß- und Kleinschreibung in Java unterschieden werden. 
					
					int a ist nicht dasselbe wie Int a.“
					
					„Übrigens kannst du in Java eine Variable erstellen und ihr gleichzeitig 
					
					einen Wert zuweisen. Das spart Zeit und Platz.“
				 */
				
				// *** 	Kompakter Code ***					*** Äquivalenter, aber längerer Code ***
				
				// int a = 5;										int a;
				// int b = 6;										a = 5;
				//													int b;
				//													b = 6;
				
				// int c = 7;										int c;
				// int d = c+1;										c = 7;
				//													int d;
				//													d = c+1;
				
				// String s = "Ich bin Amigo";						String s;
				//													s = "Ich bin Amigo";
				
				// *** Aufgabe ***
				String text = "Ellie ist clever";
				System.out.println(text);
				System.out.println(text);
				System.out.println(text);
				System.out.println(text);
				System.out.println(text);
				
				
				// *** Aufgabe ***
				int gebjahr = 3126;
				int ergebnis = gebjahr - 8;
				
				System.out.println("Geburtsjahr meines Freundes ist " + ergebnis);
				
				// *** Aufgabe ***
				
				String name = "Jule";
				int alter = 36;
				String ort = "Rantzau";

	}

}
