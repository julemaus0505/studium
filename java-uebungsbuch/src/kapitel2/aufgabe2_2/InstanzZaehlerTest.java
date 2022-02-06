package kapitel2.aufgabe2_2;

public class InstanzZaehlerTest {

	public static void main(String[] args) {

		KlasseA[] klasseA = new KlasseA[10];
		KlasseB[] klasseB = new KlasseB[10];

		for (int i = 0; i < klasseB.length; i++) {

			klasseA[i] = new KlasseA();
			System.out.println("A:" + KlasseA.anzeigeZaehler());
			klasseB[i] = new KlasseB();
			System.out.println("B:" + KlasseB.anzeigeZaehler());

			System.out.println();
		}

	}
}
