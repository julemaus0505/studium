package programm;

import a.KlasseA;
import b.KlasseB;
import c.KlasseC;
import d.KlasseD;
import e.KlasseE;

public class TestProgramm {

	public static void main(String[] args) {

		KlasseA objektA = new KlasseA();

		objektA.setZahl(5);

		System.out.println("Die Zahl in Objekt A ist:" + objektA.getZahl());

		KlasseB objektB = new KlasseB();

		objektB.setName("Jule");

		System.out.println("Der Name ist: " + objektB.getName());

		KlasseC objektC = new KlasseC(26);

		System.out.println("Die zahl ist: " + objektC.getZahlen());

		System.out.println(KlasseD.toUpperCase(objektB.getName()));

		// System.out.println(KlasseC.toUpperCase(objektB.getName()));

	}

}
