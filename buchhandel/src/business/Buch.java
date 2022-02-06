package business;

public class Buch {

	private String bildPfad;

	private boolean gebunden;

	private boolean buchLieferbar;

	private String titel;

	private double preis;

	private String autor;

	private String beschreibung;

	private String produktdetails;

	private String mehrwertsteuer;

	private String sofortLieferbar;

	private String isbn;
	
	private String kaufen;

	public Buch(String bildPfad, String titel, double preis, String autor, String beschreibung, String isbn,
			boolean gebunden, boolean buchLieferbar, String produktdetails, String mehrwertsteuer,
			String sofortLieferbar, String kaufen) {
		
		this.bildPfad = bildPfad;
		this.titel = titel;
		this.preis = preis;
		this.autor = autor;
		this.beschreibung = beschreibung;
		this.isbn = isbn;
		this.gebunden = gebunden;
		this.buchLieferbar = buchLieferbar;
		this.produktdetails = produktdetails;
		this.mehrwertsteuer = mehrwertsteuer;
		this.sofortLieferbar = sofortLieferbar;
		this.kaufen = kaufen;
	}

	public String getBildPfad() {
		return bildPfad;

	}

	public String getTitel() {
		return titel;

	}

	public double getPreis() {
		return preis;

	}

	public String getAutor() {
		return autor;

	}

	public String getBeschreibung() {
		return beschreibung;

	}

	public String getIsbn() {
		return isbn;

	}

	public boolean isGebunden() {
		return gebunden;

	}

	public boolean isBuchLieferbar() {
		return buchLieferbar;

	}

	public String getProduktdetails() {
		return produktdetails;

	}

	public String getMehrwertsteuer() {
		return mehrwertsteuer;

	}

	public String getSofortLieferbar() {
		return sofortLieferbar;

	}
	
	public String getKaufen() {
		return kaufen;
		
	}
}
