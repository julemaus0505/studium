package ticketverkauf;

import javax.swing.JFrame;

import ticketverkauf.controller.TicketverkaufController;

public class Ticketverkauf {

	public static void main(String[] args) {

		// Erzeugung eines neuen Dialoges
		JFrame meinJFrame = new JFrame();
		meinJFrame.setTitle("Saalpläne");
		meinJFrame.setSize(800, 800);

		TicketverkaufController controller = new TicketverkaufController();
		controller.init(meinJFrame);
		

		// Wir lassen unseren Dialog anzeigen
		meinJFrame.setVisible(true);
	}

}
