import javax.swing.JOptionPane;

public class Aufgabe_1_und_Erweiterung_1 {

	public static void main(String[] args) {

		// Konstantzen
		final int steuer = 19, aufschlag = 5;

		// Variablen
		float preisGesamt, preisNetto, preisBrutto;

		// Quadratmeter berechnen
		int laenge = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die L�nge ein:"));
		int breite = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie die Breite ein:"));
		int flaeche = laenge * breite;
		System.out.println("Das Grundst�ck ist " + flaeche + " qm gross.");

		// die Preise berechnen
		float preis = Float.parseFloat(JOptionPane.showInputDialog("Geben Sie den Preis pro qm ein:"));
		preisGesamt = flaeche * preis;
		System.out.println("Der Preis f�r das Grundst�ck betr�gt: " + preisGesamt + " �");

		// der Nettopreis mit Aufschlag
		preisNetto = preisGesamt + ((preisGesamt / 100) * aufschlag);
		System.out.println("Der Nettopreis mit Aufschlag betr�gt " + preisNetto + " � ");

		// der Brutto-Preis mit Steuer
		preisBrutto = preisGesamt + ((preisGesamt / 100) * steuer);
		System.out.println("Der Bruttopreis betr�gt " + preisBrutto + " � ");
	}

}
