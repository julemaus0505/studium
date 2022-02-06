package uebung_vererbung_11;

public class Klassensprecher extends Schueler {

	private int indiiduellenJahresbeitrag;

	public void setIndiiduellenJahresbeitrag(int indiiduellenJahresbeitrag) {
		this.indiiduellenJahresbeitrag = indiiduellenJahresbeitrag;
	}

	public int getIndiiduellenJahresbeitrag() {
		return indiiduellenJahresbeitrag;
	}

	public double indiiduellenJahresbeitragBerechen() {

		return 1.0 * getAlter() / getKlassenstufe() * getJahresbeitragsfaktor();

	}

}
