package aufgaben;

/*  ################################################
Die ganzzahligen Typen von Java
################################################# */

public class Java02c_04_01 {

	public static void main(String[] args) {
		//Ausgabe der Größe und des Wertebereichs
				//benutzt werden die Klassen für die jeweiligen Datentypen
				System.out.println("Typ\tGröße\tWertebereich");
				System.out.println("byte\t " + Byte.SIZE + "\t" + Byte.MIN_VALUE + " bis " + Byte.MAX_VALUE);
				System.out.println("short\t " + Short.SIZE + "\t" + Short.MIN_VALUE + " bis " + Short.MAX_VALUE);
				System.out.println("int\t " + Integer.SIZE + "\t" + Integer.MIN_VALUE + " bis " + Integer.MAX_VALUE);
				System.out.println("long\t " + Long.SIZE + "\t" + Long.MIN_VALUE + " bis " + Long.MAX_VALUE);

	}

}
