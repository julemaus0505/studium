/*  ################################################
Eingabe III (�ber die Klasse Console)
Das Programm l�uft nicht direkt in Eclipse
################################################# */

package aufgaben;

//f�r den Import der java.io-Klassen
//sonst ist die Klasse Console nicht bekannt
import java.io.*;

public class Java02c_06_4 {

	public static void main(String[] args) {
		String eingabe, eingabe1;
		//f�r die beiden letzten Eingaben benutzen wir jetzt den Typ int
		int eingabe2, eingabe3;
		//die Konsole beschaffen
		//das klappt leider nicht in Eclipse!
		Console konsole = System.console();
		//die ersten beiden Eingaben �ber readLine()
		System.out.println("Wie hei�en Sie?");
		eingabe = konsole.readLine();
		System.out.println("Wen wollen Sie gr��en?");
		eingabe1 = konsole.readLine();
		//die Ausgabe zusammenbauen
		System.out.println("Hallo " + eingabe1 + ". Es gr��t Dich " + eingabe);
		//zwei Zahlen einlesen
		//dazu wird die R�ckgabe von readLine in einen int-Wert umgebaut
		System.out.println("Bitte geben Sie die erste Zahl ein:");
		eingabe2 = Integer.parseInt(konsole.readLine());
		System.out.println("Bitte geben Sie die zweite Zahl ein:");
		eingabe3 = Integer.parseInt(konsole.readLine());
		//und addieren
		System.out.println("Das Ergebnis der Addition von " + eingabe2 + " und " + eingabe3 + " ist " + (eingabe2 + eingabe3));

	}

}
