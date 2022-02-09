package minimail;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import net.miginfocom.swing.MigLayout;

public class MiniMailStart extends JFrame {

	// automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = 3610196939297879702L;

	// Klassenvariabel f�r den den Login erstellt
	private String email;
	private String password;

	// die innere Klasse f�r den ActionListener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf Senden geklickt?
			if (event.getActionCommand().equals("senden")) {

				// dann das Senden starten
				senden();

				// wurde auf Empfangen geklickt?
			} else if (event.getActionCommand().equals("empfangen")) {

				// dann das Empfangen starten
				empfangen();

				// wurde auf E-Mails L�schen geklickt?
			} else if (event.getActionCommand().equals("emailLoeschen")) {

				// dann das E-Mail l�schen starten
				loescheEmail();

				// wurde auf Benutzer L�schen geklickt?
			} else if (event.getActionCommand().equals("benutzerLoeschen")) {

				// dann das E-Mail l�schen starten
				loescheBenutzer();

				// wurde auf Beenden geklickt?
			} else if (event.getActionCommand().equals("ende")) {

				// dann beenden
				beenden();
			}
		}

	}

	// der Konstruktor
	public MiniMailStart(String titel, String email, String password) {
		super(titel);
		this.email = email;
		this.password = password;

		// ein MigLayout
		setLayout(new MigLayout("w 350, h 250", "[center, 50%][center, 50%]"));

		// Label f�r die Schaltfl�chen
		JLabel programmLabel = new JLabel("E-Mail Programm");
		programmLabel.setFont(new Font("Arial", 30, 30));

		// die Schaltfl�chen und Labels
		JLabel sendenLabel = new JLabel("Senden");
		JButton sendenButton = new JButton("Senden");
		sendenButton.setActionCommand("senden");
		JLabel empfangenLabel = new JLabel("Empfangen");
		JButton empfangenButton = new JButton("Empfangen");
		empfangenButton.setActionCommand("empfangen");
		JLabel emailLoeschenLabel = new JLabel("E-Mails L�schen");
		JButton emailsLoeschenButton = new JButton("E-Mails L�schen");
		emailsLoeschenButton.setActionCommand("emailLoeschen");
		JLabel benutzerLoeschenLabel = new JLabel("Benutzer L�schen");
		JButton benutzerLoeschenButton = new JButton("Benutzer L�schen");
		benutzerLoeschenButton.setActionCommand("benutzerLoeschen");
		JButton beendenButton = new JButton("Beenden");
		beendenButton.setActionCommand("ende");

		MeinListener listener = new MeinListener();
		sendenButton.addActionListener(listener);
		empfangenButton.addActionListener(listener);
		emailsLoeschenButton.addActionListener(listener);
		benutzerLoeschenButton.addActionListener(listener);
		beendenButton.addActionListener(listener);

		add(programmLabel, "spanx, center,wrap 30");
		add(sendenLabel);
		add(empfangenLabel, "wrap ");
		add(sendenButton, "growx");
		add(empfangenButton, "growx, wrap ");
		add(emailLoeschenLabel);
		add(benutzerLoeschenLabel, "wrap ");
		add(emailsLoeschenButton, "growx");
		add(benutzerLoeschenButton, "growx,wrap ");
		add(beendenButton, "growx,spanx");

		// Gr��e setzen, Standardverhalten festlegen und anzeigen
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	// die Dummy-Methoden
	private void senden() {
		new Senden(email, password);
	}

	private void empfangen() {
		new Empfangen(email, password);
	}

	// Bei Methode hier wird erst abgefragt, ob sie die Benutzer l�schen wollen,
	// wenn ja, dann werden die Benutzer gel�scht
	private void loescheBenutzer() {
		if (JOptionPane.showConfirmDialog(this, "M�chten Sie die Benutzer l�schen") == JOptionPane.YES_OPTION) {
			MailDBManager.fuehreSqlUpdateAus("DELETE FROM benutzer");
		}
	}

	// Bei Methode hier wird erst abgefragt, ob sie die Empfangenen und gesendeten
	// E-Mails l�schen wollen, wenn ja, dann werden die E-Mails gel�scht
	private void loescheEmail() {
		if (JOptionPane.showConfirmDialog(this,
				"M�chten Sie die Empfangenen und gesendeten E-Mails l�schen") == JOptionPane.YES_OPTION) {
			MailDBManager.fuehreSqlUpdateAus("DELETE FROM empfangen");
			MailDBManager.fuehreSqlUpdateAus("DELETE FROM gesendet");
		}
	}

	// Programm beenden
	private void beenden() {
		System.exit(0);
	}
}
