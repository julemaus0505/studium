package aufgaben;

/*  ################################################
Die Gleitkommatypen von Java
################################################# */

public class Java02c_04_3 {

	public static void main(String[] args) {
		float floatVariable;
		double doubleVariable;

		//Ausgabe von Gleitkommazahlen mit Standardeinstellungen
		System.out.println("Ausgabe von Gleitkommazahlen:");
		System.out.println("Standardeinstellungen:");
		System.out.println("=======================");
		//die Zuweisung eines floats wird durch das f markiert
		floatVariable = 10000000000f;
		System.out.println("Große Zahlen (10000000000): " + floatVariable);
		System.out.println("Kommazahlen (1.33333333333333333333)");
		floatVariable =  1.33333333333333333333f;
		System.out.println("Als float: " + floatVariable);
		doubleVariable =  1.33333333333333333333;
		System.out.println("Als double: " + doubleVariable);
		//Ausgabe von Gleitkommazahlen mit geänderten Einstellungen
		System.out.println("\n\n18 Stellen:");
		System.out.println("=======================");
		floatVariable = 10000000000f;
		//für die Angabe der Genauigkeit benutzen wir System.out.printf()
		System.out.printf("Große Zahlen (10000000000): %.18f\n", floatVariable);
		System.out.println("Kommazahlen (1.33333333333333333333)");
		floatVariable =  1.33333333333333333333f;
		System.out.printf("Als float: %.18f\n", floatVariable);
		System.out.printf("Als double: %.18f\n", doubleVariable);
		//jetzt verändert sich die Genauigkeit der Nachkommastellen
		floatVariable =  1001.33333333333333333333f;
		System.out.printf("Als float: %.18f\n", floatVariable);

	}

}
