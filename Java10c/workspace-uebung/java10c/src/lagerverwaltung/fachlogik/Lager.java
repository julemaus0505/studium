package lagerverwaltung.fachlogik;

import java.util.ArrayList;
import java.util.List;

public class Lager {

	// anlegen eines Zweidimensionalen Arrays
	/*
	 * Kistennummer = index + 1
	 */
	public int[][] lager; 

	public Lager(int anzahlPlaetze) {
		lager = new int[anzahlPlaetze][3];
	}

	public boolean loescheDatenEinerKistennummer(int kistennummer) {

		if (kistennummer != 0 && kistennummer <= lager.length) {
			lager[kistennummer - 1][0] = 0;
			lager[kistennummer - 1][1] = 0;
			lager[kistennummer - 1][2] = 0;
			return true;
		}
		return false;
	}

	public int einlagernEinerNeuenKiste(int breite, int hoehe, int laenge) {
		int index = 0;
		int kistennummer = 0;

		while (kistennummer == 0 && index < lager.length) {
			if (lager[index][0] == 0 && lager[index][1] == 0 && lager[index][2] == 0) {
				kistennummer = index + 1;
				lager[index][0] = breite;
				lager[index][1] = hoehe;
				lager[index][2] = laenge;
			}
			index++;
		}
		return kistennummer;
	}

	public boolean aendern(int kistennummer, int breite, int hoehe, int laenge) {
		int index = 0;
		if (kistennummer != 0 && kistennummer <= lager.length) {
			lager[index][0] = breite;
			lager[index][1] = hoehe;
			lager[index][2] = laenge;
			return true;
		}
		return false;
	}

	public int[] beschaffeDatenEinerKiste(int kistennummer) {
		return lager[kistennummer - 1];

	}

	public Integer[][] beschaffeDatenAllerVorhandenenKisten() {
		
		List<Integer> vorhandeneKistennummern = berechneVorhandeneKistennummern();
		Integer[][] rowData = new Integer[vorhandeneKistennummern.size()][4];

		int[] anzeigenAllerKistenDaten;
		for (int i = 0; i < vorhandeneKistennummern.size(); i++) {
			anzeigenAllerKistenDaten = beschaffeDatenEinerKiste(i);
			for (int j = 0; j < anzeigenAllerKistenDaten.length; j++) {
				
			}
			rowData = beschaffeDatenAllerVorhandenenKisten();
					
		} 
		
		return rowData;

	}

	public List<Integer> berechneVorhandeneKistennummern() {
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < lager.length; i++) {
			if (lager[i][0] > 0 && lager[i][1] > 0 && lager[i][2] > 0) {
				result.add(i + 1);
			}
		}
		return result;
	}
}
