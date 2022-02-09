package minimail;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

/**
 * Teilaufgabe 1
 * 
 * Diese Klasse stellt die Registrierungsfunktion zur Verf�gung. Sofern der
 * Benutzer sich erfolgreich registrieren konnte wird das Programm ge�ffnet. Die
 * Funktion enth�lt ebenfalls eine �berpr�fung um doppelte Registrierungen zu
 * verhindern.
 *
 * @author Julia Petersen
 */
public class Registrieren {

	// Klassenvariablen
	private JButton registrierenButton;
	private JTextField emailTextField;
	private JPasswordField passwordField;
	private JPasswordField passwortWiederholenPasswordField;
	private JFrame registrierenFenster;

	/**
	 * Die Methode zeigt das Registrierungsfenster an.
	 * 
	 * @param loginFenster wiederanzeigen des Loginfensters nach Abbruch der
	 *                     Registrierung
	 */
	public void zeigeRegistrierenFenster(JFrame loginFenster) {
		registrierenFenster = new JFrame("Registrieren");
		registrierenFenster.setLayout(new MigLayout("w 300, h 300"));
		registrierenFenster.setResizable(false);

		// f�r die Anzeige wo das Fenster angezeigt wird
		final Dimension dimension = registrierenFenster.getToolkit().getScreenSize();
		registrierenFenster.setLocation((int) ((dimension.getWidth() - registrierenFenster.getWidth()) / 5),
				(int) ((dimension.getHeight() - registrierenFenster.getHeight()) / 5));

		// JLabel erstellt
		JLabel registrierenLabel = new JLabel("JETZT REGISTRIEREN");
		JLabel emailLabel = new JLabel("Email adreese eingeben...");
		JLabel passwortLabel = new JLabel("Bitte Passwort eingeben...");
		JLabel passwortWiederholenLabel = new JLabel("Bitte Passwort wiederholen...");

		// JButton erstellt
		JButton abbrechenButton = new JButton("Abbrechen");

		// Label die Gr��e und die Textfarbe ge�ndert
		registrierenLabel.setFont(new Font("Arial", 15, 15));
		passwortLabel.setForeground(Color.WHITE);
		emailLabel.setForeground(Color.WHITE);
		passwortWiederholenLabel.setForeground(Color.WHITE);

		// Layout dem TextField hinzugef�gt und den Focus �ber den FocusListenner
		// gesetzt
		emailTextField = new JTextField("", 30);
		emailTextField.addFocusListener(getPruefeTextFieldListener());
		passwordField = new JPasswordField("", 30);
		passwordField.addFocusListener(getPruefeTextFieldListener());
		passwortWiederholenPasswordField = new JPasswordField("", 30);
		passwortWiederholenPasswordField.addFocusListener(getPruefeTextFieldListener());

		// ToolTip erstellt
		emailTextField.setToolTipText("Hier bitte die Email adresse eingeben.");
		passwordField.setToolTipText("Bitte Passwort eingeben");
		passwortWiederholenPasswordField.setToolTipText("Bitte Passwort wiederholen");

		// solange die Textfelder noch leer sind wird der Button ausgegraut
		registrierenButton = new JButton("Registrieren");
		registrierenButton.setEnabled(false);

		// Label und Fenster farbe genetzt
		registrierenLabel.setForeground(Color.WHITE);
		registrierenFenster.getContentPane().setBackground(Color.DARK_GRAY);

		registrierenButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent event) {

				// Eintrag in die Datenbank
				if (pruefeBenutzereingaben()) {
					int naechsteId = MailDBManager.getNaechsteId("benutzer");
					MailDBManager.fuehreSqlUpdateAus(
							String.format("INSERT INTO benutzer (id, email, passwort) VALUES (%d, '%s', '%s')",
									naechsteId, emailTextField.getText(), passwordField.getText()));
					JOptionPane.showMessageDialog(registrierenFenster, "Willkommen die Registrierung hat geklappt.");
					new MiniMailStart("MiniMail", emailTextField.getText(), passwordField.getText());
					registrierenFenster.setVisible(false);
				}
			}
		});

		// Abbrechen Button Login Fenster wird ge�ffnet und das Registrieren Fenster
		// wird geschlossen
		abbrechenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginFenster.setVisible(true);
				registrierenFenster.setVisible(false);

			}
		});

		// dem RegistrierenFenster die Komponenten hinzuf�gen
		registrierenFenster.add(registrierenLabel, "spanx, center,wrap 10");
		registrierenLabel.setFont(new Font("Arial", 20, 20));
		registrierenFenster.add(emailLabel, "spanx,wrap 10");
		registrierenFenster.add(emailTextField, "width :250:, wrap");
		registrierenFenster.add(passwortLabel, "spanx,wrap 10");
		registrierenFenster.add(passwordField, "width :250:, wrap");
		registrierenFenster.add(passwortWiederholenLabel, "spanx,wrap 10");
		registrierenFenster.add(passwortWiederholenPasswordField, "width :250:, wrap");
		registrierenFenster.add(registrierenButton, "split 2");
		registrierenFenster.add(abbrechenButton, "growx");
		registrierenFenster.pack();
		registrierenFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registrierenFenster.setVisible(true);
	}

	/**
	 * Erstellt einen {@link FocusListener} um zu pr�fen ob die Eingabefelder
	 * gef�llt sind.
	 * 
	 * @return Erstelltes {@link FocusListener} - Objekt
	 */
	private FocusListener getPruefeTextFieldListener() {

		return new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent event) {
				if (emailTextField.getText().isEmpty() || passwordField.getText().isEmpty()
						|| passwortWiederholenPasswordField.getText().isEmpty()) {
					registrierenButton.setEnabled(false);

				} else {
					registrierenButton.setEnabled(true);
					registrierenButton.requestFocus();
				}
			}
		};
	}

	/**
	 * Die Methode pr�ft die Benutzereingaben: <br>
	 * email: g�ltige Syntax und ob bereits in der Datenbank vorhanden <br>
	 * password: sind die Passw�rter identisch <br>
	 * 
	 * @return true: wenn Eingaben OK <br>
	 *         false: wenn Eingaben fehlerhaft
	 */
	@SuppressWarnings("deprecation")
	private boolean pruefeBenutzereingaben() {

		// Pr�fung ob in der E-Mail Adresse eine @ und die anderen zeichen vorhenden
		// sind
		if (!emailTextField.getText().matches("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$")
				|| !passwordField.getText().equals(passwortWiederholenPasswordField.getText())) {

			JOptionPane.showMessageDialog(registrierenFenster,
					"Die Email Adresse ist ung�ltig, oder Passw�rter simmen nicht �ber ein.");
			return false;
		}

		// Pr�fe ob Benutzer in der Datenbank schon vorhanden iat
		Integer emailAdresseVorhanden = MailDBManager.fuehreSqlAus(
				String.format("SELECT * FROM benutzer WHERE email = '%s'", emailTextField.getText()), resultSet -> {
					try {
						if (resultSet.next()) {
							return 1;
						} else {
							return 0;
						}
					} catch (SQLException exception) {
						return -1;
					}
				});

		// Pr�fung ob benutzer mit der E-Mail Adresse schon registriert ist gbit es die
		// Meldung
		if (emailAdresseVorhanden == 1) {
			JOptionPane.showMessageDialog(registrierenFenster, "Die E-Mailadresse ist bereits registriet.");
			return false;
		}
		return true;
	}
}
