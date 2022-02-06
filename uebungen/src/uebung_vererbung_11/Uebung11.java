package uebung_vererbung_11;

public class Uebung11 {

	public static void main(String[] args) {

		Menschen menschen1 = new Menschen();
		menschen1.setNamen("Julia Petersen");
		menschen1.setAlter(36);

		System.out.println("Hallo ich bin ein Mensch und heiße " + menschen1.getNamen() + " und bin "
				+ menschen1.getAlter() + " Jahre alt.");

		System.out.println();

		Lehrer lehrer1 = new Lehrer();
		lehrer1.setNamen("Herr Müller");
		lehrer1.setAlter(55);
		lehrer1.setUnterrichtsfach("Deutsch");

		System.out.println("Hallo mein Name ist " + lehrer1.getNamen() + " und mein Alter ist " + lehrer1.getAlter()
				+ " und ich unterricht " + lehrer1.getUnterrichtsfach() + ".");

		System.out.println();

		Schueler schueler1 = new Schueler();
		schueler1.setNamen("Lea Marie Petersen");
		schueler1.setAlter(18);
		schueler1.setKlassenstufe(10);
		schueler1.setJahresbeitragsfaktor(5);

		System.out.println("Hallo mein Name ist " + schueler1.getNamen() + " und ich bin " + schueler1.getAlter()
				+ " Jahre alt, meine Klassenstufe ist " + schueler1.getKlassenstufe()
				+ ". Mein Jahresbeitrag den ich bezahlen muss sind " + schueler1.jahresbeitragBerechen() + " Euro.");

		System.out.println();

		Klassensprecher klassensprecher1 = new Klassensprecher();
		klassensprecher1.setNamen("Sascha Petersen");
		klassensprecher1.setAlter(18);
		klassensprecher1.setKlassenstufe(12);
		klassensprecher1.setJahresbeitragsfaktor(4);

		System.out.println("Hallo mein Name ist " + klassensprecher1.getNamen() + " und ich bin "
				+ klassensprecher1.getAlter() + " Jahre alt, meine Klassenstufe ist "
				+ klassensprecher1.getKlassenstufe() + ". Mein Jahresbeitrag den ich bezahlen muss sind "
				+ klassensprecher1.indiiduellenJahresbeitragBerechen() + " Euro.");

		System.out.println();

		Klassensprecher klassensprecher2 = new Klassensprecher();
		klassensprecher2.setNamen("Marcus Petersen");
		klassensprecher2.setAlter(23);
		klassensprecher2.setKlassenstufe(11);
		klassensprecher2.setJahresbeitragsfaktor(3);

		System.out.println(String.format(
				"Hallo mein Name ist %s und ich bin %d Jahre alt, meine Klassenstufe"
						+ " ist %d. Mein Jahresbeitrag den ich bezahlen muss sind %.2f Euro.",
				klassensprecher2.getNamen(), klassensprecher2.getAlter(), klassensprecher2.getKlassenstufe(),
				klassensprecher2.indiiduellenJahresbeitragBerechen()));

	}
}
