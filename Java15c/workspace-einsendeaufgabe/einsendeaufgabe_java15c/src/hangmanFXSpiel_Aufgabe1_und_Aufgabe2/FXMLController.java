package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.io.IOException;
import java.util.List;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLController {
	// das Kombinationsfeld
	@FXML
	private ComboBox<String> auswahl;

	// die Labels für die Ausgaben
	@FXML
	private Label ausgabeText;

	// die Labels für die Anzahl der Versuche
	@FXML
	private Label anzVersuche;

	// die Labels für die Ausgaben Punkte
	@FXML
	private Label punktAusgabe;

	// für die Zeichenfläche
	@FXML
	private Canvas zeichenflaeche;

	// ein Array mit Zeichenketten(!) für die Buchstaben
	private String[] zeichen = new String[26];

	// ein StringBuilder für die Darstellung des Suchwortes
	private StringBuilder anzeige;

	// ein String für das gesuchte Wort im Klartext
	private String suchwort;

	// für die verbleibenden Durchläufe
	private int restDurchlauefe;

	// für die Anzahl der Fehler
	private int fehler;

	// für den Grafikkontext
	private GraphicsContext gc;

	// für die Punkte
	private Score spielpunkte;

	// für die Bühne
	private Stage meineStage;

	// die Methode zur Auswahl aus dem Kombinationsfeld
	@FXML
	protected void auswahlNeu(ActionEvent event) {

		// der aktuell ausgewählte Eintrag wird übergeben und ausgewertet
		pruefen(auswahl.getSelectionModel().getSelectedItem().toString());

		// ist das Spiel zu Ende oder nicht?
		gewinnerOderNicht();
	}

	// die Methode zum Beenden
	@FXML
	protected void beendenKlick(ActionEvent event) {
		Platform.exit();
	}

	// die Methode setzt die Initialwerte
	// sie wird automatisch ausgeführt
	@FXML
	void initialize() throws IOException {
		int tempIndex = 0;

		// es geht los mit 9 verbleibenden Durchläufe
		restDurchlauefe = 9;

		// die restlichen Durchläufe anzeigen
		anzVersuche.setText(Integer.toString(restDurchlauefe));

		// die Liste für das Kombinationsfeld füllen
		for (char temp = 'a'; temp <= 'z'; temp++) {
			zeichen[tempIndex] = Character.toString(temp);
			tempIndex++;
		}

		auswahl.getItems().addAll(zeichen);
		// ein Wort ermitteln
		neuesWort();

		// den Grafikkontext beschaffen
		gc = zeichenflaeche.getGraphicsContext2D();
		spielpunkte = new Score(meineStage);
	}


	// die Methode ermittelt zufüllig ein Wort
	private void neuesWort() throws IOException {
		int zufall = 0;

		// eine Liste mit den Wörtern
		List<String> woerter = WortlisteTextdateiHandler.leseWoerterAusDatei();
		

		// ein zufälliges Wort ermitteln
		// dazu wird eine zufällige Zahl zwischen 0 und 1 ermitteln und mit der Länge
		// von woerter multipliziert
		zufall = (int) (Math.random() * woerter.size());

		// das Suchwort und die Zeichen für die Anzeige setzen
		suchwort = new String(woerter.set(zufall, suchwort));
		anzeige = new StringBuilder(suchwort);

		// alle Zeichen in der Anzeige ersetzen durch *
		for (int zeichen = 0; zeichen < suchwort.length(); zeichen++)
			anzeige.setCharAt(zeichen, '*');

		// die Sternchen anzeigen
		ausgabeText.setText(anzeige.toString());
	}

	// die Methode zum Prüfen
	private void pruefen(Object auswahlZeichen) {
		char zeichen;
		int treffer = 0;

		// das ausgewählte Zeichen aus dem Kombinationsfeld wieder umbauen
		zeichen = auswahlZeichen.toString().charAt(0);

		// gibt es das Zeichen auch im Suchwort?
		// dabei vergleichen wir nur die Kleinbuchstaben
		treffer = suchwort.toLowerCase().indexOf(zeichen);

		// wenn wir nichts gefunden haben
		if (treffer < 0) {

			// 1 von den verbleibenden Durchläufen abziehen
			restDurchlauefe--;

			// die restlichen Durchläufe anzeigen
			anzVersuche.setText(Integer.toString(restDurchlauefe));

			// die Fehler für die Anzeige erhöhen und den Galgen zeichnen
			erhoeheFehler();

			// einen Punkt abziehen
			punktAusgabe.setText(Integer.toString(spielpunkte.veraenderePunkte(-1)));
		} else {
			// nach weiteren Vorkommen suchen
			while (treffer >= 0) {

				// das Zeichen aus der entsprechenden Position im Suchwort anzeigen
				anzeige.setCharAt(treffer, suchwort.charAt(treffer));

				// treffer erhöhen und dann weitersuchen
				treffer++;
				treffer = suchwort.toLowerCase().indexOf(zeichen, treffer);

				// Punkte erhöhen
				punktAusgabe.setText(Integer.toString(spielpunkte.veraenderePunkte(5)));
			}
			// das geänderte Wort anzeigen
			ausgabeText.setText(anzeige.toString());
		}
	}

	private void gewinnerOderNicht() {

		// ende steuert, ob das Spiel zu Ende ist
		// nur dann wird die Liste geprüft und die Anwendung
		// geschlossen
		boolean ende = false;

		// die Linienbreite auf 1 setzen
		gc.setLineWidth(1);

		// ist das Spiel zu Ende?
		if (restDurchlauefe == 0) {
			gc.strokeText("Das gesuchte Wort war: " + suchwort, 20, 100);
			ende = true;
		}
		// ist das Wort erraten worden?
		if (anzeige.toString().equals(suchwort)) {

			// pro verbleibendem Durchlauf gibt es noch zehn Punkte extra
			spielpunkte.veraenderePunkte(restDurchlauefe * 10);
			gc.strokeText("Hurra! Sie haben gewonnen!", 20, 100);
			ende = true;
		}
		if (ende == true) {

			// hat es für einen neuen Eintrag in der Bestenliste gereicht?
			if (spielpunkte.neuerEintrag() == true) {
				spielpunkte.listeZeigen();
			}
			Platform.exit();
		}
	}

	// Fehler hochzählen und den Galgen zeichnen
	private void erhoeheFehler() {
		fehler = fehler + 1;
		gc.setLineWidth(4);

		// je nach Wert von fehler zeichnen
		switch (fehler) {
		case 1:
			gc.strokeLine(10, 10, 10, 200);
			break;
		case 2:
			gc.strokeLine(10, 10, 100, 10);
			break;
		case 3:
			gc.strokeLine(40, 10, 10, 40);
			break;
		case 4:
			gc.strokeLine(100, 10, 100, 50);
			break;
		case 5:
			gc.strokeLine(70, 50, 130, 50);
			break;
		case 6:
			gc.strokeLine(130, 50, 130, 110);
			break;
		case 7:
			gc.strokeLine(130, 110, 70, 110);
			break;
		case 8:
			gc.strokeLine(70, 110, 70, 50);
			break;
		case 9:
			gc.strokeLine(0, 200, 20, 200);
			break;
		}
	}

	// die Methode setzt die Bühne auf den übergebenen Wert
	public void setStage(Stage meineStage) {
		this.meineStage = meineStage;
		spielpunkte = new Score(meineStage);
	}
}
