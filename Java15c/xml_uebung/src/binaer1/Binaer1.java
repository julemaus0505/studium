package binaer1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Binaer1 {

	//der Konstruktor
	public Binaer1() {
		datenSchreiben();
		datenLesen();
	}

	//die Methode zum Lesen
	private void datenLesen() {
		int wert = 0;
		
		//eine Instanz der Klasse FileInputStream mit der Datei daten.bin
		try (FileInputStream datei = new FileInputStream("daten.bin")) {
			
			//solange das Ende der Datei nich erreicht ist, werden die Werte gelesen
			//und auf der Konsole ausgegeben
			
			wert = datei.read();
			while (wert != -1) {
				System.out.println(wert);
				wert = datei.read();
			}
			
		} catch (Exception e) {
			System.out.println("Beim Laden ist ein Problem aufgetreten");
		}
	}

	//die Mehtode zum Schreieben
	private void datenSchreiben() {
		
		//eine Instanz der Klasse FileOutputStream mit der Datei daten.bin
		try (FileOutputStream datei = new FileOutputStream("daten.bin")) {
			
			//die Werte werden direkt in die Datei geschrieben
			datei.write(100);
			datei.write(110);
			datei.write(120);
			datei.write(255);
			
			//das klappt nicht
			datei.write(256);
			
		} catch (Exception e) {
			System.out.println("Beim Schreiben ist ein Problem aufgetreten");
		}
		
	}
	
}
