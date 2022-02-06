package ticketverkauf.ui;

import java.awt.Color;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import net.miginfocom.swing.MigLayout;
import ticketverkauf.controller.TicketverkaufController;

public class TicketverkaufView {

	private TicketverkaufController ticketverkaufController;

	public TicketverkaufView(TicketverkaufController ticketverkaufController) {
		this.ticketverkaufController = ticketverkaufController;		
	}

	public void init(JFrame meinJFrame) {

		// Erzeugung eines JTabbedPane-Objektes
		JTabbedPane tabpane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		
		// Hier werden die JPanels als Registerkarten hinzugef�gt
//		tabpane.addTab("Saalplan Rot Ansicht", getPanelAnsicht(Color.RED));
//		tabpane.addTab("Saalplan Blau Ansicht", getPanelAnsicht(Color.BLUE));
//		tabpane.addTab("Saalplan Gelb Ansicht", getPanelAnsicht(Color.YELLOW));
//		tabpane.addTab("Saalplan Gr�n Ansicht", getPanelAnsicht(Color.GREEN));
		tabpane.addTab("Saalplan Entnehmen und Zur�cklegen", new PanelSaalNehmenUndZuruecklegen(ticketverkaufController));

		meinJFrame.add(tabpane);

	}

	private static JPanel getPanelAnsicht(Color farbe) {
		
		JPanel panelAnsicht = new JPanel();
		panelAnsicht.setLayout(new MigLayout());
		panelAnsicht.setBackground(farbe);

		return panelAnsicht;
	}

}