package uebung_vererbung_10;

public class Daemonenhund extends Hund {

	private int verderbtheit;
	private int anzahlSeelen;

	public Daemonenhund(int hechelfrequenz, int anzahlSeelen) {
		super(hechelfrequenz);
		this.anzahlSeelen = anzahlSeelen;
		verderbtheit = anzahlSeelen * hechelfrequenz;
	}

	public int getVerderbtheit() {
		return verderbtheit;
	}

	public int getAnzahlSeelen() {
		return anzahlSeelen;
	}

}
