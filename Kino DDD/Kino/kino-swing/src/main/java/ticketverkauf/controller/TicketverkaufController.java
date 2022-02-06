package ticketverkauf.controller;

import javax.swing.JFrame;

import ticketverkauf.domain.Saalplan;
import ticketverkauf.model.TicketverkaufModel;
import ticketverkauf.ui.TicketverkaufView;

public class TicketverkaufController {

	private TicketverkaufModel model;

	public void init(JFrame meinJFrame) {
		
		model = new TicketverkaufModel();
		model.init();
		
		TicketverkaufView view = new TicketverkaufView(this);
		view.init(meinJFrame);
		
		
	}

	public Saalplan[] getSaalplaene() {
		
		return model.getSaalplaene();
	}

}
