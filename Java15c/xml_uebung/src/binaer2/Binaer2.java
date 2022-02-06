package binaer2;

import java.awt.GridLayout;
import java.io.File;
import java.io.RandomAccessFile;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Binaer2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// der Konstruktor
	public Binaer2(String titel) {
		super(titel);

		// ein GridLayout mit 2 Spalten anwenden
		setLayout(new GridLayout(0, 2));

		// gibt es die Datei daten.bin schon?
		File dateiTest = new File("daten.bin");

		// wenn nicht, erstellen wir sie neu
		if (dateiTest.exists() == false) {
			datenSchreiben();
		} else {
			// die Daten lesen
			datenLesen();
		}

		// Größe setzen, Standard-Verhalten festlegen und anzeigen
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// die Methode zum Lesen
	private void datenLesen() {
		// geöffnet wird die Datei daten.bin im Nur-Lesen-Modus
		try (RandomAccessFile datei = new RandomAccessFile("daten.bin", "r")) {

			// 20 Mal Daten als int lesen
			for (int i = 0; i < 20; i++) {

				// und ein neues Label aus dem Wert erzeugen
				add(new JLabel(Integer.toString(datei.readInt())));
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Beim Laden ist ein Problem aufgetreten");
		}

		// das Fenster neu "packen"
		pack();
	}

	// die Methode zum Schreiben
	private void datenSchreiben() {

		// geöffnet wird die Datei daten.bin im Lese- und Schreibmodus
		try (RandomAccessFile datei = new RandomAccessFile("daten.bin", "rw")) {

			// 20 Werte als int in die Datei schreiben
			for (int i = 0; i < 20; i++) {
				datei.writeInt(i * 10);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Beim Schreiben ist ein Problem aufgetreten");
		}
	}
}
