package selbstüberprüfung;

//für die Eingabe
import javax.swing.*;

	public class Java03c_4_5 {
		static int produkt(int x, int y) {
			return x * y;
}
		static int quadrat(int x) {
			return produkt(x,x);
}
		public static void main(String[] args) {
			int einVariable1;
			//bitte jeweils in einer Zeile eingeben
			einVariable1 = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:"));
			System.out.println("Das Quadrat der Zahl ist " + quadrat(einVariable1));
			System.exit(0);

	}
}
	
	
	
