package uebungen_vererbung_6_fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SchaerfegradModel {

	ObservableList<Schaerfegrad> lieferSchaerfegrad() {

		ObservableList<Schaerfegrad> schaerfegradList = FXCollections.observableArrayList();

		Schaerfegrad schaerfegrad1 = new Schaerfegrad();
		schaerfegrad1.setName("Schärfegrad 1");
		schaerfegradList.add(schaerfegrad1);

		Schaerfegrad schaerfegrad2 = new Schaerfegrad();
		schaerfegrad2.setName("Schärfegrad 2");
		schaerfegradList.add(schaerfegrad2);

		Schaerfegrad schaerfegrad3 = new Schaerfegrad();
		schaerfegrad3.setName("Schärfegrad 3");
		schaerfegradList.add(schaerfegrad3);

		Schaerfegrad schaerfegrad4 = new Schaerfegrad();
		schaerfegrad4.setName("Schärfegrad 4");
		schaerfegradList.add(schaerfegrad4);

		Schaerfegrad schaerfegrad5 = new Schaerfegrad();
		schaerfegrad5.setName("Schärfegrad 5");
		schaerfegradList.add(schaerfegrad5);

		Schaerfegrad schaerfegrad6 = new Schaerfegrad();
		schaerfegrad6.setName("Schärfegrad 6");
		schaerfegradList.add(schaerfegrad6);

		Schaerfegrad schaerfegrad7 = new Schaerfegrad();
		schaerfegrad7.setName("Schärfegrad 7");
		schaerfegradList.add(schaerfegrad7);

		Schaerfegrad schaerfegrad8 = new Schaerfegrad();
		schaerfegrad8.setName("Schärfegrad 8");
		schaerfegradList.add(schaerfegrad8);

		Schaerfegrad schaerfegrad9 = new Schaerfegrad();
		schaerfegrad9.setName("Schärfegrad 9");
		schaerfegradList.add(schaerfegrad9);

		Schaerfegrad schaerfegrad10 = new Schaerfegrad();
		schaerfegrad10.setName("Schärfegrad 10");
		schaerfegradList.add(schaerfegrad10);

		return schaerfegradList;

	}

}
