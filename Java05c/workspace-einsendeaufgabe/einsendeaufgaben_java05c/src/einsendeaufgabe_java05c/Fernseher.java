/* #############################################################################
 * Einsendeaufgabe 5.1
 * #############################################################################*/

package einsendeaufgabe_java05c;

public class Fernseher {

	private boolean eingeschaltet = false;
	private int lautstaerke = 0;
	private int programm = 0;

	public void ausschalten() {
		eingeschaltet = false;
	}

	public void einschalten() {
		eingeschaltet = true;
	}

	public void lautstaerkeAendern(int lautstaerke) {
		if (eingeschaltet) {
			this.lautstaerke = lautstaerke;
		}
	}

	public void programmAendern(int programm) {
		if (eingeschaltet) {
			this.programm = programm;
		}
	}

	public boolean isEingesachaltet() {
		return eingeschaltet;

	}

	public int aktuelleLautstaerke() {
		return lautstaerke;

	}

	public int aktuellesProgramm() {
		return programm;
	}

}
