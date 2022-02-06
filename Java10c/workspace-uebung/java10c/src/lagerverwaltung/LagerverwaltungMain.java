package lagerverwaltung;

import lagerverwaltung.fachlogik.Lager;
import lagerverwaltung.ui.LagerverwaltungGUI;

public class LagerverwaltungMain {

	public static void main(String[] args) {
		new LagerverwaltungGUI("Lagerverwaltung 2020", new Lager(80));
	}

}
