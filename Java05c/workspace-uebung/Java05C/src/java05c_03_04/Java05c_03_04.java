/*############################
 * Das Problem der �berdeckung
 * Das Programm l�st eine Ausnahme aus!
 #############################*/
package java05c_03_04;

class Ueberdeckt {
	//die Instanzvariable
	String zKette;

	//die Methode soll den Wert von zKette �ndern
	void zKetteAendern(String zKette) {
		this.zKette = zKette + " ge�ndert";
	}

	//die Zeichenkette liefern
	String getZKette() {
		return zKette;
	}
}

public class Java05c_03_04 {
	public static void main(String[] args) {
		//eine Instanz von Ueberdeckt erzeugen
		Ueberdeckt test = new Ueberdeckt();
		test.zKetteAendern("Test");
		//das f�hrt zu seltsamen Ausgaben
		System.out.println("Der ge�nderte Wert ist " + test.getZKette());
		//und das sogar zum Absturz
		if (test.getZKette().isEmpty())
			System.out.println("Die Zeichenkette ist leer");
		else
			System.out.println("Die Zeichenkette ist nicht leer");
	}
}

