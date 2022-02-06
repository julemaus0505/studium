package uebung_vererbung_10;

public class Hoellenhund extends Daemonenhund {

	private int verderbtheitsfaktor;
	private int gefaehrlichkeit;

	public Hoellenhund(int verderbtheitsfaktor, int anzahlSeelen, int hechelfrequenz) {
		super(anzahlSeelen, hechelfrequenz);
		this.gefaehrlichkeit = getgefaehrlichkeit();
		this.verderbtheitsfaktor = verderbtheitsfaktor;
		gefaehrlichkeit = verderbtheitsfaktor * getVerderbtheit();

	}

	@Override
	public int getVerderbtheit() {

		return 17;
	}

	public int getgefaehrlichkeit() {
		return gefaehrlichkeit;

	}

	public int getVerderbtheitsfaktor() {
		return verderbtheitsfaktor;

	}

}
