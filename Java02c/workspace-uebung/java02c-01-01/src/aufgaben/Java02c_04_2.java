package aufgaben;

/*  ################################################
Ein provozierter �berlauf
################################################# */

public class Java02c_04_2 {

	public static void main(String[] args) {
		//Vereinbarung der Variablen
				byte byteVariable = 127;
				System.out.println("Die Variable hat den Wert: " + byteVariable);
				//jetzt erh�hen wir den Wert um 1 �ber den Inkrementoperator
				byteVariable++;
				System.out.println("127 + 1 ist gleich " + byteVariable + "???");

	}

}
