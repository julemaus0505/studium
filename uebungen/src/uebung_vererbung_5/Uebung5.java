package uebung_vererbung_5;

public class Uebung5 {

	public static void main(String[] args) {

		Kinderfahrrad kinderfahrrad = new Kinderfahrrad();
		kinderfahrrad.setArtikelnummer(458524587);
		kinderfahrrad.setName("Puky");
		kinderfahrrad.setNettopreis(2564.00);

		System.out.println("Das Fahrrad " + kinderfahrrad.getName() + " mit der " + kinderfahrrad.getArtikelnummer()
				+ " hat den Preis " + kinderfahrrad.getNettopreis() + " Euro.");
		kinderfahrrad.klingelAuswaehlen("Pink");

		MusikCD cd = new MusikCD();
		cd.setArtikelnummer(45811154);
		cd.setInterpreten("Kellys");
		cd.setLaufzeit(15);
		cd.setName("Album");
		cd.setNettopreis(29.95);

		System.out.println("Die MusikCD mit der Artikelnummer " + cd.getArtikelnummer() + " und dem Interpreten "
				+ cd.getInterpreten() + " hat die Laufzeit von " + cd.getLaufzeit() + " und den Namen " + cd.getName()
				+ " und den Preis von " + cd.getNettopreis());

	}

}
