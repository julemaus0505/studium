package memory;

import java.util.Arrays;
import java.util.Collections;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

import javafx.util.Duration;

public class MemoryFeld {

<<<<<<< HEAD
	// Konstanten erstellt, mit denen die Spielfeldgröße geändert werden kann.
	private final static int GESAMTPUNKTE = 21;
	private final static int ANZAHL_KARTEN = 2 * GESAMTPUNKTE;

=======
	private final static int GESAMTPUNKTE = 21;
	private final static int ANZAHL_KARTEN = 2 * GESAMTPUNKTE;
	
>>>>>>> e8f068abf86bb5b0ba608928e46c22d6b5f465e4
	// eine innere Klasse für den Eventhandler des Timer
	class TimerHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {

			// haben wir zusammen GESAMTPUNKTE Paare, dann ist das Spiel vorbei
			// (Einsendeaufgabe der Aufgabe: 1)
			if (GESAMTPUNKTE == menschPunkte + computerPunkte) {

				// die Methode ruft die Methode auswertungSieger() auf.
				auswertungSieger();

			} else {
				// die Methode ruft die Methode karteSchliessen() auf.
				karteSchliessen();
			}
		}
	}

	// eine Klasse für den Eventhandler des SchummelTimers
	// (Einsendeaufgabe der Aufgabe: 3)
	class SchummelHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			// Schleife über alle Karten
			for (MemoryKarte karte : karten) {
				//Wenn Karte noch im Spiel ist und sie nicht vorher durch den Spieler umgedreht wurde wieder umdrehen
				if (karte.isNochImSpiel() && !karte.equals(paar[0])) {
					karte.rueckseiteZeigen(false);
				}
			}
		}
	}

	// das Array für die Karten
	private MemoryKarte[] karten;

	// das Array für die Namen der Grafiken
	private String[] bilder = { "/grafiken/apfel.jpg", "/grafiken/birne.jpg", "/grafiken/blume.jpg",
			"/grafiken/blume2.jpg", "/grafiken/ente.jpg", "/grafiken/fisch.jpg", "/grafiken/fuchs.jpg",
			"/grafiken/igel.jpg", "/grafiken/kaenguruh.jpg", "/grafiken/katze.jpg", "/grafiken/kuh.jpg",
			"/grafiken/maus1.jpg", "/grafiken/maus2.jpg", "/grafiken/maus3.jpg", "/grafiken/melone.jpg",
			"/grafiken/pilz.jpg", "/grafiken/ronny.jpg", "/grafiken/schmetterling.jpg", "/grafiken/sonne.jpg",
			"/grafiken/wolke.jpg", "/grafiken/maus4.jpg" };

	// für die Punkte
	private int menschPunkte;
	private int computerPunkte;

	// zwei Labels für die Punkte
	private Label menschPunkteLabel;
	private Label computerPunkteLabel;

	// für das Ziehen wer grade an der Reihe ist (Einsendeaufgabe für Aufgabe: 2)
	private Label werZiehtLabel;
	private String werZiehtMensch = "Der Mensch";
	private String werZiehtComputer = "Der Computer";

	// ein Button für das Schummeln
	// (Einsendeaufgabe für Aufgabe: 3)
	private Button schummelButton;

	// wie viele Karten sind aktuell umgedreht?
	private int umgedrehteKarten;

	// für das aktuell umdrehte Paar
	private MemoryKarte[] paar;

	// für den aktuellen Spieler
	private int spieler;

	// das "Gedächtnis" für den Computer
	// er speichert hier wo das Gegenstück liegt
	private int[][] gemerkteKarten;

	// für die Spielstärke
	private int spielstaerke;

	// für den Timer
	private Timeline timer;

	// der Konstruktor
	public MemoryFeld() {

		// das Array für die Karten erstellen, insgesamt ANZAHL_KARTEN Stück
		karten = new MemoryKarte[ANZAHL_KARTEN];

		// für das Paar
		paar = new MemoryKarte[2];

		// für das Gedächtnis
		// es speichert für jede Karte paarweise die Position im Spielfeld
		gemerkteKarten = new int[2][GESAMTPUNKTE];

		// keiner hat zu Beginn einen Punkt
		menschPunkte = 0;
		computerPunkte = 0;

		// es ist keine Karte umgedreht
		umgedrehteKarten = 0;

		// der Mensch fängt an
		spieler = 0;

		// die Spielstärke ist 10
		spielstaerke = 10;

		// es gibt keine gemerkten Karten
		for (int aussen = 0; aussen < 2; aussen++)
			for (int innen = 0; innen < GESAMTPUNKTE; innen++)
				gemerkteKarten[aussen][innen] = -1;
	}

	// die Methode erstellt die Oberfläche und zeichnet die Karten über eine eigene
	// Methode
	// übergeben wird ein FlowPane
	public FlowPane initGUI(FlowPane feld) {

		// für die Ausgaben
		kartenZeichnen(feld);
		menschPunkteLabel = new Label();
		computerPunkteLabel = new Label();
		menschPunkteLabel.setText(Integer.toString(menschPunkte));
		computerPunkteLabel.setText(Integer.toString(computerPunkte));

		// neues Label erstellt (Einsendeaufgabe für Aufgabe: 2)
		werZiehtLabel = new Label();
		schummelButton = new Button("Alles aufdecken");

		// Hier eine OnAction Methode aufgerufen, und einen EventHandler mit der
		// ActionEvent erstellt.
		// (Einsendeaufgabe für Aufgabe: 3)
		schummelButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				// die Methode schummeln aufgerufen
				// (Einsendeaufgabe für Aufgabe: 3)
				schummeln();
			}
		});

		// in zwei Spalten anzeigen
		GridPane tempGrid = new GridPane();

		// und einfügen, dabei werden die Koordinaten angegeben

		tempGrid.add(new Label("Mensch: "), 0, 0);
		tempGrid.add(menschPunkteLabel, 1, 0);
		tempGrid.add(new Label("Computer: "), 0, 1);
		tempGrid.add(computerPunkteLabel, 1, 1);

		// eingefügt, für die anzeige wer Zieht (Einsendeaufgabe für Aufgabe: 2)
		tempGrid.add(new Label("Es Zieht: "), 0, 2);
		tempGrid.add(werZiehtLabel, 2, 2);

		// Button dem tempGrid hinzufügen
		// (Einsendeaufgabe für Aufgabe: 3)
		tempGrid.add(schummelButton, 0, 4);

		feld.getChildren().add(tempGrid);
		return feld;
	}

	// das eigentliche Spielfeld erstellen
	private void kartenZeichnen(FlowPane feld) {
		int count = 0;
<<<<<<< HEAD
		for (int i = 0; i <= ANZAHL_KARTEN - 1; i++) {
=======
		for (int i = 0; i <= ANZAHL_KARTEN -1; i++) {
>>>>>>> e8f068abf86bb5b0ba608928e46c22d6b5f465e4

			// eine neue Karte erzeugen
			karten[i] = new MemoryKarte(bilder[count], count, this);

			// bei jeder zweiten Karte kommt auch ein neues Bild
			if ((i + 1) % 2 == 0)
				count++;
		}

		// die Karten werden gemischt
		Collections.shuffle(Arrays.asList(karten));

		// und ins Spielfeld gesetzt
<<<<<<< HEAD
		for (int i = 0; i <= ANZAHL_KARTEN - 1; i++) {
=======
		for (int i = 0; i <= ANZAHL_KARTEN -1; i++) {
>>>>>>> e8f068abf86bb5b0ba608928e46c22d6b5f465e4
			feld.getChildren().add(karten[i]);

			// die Position der Karte setzen
			karten[i].setBildPos(i);
		}
	}

	// die Methode übernimmt die wesentliche Steuerung des Spiels
	// Sie wird beim Anklicken einer Karte ausgeführt
	public void karteOeffnen(MemoryKarte karte) {

		// hier wird der Text gesetzt wer dran ist in dem Fall der Mensch
		// (Einsendeaufgabe für Aufgabe: 2)
		werZiehtLabel.setText(werZiehtMensch);

		// zum Zwischenspeichern der ID und der Position
		int kartenID, kartenPos;

		// die Karten zwischenspeichern
		paar[umgedrehteKarten] = karte;

		// die ID und die Position beschaffen
		kartenID = karte.getBildID();
		kartenPos = karte.getBildPos();

		// die Karte in das Gedächtnis des Computers eintragen
		// aber nur dann, wenn es noch keinen Eintrag an der entsprechenden Stelle gibt
		if ((gemerkteKarten[0][kartenID] == -1))
			gemerkteKarten[0][kartenID] = kartenPos;
		else

		// wenn es schon einen Eintrag gibt
		// und der nicht mit der aktuellen Position übereinstimmt, dann haben wir die
		// zweite Karte gefunden
		// die wird dann in die zweite Dimension eingetragen
		if (gemerkteKarten[0][kartenID] != kartenPos)
			gemerkteKarten[1][kartenID] = kartenPos;

		// umgedrehte Karten erhöhen
		umgedrehteKarten++;

		// sind 2 Karten umgedreht worden?
		if (umgedrehteKarten == 2) {

			// dann prüfen wir, ob es ein Paar ist
			paarPruefen(kartenID);

			// den Timer erzeugen
			timer = new Timeline(new KeyFrame(Duration.millis(2000), new TimerHandler()));

			// und starten
			timer.play();
		}
	}

	// die Methode dreht die Karten wieder auf die Rückseite
	// bzw. nimmt sie aus dem Spiel
	private void karteSchliessen() {
		boolean raus = false;

		// ist es ein Paar?
		if (paar[0].getBildID() == paar[1].getBildID())
			raus = true;

		// wenn es ein Paar war, nehmen wir die Karten aus dem Spiel
		// sonst drehen wir sie nur wieder um
		paar[0].rueckseiteZeigen(raus);
		paar[1].rueckseiteZeigen(raus);

		// es ist keine Karte mehr geöffnet
		umgedrehteKarten = 0;

		// hat der Spieler kein Paar gefunden?
		if (raus == false)

			// dann wird der Spieler gewechselt
			spielerWechseln();
		else

		// hat der Computer ein Paar gefunden?
		// dann ist er noch einmal an der Reihe
		if (spieler == 1) {
			computerZug();
		}
	}

	// die Methode prüft, ob ein Paar gefunden wurde
	private void paarPruefen(int kartenID) {
		if (paar[0].getBildID() == paar[1].getBildID()) {

			// die Punkte setzen
			paarGefunden();

			// die Karten aus dem Gedächtnis löschen
			gemerkteKarten[0][kartenID] = -2;
			gemerkteKarten[1][kartenID] = -2;
		}
	}

	// die Methode setzt die Punkte, wenn ein Paar gefunden wurde
	private void paarGefunden() {
		// spielt gerade der Mensch?
		if (spieler == 0) {
			menschPunkte++;
			menschPunkteLabel.setText(Integer.toString(menschPunkte));

		} else {
			computerPunkte++;
			computerPunkteLabel.setText(Integer.toString(computerPunkte));
		}
	}

	// die Methode wechselt den Spieler
	private void spielerWechseln() {

		// wenn der Mensch an der Reihe war,
		// kommt jetzt der Computer
		// hier wird der Text gesetzt wer dran ist in dem Fall der Computer
		// dann wird auch dafür gesorgt, dass der Button für den Computerzug nicht aktiviert ist
		// (Einsendeaufgabe für Aufgabe Aufgabe: 2)
		if (spieler == 0) {
			spieler = 1;
			schummelButton.disableProperty().setValue(true);
			computerZug();
			werZiehtLabel.setText(werZiehtComputer);
		} else {
			spieler = 0;
			schummelButton.disableProperty().setValue(false);
		}
	}

	// die Methode setzt die Computerzüge um
	private void computerZug() {
		int kartenZaehler = 0;
		int zufall = 0;
		boolean treffer = false;

		// zur Steuerung über die Spielstärke
		if ((int) (Math.random() * spielstaerke) == 0) {

			// erst einmal nach einem Paar suchen
			// dazu durchsuchen wir das Array gemerkteKarten, bis wir in beiden Dimensionen
			// einen Wert finden
			while ((kartenZaehler < GESAMTPUNKTE) && (treffer == false)) {

				// gibt es in beiden Dimensionen einen Wert größer oder gleich 0?
				if ((gemerkteKarten[0][kartenZaehler] >= 0) && (gemerkteKarten[1][kartenZaehler] >= 0)) {

					// dann haben wir ein Paar
					treffer = true;

					// die Vorderseite der Karte zeigen
					karten[gemerkteKarten[0][kartenZaehler]].vorderseiteZeigen();

					// und dann die Karte öffnen
					karteOeffnen(karten[gemerkteKarten[0][kartenZaehler]]);

					// die zweite Karte auch
					karten[gemerkteKarten[1][kartenZaehler]].vorderseiteZeigen();
					karteOeffnen(karten[gemerkteKarten[1][kartenZaehler]]);
				}
				kartenZaehler++;
			}
		}
		// wenn wir kein Paar gefunden haben, drehen wir zufällig zwei Karten um
		if (treffer == false) {

			// solange eine Zufallszahl suchen, bis eine Karte gefunden wird, die noch im
			// Spiel ist
			do {
				zufall = (int) (Math.random() * karten.length);
			} while (karten[zufall].isNochImSpiel() == false);

			// die erste Karte umdrehen
			// die Vorderseite der Karte zeigen
			karten[zufall].vorderseiteZeigen();

			// und dann die Karte öffnen
			karteOeffnen(karten[zufall]);

			// für die zweite Karte müssen wir außerdem prüfen, ob sie nicht gerade
			// angezeigt wird
			do {
				zufall = (int) (Math.random() * karten.length);
			} while ((karten[zufall].isNochImSpiel() == false) || (karten[zufall].isUmgedreht() == true));

			// und die zweite Karte umdrehen
			karten[zufall].vorderseiteZeigen();
			karteOeffnen(karten[zufall]);
		}
	}

	// die Methode liefert, ob Züge des Menschen erlaubt sind
	// die Rückgabe ist false, wenn gerade der Computer zieht
	// oder wenn schon zwei Karten umgedreht sind
	// sonst ist die Rückgabe true
	public boolean zugErlaubt() {
		boolean erlaubt = true;

		// zieht der Computer?
		if (spieler == 1)
			erlaubt = false;

		// sind schon zwei Karten umdreht?
		if (umgedrehteKarten == 2)
			erlaubt = false;
		return erlaubt;
	}
<<<<<<< HEAD
=======
	
	public void auswertungSieger() {
		// haben wir zusammen GESAMTPUNKTE Paare, dann ist das Spiel vorbei
		if (computerPunkte + menschPunkte == GESAMTPUNKTE) {
>>>>>>> e8f068abf86bb5b0ba608928e46c22d6b5f465e4

	private void auswertungSieger() {

		// Einen Alert für die Meldung erstellt wer gewonnen hat.
		// Über die If Bedinngung geprüft wer der Gewinner ist.
		// Einsendeaufgabe Aufgabe Nummer: 1.

		Alert alert = new Alert(AlertType.INFORMATION);

		if (menschPunkte > computerPunkte) {
			alert.setContentText("Gewonnen hat der Mensch.");

		} else {
			alert.setContentText("Gewonnen hat der Computer. ");
		}
		alert.setTitle("Memory Spiel");
		alert.setHeaderText("Wer ist der Gewinner!");
		alert.setOnHidden(evt -> Platform.exit());
		alert.show();
	}

	/**
	 * Wenn der Mensch am Zug ist, dann werden die Karten, die noch im Spiel sind
	 * für 2 Sekunden umgedreht. (Einsendeaufgabe der Aufgabe: 3)
	 */
	private void schummeln() {

		if (spieler == 0) {
			for (MemoryKarte karte : karten) {
				if (karte.isNochImSpiel() && !karte.isUmgedreht()) {
					karte.vorderseiteZeigen();
				}
			}
			Timeline schummelTimer = new Timeline(new KeyFrame(Duration.millis(2000), new SchummelHandler()));
			schummelTimer.play();
		}
	}
}
