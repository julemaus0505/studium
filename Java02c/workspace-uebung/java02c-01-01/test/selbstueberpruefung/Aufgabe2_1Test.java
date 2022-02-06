package selbstueberpruefung;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import selbstüberprüfung.Aufgabe2_1;

public class Aufgabe2_1Test {

	@Test
	public void testVergleicheXgroesserY() {
		// Pruefen: Ob x groesser ist als y
		assertEquals("X ist größer als Y.", Aufgabe2_1.vergleicheXgroesserY(100, 20));
		assertEquals("X ist größer als Y.", Aufgabe2_1.vergleicheXgroesserY(50, 49));

		// Pruefen ob y groesser ist als x
		assertEquals("Y ist größer als X.", Aufgabe2_1.vergleicheXgroesserY(20, 60));
		assertEquals("Y ist größer als X.", Aufgabe2_1.vergleicheXgroesserY(5, 10));

		// Pruefen ob y gleich x ist
		assertEquals("Y und X sind gleich.", Aufgabe2_1.vergleicheXgroesserY(10, 10));
		assertEquals("Y und X sind gleich.", Aufgabe2_1.vergleicheXgroesserY(25, 25));

	}
}
