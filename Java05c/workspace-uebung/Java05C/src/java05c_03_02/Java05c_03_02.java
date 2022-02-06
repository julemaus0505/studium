

	/*###############################
	/*Eine Klasse mit Klassenmethode
	 * und Klassenvariable
	 ################################*/
	package java05c_03_02;

	//die selbst erstellte Klasse
	class Quadrat {
		//eine Klassenmethode
		static int berechnen(int wert) {
			// lokale Variable
			int ergebnis;  
			ergebnis = wert * wert;
			return ergebnis;
		}
	}

	public class Java05c_03_02 {
		public static void main(String[] args) {
			//der Aufruf der Klassenmethode
			System.out.println("Das Quadrat von 4 ist " + Quadrat.berechnen(4));
		}

	}

