package java07c_01_01;

/*################################
 * Ein direkter Zugriff von au�en
 ################################*/

class Esel {
	boolean stur;
	int gewicht;
}

public class Java07c_01_01 {
	public static void main(String[] args) {
		//Instanz erzeugen
		Esel eselchen = new Esel();
		//den Wert von gewicht von au�en setzen
		eselchen.gewicht = 10;
		//den Wert von gewicht von au�en abrufen
		System.out.println("Der Esel wiegt " + eselchen.gewicht + " Kilo.");
		//stur von au�en setzen
		eselchen.stur = true;
		//den Wert von stur von au�en abfragen
		if (eselchen.stur == true)
			System.out.println("Der Esel ist stur.");
		else
			System.out.println("Der Esel ist nicht stur.");
		
		
	}
}

