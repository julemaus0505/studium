package minimail;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class MiniMailStart extends JFrame {

	// automatisch über Eclipse erzeugt
	private static final long serialVersionUID = 3610196939297879702L;

	// Klassenvariabel für den den Login erstellt
	private String email;
	private String password;

	// die innere Klasse für den ActionListener
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

				// wurde auf E-Mails Löschen geklickt?
			} else if (event.getActionCommand().equals("emailLoeschen")) {

				// dann das E-Mail löschen starten
				loescheEmail();

				// wurde auf Benutzer Löschen geklickt?
			} else if (event.getActionCommand().equals("benutzerLoeschen")) {

				// dann das E-Mail löschen starten
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

		// ein FlowLayout
		setLayout(new MigLayout("w 350, h 250", "[center, 50%][center, 50%]"));

		// Label für die Schaltflächen
		JLabel programm = new JLabel("E-Mail Programm");
		programm.setFont(new Font("Arial", 30, 30));

		// die Schaltflächen
		JLabel sendenLabel = new JLabel("Senden");
		JButton sendenButton = new JButton("Senden");
		sendenButton.setActionCommand("senden");
		JLabel empfangenLabel = new JLabel("Empfangen");
		JButton empfangenButton = new JButton("Empfangen");
		empfangenButton.setActionCommand("empfangen");
		JLabel emailLoeschenLabel = new JLabel("E-Mails Löschen");
		JButton emailsLoeschenButton = new JButton("E-Mails Löschen");
		emailsLoeschenButton.setActionCommand("emailLoeschen");
		JLabel benutzerLoeschenLabel = new JLabel("Benutzer Löschen");
		JButton benutzerLoeschenButton = new JButton("Benutzer Löschen");
		benutzerLoeschenButton.setActionCommand("benutzerLoeschen");
		JButton beenden = new JButton("Beenden");
		beenden.setActionCommand("ende");

		MeinListener listener = new MeinListener();
		sendenButton.addActionListener(listener);
		empfangenButton.addActionListener(listener);
		emailsLoeschenButton.addActionListener(listener);
		benutzerLoeschenButton.addActionListener(listener);
		beenden.addActionListener(listener);

		add(programm, "spanx, center,wrap 30");
		add(sendenLabel);
		add(empfangenLabel, "wrap ");
		add(sendenButton, "growx");
		add(empfangenButton, "growx, wrap ");
		add(emailLoeschenLabel);
		add(benutzerLoeschenLabel, "wrap ");
		add(emailsLoeschenButton, "growx");
		add(benutzerLoeschenButton, "growx,wrap ");
		add(beenden, "growx,spanx");

		// Größe setzen, Standardverhalten festlegen und anzeigen
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

	private void loescheBenutzer() {
		
		MailDBManager.fuehreSqlUpdateAus("DELETE FROM benutzer");

	}

	private void loescheEmail() {
		MailDBManager.fuehreSqlUpdateAus("DELETE FROM empfangen");

	}

	private void beenden() {
		System.exit(0);
	}
}
