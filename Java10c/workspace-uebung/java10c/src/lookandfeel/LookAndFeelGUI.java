package lookandfeel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class LookAndFeelGUI extends JFrame {

	// über Eclipse eingefügt
	private static final long serialVersionUID = -9146253307599598789L;

	// für die Look & Feels
	private String look1, look2;

	private JRadioButton button1, button2;
	private JLabel label;
	private JButton button;
	private JCheckBox checkBox1;
	private ButtonGroup gruppe;

	// die innere Klasse für die Listener
	class MeinListener implements ActionListener, ItemListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Beenden"))
				System.exit(0);
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			String look = null;

			if (button1.isSelected())
				look = look2;
			if (button2.isSelected())
				look = look1;
			// das Look & Feel setzen
			try {
				UIManager.setLookAndFeel(look);
			} catch (Exception ausnahme) {
			}
			// die Anzeige aktualisieren
			SwingUtilities.updateComponentTreeUI(LookAndFeelGUI.this);
		}
	}

	// der Konstruktor
	public LookAndFeelGUI(String titel) {
		super(titel);

		// Das System Look & Feel beschaffen
		look1 = UIManager.getSystemLookAndFeelClassName();
		// Das Standard Look & Feel beschaffen
		look2 = UIManager.getCrossPlatformLookAndFeelClassName();

		label = new JLabel("Das Aussehen lässt sich zur Laufzeit ändern.");
		button = new JButton("Beenden");

		checkBox1 = new JCheckBox("Ein Kontrollkästchen");
		// die ButtonGroup
		gruppe = new ButtonGroup();
		// für die RadioButtons
		button1 = new JRadioButton("Standard");
		button2 = new JRadioButton("Plattform");
		button1.setSelected(true);

		// die Gruppe bekommt ein eigenes Panel
		gruppe.add(button1);
		gruppe.add(button2);

		JPanel panelRadioButtons = new JPanel();
		panelRadioButtons.add(button1);
		panelRadioButtons.add(button2);

		// das Panel bekommt einen Rahmen mit Titel
		panelRadioButtons.setBorder(new TitledBorder("Look & Feel"));

		// die Komponenten hinzufügen
		// benutzt wird ein GridLayout
		setLayout(new GridLayout(0, 2, 20, 20));
		add(label);
		add(panelRadioButtons);
		add(checkBox1);
		add(button);

		// den Listener verbinden
		MeinListener listener = new MeinListener();
		button.addActionListener(listener);
		button1.addItemListener(listener);
		button2.addItemListener(listener);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// packen und anzeigen
		pack();
		setVisible(true);
	}
}
