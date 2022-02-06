package uebung_vererbung_8;

public class Uebung8 {

	public static void main(String[] args) {

		Bundespraesident holger = new Bundespraesident("Herr Holger Müller", 15);

		System.out.println("Ich heiße " + holger.getName() + " und erhalte überall " + holger.getRabattProzent()
				+ " Prozent Rabatt.");

		System.out.println();

		Bundespraesident jule = new Bundespraesident("Frau Julia Petersen", 50);

		System.out.println(
				"Ich heiße " + jule.getName() + " und erhalte überall " + jule.getRabattProzent() + " Prozent Rabatt.");

		System.out.println();

		Bundespraesident sascha = new Bundespraesident("Herr Sascha Petersen", 80);

		System.out.println("Ich heiße " + sascha.getName() + " und erhalte überall " + sascha.getRabattProzent()
				+ " Prozent Rabatt.");
	}

}
