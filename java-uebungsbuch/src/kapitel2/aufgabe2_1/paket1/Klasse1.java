
package kapitel2.aufgabe2_1.paket1;

public class Klasse1 {

	private int zahl1 = 1;

	protected int zahl2 = 2;

	public int zahl3 = 3;

	int zahl4 = 4;

	public Klasse1() {
		System.out.println("Instanz der Klasse 1");
	}

	protected void anzeige() {
		System.out.println(zahl1);
		System.out.println(zahl2);
		System.out.println(zahl3);
		System.out.println(zahl4);

	}
}
