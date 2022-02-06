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

// Neu Klasse erstellt
public class Registrieren {

	// Klassenvariablen
	private JButton registrierenButton;
	private JTextField emailTextField;
	private JPasswordField passwordField;
	private JPasswordField passwortWiederholenPasswordField;
	private JFrame registrierenFester;

	// Mehtode kümmert sich um das Fenster Registrieren
	public void zeigeRegistrierenFenster(JFrame loginFenster) {
		registrierenFester = new JFrame("Registrieren");
		registrierenFester.setLayout(new MigLayout("w 300, h 300"));
		registrierenFester.setResizable(false);

		// für die Anzeige wo das Fenster angezeigt wird
		final Dimension d = registrierenFester.getToolkit().getScreenSize();
		registrierenFester.setLocation((int) ((d.getWidth() - registrierenFester.getWidth()) / 5),
				(int) ((d.getHeight() - registrierenFester.getHeight()) / 5));

		// JLabel erstellt
		JLabel registrierenLabel = new JLabel("JETZT REGISTRIEREN");
		JLabel emailLabel = new JLabel("Email adreese eingeben...");
		JLabel passwortLabel = new JLabel("Bitte Passwort eingeben...");
		JLabel passwortWiederholenLabel = new JLabel("Bitte Passwort wiederholen...");

		// JButton erstellt
		JButton abbrechenButton = new JButton("Abbrechen");

		// Label die Größe und die Textfarbe geändert
		registrierenLabel.setFont(new Font("Arial", 15, 15));
		passwortLabel.setForeground(Color.WHITE);
		emailLabel.setForeground(Color.WHITE);
		passwortWiederholenLabel.setForeground(Color.WHITE);

		// Layout den Textfeild hinzugefügt und den Focus gesetzt
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
		registrierenFester.getContentPane().setBackground(Color.DARK_GRAY);

		registrierenButton.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent event) {

				// Eintrag in die Datenbank
				if (pruefeBenutzereingaben(emailTextField.getText())) {
					int naechsteId = MailDBManager.getNaechsteId("benutzer");
					MailDBManager.fuehreSqlUpdateAus(
							String.format("INSERT INTO benutzer (id, email, passwort) VALUES (%d, '%s', '%s')",
									naechsteId, emailTextField.getText(), passwordField.getText()));
				}
			}
		});

		// Neu Abbrechen Button Login Fenster wird geöffnet und das Registrieren Fenster
		// wird geschlossen
		abbrechenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loginFenster.setVisible(true);
				registrierenFester.setVisible(false);

			}
		});

		// Neu Dem Fenster die Node hinzufügen
		registrierenFester.add(registrierenLabel, "spanx, center,wrap 10");
		registrierenLabel.setFont(new Font("Arial", 20, 20));
		registrierenFester.add(emailLabel, "spanx,wrap 10");
		registrierenFester.add(emailTextField, "width :250:, wrap");
		registrierenFester.add(passwortLabel, "spanx,wrap 10");
		registrierenFester.add(passwordField, "width :250:, wrap");
		registrierenFester.add(passwortWiederholenLabel, "spanx,wrap 10");
		registrierenFester.add(passwortWiederholenPasswordField, "width :250:, wrap");
		registrierenFester.add(registrierenButton, "split 2");
		registrierenFester.add(abbrechenButton, "growx");
		registrierenFester.pack();
		registrierenFester.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registrierenFester.setVisible(true);

	}

	// Neu das TextField darf nicht leer sein
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

	// Neu Email und Passwort überprüft
	@SuppressWarnings("deprecation")
	private boolean pruefeBenutzereingaben(String emailAdresse) {

		// Prüfe ob Benutzer in der Datenbank schon vorhanden iat
		Integer emailAdresseVorhanden = MailDBManager
				.fuehreSqlAus(String.format("SELECT * FROM benutzer WHERE email = '%s'", emailAdresse), resultSet -> {

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

		if (emailAdresseVorhanden == 1) {
			JOptionPane.showMessageDialog(registrierenFester, "Die E-Mailadresse ist bereits registriet.");

		} else if (!emailAdresse.matches("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$")
				|| !passwordField.getText().equals(passwortWiederholenPasswordField.getText())) {

			JOptionPane.showMessageDialog(registrierenFester,
					"Die Email Adresse ist ungültig, oder Passwörter simmen nicht über ein.");

		} else {

			JOptionPane.showMessageDialog(registrierenFester, "Willkommen die Registrierung hat geklappt.");

			return true;
		}

		return false;
	}
}
