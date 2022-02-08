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
 * 
 * @author Julia Petersen
 *
 *Neue Klasse Benutzer erstellt, sie dient dafür das der Benutzer sich über eine Maske einloggen.
 *Sie hat ein Hauptfenster, in dem dann die Benutzerdaten in dem Feld E-Mail und Passwort eingeben werden müssen, um sich einzuloggen.
 *wenn der Loginbutton geklickt wird, wird in der Datenbank nach dem Benutzer geschaut, ob es ihn in der Datenbank gibt.
 *Wenn ja, wird das Mail Programm geöffnet. Andernfalss muss der Anwender sich erst registrieren.
 *
 */

public class Benutzer {

	// Klassenvariablen
	private JTextField emailField;
	private JTextField passwordField;
	private JButton loginButton;
	private JButton registrierenButton;
	private JButton abbrechenButton;

	// der Konstruktor
	public Benutzer() {

	}

	// Mehtode kümmert sich um das Login Fenster
	public void zeigeLoginFenster() {

		// Login Fenster erstellen
		JFrame loginFenster = new JFrame();
		loginFenster.setTitle("Login Bereich");

		// ein Layout setzen
		// beim Layout habe ich mich für ein MigLayout entschieden
		loginFenster.setLayout(new MigLayout("w 300, h 200"));

		// Fenster kann nicht verändert werden
		loginFenster.setResizable(false);

		// Label erstellt
		JLabel loginLabel = new JLabel("Login");
		JLabel emailLabel = new JLabel("Email Adresse:");
		JLabel passwordLabel = new JLabel("Passwort");

		// JTextField erstellt
		emailField = new JTextField("", 20);
		passwordField = new JPasswordField("", 20);

		// JButton erstellt und den zustand auf aus gesetzt
		loginButton = new JButton("Login");
		loginButton.setEnabled(false);
		registrierenButton = new JButton("Registrieren");
		abbrechenButton = new JButton("Abbrechen");
		JButton loginDatenEintragen = new JButton("Daten eingeben");

		// ToolTips erstellt
		emailField.setToolTipText("Bitte die E-mail eingeben");
		passwordField.setToolTipText("Bitte Passwort eingeben");

		// Focus auf die TextFields gesetzt
		emailField.addFocusListener(getPruefeTextFieldListener());
		passwordField.addFocusListener(getPruefeTextFieldListener());

		// Button Registrieren geklickt, dann öffnet sich das Registrierungsfenster
		// zugleich wird Login Fenster geschlossen
		registrierenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evnet) {
				loginFenster.setVisible(false);
				new Registrieren().zeigeRegistrierenFenster(loginFenster);

			}

		});

		// DAS MUSS VOR DEM ABSCHICKEN GELÖSCHT WERDEN
		loginDatenEintragen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				emailField.setText("petersenjulia60@gmail.com");
				passwordField.setText("petersen2022");
				loginButton.setEnabled(true);
				registrierenButton.setEnabled(true);

			}
		});

		// Neu wenn der Loginbutton geklickt wurde, wird überprüft ob es den Benutzer schon in der Datenbank gibt
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				// eine neue Klasse für meine SQL Abfragen erstellt, und hier für die abfrage genutzt
				MailDBManager.fuehreSqlAus(
						String.format("SELECT COUNT(*) FROM benutzer WHERE email = '%s' AND passwort = '%s'",
								emailField.getText(), passwordField.getText()),
						daten -> {
							try {
								if (daten != null && daten.next() && daten.getInt(1) != 0) {
									loginFenster.setVisible(false);
									new MiniMailStart("MiniMail", emailField.getText(), passwordField.getText());

								} else {

									JOptionPane.showMessageDialog(null,
											"Login Fehlgeschlagen, bitte neu eingeben, oder sich erst registrieren!");

								}
							} catch (SQLException exception) {
								JOptionPane.showMessageDialog(loginFenster,
										"Eingegebene Login Daten stimmen nicht überein.");

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

		// die Node dem Login Fenster hinzufügen
		loginFenster.add(loginLabel, "spanx, center,wrap 30");
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setFont(new Font("Arial", 30, 30));
		loginFenster.add(emailLabel);
		emailLabel.setForeground(Color.WHITE);
		loginFenster.add(emailField, "width :300:, wrap");
		loginFenster.add(passwordLabel);
		passwordLabel.setForeground(Color.WHITE);
		loginFenster.add(passwordField, "width :300:, wrap");
		loginFenster.add(registrierenButton, " skip 1, spanx, split 3");
		loginFenster.add(loginButton);
		loginFenster.add(abbrechenButton, "growx 10");
		loginFenster.add(loginDatenEintragen);

		// Fenster Größe setzen
		loginFenster.setSize(600, 600);

		// Hintergrundfarbe geändert
		loginFenster.getContentPane().setBackground(Color.DARK_GRAY);

		// für die Anzeige, wo das Login Fenster angezeit wird
		final Dimension d = loginFenster.getToolkit().getScreenSize();
		loginFenster.setLocation((int) ((d.getWidth() - loginFenster.getWidth()) / 5),
				(int) ((d.getHeight() - loginFenster.getHeight()) / 5));

		// Fenster anzeigen
		loginFenster.pack();
		loginFenster.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		loginFenster.setVisible(true);

	}

	// TextField darf nicht leer sein
	// die Methode für den Focus
	private FocusListener getPruefeTextFieldListener() {

		return new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent event) {
				if (emailField.getText().isEmpty() || passwordField.getText().isEmpty()) {
					loginButton.setEnabled(false);

				} else {
					loginButton.setEnabled(true);
					loginButton.requestFocus();
				}
			}
		};
	}
}
