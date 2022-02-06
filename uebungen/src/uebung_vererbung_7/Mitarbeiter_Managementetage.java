package uebung_vererbung_7;

public class Mitarbeiter_Managementetage extends Mitarbeiter {

	private double bonus = 1299.00;

	public double getBonus() {
		return bonus;
	}

	public void zahleBonus(double bonus) {
		System.out.println("Sie bekommen " + bonus + " Euro und kaufen sich ein neues Haus.");
	}

	public void holePersonalnummer(String nachname) {
		System.out.println("Mitarbeiter " + nachname + " nicht verfügbar.");

	}
}
