package eigendeUebungListener;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListenerUebung {
	
	private JFrame fenster = new JFrame();
	private String[] geschlecht = {"Mann" , "Frau"};
	private JLabel vornameLabel = new JLabel("Vorname");
	private JTextField vornameFeld = new JTextField();
	private JLabel nameLabel = new JLabel("Name");
	private JTextField nameFeld = new JTextField();
	private JButton anzeigenButton = new JButton("Anzeigen");
	
	JComboBox<String> geschlechtCmb = new JComboBox<String>(geschlecht);
	
	JLabel geschlechtLabel = new JLabel("Geschlecht");

	public ListenerUebung() {
		
		fenster.setLayout(new GridLayout());
		fenster.setSize(300, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 10, 10));
		fenster.add(panel);
		
		anzeigenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				ausgeben();
			}
		});
		
		geschlechtCmb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange() == ItemEvent.SELECTED) {
					ausgeben();					
				}
				
			}
		});
		
		panel.add(vornameLabel);
		panel.add(vornameFeld);
		panel.add(nameLabel);
		panel.add(nameFeld);
		panel.add(geschlechtLabel);
		panel.add(geschlechtCmb);
		panel.add(anzeigenButton);
		
		fenster.pack();
		fenster.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ListenerUebung();

	}
	
	private void ausgeben() {
		
		if((vornameFeld.getText() == null || vornameFeld.getText().isEmpty()) && (nameFeld.getText() == null || nameFeld.getText().isEmpty())) {
			JOptionPane.showMessageDialog(fenster, "Du bist ein niemand.");
		} else if (geschlechtCmb.getSelectedIndex()== 0) {
			JOptionPane.showMessageDialog(fenster, "Hallo Herr " + vornameFeld.getText()+ " " + nameFeld.getText() + ".");
		} else {
			JOptionPane.showMessageDialog(fenster, "Hallo Frau " + vornameFeld.getText()+ " " + nameFeld.getText() + ".");										
		}
		
	}
}
