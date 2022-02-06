package uebung_vererbung_10;

public class Uebung10 {

	public static void main(String[] args) {

		Tier tier1 = new Tier("Fifi");
		System.out.println("Mein Hund heiﬂt " + tier1.getName() + ".");

		System.out.println();

		Hund hund1 = new Hund(10);
		System.out.println(
				"Der Hund " + hund1.getName() + " hat eine Hechelfrequenz von " + hund1.getHechelfrequenz() + ".");

		System.out.println();

		Daemonenhund daemonenhund1 = new Daemonenhund(21, 4);
		System.out.println("Der Daemonenhund " + daemonenhund1.getName() + " hat eine Hechelfrequenz "
				+ daemonenhund1.getHechelfrequenz() + " und " + daemonenhund1.getAnzahlSeelen() + " AnzahlSeelen. ");

		System.out.println();

		Hoellenhund hoellenhund1 = new Hoellenhund(3, 8, 20);
		System.out.println(
				"Der Hoellenhund mit dem Namen " + hoellenhund1.getName() + " hat einen Verderbtheitsfaktor von "
						+ hoellenhund1.getVerderbtheitsfaktor() + " und " + daemonenhund1.getAnzahlSeelen()
						+ " anzahl der Seelen, und eine Hechelfrequenz von " + hoellenhund1.getHechelfrequenz() + ".");
		
		

	}

}
