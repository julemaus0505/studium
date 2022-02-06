package einsendeaufgaben_java03c;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Java03c_3_4Test {

	@Test
	public void testAaddiere() {

		// Rechne Addition +
		assertEquals(5.0, Java03c_3_4.addiere(3, 2), "Addiere die beiden Zahlen");
		assertEquals(4.0, Java03c_3_4.addiere(2, 2), "Addiere die beiden Zahlen");
		assertEquals(43.0, Java03c_3_4.addiere(18, 25), "Addiere die beiden Zahlen");
		assertEquals(497.0, Java03c_3_4.addiere(285, 212), "Addiere die beiden Zahlen");
		assertEquals(103.0, Java03c_3_4.addiere(21, 82), "Addiere die beiden Zahlen");
	}
	
	@Test
	public void testSubtrahiere() {
		
	// Rechne Subtraktion -
		assertEquals(37.0, Java03c_3_4.subtrahiere(89, 52), "Subtrahiere die beiden Zahlen");
		assertEquals(26.0, Java03c_3_4.subtrahiere(78, 52), "Subtrahiere die beiden Zahlen");
		assertEquals(0.0, Java03c_3_4.subtrahiere(72, 72), "Subtrahiere die beiden Zahlen");
		assertEquals(62.0, Java03c_3_4.subtrahiere(84, 22), "Subtrahiere die beiden Zahlen");
		assertEquals(4.0, Java03c_3_4.subtrahiere(8, 4) , "Subtrahiere die beiden Zahlen");

	}
	
	@Test
	public void testDividiere() {
	
		// Rechne Division /
		assertEquals(6.0,Java03c_3_4.dividiere(12, 2) , "Dividiere die beiden Zahlen");
		assertEquals(55.0 / 92.0, Java03c_3_4.dividiere(55, 92), "Dividiere die beiden Zahlen");
		assertEquals(28.0 / 42.0, Java03c_3_4.dividiere(28, 42), "Dividiere die beiden Zahlen");
		assertEquals(66.0 / 3.0, Java03c_3_4.dividiere(66, 3) , "Dividiere die beiden Zahlen");
		assertEquals(65.0 / 98.0, Java03c_3_4.dividiere(65, 98), "Dividiere die beiden Zahlen");

	}
	
	@Test
	public void testMultipliziere() {
		
		// Rechne Multipikation *
		assertEquals(41.0 * 65.0, Java03c_3_4.multipliziere(41, 65), "Multipliziere die beiden Zahlen");
		assertEquals(25.0 * 32.0, Java03c_3_4.multipliziere(25, 32), "Multipliziere die beiden Zahlen");
		assertEquals(12.0 * 32.0, Java03c_3_4.multipliziere(12, 32), "Multipliziere die beiden Zahlen");
		assertEquals(14.0 * 74.0, Java03c_3_4.multipliziere(14, 74), "Multipliziere die beiden Zahlen");
		assertEquals(32.0 * 72.0, Java03c_3_4.multipliziere(32, 72), "Multipliziere die beiden Zahlen");
	}
	
	@Test
	public void testPotenziere() {
		
		assertEquals(8.0, Java03c_3_5.potenziere(2.0, 3.0), "Potenziere die beiden Zahlen");
		assertEquals(9.0, Java03c_3_5.potenziere(3.0, 2.0), "Potenziere die beiden Zahlen");
		assertEquals(1.0, Java03c_3_5.potenziere(3.0, 0.0), "Potenziere die beiden Zahlen");
	}
}
