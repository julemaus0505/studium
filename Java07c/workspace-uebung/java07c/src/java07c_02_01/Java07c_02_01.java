package java07c_02_01;

/*  ################################################
Eingabe I
################################################# */

//f�r den Import der Swing-Klassen
import javax.swing.*;

public class Java07c_02_01 {
	public static void main(String[] args) {
		String eingabe;
		eingabe = JOptionPane.showInputDialog("Bitte machen Sie Ihre Eingabe.");
		System.out.println("Ihre Eingabe war: " + eingabe);
		// das Programm zur Sicherheit ausdr�cklich beenden
		System.exit(0);
	}
}