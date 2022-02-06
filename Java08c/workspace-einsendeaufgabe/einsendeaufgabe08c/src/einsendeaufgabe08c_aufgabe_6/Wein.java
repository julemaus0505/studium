package einsendeaufgabe08c_aufgabe_6;

/* ################################
 * Einsendeaufgabe Java08c Nummer 6
 ##################################*/

public class Wein {
	private int alter;
	private double grundpreis;

	public Wein(final int alter, final double grundpreis) throws IllegalArgumentException {
		if (alter < 0) {
			throw new IllegalArgumentException("Alter muss Größer oder gleich 0 sein."); 
				
		} else if (grundpreis > 9) {
			throw new IllegalArgumentException("Der Grundpreis muss kleiner oder gleich 9 sein.");
				
		} else {
			this.alter = alter;
			this.grundpreis = grundpreis;	
		}
	}
	
	public static void main(String[] args) {
	
		// Der Aufruf funktioniert
		new Wein(0,9);
		
		// Alter fehlerhaft
		try {
			new Wein(-1,7); 
			
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
		
		// Grundpreis fehlerhaft
		try {
			new Wein(0,10);
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
