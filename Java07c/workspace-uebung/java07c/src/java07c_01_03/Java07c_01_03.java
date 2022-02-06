/*##################################
 * Private und öffentliche Methoden
 ###################################*/
package java07c_01_03;

class Esel {
	//die Instanzvariablen sind jetzt nur für die Klasse selbst sichtbar
	private boolean stur;
	private int gewicht;
	
	//der öffentlich Konstruktor
	public Esel(boolean stur, int gewicht) {
		//der Aufruf der privaten set-Methoden
		setStur(stur);
		setGewicht(gewicht);
	}
	
	//die get- und set-Methoden sind jetzt privat
	//und können daher nur innerhalb der Klasse aufgerufen werden
	//die Methode setzt die Sturheit
	private void setStur(boolean stur) {
		this.stur = stur;
	}

	//die Methode liefert die Sturheit
	private boolean isStur() {
		return stur;
	}

	//die Methode setzt das Gewicht
	private void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	//die Methode liefert das Gewicht
	private int getGewicht() {
		return gewicht;
	}
	
	//eine neue öffentliche Methode essen()
	//der Esel wird schwerer und verliert seine Sturheit
	public void essen() {
		gewicht++;
		stur = false;
	}
	
	//eine neue öffentliche Methode, die die "Eseldaten" als String zurückgibt
	//die Daten werden dabei über die privaten Methoden beschafft
	public String datenLiefern() {
		String daten;
		daten = "Der Esel wiegt " + getGewicht() + " Kilo. Er ist";
		if (isStur() == false)
			daten = daten + " nicht stur.";
		else
			daten = daten + " stur";
		return daten;
	}
}

public class Java07c_01_03 {
	public static void main(String[] args) {
		//Instanz mit dem Konstruktor erzeugen
		Esel eselchen = new Esel(true, 10);
		//die "Eseldaten" ausgeben
		System.out.println(eselchen.datenLiefern());
		//der Esel isst
		eselchen.essen();
		//und noch einmal die "Eseldaten" ausgeben
		System.out.println(eselchen.datenLiefern());
	}
}

