package einsendeaufgaben_java03c;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Java03c_3_1_Test {
	@Test
	public void testBerechneSchaltjahr() {
		assertEquals(true, Java03c_3_1.berechneSchaltjahr(1964));
		assertEquals(true, Java03c_3_1.berechneSchaltjahr(2000));
		assertEquals(false, Java03c_3_1.berechneSchaltjahr(1955));
		assertEquals(true, Java03c_3_1.berechneSchaltjahr(1956));
		assertEquals(true, Java03c_3_1.berechneSchaltjahr(4000));
		assertEquals(false, Java03c_3_1.berechneSchaltjahr(3000));
	}

	
}


