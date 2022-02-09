package minimail;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Anzeige extends JDialog {

	// automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = 7637369405383432965L;

	// f�r die Eingabefelder
	private JTextField empfaengerTextField;
	private JTextField betreffTextField;
	private JTextArea inhaltTextArea;

	// f�r die Schaltfl�chen
	private JButton okButton;

	// die innere Klasse f�r den ActionListener
	class NeuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf OK geklickt?
			if (event.getActionCommand().equals("ok")) {

				// dann Dialog schlie�en
				dispose();
			}
		}
	}

	// der Konstruktor
	public Anzeige(JFrame parent, boolean modal, String ID, String empfaenger, String betreff, String inhalt) {
		super(parent, modal);
		setTitle("Anzeige");

		// die Oberfl�che erstellen
		initGui(ID, empfaenger, betreff, inhalt);

		// Standardoperation setzen
		// hier den Dialog ausblenden und l�schen
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	// initGui Methode f�r die Grafik
	private void initGui(String iD, String empfaenger, String betreff, String inhalt) {
		setLayout(new BorderLayout());
		JPanel oben = new JPanel();
		oben.setLayout(new GridLayout(0, 2));
		oben.add(new JLabel("Empf�nger:"));
		empfaengerTextField = new JTextField(empfaenger);
		oben.add(empfaengerTextField);
		oben.add(new JLabel("Betreff:"));
		betreffTextField = new JTextField(betreff);
		oben.add(betreffTextField);
		add(oben, BorderLayout.NORTH);
		inhaltTextArea = new JTextArea(inhalt);

		// den Zeilenumbruch aktivieren
		inhaltTextArea.setLineWrap(true);
		inhaltTextArea.setWrapStyleWord(true);

		// das Feld setzen wir in ein Scrollpane
		JScrollPane scroll = new JScrollPane(inhaltTextArea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scroll);

		// die Felder k�nnen nicht bearbeitet werden
		empfaengerTextField.setEditable(false);
		betreffTextField.setEditable(false);
		inhaltTextArea.setEditable(false);
		JPanel unten = new JPanel();

		// die Schaltfl�che
		okButton = new JButton("OK");
		okButton.setActionCommand("ok");

		NeuListener listener = new NeuListener();
		okButton.addActionListener(listener);

		unten.add(okButton);
		add(unten, BorderLayout.SOUTH);

		// anzeigen
		setSize(600, 300);
		setVisible(true);
	}
}
