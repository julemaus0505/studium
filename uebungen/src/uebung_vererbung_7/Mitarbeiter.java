package uebung_vererbung_7;

public class Mitarbeiter {

	private String vorname;
	private String nachname;
	private int personalnummer;
	private double gehalt;

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;

	}

	public String getNachname() {
		return nachname;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public double getGehalt() {
		return gehalt;
	}

}
