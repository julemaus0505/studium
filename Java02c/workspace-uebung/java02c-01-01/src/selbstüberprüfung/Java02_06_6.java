package selbstüberprüfung;

import javax.swing.JOptionPane;

public class Java02_06_6 {

	public static void main(String[] args) {
		//für die Eingabe
		int eingabe1;
		double  eingabe2, eingabe3;
		//für das Ergebnis
		double ergebnis;
		//den int-Wert einlesen
		//bitte jeweils in einer Zeile eingeben
		eingabe1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die erste Zahl ein:"));
		//bitte die beiden double Werte einlesen
		eingabe2 = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die zweite Zahl ein:"));
		eingabe3 = Double.parseDouble(JOptionPane.showInputDialog("Bitte geben Sie die dritte Zahl ein:"));
		//das Ergebnis berechnen und ausgeben
		ergebnis = eingabe1 + eingabe2 + eingabe3;
		//bitte in einer Zeile eingeben
		System.out.println("Das Ergebnis der Addition ist " + ergebnis);
		System.exit(0);

	}

}
