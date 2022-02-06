package java10c_projekt07;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SplitContainer extends JFrame {
	// automatisch über Eclipse ergänzt
	private static final long serialVersionUID = -704158397513504524L;

	JSplitPane geteilt;
	JButton button1, button2;
	JLabel label1, label2;
	JPanel panel1, panel2;

	// der Konstruktor
	public SplitContainer(String titel) {
		super(titel);

		// die Labels
		label1 = new JLabel("Ich bin im linken Bereich");
		label2 = new JLabel("Ich bin im rechten Bereich");

		// die Buttons
		button1 = new JButton("Ich bin im linken Bereich");
		button2 = new JButton("Ich bin im rechten Bereich");

		// die Panels
		panel1 = new JPanel();
		panel1.add(button1);
		panel1.add(label1);

		panel2 = new JPanel();
		panel2.add(button2);
		panel2.add(label2);

		// die minimale Größe setzen
		// sie gibt auch vor, wie weit das Verkleinern möglich ist
		panel2.setMinimumSize(new Dimension(100, 100));

		// ein neues JSplitPane
		// die Komponenten werden nebeneinander angezeigt
		geteilt = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);

		// den Container hinzufügen
		add(geteilt);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
		setVisible(true);
	}
}
