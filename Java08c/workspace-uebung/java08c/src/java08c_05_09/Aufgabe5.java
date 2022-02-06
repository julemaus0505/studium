package java08c_05_09;

import java08c_05_05.Ausgabe;

public class Aufgabe5 {
	
	public Aufgabe5() throws AbbruchException {
		
		throw new AbbruchException();
	}
	
	public static void main(String[] args) {
		
		try {
			Aufgabe5 objekt = new Aufgabe5();
			ausgeben();
		} catch (AbbruchException e) {
			e.printStackTrace();
		}
		ergebnis();
		
	}
	
	private static void ausgeben() throws AbbruchException {
		
		System.out.println("Ausgeben");
		throw new AbbruchException("Ausgabe");
	}
	
	private static void ergebnis() {
		System.out.println("Ergebnis");
	}
}
