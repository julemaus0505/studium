package uebung_vererbung_8;

public class Bundespraesident extends Kunde {

	private int rabattProzent;

	public int getRabattProzent() {
		return rabattProzent;

	}

	public Bundespraesident(String name, int rabattProzent) {
		super(name);
		this.rabattProzent = rabattProzent;
	}

}
