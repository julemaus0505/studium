package lagerverwaltung.fachlogik;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LagerTest {

	int[] daten;
	
	@Test
	public void  testLoescheDatenEinerKistennummer() {
		Lager lager = new Lager(3);
		
		//Vorzustand herstellen
		lager.einlagernEinerNeuenKiste(10, 10, 10);
		lager.einlagernEinerNeuenKiste(777, 17, 81);
		lager.einlagernEinerNeuenKiste(325, 77, 125);
		
		
		// 1. Kiste im Lager löschen
		daten = lager.beschaffeDatenEinerKiste(1);
		assertArrayEquals(" vor der Löschung Daten der Kiste mit der Nummer 1", new int[] {10,10,10}, daten);
		lager.loescheDatenEinerKistennummer(1);
		boolean loeschenErfolgreich = lager.loescheDatenEinerKistennummer(1);
		assertTrue(" Die Kiste 1 konnte gelöscht werden", loeschenErfolgreich);
		daten = lager.beschaffeDatenEinerKiste(1);
		
		assertArrayEquals(" Nach der Löschung Daten der Kiste 1 ", new int[] {0, 0, 0}, daten);
		
		// letzte Kiste im Lager löschen
		
		daten = lager.beschaffeDatenEinerKiste(3);
		assertArrayEquals(" vor der Löschung Daten der Kiste mit der Nummer 3", new int[] {325, 77, 125}, daten);
		lager.loescheDatenEinerKistennummer(3);
		daten = lager.beschaffeDatenEinerKiste(3);
		loeschenErfolgreich = lager.loescheDatenEinerKistennummer(3);
		assertTrue(" Die Kiste 3 konnte gelöscht werden",loeschenErfolgreich);
		assertArrayEquals(" Nach der Löschung Daten der Kiste 3 ", new int[] {0, 0, 0 }, daten);
		
		
		
		// eine Kiste aus der mitte löschen
		
		daten = lager.beschaffeDatenEinerKiste(2);
		assertArrayEquals(" vor der Löschung Daten der Kiste mit der Nummer 2", new int[] {777, 17, 81}, daten);
		lager.loescheDatenEinerKistennummer(2);
		daten = lager.beschaffeDatenEinerKiste(2);
		loeschenErfolgreich = lager.loescheDatenEinerKistennummer(2);
		assertTrue(" Die Kiste 2 konnte gelöscht werden",loeschenErfolgreich);
		assertArrayEquals(" Nach der Löschung Daten der Kiste 2 ", new int[] {0, 0, 0}, daten);
		
		
		// eine nicht vorhandenne Kiste löschen
		
		
		
		boolean leoschenErfolgreich = lager.loescheDatenEinerKistennummer(8);
		assertFalse(" Es konnte nicht gelöscht werden ", leoschenErfolgreich);
		
	}
	
	public void testEinlagernEinerNeuenKiste() {
		
		//Vorzustand herstellen
		Lager lager = new Lager(3);
		
		
		// 1. Kiste im Lager einlagern
		
		int kistennummer = lager.einlagernEinerNeuenKiste(12, 14, 24);
		assertEquals(" Die Kiste hat die Kistennummer 1 ", 1 , kistennummer);
		daten = lager.beschaffeDatenEinerKiste(kistennummer);
		assertArrayEquals(" Werte der aktuellen Kistennummer ", new int[] {12, 14, 24}, daten );
		
	
		// letzte Kiste im Lager einlagern
		
		
		// eine Kiste aus der mitte einlagern
		
		
		// eine Kiste über das Array hinaus einlagern
		
		
	}

}

