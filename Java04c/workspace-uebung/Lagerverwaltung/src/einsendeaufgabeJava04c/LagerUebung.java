package einsendeaufgabeJava04c;

import javax.swing.JOptionPane;

public class LagerUebung {

	public static void main(String[] args) {

		// Mehrdimensionales Array
		int[][] lager = new int[75][4];

		Object gewaehlteOption = null;

		Object[] optionen = { "Eingabe einer neuen Kiste.", "Löschen der Daten einer vorhandenen Kiste.",
				"Ändern der Daten einer vorhandenen Kiste. ", "Anzeigen der Daten einer vorhandenen Kiste.", "Anzeigen aller Kisten",
				"Programm beenden" };

		while (!optionen[5].equals(gewaehlteOption)) {

			gewaehlteOption = JOptionPane.showInputDialog(null, "Was wollen sie tun?", "Willkommen bei der Lagerverwaltung. Wählen Sie aus",
					JOptionPane.QUESTION_MESSAGE, null, optionen, optionen[0]);

			if (gewaehlteOption.equals(optionen[0])) {

				boolean weitereKisteEinlagern = true;

				while (weitereKisteEinlagern) {
					int breite = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie die Breite der Kiste an."));
					int laenge = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Länge der Kiste an."));
					int hoehe = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie die Höhe der Kiste an."));
					int kistennummer = erstelleNeueKiste(lager, breite, laenge, hoehe);

					JOptionPane.showMessageDialog(null, "Die Kiste mit der Nummer " + kistennummer + "  ,  mit den Maßen   Breite: " + breite
							+ " cm , " + " Länge: " + laenge + " cm , " + " Höhe: " + hoehe + " cm  wurde erfolgreich angelegt.");

					int antwort = JOptionPane.showOptionDialog(null, "Möchten Sie eine weitere Kiste einlagern?", "Eingabe",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, JOptionPane.NO_OPTION);
					if (antwort == JOptionPane.NO_OPTION) {
						weitereKisteEinlagern = false;

					}
				}
			}

		}
	}

	private static void anzeigenDatenKiste() {
		// TODO Automatisch generierter Methodenstub

	}

	private static void loescheDatenKiste() {
		// TODO Automatisch generierter Methodenstub

	}

	private static int sucheFreienLagerplatz(int[][] lager) {

		int index = 1;

		while (index < lager.length && lager[index][0] != 0) {
			index++;
		}

		if (index == lager.length) {

			index = -1;
		}

		return index;

	}

	public static boolean IstKistennummerVorhanden(int[][] lager, int kistennummer) {

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

	private static int erstelleNeueKiste(int[][] lager, int breite, int laenge, int hoehe) {

		int index = sucheFreienLagerplatz(lager);

		int kistennummer = 0;
		if (index >= 0) {
			lager[index][0] = index;
			lager[index][1] = breite;
			lager[index][2] = laenge;
			lager[index][3] = hoehe;
			kistennummer = lager[index][0];
		} else {
			kistennummer = -1;
		}

		return kistennummer;
	}

	private static void anzeigenAllerListen() {
		// TODO Automatisch generierter Methodenstub

	}

	private static void aendereDatenKiste() {
		// TODO Automatisch generierter Methodenstub

	}

}
