package uebung_vererbung_10;

public class Hund extends Tier {

	private int hechelfrequenz;

	public Hund(int hechelfrequenz) {
		super("Fifi");
		this.hechelfrequenz = hechelfrequenz;

	}

	public int getHechelfrequenz() {
		return hechelfrequenz;

	}

}
