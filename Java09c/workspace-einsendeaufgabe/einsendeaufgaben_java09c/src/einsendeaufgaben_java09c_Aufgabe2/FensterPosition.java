package einsendeaufgaben_java09c_Aufgabe2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**************************************************************************************
 * Einsendeaufgabe Java09c Aufgabe 2
 **************************************************************************************/

public class FensterPosition extends JFrame {

	private Dimension bGroesse;

	private static final int FENSTER_BREITE = 200;
	private static final int FENSTER_HOEHE = 200;
	private static final int VERSCHIEBUNG = 10;

	private static final long serialVersionUID = -1227251925801865737L;

	public FensterPosition(String titel) {

		super(titel);
		JButton schaltflaecheOben = new JButton("Oben");
		JButton schaltflaecheUnten = new JButton("Unten");
		JButton schaltflaecheLinks = new JButton("Links");
		JButton schaltflaecheRechts = new JButton("Rechts");

		schaltflaecheLinks.addActionListener(new PositionListener());
		schaltflaecheRechts.addActionListener(new PositionListener());
		schaltflaecheOben.addActionListener(new PositionListener());
		schaltflaecheUnten.addActionListener(new PositionListener());

		// ein neues Border-Layout mit je 25 Pixeln Abstand setzen
		setLayout(new BorderLayout(25, 25));

		// die Schaltfläche einfügen
		// dabei muss die "Himmelsrichtung" bzw. die Mitte angegeben werden
		add(BorderLayout.NORTH, schaltflaecheOben);
		add(BorderLayout.SOUTH, schaltflaecheUnten);
		add(BorderLayout.WEST, schaltflaecheLinks);
		add(BorderLayout.EAST, schaltflaecheRechts);

		// die Fenstergröße setzen
		setSize(FENSTER_BREITE, FENSTER_HOEHE);

		bGroesse = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((bGroesse.width - getSize().width) / 2, (bGroesse.height - getSize().height) / 2);

		// und anzeigen
		setVisible(true);

		// die Standardaktion beim Schließen festlegen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FensterPosition("Einsendeaufgabe 2");
	}

	class PositionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Point aktuellePosition = getLocation();

			if ("Links".equals(e.getActionCommand()) && aktuellePosition.x > 0) {
				if (aktuellePosition.x <= VERSCHIEBUNG) {
					setLocation(0, aktuellePosition.y);
				} else {
					setLocation(aktuellePosition.x - VERSCHIEBUNG, aktuellePosition.y);
				}
			}

			else if ("Rechts".equals(e.getActionCommand())
					&& aktuellePosition.x < bGroesse.getWidth() - FENSTER_BREITE) {
				if (aktuellePosition.x <= bGroesse.getWidth() - FENSTER_BREITE - VERSCHIEBUNG) {
					setLocation(aktuellePosition.x + VERSCHIEBUNG, aktuellePosition.y);

				} else {
					setLocation((int) bGroesse.getWidth() - FENSTER_BREITE, aktuellePosition.y);
				}
			}

			else if ("Oben".equals(e.getActionCommand()) && aktuellePosition.y > 0) {
				if (aktuellePosition.y <= VERSCHIEBUNG) {
					setLocation(aktuellePosition.x, 0);

				} else {
					setLocation(aktuellePosition.x, aktuellePosition.y - VERSCHIEBUNG);
				}

			} else if ("Unten".equals(e.getActionCommand())
					&& aktuellePosition.y < bGroesse.getHeight() - FENSTER_HOEHE) {
				if (aktuellePosition.y >= bGroesse.getHeight() - FENSTER_HOEHE - VERSCHIEBUNG) {
					setLocation(aktuellePosition.x, (int) bGroesse.getHeight() - FENSTER_HOEHE);

				} else {
					setLocation(aktuellePosition.x, aktuellePosition.y + VERSCHIEBUNG);
				}
			}
		}
	}
}
