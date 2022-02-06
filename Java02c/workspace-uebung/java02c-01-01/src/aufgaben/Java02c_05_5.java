package aufgaben;

/*  ################################################
Umwandlung von Zeichenketten in Zahlen
################################################# */

public class Java02c_05_5 {

	public static void main(String[] args) {
		//Vereinbarung der Variablen
				int intVariable;
				String stringVariable1, stringVariable2;

				//Wertzuweisungen
				stringVariable1 = "10";
				stringVariable2  = "20";

				//SO GEHT ES NICHT!
				//intVariable=(int)(stringVariable1) + (int)(stringVariable2);
				//aber so!
				intVariable=Integer.parseInt(stringVariable1) + Integer.parseInt(stringVariable2);
				System.out.println("Das Ergebnis  = " + intVariable);

	}

}
