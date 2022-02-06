package uebung_vererbung_11;

public class Schueler extends Menschen {

	private int klassenstufe;
	private int jahresbeitragsfaktor;

	public void setJahresbeitragsfaktor(int jahresbeitragsfaktor) {
		this.jahresbeitragsfaktor = jahresbeitragsfaktor;

	}

	public int getJahresbeitragsfaktor() {
		return jahresbeitragsfaktor;
	}

	public void setKlassenstufe(int klassenstufe) {
		this.klassenstufe = klassenstufe;
	}

	public int getKlassenstufe() {
		return klassenstufe;
	}

	public double jahresbeitragBerechen() {

		return 1.0 * getAlter() / klassenstufe * jahresbeitragsfaktor;

	}

}
