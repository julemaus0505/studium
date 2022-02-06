/*############################
 * Das Problem der Überdeckung
 * Das Programm löst eine Ausnahme aus!
 #############################*/
package java05c_03_04;

class Ueberdeckt {
	//die Instanzvariable
	String zKette;

	//die Methode soll den Wert von zKette ändern
	void zKetteAendern(String zKette) {
		this.zKette = zKette + " geändert";
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
		//das führt zu seltsamen Ausgaben
		System.out.println("Der geänderte Wert ist " + test.getZKette());
		//und das sogar zum Absturz
		if (test.getZKette().isEmpty())
			System.out.println("Die Zeichenkette ist leer");
		else
			System.out.println("Die Zeichenkette ist nicht leer");
	}
}

