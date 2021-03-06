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
 * Die Klasse stellt die Loginfunktion bereit. Die Benutzereingeben werden mit
 * den Eintr?gen in der Datenbank ?berpr?ft.
 *
 * @author Julia Petersen
 */

public class Benutzer {

	// Klassenvariablen
	private JTextField emailTextField;
	private JPasswordField passwordField;
	private JButton loginButton;
	private JButton registrierenButton;
	private JButton abbrechenButton;

	// Mehtode k?mmert sich um das Login Fenster
	public void zeigeLoginFenster() {

		// Login Fenster erstellen
		JFrame loginFenster = new JFrame();
		loginFenster.setTitle("Login Bereich");

		// ein Layout setzen
		// beim Layout habe ich mich f?r ein MigLayout entschieden
		loginFenster.setLayout(new MigLayout("w 300, h 200"));

		// Fenster kann nicht ver?ndert werden
		loginFenster.setResizable(false);

		// Label erstellt
		JLabel loginLabel = new JLabel("Login");
		JLabel emailLabel = new JLabel("Email Adresse:");
		JLabel passwordLabel = new JLabel("Passwort");

		// JTextField erstellt
		emailTextField = new JTextField("", 20);
		passwordField = new JPasswordField("", 20);

		// JButton erstellt und den zustand auf aus gesetzt
		loginButton = new JButton("Login");
		loginButton.setEnabled(false);
		registrierenButton = new JButton("Registrieren");
		abbrechenButton = new JButton("Abbrechen");

		// ToolTips erstellt
		emailTextField.setToolTipText("Bitte die E-mail eingeben");
		passwordField.setToolTipText("Bitte Passwort eingeben");

		// Focus auf die TextFields gesetzt
		emailTextField.addFocusListener(getPruefeTextFieldListener());
		passwordField.addFocusListener(getPruefeTextFieldListener());

		// Button Registrieren geklickt, dann ?ffnet sich das Registrier?bungsfenster
		// zugleich wird Login Fenster geschlossen
		registrierenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evnet) {
				loginFenster.setVisible(false);
				new Registrieren().zeigeRegistrierenFenster(loginFenster);

			}

		});

		// wenn der Loginbutton geklickt wurde, wird ?berpr?ft, ob es den Benutzer
		// bereits in der Datenbank gibt
		loginButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent event) {

				MailDBManager.fuehreSqlAus(
						String.format("SELECT COUNT(*) FROM benutzer WHERE email = '%s' AND passwort = '%s'",
								emailTextField.getText(), passwordField.getText()),
						daten -> {
							try {
								if (daten != null && daten.next() && daten.getInt(1) != 0) {
									loginFenster.setVisible(false);
									new MiniMailStart("MiniMail", emailTextField.getText(), passwordField.getText());
								} else {
									JOptionPane.showMessageDialog(null,
											"Login Fehlgeschlagen, bitte neu eingeben, oder sich erst registrieren!");
								}
							} catch (SQLException exception) {
								JOptionPane.showMessageDialog(loginFenster,
										"Eingegebene Login Daten stimmen nicht ?berein.");
							}
							return null;
						});
			}
		});

		// Abbrechen Button geklickt, Programm wird beendet
		abbrechenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);

			}
		});

		// die Node dem Login Fenster hinzuf?gen
		loginFenster.add(loginLabel, "spanx, center,wrap 30");
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setFont(new Font("Arial", 30, 30));
		loginFenster.add(emailLabel);
		emailLabel.setForeground(Color.WHITE);
		loginFenster.add(emailTextField, "width :300:, wrap");
		loginFenster.add(passwordLabel);
		passwordLabel.setForeground(Color.WHITE);
		loginFenster.add(passwordField, "width :300:, wrap");
		loginFenster.add(registrierenButton, " skip 1, spanx, split 3");
		loginFenster.add(loginButton);
		loginFenster.add(abbrechenButton, "growx 10");
		

		// Fenster Gr??e setzen
		loginFenster.setSize(600, 600);

		// Hintergrundfarbe ge?ndert
		loginFenster.getContentPane().setBackground(Color.DARK_GRAY);

		// f?r die Anzeige, wo das Login Fenster angezeit wird
		final Dimension d = loginFenster.getToolkit().getScreenSize();
		loginFenster.setLocation((int) ((d.getWidth() - loginFenster.getWidth()) / 5),
				(int) ((d.getHeight() - loginFenster.getHeight()) / 5));

		// Fenster anzeigen
		loginFenster.pack();
		loginFenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFenster.setVisible(true);

	}

	/**
	 * Die Methode erstellt einen {@link FocusListener} um Textfelder auf leer zu
	 * pr?fen <br>
	 * und steuert entsprechend den Login Button
	 * 
	 * @return erstellter {@link FocusListener}
	 */
	private FocusListener getPruefeTextFieldListener() {

		return new FocusAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent event) {
				if (emailTextField.getText().isEmpty() || passwordField.getText().isEmpty()) {
					loginButton.setEnabled(false);

				} else {
					loginButton.setEnabled(true);
					loginButton.requestFocus();
				}
			}
		};
	}
}
