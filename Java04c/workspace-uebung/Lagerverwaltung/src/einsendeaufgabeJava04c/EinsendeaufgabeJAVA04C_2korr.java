
	/* ##################################
	Einsendeaufgabe 4
	korrigierte Version
	###################################*/

	package einsendeaufgabeJava04c;

	import javax.swing.*;

	public class EinsendeaufgabeJAVA04C_2korr {

	//Vereinbarung des Aufz�hlungstyps Auswahl
	enum Auswahl {A, B, C, D, E}

	// Klassenvariablen f�r die Fehlerausgabe aus verschiedenen Methoden
	static String Fehler;
	static String MeldungAbbruch = "Sie haben die Eingabe abgebrochen";

	public static void main(String[] args) {
			
			// Vereinbarung eines zweidimensionalen Arrays vom Typ int mit 75 "Zeilen" und 4 "Spalten" 
			//f�r die Aufnahme von Daten von 75 Kisten (Nummer, L�nge, Breite, H�he)
			int kistenArray [][] = new int[75][4];
			//Vereinbarung einer String-Variable f�r die Eingabe aus dem Auswahlmen�
			String auswahl;
			//Vereinbarung einer Char-Variable f�r die Umwandlung der String-Variable auswahl
			char wahl;
			//Vereinbarung der Variable operation vom Aufz�hlungstyp "Auswahl" und Initialisierung dieser mit A
			// ohne Initialisierung zeigt eclipse eine Fehlermeldung in der Kontrollstruktur switch (operation) an, 
			//da die Variable sonst dort nicht initialisiert sein k�nnte. 
			Auswahl operation = Auswahl.A;
				
			//Schleife f�r die Anzeige des Auswahlmen�s. Sofern nicht abgebrochen wird, wird das Men� immer wieder angezeigt.
			while (true) { //potenzielle Endlosschleife
				
				//EINGABE
				//Auswahlmen� f�r die einzelnen Funktionen
				auswahl = JOptionPane.showInputDialog("LAGERVERWALTUNG\n\n" 
						+ "Welche Funktion m�chten Sie ausf�hren?\n\n"
						+ "tippen Sie:\n\n" 
						+ " a   um eine neue Kiste anzulegen\n"
						+ " b   um eine Kiste zu l�schen\n"
						+ " c   um die Daten einer Kiste zu �ndern\n"
						+ " d   um die Daten einer Kiste anzuzeigen\n"
						+ " e   um eine Liste aller Kisten anzuzeigen\n\n");

			//Fehlerbehandlung f�r Abbruch
			if (auswahl == null)
			break; //Endlosschleife wird unterbrochen

			else {
				
				//Fehlerbehandlung f�r OK ohne Eingabe
				if (auswahl.trim().length() == 0)
					//Zuweisung von z. B. "x", damit der default-Zweig der 1. Kontrollstruktur ausgef�hrt wird 
					//(Entspricht damit der Eingabe eines falschen Zeichens)
					auswahl = "x";				
		
				//Umwandlung der Eingabe (1. Stelle) in eine char-Variable. 
				//Die Umwandlung erfolgt erst hier, da vorher die Fehlerbehandlung geschieht.
				wahl = auswahl.charAt(0);
				
				/*
				Kontrollstruktur f�r die Eingaben; unter -default- erfolgt die Generierung einer Fehlermeldung 
				(falls ein anderes Zeichen als a - e eingegeben wurde).
				Hier werden die Eingaben der Aufz�hlung "operation" zugeordnet - 
				dieser Schritt w�re nicht notwendig, der Aufruf der entsprechenden Methoden k�nnte auch bereits hier erfolgen.
				Im Rahmen dieser Aufgabe wollte ich die Aufz�hlung aber �ben. Vorteil: Die Zuweisung der einzelnen Methoden ist
				sehr �bersichtlich und es wird keine Fehlerbehandlung mehr ben�tigt.
				*/
				switch (wahl) {
					case 'a':
					case 'A':
						operation = Auswahl.A;
						break;
					case 'b':
					case 'B':
						operation = Auswahl.B;
						break;
					case 'c':
					case 'C':
						operation = Auswahl.C;
						break;
					case 'd':
					case 'D':
						operation = Auswahl.D;
						break;
					case 'e':
					case 'E':
						operation = Auswahl.E;
						break;
					default:
						Fehler = "Bitte machen Sie eine g�ltige Eingabe!";
						break;
				}
				
				//VERARBEITUNG und AUSGABE
				//Kontrollstruktur f�r den Aufruf der Methoden zur Ausf�hrung der einzelnen Funktionen.
				//Es wird jeweils die gesamte Referenz des Arrays an die jeweilige Methode �bergeben und dort weiterverarbeitet.
				//Eine Fehlerbehandlung bzw. ein default-Zweig ist hier nicht mehr notwendig, da nur die F�lle A - E m�glich sind.
				
				if (Fehler == null) {
					switch (operation) {
						case A:
							kisteNeu(kistenArray);
							break;
						case B:
							kisteLoeschen(kistenArray);
							break;
						case C:
							kisteAendern(kistenArray);
							break;
						case D:
							kisteAnzeigen(kistenArray);
							break;
						case E:
							kisteAlle(kistenArray);
							break;
					}
				}
			}
			//Ausgabe Fehlermeldung
			if (Fehler!=null) {
			fehlerAusgabe(Fehler);
			Fehler = null;} //Fehlermeldungstext nach Ausgabe zur�cksetzen
				
			//Ausgabe von Zeilen-Trennzeichen, um die Ausgaben der einzelnen Routinen besser unterscheiden zu k�nnen.
			System.out.println("##########################################################################################################################");
			}
				
			//Dieser Schritt wird bei der Behandlung der Schaltfl�che Abbrechen im Hauptmen� ausgef�hrt.
			Fehler = "Sie haben das Programm beendet, bitte starten Sie es bei Bedarf neu";
			fehlerAusgabe(Fehler);
			System.exit(0);
	}


	//Operation A: Methode zur Anlage einer neuen Kiste. Parameter ist wie in den folgenden Methoden f�r die "Operationen" A-E
	//jeweils ein zweidimensionales Array, welches die gesamte Referenz des Arrays kistenArray aus der Methode main() 
	//aufnehmen kann - das Array wurde zur besseren Nachvollziehbarkeit mit dem gleichen Namen versehen. Der R�ckgabetyp ist leer.
	static void kisteNeu(int[][] kistenArray) {
		
	//Vereinbarung der int-Variable index (zum hochz�hlen, bis eine freie "Stelle" gefunden wird). 
	//Gleichzeitige Initialisierung mit 0
	int index = 0;
	//Vereinbarung und Initialisierung eines boolean-Markers, wenn eine freie Stelle (ein freier Index) gefunden wird.
	boolean marker = false;
	//Suche des n�chsten freien Index (wenn Kistennummer = 0)
	while (marker == false) {
		if (kistenArray[index][0] == 0) {
			//wenn der �u�ere Index 0 entspricht (keine Kistennummer), dann wird der Marker auf true gesetzt.
			marker = true; }
		else {
			//sonst hochz�hlen des Index
			index++; }
			if (index == kistenArray.length) marker = true; //Sonst erscheint ein Fehler beim �berschreiten des Index beim hochz�hlen!
	}
			
		// wenn der Index zu gro� ist, w�rde ein �berlauf eintreten. Dies wird hier abgefangen.
		// Ist der Index kleiner als das Array, wird die Eingabe der Daten gestartet.
		if (index < kistenArray.length) {
			
			//Eingabe der Kistennummer 
			int nr = positiveGanzzahlEingabe("Bitte geben Sie die Kistennummer als ganze Zahl ein!");	
			
			if (nr != -1) { //wenn nicht abgebrochen wurde
				//Pr�fung, ob die Kistennummer bereits existiert. 
				//Daf�r werden der Methode pruefungNr() als Argumente das gesamte Array sowie die Kistennummer �bergeben.
				//Der R�ckgabetyp der Methode ist int. 
				int pruefung = pruefungNr(kistenArray, nr);
				
					//Wenn die Nummer noch nicht existiert:
					if (pruefung == -1) {
			
						kistenArray[index][0] = nr;			
						//Schleife zum F�llen der Daten der Kiste (L�nge, Breite, H�he). 
						//Die Methode masseLBH() wird direkt bei der Methode selbst erl�utert.
						//Die Stellen 1 bis 3 (L�nge, Breite, H�he) werden �ber eine Schleife gef�llt.
							int mass = 0;
							for (int i = 0; i < 3; i++) {
								mass = masseLBH(i);
								if (mass != -1)
									kistenArray[index][i + 1] = mass;
								else {
									kistenArray[index][0] = 0;
									Fehler = "Sie haben die Eingabe abgebrochen!";
									i = 3;
								}
							}
						//Erfolgsmeldung
						if (Fehler == null) 
							System.out.println("Die Kiste mit der Nummer " + nr 
								+ " wurde erfolgreich neu angelegt");
					}
					else 
						//Meldungstext, wenn die Kiste bereits existiert
						Fehler = "Die Kiste mit der Nummer " + nr 
						+ " existiert bereits und kann deshalb nicht neu angelegt werden";
			}
			else 
				Fehler = MeldungAbbruch;
		}
		else
			//Meldungstext, wenn keine Kiste mehr angelegt werden kann
			Fehler = "Die Datenbank ist voll. Bitte l�schen Sie zun�chst mindestens einen Datensatz";
	}



	//Operation B: Methode zum L�schen einer Kiste
	static void kisteLoeschen(int[][] kistenArray) {
	if (datenbankLeer(kistenArray) == false) {
		
		//Einlesen der Kistennummer und der Pr�fung, ob die Nummer bereits existiert (analog Operation A) 
		int nr = positiveGanzzahlEingabe("Bitte geben Sie die Nummer der zu l�schenden Kiste ein");
		if (nr != -1) {
			int pruefung = pruefungNr(kistenArray, nr);
				if (pruefung > -1) {
					//Wenn die Nummer existiert, werden die Daten dieser Kiste gel�scht bzw. auf 0 gesetzt.
					for (int i = 0; i < 4; i++) {
						kistenArray[pruefung][i] = 0;
					}	
					System.out.println("Die Kiste mit der Nummer " + nr + " wurde erfolgreich gel�scht");
				}
				//Wenn die Nummer nicht existiert:
				if (pruefung == -1) {
					//wenn die Nummer nicht existiert, dann wird �ber die Methode nrLeer() eine entsprechende Meldung ausgegeben.
					//Als Argument wird die eingegebene Nummer �bergeben.
					nrLeer(nr);
				}
		}
		else {
			Fehler = MeldungAbbruch;
		}
	}
	}


	//Operation C: Methode zum �ndern einer Kiste
	static void kisteAendern(int[][] kistenArray) {
		
		//Methoden analog Operation A & B
	if (datenbankLeer(kistenArray) == false) {
		int nr = positiveGanzzahlEingabe("Bitte geben Sie die Nummer der zu �ndernden Kiste ein");
		if (nr != -1) {
			int pruefung = pruefungNr(kistenArray, nr);
			if (pruefung > -1) {
				int mass = 0;
				for (int i = 0; i < 3; i++) {
					mass = masseLBH(i);
					if (mass != -1)
						kistenArray[pruefung][i + 1] = mass;
					else {
						Fehler = "Sie haben die Eingabe abgebrochen. Bitte pr�fen Sie den Datensatz!";
						i = 3;
					}
				}
					if (Fehler == null) System.out.println("Die Kiste mit der Nummer " + nr + " wurde erfolgreich ge�ndert");
			}
			//Wenn die Nummer nicht existiert:
			if (pruefung == -1) {
				nrLeer(nr);;
			}
		}
		else {
			Fehler = MeldungAbbruch;
		}
	}
	}


	//Operation D: Methode zum Anzeigen einer Kiste
	static void kisteAnzeigen(int[][] kistenArray) {
		
		//Methoden analog Operation A - C
	if (datenbankLeer(kistenArray) == false) {
		int nr = positiveGanzzahlEingabe("Bitte geben Sie die Nummer der anzuzeigenden Kiste ein");
		if (nr != -1) {
			int pruefung = pruefungNr(kistenArray, nr);
				if (pruefung > -1) {
					//Ausgabe der Daten der Kiste
					System.out.println("Die Kiste mit der Nummer " + kistenArray[pruefung][0] + " hat die Ma�e:"
							+ "\t\tL�nge:\t" + kistenArray[pruefung][1] + " cm"
							+ "\t\tBreite:\t" + kistenArray[pruefung][2] + " cm"		
							+ "\t\tH�he:\t" + kistenArray[pruefung][3]+ " cm");
				}
				//Wenn die Nummer nicht existiert:
				else {
					nrLeer(nr);
				}
		}
		else {
			Fehler = MeldungAbbruch;
		}
	}
	}


	//Operation E: Methode zur Ausgabe der Daten aller Kisten
	static void kisteAlle(int[][] kistenArray) {
		
	if (datenbankLeer(kistenArray) == false) {
		//Schleife zum Durchlauf des gesamten Arrays
		for(int index=0; index<kistenArray.length; index++) {
			if (kistenArray[index][0] != 0)
				// Wenn die Kistennummer nicht 0 ist, werden die Informationen ausgegeben.
				System.out.println("Die Kiste mit der Nummer " + kistenArray[index][0] + " hat die Ma�e:"
				+ "\t\tL�nge:\t" + kistenArray[index][1] + " cm"
				+ "\t\tBreite:\t" + kistenArray[index][2] + " cm"		
				+ "\t\tH�he:\t" + kistenArray[index][3]+ " cm");	
		}
	}
	}


	static boolean datenbankLeer(int[][]kistenArray) {
	boolean leer = false;

	//Vereinbarung und Initialisierung einer Variable als Z�hler zur Pr�fung, ob die Datenbank leer ist
	int zaehler = 0;
	//Schleife zum Durchlauf des gesamten Arrays
	for(int index=0; index<kistenArray.length; index++) {
		if (kistenArray[index][0] == 0)
			zaehler++;
	}
		if (zaehler == kistenArray.length) {
			Fehler =  "Die Datenbank enth�lt keine Datens�tze";
			leer = true;
		}
	return leer;
	}


	//Methode zum Einlesen einer positiven ganzen Zahl
	static int positiveGanzzahlEingabe(String text) {
		int nr = 0;
		String nrRoh;
		String meldungUngueltig = "Ihre Eingabe war nicht g�ltig. Bitte wiederholen!";
		boolean gelungen, ungueltig;
		
		do { 
			gelungen = false; //f�r Umwandlung nrRoh in nr
			ungueltig = false; //f�r nicht g�ltige Zahlen (0 und Negative au�er -1)
			
			while (gelungen == false) {
				nrRoh = JOptionPane.showInputDialog(text);
			
				if (nrRoh == null) {
					nr = -1;
					gelungen = true; 
				}
				else {
					try {
						nr = Integer.parseInt(nrRoh);
						gelungen = true;
					}
					//wenn nicht, wird eine Meldung ausgegeben und die Schleife wiederholt
					catch (NumberFormatException e) {
						fehlerAusgabe(meldungUngueltig);
					}
				}
			}
			if (nr == 0 || nr < -1) {
				fehlerAusgabe(meldungUngueltig);
				ungueltig = true;
			}
		} while (ungueltig);
						
		return nr;
	}

	//Methode zur Pr�fung, ob eine Kisten-Nummer bereits existiert. Die Methode liefert den Index der Position zur�ck.
	//Falls die Kisten-Nummer nicht existiert, wird -1 zur�ckgeliefert.
	//Parameter sind ein zweidimensionales int-Array 
	//f�r die Aufnahme des Arrays aus der Methode main() sowie eine int-Variable f�r die Kisten-Nummer.
	static int pruefungNr (int[][]kistenArray, int nr) {
		int pruefung = -1;
		//Pr�fung, ob die Nummer bereits vorhanden ist
			for (int index=0; index<kistenArray.length; index++) {
				//Wenn die Kiste existiert:
				if (kistenArray[index][0] == nr) {
					pruefung = index;
				}
			}
		return pruefung;
	}


	//die Methode liefert einen von drei Werten (L�nge, Breite, H�he) zur�ck. Parameter ist eine int-Variable,
	//um �ber die switch-Struktur den relevanten Fall ermitteln zu k�nnen.
	static int masseLBH(int i) {
		int masse;
		//String-Variablen f�r die Fragen des Eingabedialoges;
		String dimension = null;
		String frageTeil1 = "Bitte geben Sie die ";
		String frageTeil2 = " der Kiste in cm als ganze Zahl ein";
		
		//�ber die Kontrollstruktur wird der aus der Schleife �bergebene Fall ermittelt (L�nge, Breite oder H�he)
		switch (i) {
			//Einlesen der L�nge und Ablage im Index 0
			case 0:
				dimension = "L�nge";
			break;
			//Einlesen der Breite und Ablage im Index 1
			case 1:
				dimension = "Breite";
			break;
			//Einlesen der H�he und Ablage im Index 2
			case 2:
				dimension = "H�he";
			break;
		}
		masse = positiveGanzzahlEingabe(frageTeil1 + dimension + frageTeil2);
		return masse;
	}


	//Methode zur Ausgabe eines Textes, wenn die gew�hlte Kiste nicht vorhanden ist
	static void nrLeer(int nr) {
		Fehler = "Die Kiste mit der Nummer " + nr + " existiert leider nicht";
	}


	//Methode zur Ausgabe einer Fehlermeldung bei Fehleingaben
	static void fehlerAusgabe(String fehler) {
		System.out.println(fehler);
	}
	

}