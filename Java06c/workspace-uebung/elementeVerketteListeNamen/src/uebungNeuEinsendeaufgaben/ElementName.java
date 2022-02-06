package uebungNeuEinsendeaufgaben;

// Die Klasse (ElementName)
public class ElementName {

	// 1. Klassenvariable (name)
	private String name;
	
	private String letzter;

	// 2. Klassenvariable (weitererName)
	private ElementName weitererName;

	// Konstruktor aufruf hier wird name initialisiert.
	public ElementName(String name) {
		this.name = "Name: " + name;
	}

	
	static void letzter(String name, ElementName weitererName) {
		// Die Zeichenkette setzten
		ElementName.letzter(null, weitererName);
		// das Ende markieren
		ElementName.letzter(name, weitererName);
	}
	// Methode hinzufügen, mit dem Parameter (String neuerName) wird wenn der letzte
	// (weitererName gleich null ist),
	// dann soll ein neues Element erzeugen.
	public void hinzufuegen(String neuerName) {
		if (weitererName == null) {
			weitererName = new ElementName(neuerName);

		} else {
			// danach rufet sich die Methode hinzufügen selber wieder auf das nennt man
			// rekursion.
			weitererName.hinzufuegen(neuerName);
		}
	}

	public void loeschen(String name) {
		// Wenn der weitererName ungleich null ist und weitererName der gesuchte Name
		// ist.
		if (weitererName != null && weitererName.name.contains(toString(name))) {

			// dann wird der gesuchte Name rausgelöscht und die Namenskette zusammen
			// gesetzt.
			weitererName = weitererName.weitererName;

		} else if (weitererName != null) {
			// danach rufet sich die Methode löschen selber wieder auf das nennt man
			// rekursion.
			weitererName.loeschen(name);
		}
	}

	public void ausgeben() {
		// Hier wird der Name auf der Konsole ausgegeben
		System.out.print(name);

		// Wenn weitererName unglich null , das heißt wenn nach den Namen immer noch
		// mehr Namen kommen und es nicht der leer ist also null
		// das also kein neues Element kommt dann kommt zwischen jeden Namen -> -> ->.
		if (weitererName != null) {
			System.out.print(" -> -> -> ");

			// danach rufet sich die Methode ausgeben selber wieder auf das nennt man
			// rekursion.
			weitererName.ausgeben();
			System.out.println();
		}

	}

	// Die toString Methode liefert eine Zeichenkette. Und liefert uns den Wert über
	// return zurück.
	public String toString(String name) {
		return name;

	}
}
