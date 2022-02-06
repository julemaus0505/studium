package domain;

public class Lagerplatz {

	private final Lagerplatznummer lagerplatznummer;
	
	private Kiste reservierteKiste;

	private Kiste eingelagerteKiste = null;

	public Lagerplatz(Lagerplatznummer lagerplatznummer) {
		super();

		this.lagerplatznummer = lagerplatznummer;
	}

	public Lagerplatznummer einlagern(Kiste kiste ) {

	
		eingelagerteKiste = kiste;

		return lagerplatznummer;

	}

	public boolean isFrei() {
		// Wenn keine Kiste eingelagert ist dann ist der Lagerplatz frei
		if (eingelagerteKiste == null && reservierteKiste == null) {
			return true;
		} else {
			return false;
		}
	}

	public Kiste holen() {
		Kiste zuHolendeKiste = eingelagerteKiste;
		eingelagerteKiste = null;
		return zuHolendeKiste;

	}
	
	public boolean reservieren(Kiste kiste) {
		reservierteKiste = kiste;
		return true;
	}
	
	public Kiste zeigen() {
		
		return eingelagerteKiste;
	}
	
	@Override
	public boolean equals(Object obj) {
		//Mit dem Operator java instanceof wird getestet, ob das Objekt eine Instanz des angegebenen Typs ist (Klasse oder Unterklasse oder Schnittstelle).
		if(obj instanceof Lagerplatznummer ) {
			Lagerplatznummer vergleich = (Lagerplatznummer) obj; 
			return this.lagerplatznummer.getNummer() == vergleich.getNummer();
			
		} else if (obj instanceof Kiste) {
			Kiste vergleich = (Kiste) obj;
			return this.reservierteKiste != null && this.reservierteKiste.equals(vergleich);
		}
		
		return super.equals(obj);
	}
	
	public void austauschen() {
		
	}
	
	public void anzeigenDatenKiste() {
		
	}
		
}
