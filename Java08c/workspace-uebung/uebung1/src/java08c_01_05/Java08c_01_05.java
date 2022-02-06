package java08c_01_05;

/*##############################################
 * Plausibilit�tspr�fungen im Konstruktor
 ###############################################*/ 


public class Java08c_01_05 {
	public static void main(String[] args) {
		//eine neue Instanz f�r den Wein erzeugen
		Wein flasche1 = new Wein(10,20.5);
		//den Preis ausgeben
		System.out.println(flasche1.getPreisProFlasche());
		
		//eine neue Instanz mit unsinnigen Werten erzeugen
		Wein flasche2 = new Wein(-10,20.5);
		//den Preis ausgeben
		System.out.println(flasche2.getPreisProFlasche());
	}
}
