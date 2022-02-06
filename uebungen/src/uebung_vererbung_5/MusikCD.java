package uebung_vererbung_5;

public class MusikCD extends Produkt {

	private int laufzeit;
	private String interpreten;
	
	
	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}
	
	public int getLaufzeit() {
		return laufzeit;
		
	}
	
	public void setInterpreten(String interpreten) {
		this.interpreten = interpreten;
	}
	
	public String getInterpreten() {
		return interpreten;
		
	}
}
