package repository;

import business.Buch;
import business.Ebook;
import business.Kategorie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SchulRepository {

	public ObservableList<Kategorie> liefertKategorien() {

		ObservableList<Kategorie> kategorieList = FXCollections.observableArrayList();

		kategorieList.addAll(Kategorie.values());

		return kategorieList;

	}

	public Buch getSchulBuchVorschlag1() {

		Buch buch1 = new Buch("/gui/buchhandel_schuleLernen/img/23913749_23913749_big.jpg",
				"Lernstern: Mein dickes 1.-Klasse-Buch", 7.95, "Birgit Fuchs",
				"Das Alphabet trainieren, Wörter bauen, Schwünge malen und von 1 bis 20 zählen - "
						+ "all das können Schüler der 1. Klasse mit diesem Buch üben. "
						+ "Es gibt Grips-Tricks für Monster-Buchstaben und zeigt, "
						+ "wie man trocken durchs Buchstabengewitter gelangt. Das Y spielt Xylofon und Wörter "
						+ "gehen auf Wanderung.Schlangentänze und Kreiselschwünge - "
						+ "spielend wird erstes Wissen aus der Schule wiederholt, gefestigt "
						+ "und angewendet. Mit dem LERNSTERN-Label fasst der Tessloff Verlag "
						+ "seine Lernhilfen für Kindergarten, Vorschule und Grundschule zusammen. "
						+ "Es kann unter rund 40 Titeln gewählt werden, darunter Schwungübungen, "
						+ "Malbücher, Lern- und Übungshefte.",
				"3788626739", false, true,
				"Produktdetails\r\n" + "Titel: Lernstern: Mein dickes 1.-Klasse-Buch\r\n" + "Autor/en: Birgit Fuchs\r\n"
						+ "\r\n" + "ISBN: 3788626739\r\n" + "EAN: 9783788626730\r\n"
						+ "Buchstaben, Zahlen, Rechnen üben.\r\n" + "Empfohlen ab 6 Jahre.\r\n"
						+ "farbige Abbildungen.\r\n" + "Kindergartenkinder. Grundschüler.\r\n"
						+ "20, 2 cm / 27, 9 cm / 1, 5 cm ( B/H/T ).\r\n" + "Illustriert von Manfred Tophoven\r\n"
						+ "Tessloff Verlag\r\n" + "1. Juni 2015 - kartoniert - 192 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch1;

	}

	public Buch getSchulBuchVorschlag2() {

		Buch buch2 = new Buch("/gui/buchhandel_schuleLernen/img/38815572_9783788675509_big.jpg", "Lesen üben 1. Klasse",
				4.95, "Julia Meyer",
				"Schritt für Schritt zum flüssigen Lesen - "
						+ "aber so, dass es Spaß macht! Abwechslungsreiche Übungen helfen Grundschülern, "
						+ "ihre Lesefähigkeit zu entwickeln: Wörter erkennen und zuordnen, "
						+ "Sätze verstehen und erste Texte lesen. Zahlreiche Illustrationen und klare "
						+ "Arbeitsanweisungen leiten die Kinder bei den Aufgaben an. "
						+ "Anhand des ausführlichen Lösungsteils lässt sich der Lernfortschritt leicht ermitteln. "
						+ "Mit diesem Heft können Erstklässler rätseln, knobeln, malen - und dabei spielerisch lesen lernen!",
				"3788675500", false, true,
				"Produktdetails\r\n" + "Titel: Lesen üben 1. Klasse\r\n" + "Autor/en: Julia Meyer\r\n" + "\r\n"
						+ "ISBN: 3788675500\r\n" + "EAN: 9783788675509\r\n" + "Empfohlen ab 6 Jahre.\r\n"
						+ "farbige Abbildungen.\r\n" + "Illustriert von Manfred Tophoven\r\n" + "Tessloff Verlag\r\n"
						+ "1. Juli 2020 - kartoniert - 48 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch2;
	}

	public Buch getSchulBuchVorschlag3() {

		Buch buch3 = new Buch("/gui/buchhandel_schuleLernen/img/34909463_9783411060689_big.jpg",
				"Duden - Das Grundschulwörterbuch", 12.00,
				" Barbara Schneider-Zuschlag, Ulrike " + "Holzwarth-Raether, Angelika Neidthardt",
				"\"Das Grundschulwörterbuch\" - seit über 20 Jahren DER Duden für Kinder.\r\n"
						+ "Vollständig überarbeitet und erweitert, enthält dieser Band gut 11.500 Wörter und bildet "
						+ "so den Wortschatz für die gesamte Grundschulzeit ab. Das beliebte Nachschlagewerk bietet:\r\n"
						+ "- eine übersichtliche A-Z-Wörterliste mit Silbentrennung und flektierten Formen\r\n"
						+ "- eine Liste der schwierigen Verbformen\r\n"
						+ "- Extrakapitel zu Wortfamilien und Wortfeldern (inklusive Synonymen für abwechslungsreiches Formulieren)\r\n"
						+ "- zahlreiche Rechtschreibtipps und -strategien\r\n"
						+ "- einen liebevoll illustrierten Bildwörterbuchteil in Englisch, Türkisch und Arabisch\r\n"
						+ "- ein Glossar der wichtigsten Fachbegriffe aus dem Deutsch- und Mathematikunterricht\r\n"
						+ "\r\n"
						+ "Mit einer Arbeitsblatt- und Materialsammlung für Lehrerinnen und Lehrer zum Downloaden inklusive "
						+ "umfangreichem Themenwortschatz, einer A-Z-Wörterliste für die 1. Klasse sowie einem Bildwörterbuchteil in Französisch.\r\n"
						+ "\r\n"
						+ "Das Grundschulwörterbuch von Duden ermöglicht Kindern ab der 2. Klasse ein einfaches Nachschlagen "
						+ "und begleitet sie sicher beim Lernen und Schreiben schwieriger Wörter. "
						+ "Liebevoll und mit viel Witz von Kerstin Meyer illustriert, macht das Buch Lust aufs Stöbern und Wörterfinden.\r\n"
						+ "\r\n" + "Von Lehrerinnen und Lehrern empfohlen.",
				"3411060689", false, true,
				"Produktdetails\r\n" + "Titel: Duden - Das Grundschulwörterbuch\r\n"
						+ "Autor/en: Barbara Schneider-Zuschlag, Ulrike Holzwarth-Raether, Angelika Neidthardt\r\n"
						+ "\r\n" + "ISBN: 3411060689\r\n" + "EAN: 9783411060689\r\n"
						+ "Mit einer Lehrerhandreichung sowie zusätzlichen Arbeitsblättern, Lernspielen und Wörterlisten im Dow.\r\n"
						+ "8. , vollständig überarbeitete und erweiterte Auflage.\r\n"
						+ "Mit zahlreichen witzigen Illustrationen.\r\n" + "Illustriert von Kerstin Meyer\r\n"
						+ "Bibliograph. Instit. GmbH\r\n" + "1. Februar 2019 - kartoniert - 288 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch3;
	}

	public Buch getSchulBuchVorschlag4() {

		Buch buch4 = new Buch("/gui/buchhandel_schuleLernen/img/32194395_9783637026520_big.jpg",
				"Rechtschreib-Stars 2. Schuljahr - Übungsheft", 6.50, "Sandra Duscher, Ulrich Petz, Irmgard Schmidt",
				"Informationen zur Reihenausgabe:\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Bunt, motivierend, kindgerecht\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Hier wird Rechtschreibung geübt und das mit Spaß: "
						+ "Mit den komplett neu bearbeiteten Heften der Reihe\r\n" + "Rechtschreib-Stars\r\n"
						+ "entdecken die Kinder hilfreiche Rechtschreibstrategien, "
						+ "überprüfen sie und wenden sie wiederholt an. Durch wiederkehrende, "
						+ "klar strukturierte Übungsfolgen können sie die Aufgaben weitgehend ohne Hilfe lösen.\r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Die Neubearbeitung berücksichtigt die aktuellen Lehr- und Bildungspläne. "
						+ "Sie vermittelt die neuesten Rechtschreibstrategien und enthält alle "
						+ "wichtigen rechtschriftlichen Lernthemen einer Jahrgangsstufe. "
						+ "So werden die Kinder in der Rechtschreibung immer sicherer.\r\n" + "\r\n" + "\r\n"
						+ "Mit den Heften der Reihe\r\n" + "Rechtschreib-Stars\r\n"
						+ "können Kinder ergänzend und selbstständig üben - als zusätzliches Übungsangebot auch den Eltern zu empfehlen.\r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Das integrierte Lösungsheft ermöglicht die Selbstkontrolle. "
						+ "Ist eine Aufgabe gelöst und kontrolliert, gibt es zur Belohnung einen Sternchen-Sticker. "
						+ "Aus diesen entsteht schließlich auf der letzten Seite ein neues Bild.",
				"363702652X", true, true,
				"Produktdetails\r\n" + "Titel: Rechtschreib-Stars 2. Schuljahr - Übungsheft\r\n"
						+ "Autor/en: Sandra Duscher, Ulrich Petz, Irmgard Schmidt\r\n" + "\r\n" + "ISBN: 363702652X\r\n"
						+ "EAN: 9783637026520\r\n" + "Mit Lösungen.\r\n" + "Neubearbeitung 2018.\r\n"
						+ "zahlreiche Abbildungen.\r\n" + "Oldenbourg Schulbuchverl.\r\n"
						+ "1. September 2018 - kartoniert - 84 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch4;
	}

	public Buch getSchulBuchVorschlag5() {

		Buch buch5 = new Buch("/gui/buchhandel_schuleLernen/img/30687389_9783788675493_big.jpg", "Mathe üben 2. Klasse",
				4.95, "Julia Meyer",
				"Mathematik 2. Klasse! Ob Zahlen bis 100, plus und minus, "
						+ "Einmaleins oder Geometrie - hier wird geübt, was wichtig ist. "
						+ "Und das mit jeder Menge guter Laune! Denn beim Malen, "
						+ "Rätseln und Knobeln geht das Üben fast wie von selbst. Mit Lösungsteil!",
				"3788675497", false, true,
				"Produktdetails\r\n" + "Titel: Mathe üben 2. Klasse\r\n" + "Autor/en: Julia Meyer\r\n" + "\r\n"
						+ "ISBN: 3788675497\r\n" + "EAN: 9783788675493\r\n"
						+ "Zahlen bis 100, plus und minus, Einmaleins oder Geometrie.\r\n" + "Empfohlen ab 7 Jahre.\r\n"
						+ "farbige.\r\n" + "Grundschüler.\r\n" + "Illustriert von Falko Honnen\r\n"
						+ "Tessloff Verlag\r\n" + "22. Januar 2018 - kartoniert - 48 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch5;
	}

	public Buch getSchulBuchVorschlag6() {

		Buch buch6 = new Buch("/gui/buchhandel_schuleLernen/img/23613220_23613220_big.jpg",
				"Deutsch-Stars 1. Schuljahr - Kleine Deutsch-Stars. Vorübungen zum Schreiben und Lesen", 6.50,
				"Bernd Wehren",
				"Informationen zum Titel:\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Mit diesem Heft bereiten sich die Kinder spielerisch auf das Lesen und Schreiben vor. "
						+ "Durch gezieltes Üben erwerben sie grundlegende Vorläuferfähigkeiten. "
						+ "Geeignet als Fördermaterial beim Übergang vom Kindergarten in die ersten Wochen der Grundschule.\r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Informationen zur Reihenausgabe:\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Lesen macht Spaß!\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Hier wird das sinnentnehmende Lesen geübt: Mit den Übungsheften\r\n"
						+ "Deutsch-Stars - Lesetraining\r\n"
						+ "trainieren und steigern die Kinder ihre Lesekompetenz. Und dabei können sich die Fans von Pferden, "
						+ "Fußball, Krimis und dem Meer besonders freuen: Für ihr Lesetraining gibt es eigene Themenhefte.\r\n"
						+ "",
				"3637014211", false, true,
				"Produktdetails\r\n"
						+ "Titel: Deutsch-Stars 1. Schuljahr - Kleine Deutsch-Stars. Vorübungen zum Schreiben und Lesen\r\n"
						+ "Autor/en: Bernd Wehren\r\n" + "\r\n" + "ISBN: 3637014211\r\n" + "EAN: 9783637014213\r\n"
						+ "Übungsheft. Mit Lösungen.\r\n" + "zahlreiche Abbildungen.\r\n"
						+ "Oldenbourg Schulbuchverl.\r\n" + "1. Juli 2015 - kartoniert - 64 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch6;
	}

	public Buch getSchulBuchVorschlag7() {

		Buch buch7 = new Buch("/gui/buchhandel_schuleLernen/img/38358994_81097315_big.jpg",
				"PONS Grundschulwörterbuch Englisch", 12.99,
				"Bildwörterbuch mit dem kompletten Grundschulwortschatz. "
						+ "Empfohlen von 6 bis 11 Jahren. Sprachen: Deutsch…",
				"Englisch lernen - kinderleicht\r\n"
						+ "Bildwörterbuch mit dem kompletten englischen Wortschatz der Klassen 1-4.\r\n"
						+ "Mit Bild und einfachem Beispielsatz für jedes Wort.\r\n"
						+ "Von Grundschulpädagogen entwickelt und an den Bildungsplänen der Grundschule orientiert.\r\n"
						+ "Wichtige Ressourcen online: 50-seitiges Übungsheft zur spielerischen "
						+ "Förderung von Lese- und Schreibkompetenzen. Dialoge aus dem Buch zum Anhören und Nachsprechen.\r\n"
						+ "Download: 50-seitiges Übungsheft",
				"3125162408", false, true,
				"Produktdetails\r\n" + "Titel: PONS Grundschulwörterbuch Englisch\r\n" + "\r\n" + "ISBN: 3125162408\r\n"
						+ "EAN: 9783125162402\r\n" + "Bildwörterbuch mit dem kompletten Grundschulwortschatz.\r\n"
						+ "Empfohlen von 6 bis 11 Jahren.\r\n" + "Sprachen: Deutsch Englisch.\r\n" + "Pons GmbH\r\n"
						+ "13. Januar 2020 - kartoniert - 176 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch7;
	}

	public Buch getSchulBuchVorschlag8() {

		Buch buch8 = new Buch("/gui/buchhandel_schuleLernen/img/23555271_9783867607834_big.jpg", "Das Pferd", 9.95,
				"Veronika Straaß",
				"Woran erkennt man, wie ein Pferd gelaunt ist? Wie wird aus einem "
						+ "Pferd ein Reitpferd? Welche \"Berufe\" kann ein Pferd haben? Wie schlafen Pferde?\r\n"
						+ "\r\n" + "Hier werden neugierige Pferdeforscher fündig: viele interessante Informationen, "
						+ "anschauliche Farbfotos und zahlreiche Tipps für eigene Entdeckungen.\r\n" + "\r\n"
						+ "Zum Vorlesen und ab der 2. Klasse zum Selbstlesen.\r\n" + "Portrait\r\n"
						+ "Veronika Straaß ist Diplom-Biologin und als Autorin, freie Journalistin, "
						+ "Übersetzerin und Lektorin tätig. Sie hat bereits zahlreiche Bücher und "
						+ "Zeitschriftenartikel für Kinder und Jugendliche verfasst. Es ist ihr wichtig, "
						+ "den jungen Lesern die Natur vor unserer Haustür näherzubringen.",
				"3867607834", false, true,
				"Produktdetails\r\n" + "Titel: Das Pferd\r\n" + "Autor/en: Veronika Straaß\r\n" + "\r\n"
						+ "ISBN: 3867607834\r\n" + "EAN: 9783867607834\r\n" + "Schauen und Wissen!.\r\n"
						+ "Empfohlen ab 7 Jahre.\r\n" + "Hase und Igel Verlag GmbH\r\n"
						+ "1. März 2015 - gebunden - 34 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch8;
	}

}
