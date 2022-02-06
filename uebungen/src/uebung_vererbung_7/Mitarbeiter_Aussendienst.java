package uebung_vererbung_7;

public class Mitarbeiter_Aussendienst extends Mitarbeiter {

	private int aussenkontakte;
	private String marke;

	public void setAussenkontakte(int aussenkontakte) {
		this.aussenkontakte = aussenkontakte;
	}

	public int getAussenkontakte() {
		return aussenkontakte;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getMarke() {
		return marke;
	}

	public void fahreMitDienstwagen(String marke) {
		System.out.println("Sie fahren mit einem Dienstwagen der Marke " + marke + " .");
	}

}
