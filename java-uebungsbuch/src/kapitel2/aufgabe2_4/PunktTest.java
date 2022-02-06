package kapitel2.aufgabe2_4;

// Aufgabe 1.4

public class PunktTest {

	public static void main(String[] args) {

		// Erzeugen einer Punkt-Instanz
		Punkt punkt = new Punkt(1.5, -4.5);

		// Anzeigen der Punkt-Instanz
		punkt.anzeigen();

		// Setzen und Lesen von Punktkoordinaten
		punkt.setX(-4.0);
		punkt.setY(4.0);

		System.out.println("x = " + punkt.getX());
		System.out.println("y = " + punkt.getY());

	}

}
