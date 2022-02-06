package aufgaben;

/*  ################################################
Beispiele für weitere Operatoren
################################################# */

public class Java02c_03_5 {

	public static void main(String[] args) {
		int zahl = 5;
		int ausgabe;

		//einfaches Inkrement
		System.out.println("zahl hat den Wert " + zahl);
		++zahl;
		System.out.println("zahl hat nach ++zahl den Wert " + zahl);
		System.out.println();
		
		//Inkrement nach der Zuweisung
		ausgabe = zahl++;
		System.out.println("ausgabe hat den Wert " + ausgabe);
		System.out.println("zahl hat jetzt den Wert " + zahl);
		System.out.println();

		//Inkrement vor der Zuweisung
		ausgabe = ++zahl;
		System.out.println("ausgabe hat den Wert " + ausgabe);
		System.out.println("zahl hat jetzt den Wert " + zahl);
		System.out.println();

		//entspricht zahl = zahl / 7
		zahl /= 7;
		System.out.println("zahl /= 7 liefert den Wert " + zahl);
		System.out.println();

		//entspricht zahl = zahl +10
		zahl += 10;
		System.out.println("zahl +=10 liefert den Wert " + zahl);

	}

}
