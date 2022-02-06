package kapitel2.aufgabe2_3;

public class KlasseD extends KlasseC {

	public static void main(String[] args) {

		KlasseC c1 = new KlasseC();
		KlasseC c2 = new KlasseD();
		KlasseD d1 = new KlasseD();
		KlasseC.klassenMethode();
		KlasseD.klassenMethoden();

		KlasseC.klassenMethode();
		KlasseD.klassenMethoden();
		c1.instanzMethode();
		d1.instanzMethode();

		System.out.println("Statisches Binden von " + "Klassenmethoden");
		KlasseC.klassenMethode();

		System.out.println("Dynamisches Binden von " + "Instanzmethoden");
		c2.instanzMethode();

	}

	public static void klassenMethoden() {
		System.out.println("Ich würde so gerne wieder Fliegen.");
	}

	public void instanzMethode() {
		super.instanzMethode();
		System.out.println("Ich hoffe das wir bald wieder Urlaub machen können.");
	}

}
