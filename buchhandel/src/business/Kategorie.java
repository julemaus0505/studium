package business;

public enum Kategorie {

	KATEGORIE("Kategorie"), BUECHER("B�cher"), EBOOKS("eBooks"), KALENDER("Kalender"), HOEBUECHER("H�rb�cher"),
	FILME("Filme"), SPIELWAREN("Spielwaren"), SCHREIBWAREN("Schreibwaren"), WEIHNACHTEN("Weihnachten"), MUSIK("Musik"),
	GESCHENKARTIKEL("Geschenkartikel"), GAMES("Games");

	private String anzeigename;

	private Kategorie(String anzeigename) {
		this.anzeigename = anzeigename;
	}

	@Override
	public String toString() {

		return anzeigename;
	}
}
