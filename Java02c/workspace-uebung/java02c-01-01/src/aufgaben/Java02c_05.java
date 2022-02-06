package aufgaben;

public class Java02c_05 {

	public static void main(String[] args) {
		double longZahl = 1234567891234567L;
		double intZahl = 100;
		double doubleZahle = 1.2;
		double byteZahle = 10;
		//diese Zuweiseungen sind möglich
		longZahl = intZahl;
		doubleZahle = intZahl;
		doubleZahle = longZahl;
		longZahl = byteZahle;
		//diese dagegen nicht
		intZahl = longZahl;
		intZahl = doubleZahle;
		byteZahle = intZahl;
	}

}
