
/*##################################
 * Zugriff �ber �ffentliche Methoden
 ###################################*/
package java07c_01_02;

class Esel {
	//die Instanzvariablen sind jetzt nur f�r die Klasse selbst sichtbar
	
	private boolean stur;
	private int gewicht;
	
	public boolean isStur() {
		return stur;
	}
	public void setStur(boolean stur) {
		this.stur = stur;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

}

public class Java07c_01_02 {
	public static void main(String[] args) {
		//Instanz erzeugen
		Esel eselchen = new Esel();
		//den Wert von gewicht �ber die Methode setzen
		eselchen.setGewicht(10);
		//den Wert von gewicht �ber die Methode abrufen
		System.out.println("Der Esel wiegt " + eselchen.getGewicht() + " Kilo.");
		//die Sturheit �ber die Methode setzen
		eselchen.setStur(true);
		//den Wert von stur von au�en abfragen
		if (eselchen.isStur() == true)
			System.out.println("Der Esel ist stur.");
		else
			System.out.println("Der Esel ist nicht stur.");
	}
}
