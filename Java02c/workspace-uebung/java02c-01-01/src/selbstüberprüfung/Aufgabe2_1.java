package selbstüberprüfung;

import javax.swing.JOptionPane;

public class Aufgabe2_1 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Bitte Wert für x eingeben."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Bitte Wert für y eingeben."));
		String ergebnis = vergleicheXgroesserY(x, y);
		JOptionPane.showInternalMessageDialog(null, ergebnis);
	}

	public static String vergleicheXgroesserY(int x, int y) {
		String ergebnis = null;

		if (x > y) {
			ergebnis = "X ist größer als Y.";
		} else if (y > x) {
			ergebnis = "Y ist größer als X.";
		} else if (y == x) {
			ergebnis = "Y und X sind gleich.";
		}
		return ergebnis;
	}

}
