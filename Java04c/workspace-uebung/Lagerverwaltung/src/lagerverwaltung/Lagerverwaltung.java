package lagerverwaltung;

import javax.swing.JOptionPane;

public class Lagerverwaltung {

	public static void main(String[] args) {

		// Mehrdimensionales Array erstellen
		int[][] kisten = new int[75][4];

		JOptionPane.showMessageDialog(null,
				"<html><h1 style='font-family: Calibri; font-size: 30pt; '>Willkommen in der Lagerverwaltung.");

		Object[] options = { "Eingabe einer neuen Kiste.", "L�schen der Daten einer vorhandenen Kiste.",
				"�ndern der Daten einer vorhandenen Kiste.", "Anzeigen der Daten einer vorhandenen Kiste." };
		Object choosenvalue = JOptionPane.showInputDialog(null, "Was wollen Sie tun?", "W�hlen Sie aus",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		
	}

}
