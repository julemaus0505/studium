package java10c_projekt06;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Liste {
	public static void main(String[] args) {
		// ein Listenfeld
		String[] listenInhalt = { "Eintrag 1", "Eintrag 2", "Eintrag 3", "Eintrag 4", "Eintrag 5", "Eintrag 6",
				"Eintrag 7", "Eintrag 8", "Eintrag 9", "Eintrag 10" };
		JList<String> liste = new JList<String>(listenInhalt);

		// ein neues Fenster
		JFrame fenster = new JFrame("Eine Liste");

		// ein Container JScrollPane für die Liste
		JScrollPane pane = new JScrollPane(liste);
		// es sollen nur zunächst nur zwei Zeilen angezeigt werden
		liste.setVisibleRowCount(2);
		// den Container hinzufügen
		fenster.add(pane);

		// die Standardaktion setzen
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// das Fenster packen und anzeigen
		fenster.pack();
		fenster.setVisible(true);
	}
}
