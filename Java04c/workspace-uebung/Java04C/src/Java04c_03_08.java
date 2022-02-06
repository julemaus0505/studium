
/* #################################################
Die Klasse StringBuilder
################################################# */

public class Java04c_03_08 {
	public static void main(String[] args) {
		// ein StringBuilder-Objekt mit dem Inhalt Rätsel erzeugen
		StringBuilder zBuilder = new StringBuilder("Rätsel");
		System.out.println(zBuilder);

		// eine Zeichenkette über append() anhängen
		// geändert wird direkt die Zeichenkette
		zBuilder.append("haft ist manches Mal das Programmieren.");
		System.out.println(zBuilder);

		// einfügen geht auch
		zBuilder.insert(zBuilder.length(), " Aber auch spannend.");
		System.out.println(zBuilder);

		// löschen ebenso
		zBuilder.delete(0, 10);
		System.out.println(zBuilder);

		// für andere Funktionen können Sie StringBuilder in einen normalen String
		// umbauen
		zBuilder.insert(0, "     ");
		System.out.println(zBuilder);
		System.out.println(zBuilder.toString().trim());
		System.out.println(zBuilder);
	}
}
