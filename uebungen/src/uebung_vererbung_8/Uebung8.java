package uebung_vererbung_8;

public class Uebung8 {

	public static void main(String[] args) {

		Bundespraesident holger = new Bundespraesident("Herr Holger M�ller", 15);

		System.out.println("Ich hei�e " + holger.getName() + " und erhalte �berall " + holger.getRabattProzent()
				+ " Prozent Rabatt.");

		System.out.println();

		Bundespraesident jule = new Bundespraesident("Frau Julia Petersen", 50);

		System.out.println(
				"Ich hei�e " + jule.getName() + " und erhalte �berall " + jule.getRabattProzent() + " Prozent Rabatt.");

		System.out.println();

		Bundespraesident sascha = new Bundespraesident("Herr Sascha Petersen", 80);

		System.out.println("Ich hei�e " + sascha.getName() + " und erhalte �berall " + sascha.getRabattProzent()
				+ " Prozent Rabatt.");
	}

}
