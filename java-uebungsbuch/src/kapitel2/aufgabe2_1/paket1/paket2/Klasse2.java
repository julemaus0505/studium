package kapitel2.aufgabe2_1.paket1.paket2;

import kapitel2.aufgabe2_1.paket1.Klasse1;

public class Klasse2 extends Klasse1 {

	@Override
	public void anzeige() {
		// Versuch auf welche Variable man zugreifen kann
		System.out.println(zahl2 + zahl3);
		super.anzeige();
	}

}
