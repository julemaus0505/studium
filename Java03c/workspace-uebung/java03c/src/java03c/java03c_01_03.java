package java03c;

/* #################################################
Logisches ODER
################################################# */

public class java03c_01_03 {

	public static void main(String[] args) {
		System.out.println("A \t B \t\t A || B");
		System.out.println("wahr \t wahr \t\t " + (true || true));
		System.out.println("wahr \t falsch \t " + (true || false));
		System.out.println("falsch \t wahr \t\t " + (false || true));
		System.out.println("falsch \t falsch \t " + (false || false));
	}

}
