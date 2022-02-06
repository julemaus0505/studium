
public class Uebung_Zufallszahlen_ausgeben {

	public static void main(String[] args) {

		int[] zufallsZahlen = new int[6];

		int anzahlGueltigerZufallsZahlen = 0;

		while (anzahlGueltigerZufallsZahlen != 6) {

			int zahl = (int) (Math.random() * 10.0 + 1);

			// Wenn Zahl noch nicht vorhanden ist.
			if (anzahlGueltigerZufallsZahlen == 0 || !istZufallsZahlSchonVorhanden(zahl, zufallsZahlen)) {
				zufallsZahlen[anzahlGueltigerZufallsZahlen++] = zahl;
				System.out.println(zahl);
			}
		}
	}

	private static boolean istZufallsZahlSchonVorhanden(int zahl, int[] zufallsZahlen) {
		for (int i = 0; i < zufallsZahlen.length; i++) {
			if (zahl == zufallsZahlen[i]) {

				return true;
			}
		}
		return false;
	}

}
