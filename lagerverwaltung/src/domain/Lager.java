package domain;

import java.util.*;

// Klasse Lager ist nur eine Schablone (Bauplan) nur die Zeichnung
public class Lager {

	// Hier wird eine ArrayList erstellt in den Spitzenklammern kommt immer der
	// Datentyp in dem Fall Lagerplatz
	// hier wird mit new eine neue Liste erzeugt
	private List<Lagerplatz> lagerplaetze = new ArrayList<>();

	public Lager(final int anzahlPlaetze) {
		for (int i = 1; i <= anzahlPlaetze; i++) {
			lagerplaetze.add(new Lagerplatz(new Lagerplatznummer(i)));

		}

	}

	// Methode Überprüfe freien Lagerplatz, wenn der Lagerplatz nicht frei ist, dann
	// wird eine Exception geworfen
	public Lagerplatz pruefeFreienLagerplatz() throws KeinLagerplatzFreiException {

		// Mitarbeiter geht von Platz zu Platz und prüft ob der Lagerplatz frei ist.
		// Er macht es solange bis erster freier Platz gefunden ist.

		Iterator<Lagerplatz> iterator = lagerplaetze.iterator();
		while (iterator.hasNext()) {
			Lagerplatz aktuelleLagerplatz = iterator.next();
			if (aktuelleLagerplatz.isFrei()) {
				return aktuelleLagerplatz;
			}
		}

		throw new KeinLagerplatzFreiException();

	}
	
	public Lagerplatz sucheLagerplatz (Lagerplatznummer lagerplatznummer) {
		Lagerplatz lagerplatz = null;
		
		Iterator<Lagerplatz> iterator = lagerplaetze.iterator();
		while (iterator.hasNext()) {
			Lagerplatz aktuellerLagerplatz = iterator.next();
			if(aktuellerLagerplatz.equals(lagerplatznummer)) {
				lagerplatz = aktuellerLagerplatz;
			}
		}
		
		return lagerplatz;
	}
	

	public Lagerplatz sucheReserviertenLagerplatz(Kiste kiste) {
		Lagerplatz lagerplatz = null;
		
		Iterator<Lagerplatz> iterator = lagerplaetze.iterator();
		while (iterator.hasNext() && lagerplatz == null) {
			Lagerplatz reserviertenLagerplatz = iterator.next();
			if (reserviertenLagerplatz.equals(kiste)) {
				lagerplatz = reserviertenLagerplatz;
			}
		}
		
		return lagerplatz;

	}

}
