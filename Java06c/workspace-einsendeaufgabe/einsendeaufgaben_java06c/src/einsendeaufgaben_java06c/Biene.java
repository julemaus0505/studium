package einsendeaufgaben_java06c;

class Biene extends Insekt {
	int geschwindigkeit;

	Biene(int laenge, int gewicht, int geschwindigkeit) {
		super(laenge, gewicht);
		this.geschwindigkeit = geschwindigkeit;

	}

	@Override
	void ausgabe() {
		System.out.println("Das Insekt ist " + laenge + " cm lang und wiegt " + gewicht + " Gramm und sie fliegt " + geschwindigkeit + " km/h schnell.");
	}

	public static void main(String[] args) {

		
		Insekt insekt = new Insekt(12, 2);
		insekt.ausgabe();

		Biene hummel = new Biene(3, 18, 5);
		hummel.ausgabe();
	}
}