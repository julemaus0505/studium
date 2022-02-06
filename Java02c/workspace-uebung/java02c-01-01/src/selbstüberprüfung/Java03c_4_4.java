package selbstüberprüfung;


//für die Eingabe
import javax.swing.*;

public class Java03c_4_4 {
	static int produkt(int x, int y) {
		return (x * y);
	}
	public static void main(String[] args) {
		int einVariable1, einVariable2;
		//bitte jeweils in einer Zeile eingeben
		einVariable1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie den Wert für Zahl 1 ein:"));
		einVariable2 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie den Wert für Zahl 2 ein:"));
		System.out.println("Das Produkt der Zahlen ist " +
		produkt(einVariable1, einVariable2));
		System.exit(0);

	}

}
