/*  ################################################
Eingabe II (mit Konvertierung)
################################################# */

package aufgaben;

//f�r den Import der Swing-Klassen
import javax.swing.*;

public class Java02c_06_3 {

	public static void main(String[] args) {
		String eingabe, eingabe1;
		//f�r die beiden letzten Eingaben benutzen wir jetzt den Typ int
		int eingabe2, eingabe3;
		//die ersten beiden Eingaben
		eingabe = JOptionPane.showInputDialog("Wie hei�en Sie?");
		eingabe1 = JOptionPane.showInputDialog("Wen wollen Sie gr��en?");
		//die Ausgabe zusammenbauen
		System.out.println("Hallo " + eingabe1 + ". Es gr��t Dich " + eingabe);
		//zwei Zahlen einlesen
		//dazu wird die R�ckgabe aus dem Dialog in einen int-Wert umgebaut
		eingabe2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein:"));
		eingabe3 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein:"));
		//und addieren
		//diesmal klappt es auch :)
		System.out.println("Das Ergebnis der Addition von " + eingabe2 + " und " + eingabe3 + " ist " + (eingabe2 + eingabe3));
		//das Programm zur Sicherheit ausdr�cklich beenden
		System.exit(0);

	}

}
