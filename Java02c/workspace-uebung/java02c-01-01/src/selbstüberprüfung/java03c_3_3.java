package selbstüberprüfung;

import javax.swing.JOptionPane;

/*#########################################################
* break in einer Schleife
##########################################################*/

public class java03c_3_3 {

	public static void main(String[] args) {
		int i, k;
		boolean weiter = true;
		i = 0;
		k = 0;
		while ((i <= 5) && (weiter == true)) {
			//bitte in einer Zeile eingeben
			k = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine 1 zum Abbruch ein."));
			if (k == 1)
				weiter = false;
			else
				i++;
			}
		System.out.println("Schleife beendet.");
		System.exit(0);

	}

}
