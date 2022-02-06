package uebungen_vererbung_6;

public class Pizza {

	protected String name;
	protected float preis;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setPreis(float preis) {
		this.preis = preis;
	}

	public float getPreis() {
		return preis;
	}
	
	

	@Override
	public String toString() {

		return name + " Preis " + preis + " €";
	}


}
