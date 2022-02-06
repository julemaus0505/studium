package uebungen_vererbung_3;

public class EntfesselterJagthund extends Jagdhund {

	private String blutdurst;

	public void setBlutdurst(String blutdurst) {
		this.blutdurst = blutdurst;
	}

	public String getBlutdurst() {
		return blutdurst;

	}

	@Override
	public void fass(String ziel) {
		System.out.println("Ich habe " + ziel + " ins Genick gebissen.");
	}

	public void zerfetze(int zeitdauer) {
		System.out.println("Gudio wird in " + zeitdauer + " zerfetzt.");
	}
}
