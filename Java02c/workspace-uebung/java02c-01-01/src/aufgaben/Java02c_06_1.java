/*  ################################################
Eingabe I
################################################# */

package aufgaben;

//f�r den Import der Swing-Klassen
import javax.swing.*;

public class Java02c_06_1 {

	public static void main(String[] args) {
		String eingabe;
		eingabe = JOptionPane.showInputDialog("Bitte machen Sie Ihre Eingabe.");
		System.out.println("Ihre Eingabe war: " + eingabe);
		//das Programm zur Sicherheit ausdr�cklich beenden
		System.exit(0);

	}

}
