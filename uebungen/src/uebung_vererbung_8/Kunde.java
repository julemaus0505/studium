package uebung_vererbung_8;

public class Kunde {

	private String name;
	private int kontonummer;

	public Kunde(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}

	public int getKontonummer() {
		return kontonummer;
	}

}
