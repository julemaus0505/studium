package domain;



public class Kiste {
	
	private double breite;
	
	private double laenge;
	
	private double hoehe;

	public Kiste(double breite, double laenge, double hoehe) {
		super();
		this.breite = breite;
		this.laenge = laenge;
		this.hoehe = hoehe;
		
	}
	

	public double getBreite() {
		return breite;
	}

	public double getLaenge() {
		return laenge;
	}

	public double getHoehe() {
		return hoehe;
	}

	@Override
	public String toString() {
		
		return String.format(" B x L x H : %.2f x %.2f x %.2f", breite, laenge, hoehe);
	}

}
