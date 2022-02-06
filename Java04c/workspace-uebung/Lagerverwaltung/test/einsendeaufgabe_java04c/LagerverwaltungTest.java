package einsendeaufgabe_java04c;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LagerverwaltungTest {

	@Test
	public void testerstelleNeueKiste() {
		// Mehrdimensionales Array
		int[][] kisten = new int[75][4];

		Lagerverwaltung.erstelleNeueKiste(kisten, 1, 2, 3);
		assertEquals("Kistennummer", 1, kisten[0][0]);
		assertEquals("breit", 1, kisten[0][1]);
		assertEquals("Länge", 2, kisten[0][2]);
		assertEquals("Höhe", 3, kisten[0][3]);

		Lagerverwaltung.erstelleNeueKiste(kisten, 3, 4, 6);
		assertEquals("Kistennummer", 2, kisten[1][0]);
		assertEquals("breit", 3, kisten[1][1]);
		assertEquals("Länge", 4, kisten[1][2]);
		assertEquals("Höhe", 6, kisten[1][3]);

		Lagerverwaltung.erstelleNeueKiste(kisten, 7, 6, 9);
		assertEquals("Kistennummer", 3, kisten[2][0]);
		assertEquals("breit", 7, kisten[2][1]);
		assertEquals("Länge", 6, kisten[2][2]);
		assertEquals("Höhe", 9, kisten[2][3]);

		// Lager bis auf einen Platz erfüllen
		for (int i = 1; i <= 71; i++) {
			Lagerverwaltung.erstelleNeueKiste(kisten, 2, 5, 8);
		}
		assertEquals("Kistennummer", 74, kisten[73][0]);
		assertEquals("breit", 2, kisten[73][1]);
		assertEquals("Länge", 5, kisten[73][2]);
		assertEquals("Höhe", 8, kisten[73][3]);

		// Letzte Kistennummer nicht vergeben
		assertEquals("Kistennummer", 0, kisten[74][0]);

		// Letzte Kiste einlagern
		Lagerverwaltung.erstelleNeueKiste(kisten, 7, 6, 9);
		assertEquals("Kistennummer", 75, kisten[74][0]);

		// Eine Kiste mehr einlagern, als Platz ist. Die 76. Kiste
		int kistennummer = Lagerverwaltung.erstelleNeueKiste(kisten, 7, 6, 9);
		assertEquals("Kistennummer", -1, kistennummer);
	}

	@Test
	public void testLoescheKiste() {
		int[][] kisten = new int[75][4];

		Lagerverwaltung.erstelleNeueKiste(kisten, 1, 2, 3);
		Lagerverwaltung.erstelleNeueKiste(kisten, 3, 4, 6);
		Lagerverwaltung.erstelleNeueKiste(kisten, 7, 6, 9);

		Lagerverwaltung.loescheDatenKiste(kisten, 2);

		// Prüfen ob Daten zur Kistennummer 2 gelöscht wurden
		assertEquals("Kistennummer", 0, kisten[1][0]);
		assertEquals("breit", 0, kisten[1][1]);
		assertEquals("Länge", 0, kisten[1][2]);
		assertEquals("Höhe", 0, kisten[1][3]);

		// Prüfen ob die anderen beiden Nummern noch vorhanden sind
		assertEquals("Kistennummer", 1, kisten[0][0]);
		assertEquals("Kistennummer", 3, kisten[2][0]);
		
		//Der Anwender gibt eine zu löschende Kistennummer ein, die nicht existiert.
		Lagerverwaltung.loescheDatenKiste(kisten, 127);
		
		assertEquals("Kistennummer", 1, kisten[0][0]);
		assertEquals("Kistennummer", 3, kisten[2][0]);
	}

	@Test
	public void testAendereKiste() {

	}

	@Test
	public void testAnzeigen() {

	}

	@Test
	public void testAnzeigenAllerKisten() {

	}

}
