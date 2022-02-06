package uebung_vererbung_7;

public class Uebung7 {

	public static void main(String[] args) {

		Mitarbeiter mitarbeiter1 = new Mitarbeiter();
		mitarbeiter1.setVorname("Sascha");
		mitarbeiter1.setNachname("Petersen");
		mitarbeiter1.setPersonalnummer(45822145);
		mitarbeiter1.setGehalt(4232.00);

		System.out.println("Herr " + mitarbeiter1.getVorname() + " " + mitarbeiter1.getNachname()
				+ " mit der Personalnummer: " + mitarbeiter1.getPersonalnummer()
				+ " und bekommt monatlich ein Gehalt von " + mitarbeiter1.getGehalt() + " Euro.");

		System.out.println();

		Mitarbeiter mitarbeiter2 = new Mitarbeiter();
		mitarbeiter2.setVorname("Julia");
		mitarbeiter2.setNachname("Petersen");
		mitarbeiter2.setPersonalnummer(74587125);
		mitarbeiter2.setGehalt(700.00);

		System.out.println("Frau " + mitarbeiter2.getVorname() + " " + mitarbeiter2.getNachname()
				+ " mit der Personalnummer: " + mitarbeiter2.getPersonalnummer()
				+ " und bekommt monatlich ein Gehalt von " + mitarbeiter2.getGehalt() + " Euro.");

		System.out.println();

		Mitarbeiter_Aussendienst mitarbeiterAussendienst1 = new Mitarbeiter_Aussendienst();
		mitarbeiterAussendienst1.setVorname("Lea");
		mitarbeiterAussendienst1.setNachname("Grimm");
		mitarbeiterAussendienst1.setPersonalnummer(45811254);
		mitarbeiterAussendienst1.setGehalt(400.00);
		mitarbeiterAussendienst1.setAussenkontakte(6);
		mitarbeiterAussendienst1.setMarke("BMW");

		System.out
				.println("Frau " + mitarbeiterAussendienst1.getVorname() + " " + mitarbeiterAussendienst1.getNachname()
						+ " mit der Personalnummer: " + mitarbeiterAussendienst1.getPersonalnummer()
						+ " und bekommt monatlich ein Gehalt von " + mitarbeiterAussendienst1.getGehalt() + " Euro.");

		System.out.println("Frau " + mitarbeiterAussendienst1.getNachname() + " hat "
				+ mitarbeiterAussendienst1.getAussenkontakte() + " Außendienstkontakte.");

		mitarbeiterAussendienst1.fahreMitDienstwagen(mitarbeiterAussendienst1.getMarke());

		System.out.println();

		Mitarbeiter_Managementetage mitarbeiterManagementetage1 = new Mitarbeiter_Managementetage();
		mitarbeiterManagementetage1.setVorname("Sonja");
		mitarbeiterManagementetage1.setNachname("Grimm");
		mitarbeiterManagementetage1.setPersonalnummer(45822214);
		mitarbeiterManagementetage1.setGehalt(950.00);

		System.out.println("Frau " + mitarbeiterManagementetage1.getVorname() + " "
				+ mitarbeiterManagementetage1.getNachname() + " mit der Personalnummer: "
				+ mitarbeiterManagementetage1.getPersonalnummer() + " und bekommt monatlich ein Gehalt von "
				+ mitarbeiterManagementetage1.getGehalt() + " Euro.");

		mitarbeiterManagementetage1.holePersonalnummer("Grimm");
		mitarbeiterManagementetage1.zahleBonus(mitarbeiterManagementetage1.getBonus());

		System.out.println();

		Mitarbeiter_Lagerverwaltung mitarbeiterLagerverwaltung = new Mitarbeiter_Lagerverwaltung();
		mitarbeiterLagerverwaltung.setVorname("Steven");
		mitarbeiterLagerverwaltung.setNachname("Holland");
		mitarbeiterLagerverwaltung.setPersonalnummer(45822145);
		mitarbeiterLagerverwaltung.setGehalt(2533);

		System.out.println(
				"Herr " + mitarbeiterLagerverwaltung.getVorname() + " " + mitarbeiterLagerverwaltung.getNachname()
						+ " mit der Personalnummer: " + mitarbeiterLagerverwaltung.getPersonalnummer()
						+ " und bekommt monatlich ein Gehalt von " + mitarbeiterLagerverwaltung.getGehalt() + " Euro.");
	}

}
