package java08c_05_09;

public class AbbruchException extends Exception {

	private static final long serialVersionUID = -7664843973233868696L;

	//der Standardkonstuktor
	AbbruchException() {
		super();
	}
	
	//der Konstruktor zur �bergabe einer Meldeung
	//er ruft �ber super den Konstuktor der Baiseklasse auf
	AbbruchException(String meldung) {
		super(meldung);
	}
}
