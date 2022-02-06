package uebungen_vererbung_6_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SaucentypModel {

	public ObservableList<Saucen> lieferSaucen() {

		ObservableList<Saucen> saucenList = FXCollections.observableArrayList();

		Saucen sauceCurryDressing = new Saucen();
		sauceCurryDressing.setNamen("CURRY-DRESSING");
		saucenList.add(sauceCurryDressing);

		Saucen sauceAmericanDressing = new Saucen();
		sauceAmericanDressing.setNamen("AMERICAN-DRESSING");
		saucenList.add(sauceAmericanDressing);

		Saucen sauceKnoblauchDressing = new Saucen();
		sauceKnoblauchDressing.setNamen("KNOBLAUCH-DRESSING");
		saucenList.add(sauceKnoblauchDressing);

		Saucen sauceBalsamicoDressing = new Saucen();
		sauceBalsamicoDressing.setNamen("BALSAMICO-DRESSING");
		saucenList.add(sauceBalsamicoDressing);

		Saucen sauceSourCream = new Saucen();
		sauceSourCream.setNamen("SOUR CREAM");
		saucenList.add(sauceSourCream);

		Saucen sauceSuessSauer = new Saucen();
		sauceSuessSauer.setNamen("Süß Sauer");
		saucenList.add(sauceSuessSauer);

		Saucen sauceKetchup = new Saucen();
		sauceKetchup.setNamen("PORTION KETCHUP");
		saucenList.add(sauceKetchup);

		Saucen sauceMayonnaise = new Saucen();
		sauceMayonnaise.setNamen("PORTION MAYONNAISE");
		saucenList.add(sauceMayonnaise);

		return saucenList;

	}

}
