package lagerverwaltung;

import domain.KeinLagerplatzFreiException;
import domain.Kiste;
import domain.Lager;
import domain.Lagerplatz;
import domain.Lagerplatznummer;

public class LagerverwaltungTestAnwendung {

	public static void main(String[] args) {

		// 1. Kunde übergibt Kiste an Mitarbeiter.

		System.out.println("Bitte einmal die Kiste einlagern.");
		System.out.println();

		// Neue Kisten erstellen
		Kiste kiste1 = new Kiste(12, 25, 85);
		Kiste kiste2 = new Kiste(25, 58, 21);
		Kiste kiste3 = new Kiste(3, 5, 4);
		Kiste kiste4 = new Kiste(33, 845, 854);
		Kiste kiste5 = new Kiste(52, 87, 4);
		Kiste kiste6 = new Kiste(12, 75, 84);
		Kiste kiste7 = new Kiste(74, 101, 88);
		Kiste kiste8 = new Kiste(1, 3, 8);

		// Lager erstellen mit 10 Plätzen
		Lager lager = new Lager(10);

		// Neue erstellt Kisten einlagern
		neueKisteEinlagern(lager, kiste1, false);
		Lagerplatznummer lagerplatznummer = neueKisteEinlagern(lager, kiste2, false);
		neueKisteEinlagern(lager, kiste3, false);
		neueKisteEinlagern(lager, kiste3, false);
		neueKisteEinlagern(lager, kiste4, false);
		neueKisteEinlagern(lager, kiste6, false);
		neueKisteEinlagern(lager, kiste7, false);

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		// Kiste2 aus dem Lager holen
		Lagerplatz lagerplatz = lager.sucheLagerplatz(lagerplatznummer);
		System.out.println("Hier ist ihre Kiste " + lagerplatz.holen());
		System.out.println();
		System.out.println("Die Lagerplatznummer " + lagerplatznummer + " ist jetzt frei.");
		System.out.println();

		// Kiste 4 einlagern
		neueKisteEinlagern(lager, kiste2, false);

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");

		// Suche Lagerplatz zum austausch einer Kiste
		Lagerplatz austauschLagerplatz = lager.sucheLagerplatz(lagerplatznummer);
		System.out.println("Hier ist ihre Kiste " + austauschLagerplatz.holen());
		System.out.println();

		// Kisten tauschen
		neueKisteEinlagern(lager, kiste8, false);

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------");

		// Kiste 2 anzeigen und wieder einlagern, dazwischen Kiste 8 einlagern
		lagerplatz = lager.sucheLagerplatz(lagerplatznummer);
		kiste2 = lagerplatz.holen();
		System.out.println("Hier ist ihre Kiste mit der Lagerplatznummer " + lagerplatznummer + kiste2);
		lagerplatz.reservieren(kiste2);
		System.out.println("Ihr Lagerplatz wurde mit der Lagerplatznummer " + lagerplatznummer + " wurde reserviert.");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		neueKisteEinlagern(lager, kiste8, false); // Kiste 8 soll auf Lagerplatz 8
		
		neueKisteEinlagern(lager, kiste2, true); // Kiste 2 soll auf Lagerplatz 2
		

	}

	private static Lagerplatznummer neueKisteEinlagern(Lager lager, Kiste kiste, boolean reservierteKiste) {

		Lagerplatznummer lagerplatznummer = null;

		
		
		try {
			if (reservierteKiste == false) {
				Lagerplatz freierLagerplatz = lager.pruefeFreienLagerplatz();
				lagerplatznummer = freierLagerplatz.einlagern(kiste);

			} else {
				Lagerplatz reserviertenLagerplatz = lager.sucheReserviertenLagerplatz(kiste);
				// 3. Mitarbeiter lagert Kiste in freien Lagerplatz im Lager ein.
				lagerplatznummer = reserviertenLagerplatz.einlagern(kiste);
			}

			// 4. Mitarbeiter übergibt Lagerplatznummer an Kunde.´

			System.out.println("Ihre Lagerplatznummer ist: " + lagerplatznummer);
			System.out.println();

		} catch (KeinLagerplatzFreiException e) {
			System.out.println("Es ist kein Lagerplatz frei.");
		}

		return lagerplatznummer;

	}

}
