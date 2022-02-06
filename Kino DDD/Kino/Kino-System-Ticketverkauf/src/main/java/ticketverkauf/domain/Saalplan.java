package ticketverkauf.domain;

public class Saalplan {
	
	private final String saalFarbe; 
	
	public Saalplan(String saalFarbe) {
		this.saalFarbe = saalFarbe;
	}
	
	public void markierePlatz(Platz zuMarkierenderPlatz) {
		
	}
	
	public Platz suchePlatz() {
		
		
		return null;
		
	}
	
	public String getSaalFarbe() {
		return saalFarbe;
	}
	
	@Override
	public String toString() {
		
		return "Saalplan " + saalFarbe;
	}
}
