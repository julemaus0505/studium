package ticketverkauf.domain;

import java.util.ArrayList;
import java.util.List;

public class SaalplanStapel {
	
	private List<Saalplan> saalplaene; 

	public SaalplanStapel() {
		saalplaene = new ArrayList<Saalplan>();
		
		// Normalerweise würden die Saalpläne aus einer Datenbabnk geladen werden, hier erstellen wir Sie manuell.
		
		Saalplan saalplanRot = new Saalplan("Rot");
		saalplaene.add(saalplanRot);
		Saalplan saalplanBlau = new Saalplan("Blau");
		saalplaene.add(saalplanBlau);
		Saalplan saalplanGelb = new Saalplan("Gelb");
		saalplaene.add(saalplanGelb);
	}
	
	public void zuruecklegen(Saalplan saalplan) {
		saalplaene.add(saalplan);
	} 
	
	public Saalplan holtSaalplan(Vorstellung vorstellung) {
		if (saalplaene.contains(vorstellung.getSaalplan())) {
			saalplaene.remove(vorstellung.getSaalplan());
			return vorstellung.getSaalplan();
		
		} else {
			return null;
		}
	}

	public Saalplan[] getSaalplaene() {
		return saalplaene.toArray(new Saalplan[] {});
	}
}
