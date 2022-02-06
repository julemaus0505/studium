package abstrakteKlassenBaum;

public class Laubbaum extends Baum {

	private int anzahlBlaetter;

	public int getAnzahlBlaetter() {
		return anzahlBlaetter;

	}

	public String getStandort() {
		return bevorzugterStandort;

	}

	public void setStandort(String standort) {
		this.bevorzugterStandort = standort;
	}

	@Override
	public void photosyntheseBeteiben() {

	}

}
