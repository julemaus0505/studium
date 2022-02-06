package uebungen_vererbung_6_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import uebungen_vererbung_6.Pizza;
import uebungen_vererbung_6.PizzaSpecial2012;
import uebungen_vererbung_6.Sonderangebot;

public class PizzaModel {

	public ObservableList<Pizza> lieferPizzen() {

		ObservableList<Pizza> pizzaList = FXCollections.observableArrayList();

		Pizza pizzaSalami = new Pizza();
		pizzaSalami.setName("Pizza Salami");
		pizzaSalami.setPreis(7.90f);
		pizzaList.add(pizzaSalami);

		Pizza pizzaThunfisch = new Pizza();
		pizzaThunfisch.setName("Pizza Thunfisch");
		pizzaThunfisch.setPreis(15.00f);
		pizzaList.add(pizzaThunfisch);

		PizzaSpecial2012 pizzaSpecial = new PizzaSpecial2012();
		pizzaSpecial.setName("PizzaSpecial2012");
		pizzaSpecial.setPreis(12.90f);
		pizzaList.add(pizzaSpecial);

		Pizza pizzaHawaii = new Pizza();
		pizzaHawaii.setName("Pizza Hawaii");
		pizzaHawaii.setPreis(7.90f);
		pizzaList.add(pizzaHawaii);

		Pizza pizzaJuliet = new Pizza();
		pizzaJuliet.setName("Pizza Juliet ,Currysauce,Hähnchen,Paprika");
		pizzaJuliet.setPreis(9.90f);
		pizzaList.add(pizzaJuliet);

		Sonderangebot sonderangebot = new Sonderangebot();
		sonderangebot.setName("Sonderangebot mit Rabatt von 25% ");
		sonderangebot.setPreis(14.90f);
		sonderangebot.getRabatt();
		pizzaList.add(sonderangebot);

		return pizzaList;

	}

}
