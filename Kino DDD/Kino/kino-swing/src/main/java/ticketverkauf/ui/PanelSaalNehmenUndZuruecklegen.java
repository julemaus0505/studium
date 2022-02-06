package ticketverkauf.ui;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;
import ticketverkauf.controller.TicketverkaufController;
import ticketverkauf.domain.Saalplan;

public class PanelSaalNehmenUndZuruecklegen extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private TicketverkaufController ticketverkaufController;

	public PanelSaalNehmenUndZuruecklegen(TicketverkaufController ticketverkaufController) {
		
		this.ticketverkaufController = ticketverkaufController;
		this.setLayout(new MigLayout( "", "fill", ""));
		
		this.add(getPanelSaalAuswaehlen());
		
		this.add(getPanelSaalplanZurueckLegen(), "growx, pushx");
		
		
	}

	private JPanel getPanelSaalAuswaehlen() {
		
		JPanel panelSaalAuswaehlen = new JPanel();
		panelSaalAuswaehlen.setLayout(new MigLayout("insets 30 20 20 10"));
		
		JLabel labelSaalplanAuswaehlen = new JLabel("Saalplan Auswählen");
		panelSaalAuswaehlen.add(labelSaalplanAuswaehlen, "gap unrelated");
		
		JComboBox<Saalplan> cmbSaalplanAuswaehlen = new JComboBox<>();
		ComboBoxModel<Saalplan> model = new DefaultComboBoxModel<Saalplan>(ticketverkaufController.getSaalplaene());
		cmbSaalplanAuswaehlen.setModel(model);
//		cmbSaalplanAuswaehlen.addItem("Saalplan Rot");
//		cmbSaalplanAuswaehlen.addItem("Saalplan Blau");
//		cmbSaalplanAuswaehlen.addItem("Saalplan Gelb");
		
		panelSaalAuswaehlen.add(cmbSaalplanAuswaehlen, "wrap 3");
		
		JButton buttonSaalplanEntnehmen = new JButton("Saalplan Entnehmen");
		panelSaalAuswaehlen.add(buttonSaalplanEntnehmen, "span , grow");
		
		return panelSaalAuswaehlen;
	}
	
		
	private JPanel getPanelSaalplanZurueckLegen() {
		
		JPanel panelSaalplanZurueck = new JPanel();
		panelSaalplanZurueck.setLayout(new MigLayout("insets 30 20 20 10", "fill"));
		
		JLabel labelSaalZurueckLegen = new JLabel("Saalplan zurück legen ");
		panelSaalplanZurueck.add(labelSaalZurueckLegen, "gap unrelated");
		
		JTextField textFieldSaalplanZurueckLegen = new JTextField();
		panelSaalplanZurueck.add(textFieldSaalplanZurueckLegen, "pushx, growx, wrap 3");
		
		JButton buttonSaalplanZurueckLegen = new JButton("Saalplan wieder hinzufügen");
		panelSaalplanZurueck.add(buttonSaalplanZurueckLegen, "span , grow");
		
		return panelSaalplanZurueck;
		
	}
	
}
