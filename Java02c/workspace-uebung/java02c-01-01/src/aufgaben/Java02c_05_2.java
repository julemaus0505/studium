package aufgaben;

/*  #################################################
Divisionen mit verschiedenen Datentypen
################################################## */

public class Java02c_05_2 {

	public static void main(String[] args) {
		//Vereinbarung der Variablen
				int intVariable1, intVariable2;
				double doubleVariable1, doubleVariable2, doubleVariable3;

				//Wertzuweisungen
				intVariable1 = 10;
				doubleVariable1  = 10;
				intVariable2 = 3;
				doubleVariable2 = 3;
				
				//double / double
				doubleVariable3 = doubleVariable1 / doubleVariable2;
				System.out.println("double / double = " + doubleVariable3);
				//int / double
				doubleVariable3 = intVariable1 / doubleVariable2;
				System.out.println("int / double = " + doubleVariable3);
				//double / int
				doubleVariable3 = doubleVariable1 / intVariable2;
				System.out.println("double / int = " + doubleVariable3);
				//int / int
				doubleVariable3 = intVariable1 / intVariable2;
				System.out.println("int / int = " + doubleVariable3);

	}

}
