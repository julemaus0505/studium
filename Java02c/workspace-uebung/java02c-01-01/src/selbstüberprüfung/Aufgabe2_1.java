package selbst�berpr�fung;

import javax.swing.JOptionPane;

public class Aufgabe2_1 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Bitte Wert f�r x eingeben."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte Wert f�r y eingeben."));
		String ergebnis = vergleicheXgroesserY(x, y);
		JOptionPane.showInternalMessageDialog(null, ergebnis);
	}

	public static String vergleicheXgroesserY(int x, int y) {
		String ergebnis = null;

		if (x > y) {
			ergebnis = "X ist gr��er als Y.";
		} else if (y > x) {
			ergebnis = "Y ist gr��er als X.";
		} else if (y == x) {
			ergebnis = "Y und X sind gleich.";
		}
		return ergebnis;
	}

}
