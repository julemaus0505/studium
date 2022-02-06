package ticketverkauf.model;

import ticketverkauf.domain.Saalplan;
import ticketverkauf.domain.SaalplanStapel;

public class TicketverkaufModel {

	
	private SaalplanStapel saalplanStapel;
	
	public void init() {
		
		saalplanStapel = new SaalplanStapel();
			
	}

	public Saalplan[] getSaalplaene() {
		return saalplanStapel.getSaalplaene();
	}
	
}
