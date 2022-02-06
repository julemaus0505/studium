package einsendeaufgabeJava04c;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Lagerverwaltung {

	/*
	 * #################################################### 
	 * Einsendeaufgabe 4
	 * ####################################################
	 */
	
	public static void main(String[] args) {

		// Vereinbarung eines zweidimensionalen Arrays vom Typ int mit 75 "Zeilen" und 4
		// "Spalten"
		// für die Aufnahme von Daten von 75 Kisten (Kistennummer, Länge, Breite, Höhe)
		int[][] lager = new int[75][4];

		Object gewaehlteOption = null;

		// Auswahlmenü für die einzelnen Funktionen
		Object[] optionen = { "Eingabe einer neuen Kiste.", "Löschen der Daten einer vorhandenen Kiste.",
				"Ändern der Daten einer vorhandenen Kiste. ", "Anzeigen der Daten einer vorhandenen Kiste.", "Anzeigen aller Kisten",
				"Programm beenden" };

		while (!optionen[5].equals(gewaehlteOption)) {

			gewaehlteOption = JOptionPane.showInputDialog(null, "Was wollen sie tun?", "Willkommen bei der Lagerverwaltung. Wählen Sie aus",
					JOptionPane.QUESTION_MESSAGE, null, optionen, optionen[0]);

			int index;
			if (gewaehlteOption.equals(optionen[0])) {

				boolean weitereKisteEinlagern = true;
				
				// Schleife für weitere Kisten hinzufügen
				while (weitereKisteEinlagern) {
					int breite = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Breite der Kiste an."));
					int laenge = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an."));
					int hoehe = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an."));
					
					int kistennummer = erstelleNeueKiste(lager, breite, laenge, hoehe);
				

	// Methode zum Anzeigen aller Kisten
	private static void anzeigenAllerVorhandenerKisten(int[][] lager) {
		String liste = "Nr.\t\tLänge\t\tBreite\t\tHöhe\n";
		for (int i = 0; i < lager.length; i++) {
			if (lager[i][0] != 0) {
				liste += lager[i][0];
				liste += "\t\t";
				liste += lager[i][1];
				liste += "\t\t";
				liste += lager[i][2];
				liste += "\t\t";
				liste += lager[i][3];
				liste += "\n";
			}
		}
		JOptionPane.showMessageDialog(null, new JTextArea(liste));
	}

	private static boolean isKistennummerVorhanden(int kistennummer, int[][] lager) {
		int index = 0;
		boolean kistennummerGefunden = false;

		while (index < lager.length && lager[index][0] != kistennummer) {
			index++;
		}
		if (index < lager.length) {
			kistennummerGefunden = true;
		}
		return kistennummerGefunden;
	}

	/**
	 * Die Methode sucht nach einem freien Lagerplatz. Ein Lagerplatz ist verfügbar,
	 * wenn die Kistennummer(lager[index][0]) 0 ist.
	 * 
	 * @param kisten - Lager welches die Kisten enthält.
	 * @return >= 0: index des ersten freien Lagerplatzes. <br>
	 *         -1: ist kein freier Lagereplatz vorhanden.
	 */
	private static int sucheFreienLagerplatz(int[][] lager) {
		int index = 0;

		while (index < lager.length && lager[index][0] != 0) {
			index++;
		}

		if (index == lager.length) {
			index = -1;
		}

		return index;
	}

	/**
	 * Die Methode erstellt eine neue Kiste mit den Daten von breite länge und höhe,
	 * sofern im Lager noch Platz ist. Sie vergibt für die neue Kiste eine Nummer.
	 * 
	 * @param kisten - Lager welches die Kisten enthält
	 * @param breite - der neuen Kiste
	 * @param laenge - der neuen Kiste
	 * @param hoehe  - der neuen Kiste
	 * @return > 0: Die vergebene Kistennummer. <br>
	 *         -1: Im Lager ist kein Platz mehr.
	 */
	private static int erstelleNeueKiste(int[][] lager, int breite, int laenge, int hoehe) {
		int index = sucheFreienLagerplatz(lager);

		int kistennummer = 0;
		if (index >= 0) {
			lager[index][0] = index + 1;
			lager[index][1] = breite;
			lager[index][2] = laenge;
			lager[index][3] = hoehe;
			kistennummer = lager[index][0];
		} else {
			kistennummer = -1;
		}
		return kistennummer;
	}

	public static boolean loescheDatenKiste(int[][] lager, int kistennummer) {
		boolean loschenErfolgreich = false;
		int index = 0;
		// 1. Lagerplatz ermitteln (index der Kistennummer ermitteln)
		// 2 a. Kiste ist nicht vorhanden
		// 2 b. Kiste ist vorhanden

		while (!loschenErfolgreich && index < lager.length) {
			if (lager[index][0] == kistennummer) {
				// Wenn die Nummer existiert, werden die Daten dieser Kiste gelöscht bzw. auf 0
				// gesetzt.
				lager[index][0] = 0;
				lager[index][1] = 0;
				lager[index][2] = 0;
				lager[index][3] = 0;
				loschenErfolgreich = true;

			}
			index++;
		}
		return loschenErfolgreich;

	}

	public static boolean aendereDatenKiste(int kistennummer, int[][] lager, int breite, int laenge, int hoehe) {
		boolean aendernErfolgreich = false;
		int index = 0;
		// 1. Lagerplatz ermitteln (index der Kistennummer ermitteln)
		// 2 a. Kiste ist nicht vorhanden
		// 2 b. Kiste ist vorhanden

		while (!aendernErfolgreich && index < lager.length) {
			if (lager[index][0] == kistennummer) {
				// 3. Kisten ändern
				lager[index][1] = breite;
				lager[index][2] = laenge;
				lager[index][3] = hoehe;
				aendernErfolgreich = true;
			}
			index++;
		}
		return aendernErfolgreich;
	}

	// Methode zum Anzeigen einer Kiste
	public static void anzeigenDatenKiste(int kistennummer, int lager[][]) {
		int index = 0;

		while (lager[index][0] != kistennummer && index < lager.length) {

			index++;
		}
		if (lager[index][0] == kistennummer) {
			// Ausgabe der Daten der Kiste
			JOptionPane.showMessageDialog(null, ("Die Kiste mit der Nummer " + kistennummer + " hat die Maße:" + " Länge: " + lager[index][1] + " cm "
					+ " Breite: " + lager[index][2] + " cm " + " Höhe: " + lager[index][3] + " cm"));
		}
	}
}
