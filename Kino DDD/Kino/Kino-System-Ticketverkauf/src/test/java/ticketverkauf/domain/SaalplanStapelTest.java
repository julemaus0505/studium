package ticketverkauf.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SaalplanStapelTest {

	@Test
	public void holtSaalplanTest () {
		
		SaalplanStapel saalplanStapel = new SaalplanStapel();
		
		// Vorbedinung setzen
		Saalplan saalplan1 = new Saalplan("Rot");
		Saalplan saalplan2 = new Saalplan("Blau");
		Saalplan saalplan3 = new Saalplan("Gelb");
		
		Vorstellung vorstellungInRot = new Vorstellung();
		vorstellungInRot.setSaalplan(saalplan1);
		
		// Kein Saalplan vorhanden
		Saalplan saalplan = saalplanStapel.holtSaalplan(vorstellungInRot);
		assertEquals("Kein Saalplan vorhanden", null, saalplan);
		
		saalplanStapel.zuruecklegen(saalplan1);
		saalplanStapel.zuruecklegen(saalplan2);
		saalplanStapel.zuruecklegen(saalplan3);

		// Saalplan vorhanden
		saalplan = saalplanStapel.holtSaalplan(vorstellungInRot);
		assertNotNull(saalplan);
		assertEquals("Saalplan ist vorhanden", vorstellungInRot.getSaalplan().getSaalFarbe(), saalplan.getSaalFarbe());
		
		// Gesuchter Saalplan nicht vorhanden
		saalplan = saalplanStapel.holtSaalplan(vorstellungInRot);
		assertEquals("Gesuchter Saalplan nicht gefunden", null, saalplan);
	}
}
