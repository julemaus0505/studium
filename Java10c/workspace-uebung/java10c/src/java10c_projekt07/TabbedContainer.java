package java10c_projekt07;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedContainer extends JFrame {

	// automatisch über Eclipse eingefügt
	private static final long serialVersionUID = -2520149621519174702L;

	private JTabbedPane registerPanel;
	private JButton button1, button2;
	private JLabel label1, label2;
	private JPanel panel1, panel2;

	// der Konstruktor
	public TabbedContainer(String titel) {
		super(titel);

		// die Labels
		label1 = new JLabel("Ich bin auf dem ersten Register");
		label2 = new JLabel("Ich bin auf dem zweiten Register");

		// die Buttons
		button1 = new JButton("Ich bin auf dem ersten Register");
		button2 = new JButton("Ich bin auf dem zweiten Register");

		// die Panels
		panel1 = new JPanel();
		panel1.add(button1);
		panel1.add(label1);

		panel2 = new JPanel();
		panel2.add(button2);
		panel2.add(label2);

		// ein neues JTabbedPane
		registerPanel = new JTabbedPane();

		// die Register hinzufügen
		// übergeben werden die kompletten Panels
		registerPanel.add("Register 1", panel1);
		registerPanel.add("Register 2", panel2);

		// den Container hinzufügen
		add(registerPanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
		setVisible(true);
	}
}
