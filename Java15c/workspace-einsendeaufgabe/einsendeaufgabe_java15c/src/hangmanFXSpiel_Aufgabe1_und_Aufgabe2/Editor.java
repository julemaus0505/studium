package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import jakarta.xml.bind.JAXBException;

// die Klasse Editor mit einem JFrame
public class Editor extends JFrame {

	// automatisch über Eclipse ergänzt
	private static final long serialVersionUID = -3780305662748152740L;

	// für das Eingabefeld variable anlegen
	private JTextArea feld;

	// für die Schaltflächen 3. Variablen
	private JButton einlesenTextDatei;
	private JButton einlesenXmlDatei;
	private JButton schreibenTextDatei;
	private JButton schreibenXmlDatei;
	private JButton beenden;

	// die innere Klasse für den ActionListener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf Lesen geklickt?
			if (event.getActionCommand().equals("lesenTextDatei")) {

				// Methode aus Text Datei lesen
				dateiLesenTextDatei();

				// wurde auf Schreiben geklickt?
			} else if (event.getActionCommand().equals("schreibenTextDatei")) {

				// eine Inputt abfrage erstellt ob die Datei überschrieben werden soll, oder ob
				// das Wort(Wörter) ergänzt werden sollen.
				int antwortText = JOptionPane.showConfirmDialog(null,
						"Möchten sie der aktuellen Liste ein oder mehre Wörter ergänzen?",
						"Abfrage: Was möcchten sie tun!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (antwortText == 0) {
					textDateiErgaenzen();

				} else if (antwortText == 1)
					textDateiUeberschreiben();

			} else if (event.getActionCommand().equals("schreibenXmlDatei")) {

				// eine Inputt abfrage erstellt ob die Datei überschrieben werden soll, oder ob
				// das Wort(Wörter) ergänzt werden sollen.
				int antwortXml = JOptionPane.showConfirmDialog(null,
						"Möchten sie der aktuellen Liste ein oder mehre Wörter ergänzen?",
						"Abfrage: Was möcchten sie tun!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

				if (antwortXml == 0) {
					xmlDateiErgaenzen();

				} else if (antwortXml == 1) {
					xmlDateiUeberschreiben();
				}
			} else if (event.getActionCommand().equals("lesenXmlDatei")) {
				dateiLesenXmlDatei();
			}
		}
	}

	// der Konstruktor
	public Editor(String titel) {

		// Titel setzten
		setTitle("Editor für Hangman-Spiel");

		// für das Panel mit den Schaltflächen
		JPanel tempPanel;

		// ein neues Eingabefeld erstellen
		feld = new JTextArea(20, 1);

		// die Schaltflächen
		einlesenTextDatei = new JButton("Wörter aus Textdatei lesen");
		einlesenTextDatei.setActionCommand("lesenTextDatei");
		schreibenTextDatei = new JButton("Wort/Wörter in Textdatei schreiben");
		schreibenTextDatei.setActionCommand("schreibenTextDatei");
		einlesenXmlDatei = new JButton("Wörter aus Xmldatei lesen");
		einlesenXmlDatei.setActionCommand("lesenXmlDatei");
		schreibenXmlDatei = new JButton("Wort/Wörter in Xmldatei schreiben");
		schreibenXmlDatei.setActionCommand("schreibenXmlDatei");
		beenden = new JButton("Beenden");
		beenden.setActionCommand("ende");

		// dem Listener die Schaltflächen zuweisen
		MeinListener listener = new MeinListener();
		einlesenTextDatei.addActionListener(listener);
		schreibenTextDatei.addActionListener(listener);
		einlesenXmlDatei.addActionListener(listener);
		schreibenXmlDatei.addActionListener(listener);
		beenden.addActionListener(listener);

		// ein BorderLayout anwenden
		setLayout(new BorderLayout());

		// das Eingabefeld mit Scrollbars
		add(new JScrollPane(feld), BorderLayout.CENTER);

		// ein Panel für die Schaltflächen erstellen
		tempPanel = new JPanel();
		tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tempPanel.add(schreibenTextDatei);
		tempPanel.add(schreibenXmlDatei);
		tempPanel.add(einlesenTextDatei);
		tempPanel.add(einlesenXmlDatei);
		tempPanel.add(beenden);
		add(tempPanel, BorderLayout.SOUTH);

		// Größe setzen, Standard-Verhalten festlegen und anzeigen
		setMinimumSize(new Dimension(1000, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// die Methode überschreiben
	private void textDateiUeberschreiben() {

		// Abfrage ob das JTextArea(feld) leer ist
		if (!feld.getText().isEmpty()) {
			try {
				WortlisteTextdateiHandler.textDateiUeberschreiben(feld.getText());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "Beim Schreiben ist ein Problem aufgetreten");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Das Feld ist leer, bitte etwas eintragen.");
		}
	}

	private void xmlDateiUeberschreiben() {
		
		// Abfrage ob das JTextArea(feld) leer ist
		if (!feld.getText().isEmpty()) {
			try {
				WortlisteJaxbHandler.xmlDateiUeberschreiben(feld.getText());
			} catch (JAXBException e) {
				JOptionPane.showMessageDialog(this, "Beim Schreiben ist ein Problem aufgetreten");
			}
		} else {
			JOptionPane.showMessageDialog(this, "Das Feld ist leer, bitte etwas eintragen.");
		}

	}

	// Ergänzt die Textdatei mit den Wörter aus der TextArea
	private void textDateiErgaenzen() {
		try {
			WortlisteTextdateiHandler.textDateiErgaenzen(holeAnzahlWoerterAusTextArea(), feld.getText());
		} catch (IOException e1) {
			// Ausgabe der Exception
			JOptionPane.showMessageDialog(this, "Es ist ein Problem aufgetreten.");
		}
	}

	private void xmlDateiErgaenzen() {
		try {
			WortlisteXmldateiHandler.xmlDateiErgaenzen(holeAnzahlWoerterAusTextArea(), feld.getText());
		} catch (IOException | XMLStreamException e1) {
			// Ausgabe der Exception
			JOptionPane.showMessageDialog(this, "Es ist ein Problem aufgetreten.");
		}

	}

	/**
	 * Ermittelt die Anzahl der Wörter, die in der TextArea stehen
	 * 
	 * @return Anzahl der Wörter
	 */
	private int holeAnzahlWoerterAusTextArea() {
		// Variable wörter mit dem Inhalt vom JTextArea befüllt.
		String woerter = feld.getText();

		// ein StringTokenizer mit der Variable tokenizer erstellt und die Variable mit
		// wörter befüllt
		StringTokenizer tokenizer = new StringTokenizer(woerter);

		return tokenizer.countTokens();
	}

	/**
	 * Liest die Wörter aus der Textdatei und zeigt sie in der TextArea an
	 */
	private void dateiLesenTextDatei() {
		try {
			feld.setText(WortlisteTextdateiHandler.leseWoerterAusDatei().stream().collect(Collectors.joining("\n")));
		} catch (IOException e) {
			// Ausgabe der Exception
			JOptionPane.showMessageDialog(this, "Die Datei existiert noch nicht.");
		}
	}

	private void dateiLesenXmlDatei() {
		try {
			feld.setText(WortlisteJaxbHandler.leseWoerterAusXml().stream().collect(Collectors.joining("\n")));
		} catch (Exception e) {
			e.printStackTrace();
			// Ausgabe der Exception
			JOptionPane.showMessageDialog(this, "Die Datei existiert noch nicht.");
		}
	}
}