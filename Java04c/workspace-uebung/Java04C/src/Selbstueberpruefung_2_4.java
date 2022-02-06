
public class Selbstueberpruefung_2_4 {

	public static void main(String[] args, String[] test) {
		// TODO Auto-generated method stub

		for (int index = 0; index < 10; index++)
			System.out.println("Das Element hat den Wert " + test[index]);
		for (String element : test)
			System.out.println("Das Element hat den Wert " + element);
		for (int index = 0; index < test.length; index++)
			System.out.println("Das Element hat den Wert " + test[index]);

	}

}
