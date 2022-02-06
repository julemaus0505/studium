package aufgaben;

/*  ################################################
Typecasting
################################################# */

public class Java02c_05_3 {

	public static void main(String[] args) {
		//Vereinbarung der Variablen
				int intVariable1, intVariable2;
				double doubleVariable1, doubleVariable2, doubleVariable3;
				
				//Wertzuweisungen
				intVariable1 = 10;
				doubleVariable1  = 10;
				intVariable2 = 3;
				doubleVariable2 = 3;

				//beide double werden zum int, das Ergebnis wird falsch
				doubleVariable3 = (int)doubleVariable1 / (int)doubleVariable2;
				System.out.println("(int)double / (int)double = " + doubleVariable3);
				//ein int wird zum double, das Ergebnis stimmt
				doubleVariable3 = (double)intVariable1 / intVariable2;
				System.out.println("(double)int / int = " + doubleVariable3);
				//noch einmal zur Kontrolle ohne Casting, das Ergebnis ist wieder falsch
				doubleVariable3 = intVariable1 / intVariable2;
				System.out.println("int / int = " + doubleVariable3);
				//der gesamte Ausdruck wird gecastet
				doubleVariable3 = (double)(intVariable1 / intVariable2);
				System.out.println("(double)(int / int) = " + doubleVariable3);
				
				byte byteZahl1, byteZahl2, byteZahl3;
				byteZahl2 = 10;
				byteZahl3 = 20;
				//das geht nicht!!!
				//byteZahl1 = byteZahle2 + byteZahl3;
				//und geht auch nicht
				byteZahl1 = (byte) ((byte)byteZahl2 + (byte)byteZahl3);
				//so ist es möglich
				byteZahl1 = 10 + 20;
				//und auch über Casting des gesamten ASusdrucks
				byteZahl1 = (byte)(byteZahl2 + byteZahl3);
				
		

	}

}
