package java08c_01_04;

/*#########################
 * Die Klasse für den Wein 
 #########################*/

public class Wein {
	private int alter;
	private double grundpreis;
	private double preisProFlasche;
	
	//der Standardkonstruktor
	public Wein() {
		this.alter = 1;
		this.grundpreis = 10;
	}
	
	//der Konstruktor setzt das Alter
	//der Preis erhält einen Standardwert
	public Wein(int alter) {
		this.alter = alter;
		this.grundpreis = 10;
	}
	
	//der Konstruktor setzt den Preis
	//das Alter erhält einen Standardwert
	public Wein(double grundpreis) {
		this.alter = 1;
		this.grundpreis = grundpreis;
	}
	
	//der Konstruktor setzt das Alter und den Grundpreis
	public Wein(int alter, double grundpreis) {
		this.alter = alter;
		this.grundpreis = grundpreis;
	}
	
	//die Methode berechnet den Preis pro Flasche
	public void preisBerechnen() {
		preisProFlasche = alter * grundpreis;
	}
	
	//die Methode liefert den Preis pro Flasche
	public double getPreisProFlasche() {
		preisBerechnen();
		return preisProFlasche;
	}
}

