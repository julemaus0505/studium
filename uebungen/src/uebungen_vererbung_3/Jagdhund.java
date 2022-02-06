package uebungen_vererbung_3;

public class Jagdhund extends Hund {

	private int geschwindigkeit;

	public void setGeschwindigkeit(int geschwindigkeit) {
		this.geschwindigkeit = geschwindigkeit;
	}

	public int getGeschwindigkeit() {
		return geschwindigkeit;

	}

	public void fass(String ziel) {
		System.out.println("Ich habe " + ziel + " geschnappt");
	}

}
