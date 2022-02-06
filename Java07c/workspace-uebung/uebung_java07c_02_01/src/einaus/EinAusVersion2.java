package einaus;

import javax.swing.JOptionPane;

public class EinAusVersion2 {

	private String eingabe;

	public void einlesen() {
		eingabe = JOptionPane.showInputDialog("Geben sie etwas ein?");
	}
	
	public void ausgeben() {
		System.out.println("Das haben sie eingegeben: " + eingabe);
	}
	
	
}
