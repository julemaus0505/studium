package domain;

public class Lagerplatznummer {

	private final int nummer;

	public Lagerplatznummer(int nummer) {
		super();
		this.nummer = nummer;
	}

	public int getNummer() {
		
		
		return nummer;
	}

	@Override
	public String toString() {
		return Integer.toString(nummer);
	}
}
