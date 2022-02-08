package minimail;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class NeueNachricht extends JDialog {

	// automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = -5496318621928815910L;

	// f�r die Eingabefelder
	private JTextField empfaenger;
	private JTextField betreff;
	private JTextArea inhalt;

	private String absenderEmail;
	private String password;

	// f�r die Schaltfl�chen
	private JButton ok;
	private JButton abbrechen;

	// die innere Klasse f�r den ActionListener
	class NeuListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf OK geklickt?
			if (event.getActionCommand().equals("senden")) {

				// dann die Daten �bernehmen
				senden();

				// wurde auf Abbrechen geklickt?
			} else if (event.getActionCommand().equals("abbrechen")) {

				// dann Dialog schlie�en
				dispose();
			}
		}
	}

	// der Konstruktor f�r Beantworten
	public NeueNachricht(JFrame parent, boolean modal, String absenderEmail, String password, String betreff,
			String inhalt, String empfaenger) {
		this(parent, modal, absenderEmail, password);
		this.absenderEmail = absenderEmail;

		setTitle("E-Mail beantworten");
		ok.setText("Beantworten");
		this.betreff.setText("AW:" + betreff);
		this.inhalt.setText("\n\n----- Text der urspr�nglichen Nachricht -----\n\n" + inhalt);
		this.empfaenger.setText(empfaenger);

	}

	// der Konstruktor f�r Weiterleiten
	public NeueNachricht(JFrame parent, boolean modal, String absenderEmail, String password, String betreff,
			String inhalt) {
		this(parent, modal, absenderEmail, password);

		setTitle("E-Mail weiterleiten");
		ok.setText("Weiterleiten");
		this.betreff.setText("WG:" + betreff);
		this.inhalt.setText("\n\n----- Text der urspr�nglichen Nachricht -----\n\n" + inhalt);

	}

	// der Konstruktor f�r Senden
	public NeueNachricht(JFrame parent, boolean modal, String absenderEmail, String password) {
		super(parent, modal);
		this.absenderEmail = absenderEmail;
		this.password = password;

		setTitle("Neue Nachricht");

		// die Oberfl�che erstellen
		initGui();

		// Standardoperation setzen
		// hier den Dialog ausblenden und l�schen
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	private void initGui() {
		setLayout(new BorderLayout());
		JPanel oben = new JPanel();
		oben.setLayout(new GridLayout(0, 2));
		oben.add(new JLabel("Empf�nger:"));
		empfaenger = new JTextField();
		oben.add(empfaenger);
		oben.add(new JLabel("Betreff:"));
		betreff = new JTextField();
		oben.add(betreff);
		add(oben, BorderLayout.NORTH);
		inhalt = new JTextArea();

		// den Zeilenumbruch aktivieren
		inhalt.setLineWrap(true);
		inhalt.setWrapStyleWord(true);

		// das Feld setzen wir in ein Scrollpane
		JScrollPane scroll = new JScrollPane(inhalt);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		add(scroll);

		JPanel unten = new JPanel();

		// die Schaltfl�chen
		ok = new JButton("Senden");
		ok.setActionCommand("senden");
		abbrechen = new JButton("Abbrechen");
		abbrechen.setActionCommand("abbrechen");

		NeuListener listener = new NeuListener();
		ok.addActionListener(listener);
		abbrechen.addActionListener(listener);

		unten.add(ok);
		unten.add(abbrechen);
		add(unten, BorderLayout.SOUTH);

		// anzeigen
		setSize(600, 300);

	}

	// die Methode verschickt die Nachricht
	private void senden() {

		// f�r die Sitzung
		Session sitzung;

		// die Verbindung herstellen
		sitzung = verbindungHerstellen();

		// die Nachricht verschicken und speichern
		nachrichtVerschicken(sitzung);
		nachrichtSpeichern();
	}

	private Session verbindungHerstellen() {

		// der Server
		String server = "smtp.gmail.com";

		// die Eigenschaften setzen
		Properties eigenschaften = new Properties();

		// die Authentifizierung �ber TLS
		eigenschaften.put("mail.smtp.auth", "true");
		eigenschaften.put("mail.smtp.starttls.enable", "true");

		// der Server
		eigenschaften.put("mail.smtp.host", server);

		// der Port zum Versenden
		eigenschaften.put("mail.smtp.port", "587");

		// das Session-Objekt erstellen
		Session sitzung = Session.getInstance(eigenschaften, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(absenderEmail, password);
			}
		});

		return sitzung;
	}

	private void nachrichtVerschicken(Session sitzung) {

		// der Absender
		String absender = "studium2022@gmx.de";

		try {

			// eine neue Nachricht vom Typ MimeMessage erzeugen
			MimeMessage nachricht = new MimeMessage(sitzung);

			// den Absender setzen
			nachricht.setFrom(new InternetAddress(absender));

			// den Empf�nger
			nachricht.setRecipients(Message.RecipientType.TO, InternetAddress.parse(empfaenger.getText()));

			// den Betreff
			nachricht.setSubject(betreff.getText());

			// und den Text
			nachricht.setText(inhalt.getText());

			// die Nachricht verschicken
			Transport.send(nachricht);

			JOptionPane.showMessageDialog(this, "Die Nachricht wurde verschickt.");

			// den Dialog schlie�en
			dispose();
		} catch (MessagingException exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}

	private void nachrichtSpeichern() {

		// f�r die Verbindung
		Connection verbindung;

		// die Datenbank �ffnen
		verbindung = MiniDBTools.oeffnenDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:mailDB");
		try {

			// einen Eintrag in der Tabelle empfangen anlegen
			// �ber ein vorbereitetes Statement
			PreparedStatement prepState;
			prepState = verbindung
					.prepareStatement("insert into gesendet (empfaenger, betreff, inhalt) values (?,?,?)");
			prepState.setString(1, empfaenger.getText());
			prepState.setString(2, betreff.getText());
			prepState.setString(3, inhalt.getText());

			// das Statement ausf�hren
			prepState.executeUpdate();
			verbindung.commit();

			// Verbindung schlie�en
			prepState.close();
			verbindung.close();

			// und die Datenbank schlie�en
			MiniDBTools.schliessenDB("jdbc:derby:");
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + exception.toString());
		}
	}
}
