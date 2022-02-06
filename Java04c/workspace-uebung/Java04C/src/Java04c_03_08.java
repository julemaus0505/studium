
/* #################################################
Die Klasse StringBuilder
################################################# */

public class Java04c_03_08 {
	public static void main(String[] args) {
		// ein StringBuilder-Objekt mit dem Inhalt R�tsel erzeugen
		StringBuilder zBuilder = new StringBuilder("R�tsel");
		System.out.println(zBuilder);

		// eine Zeichenkette �ber append() anh�ngen
		// ge�ndert wird direkt die Zeichenkette
		zBuilder.append("haft ist manches Mal das Programmieren.");
		System.out.println(zBuilder);

		// einf�gen geht auch
		zBuilder.insert(zBuilder.length(), " Aber auch spannend.");
		System.out.println(zBuilder);

		// l�schen ebenso
		zBuilder.delete(0, 10);
		System.out.println(zBuilder);

		// f�r andere Funktionen k�nnen Sie StringBuilder in einen normalen String
		// umbauen
		zBuilder.insert(0, "     ");
		System.out.println(zBuilder);
		System.out.println(zBuilder.toString().trim());
		System.out.println(zBuilder);
	}
}
