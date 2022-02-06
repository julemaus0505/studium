package eigendeUebungListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Fenster extends JFrame {

	private JTextField name;
	private JTextField dieFrage;
	private JTextField dieAntwort;
	private JPasswordField passwortFeld1;
	private JPasswordField passwortFeld2;

	public Fenster() {
		super("Fenster Titel");
		setLayout(new FlowLayout());

		name = new JTextField(15);
		add(name);

		dieFrage = new JTextField("Was ist 3 + vier?");
		dieFrage.setEditable(false);
		add(dieFrage);

		dieAntwort = new JTextField("Gib die Antwort hier ein!");
		add(dieAntwort);

		passwortFeld1 = new JPasswordField(10);
		add(passwortFeld1);
		passwortFeld2 = new JPasswordField(10);
		add(passwortFeld2);

		DerHandler handler = new DerHandler();
		name.addActionListener(handler);
		dieAntwort.addActionListener(handler);
		passwortFeld1.addActionListener(handler);
		passwortFeld2.addActionListener(handler);
	}

	private class DerHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			String string = "";

			if (event.getSource() == name) {
				string = String.format("Name: %s", event.getActionCommand());

			} else if (event.getSource() == dieAntwort) {
				string = String.format("Antwort: %s", event.getActionCommand());
			} else if (event.getSource() == passwortFeld1) {
				string = String.format("PasswortFelde1: %s", event.getActionCommand());
			} else if (event.getSource() == passwortFeld2) {
				string = String.format("PasswortFeld2: %s", event.getActionCommand());

			}

			JOptionPane.showMessageDialog(null, string);
		}
	}
}
