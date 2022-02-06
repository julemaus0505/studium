package uebungen_vererbung_3;

public class Uebung3 {

	public static void main(String[] args) {

		Hund kira = new Hund();
		kira.setGroesse(55);
		
		

		Hund bello = new Hund();
		bello.setGroesse(107);

		System.out.println("Kira ist " + kira.getGroesse() + " cm Groﬂ.");
		kira.bellen();

		System.out.println("Bello ist " + bello.getGroesse() + " cm Groﬂ.");
		bello.bellen();

		Jagdhund oscar = new Jagdhund();
		oscar.setGeschwindigkeit(22);
		oscar.fass("Sascha");
		oscar.bellen();
		
		EntfesselterJagthund gudio = new EntfesselterJagthund();
		gudio.setBlutdurst("durstig");
		gudio.setGeschwindigkeit(12);
		gudio.setGroesse(25);
		
		System.out.println("Gudio rennt " +  gudio.getGeschwindigkeit() + " kmh schnell.");
		System.out.println("Gudio ist " + gudio.getGroesse() + " groﬂ.");
		System.out.println("Gudio ist " + gudio.getBlutdurst() + " .");
		
		gudio.fass("Marcus");
		gudio.bellen();
		gudio.zerfetze(2);
		
		
		
		
	}
	
	
	

}
