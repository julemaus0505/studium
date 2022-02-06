module uebungen {
	exports abstraktenKlasseRechnerMitInterface;
	exports uebung_vererbung_10;
	exports uebungen_vererbung_3;
	exports uebung_vererbung_11;
	exports abstrakteKlassenBaum;
	exports uebung_vererbung_7;
	exports uebungen_vererbung_6_fx;
	exports uebung_vererbung_9;
	exports uebungen_vererbung_6;
	exports uebung_vererbung_8;
	exports abstractKlasseWaehrung;
	exports abstraktenKlasseRechner;
	exports uebung_vererbung_5;

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

	opens abstractKlasseWaehrung to javafx.graphics, javafx.fxml;
}