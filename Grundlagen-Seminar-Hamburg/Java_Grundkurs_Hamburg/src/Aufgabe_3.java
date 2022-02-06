import javax.swing.JOptionPane;

public class Aufgabe_3 {

	public static void main(String[] args) {
		
		//die Variablen
	    //hier ist die korrekte Initialisierung wichtig
		int zahl = 1, summe = 0, zaehler = 0;
		float mittelwert; 
		
		//die Zahlen einlesen
		while (zahl != 0) {
			zahl = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein."));
			
			//die Summe fortlaufend berechnen
			summe = summe + zahl;
			
			//den Zähler erhöhen
			zaehler++;
		}
		
		//den Mittelwert berechnen
	    //der kann auch Nachkommastellen haben, daher ist ein Casting erforderlich
	    //die Berechnung erfolgt aber nur dann, wenn mindestens eine Zahl eingegeben wurde
	    //zaehler ist um 1 zu groß und muss daher vor der Berechnung wieder reduziert werden
		if (zaehler != 1) {
			zaehler = zaehler -1;
			mittelwert = (float) summe / zaehler;
			 System.out.println("Sie haben " + zaehler + " Zahlen eingegeben.");
		     System.out.println("Die Summe der Zahlen beträgt " + summe);
		     System.out.println("Der Mittelwert beträgt " + mittelwert);
		}
		

	}

}
