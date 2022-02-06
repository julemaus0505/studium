package uebung_vererbung_5;

public class Produkt {

	private int artikelnummer;
	private String namen;
	private double nettopreis;

	public void setArtikelnummer(int artikelnummer) {
		this.artikelnummer = artikelnummer;
	}

	public int getArtikelnummer() {
		return artikelnummer;

	}

	public void setName(String name) {
		this.namen = name;
	}

	public String getName() {
		return namen;

	}

	public void setNettopreis(double nettopreis) {
		this.nettopreis = nettopreis;
	}

	public double getNettopreis() {
		return nettopreis;

	}

}
