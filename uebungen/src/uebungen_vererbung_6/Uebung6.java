package uebungen_vererbung_6;

public class Uebung6 {

	public static void main(String[] args) {

		Pizza pizzaSalami = new Pizza();
		pizzaSalami.setName("Pizza Salami");
		pizzaSalami.setPreis(7.90f);

		System.out.println("Sie habe eine " + pizzaSalami.getName() + " mit dem Preis " + pizzaSalami.getPreis()
				+ " Euro bestellt.");

		Pizza pizzaThunfisch = new Pizza();
		pizzaThunfisch.setName("Pizza Thunfisch");
		pizzaThunfisch.setPreis(15.00f);

		System.out.println("Sie habe eine " + pizzaThunfisch.getName() + " mit dem Preis " + pizzaThunfisch.getPreis()
				+ " Euro bestellt.");

		PizzaSpecial2012 pizzaSpecial = new PizzaSpecial2012();
		pizzaSpecial.setName("PizzaSpecial2012");
		pizzaSpecial.setPreis(12.90f);

		pizzaSpecial.setSaucentyp("Süß Sauer");
		pizzaSpecial.setSchaerfegrad(1);

		System.out.println("Sie habe eine " + pizzaSpecial.getName() + ", mit der Sauce " + pizzaSpecial.getSaucentyp()
				+ " und dem Schaerfegrad " + pizzaSpecial.getSchaerfegrad() + " gweählt der Preis ist "
				+ pizzaSpecial.getPreis() + " Euro.");

		
		Pizza pizzaHawaii = new Pizza();
		pizzaHawaii.setName("Pizza Hawaii");
		pizzaHawaii.setPreis(7.90f);

		System.out.println("Sie habe eine " + pizzaHawaii.getName() + " mit dem Preis " + pizzaHawaii.getPreis()
				+ " Euro bestellt.");

		Pizza pizzaJuliet = new Pizza();
		pizzaJuliet.setName("Pizza Juliet ,Currysauce,Hähnchen,Paprika");
		pizzaJuliet.setPreis(9.90f);

		System.out.println("Sie habe eine " + pizzaJuliet.getName() + " mit dem Preis " + pizzaJuliet.getPreis()
				+ " Euro bestellt.");

		Sonderangebot sonderangebot = new Sonderangebot();
		sonderangebot.setName("Sonderangebot");
		sonderangebot.setPreis(14.90f);

		System.out.println("Sie haben sich für unser " + sonderangebot.getName() + " mit dem Preis "
				+ sonderangebot.getPreis() + " Euro entschieden, es gibt auf unser Sonderangebot noch, "
				+ sonderangebot.getRabatt() + " % Rabatt die Zeihen wir Automatisch vom Preis ab.");

	}

}
