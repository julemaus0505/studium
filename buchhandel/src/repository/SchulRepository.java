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
				"Das Alphabet trainieren, W�rter bauen, Schw�nge malen und von 1 bis 20 z�hlen - "
						+ "all das k�nnen Sch�ler der 1. Klasse mit diesem Buch �ben. "
						+ "Es gibt Grips-Tricks f�r Monster-Buchstaben und zeigt, "
						+ "wie man trocken durchs Buchstabengewitter gelangt. Das Y spielt Xylofon und W�rter "
						+ "gehen auf Wanderung.Schlangent�nze und Kreiselschw�nge - "
						+ "spielend wird erstes Wissen aus der Schule wiederholt, gefestigt "
						+ "und angewendet. Mit dem LERNSTERN-Label fasst der Tessloff Verlag "
						+ "seine Lernhilfen f�r Kindergarten, Vorschule und Grundschule zusammen. "
						+ "Es kann unter rund 40 Titeln gew�hlt werden, darunter Schwung�bungen, "
						+ "Malb�cher, Lern- und �bungshefte.",
				"3788626739", false, true,
				"Produktdetails\r\n" + "Titel: Lernstern: Mein dickes 1.-Klasse-Buch\r\n" + "Autor/en: Birgit Fuchs\r\n"
						+ "\r\n" + "ISBN: 3788626739\r\n" + "EAN: 9783788626730\r\n"
						+ "Buchstaben, Zahlen, Rechnen �ben.\r\n" + "Empfohlen ab 6 Jahre.\r\n"
						+ "farbige Abbildungen.\r\n" + "Kindergartenkinder. Grundsch�ler.\r\n"
						+ "20, 2 cm / 27, 9 cm / 1, 5 cm ( B/H/T ).\r\n" + "Illustriert von Manfred Tophoven\r\n"
						+ "Tessloff Verlag\r\n" + "1. Juni 2015 - kartoniert - 192 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch1;

	}

	public Buch getSchulBuchVorschlag2() {

		Buch buch2 = new Buch("/gui/buchhandel_schuleLernen/img/38815572_9783788675509_big.jpg", "Lesen �ben 1. Klasse",
				4.95, "Julia Meyer",
				"Schritt f�r Schritt zum fl�ssigen Lesen - "
						+ "aber so, dass es Spa� macht! Abwechslungsreiche �bungen helfen Grundsch�lern, "
						+ "ihre Lesef�higkeit zu entwickeln: W�rter erkennen und zuordnen, "
						+ "S�tze verstehen und erste Texte lesen. Zahlreiche Illustrationen und klare "
						+ "Arbeitsanweisungen leiten die Kinder bei den Aufgaben an. "
						+ "Anhand des ausf�hrlichen L�sungsteils l�sst sich der Lernfortschritt leicht ermitteln. "
						+ "Mit diesem Heft k�nnen Erstkl�ssler r�tseln, knobeln, malen - und dabei spielerisch lesen lernen!",
				"3788675500", false, true,
				"Produktdetails\r\n" + "Titel: Lesen �ben 1. Klasse\r\n" + "Autor/en: Julia Meyer\r\n" + "\r\n"
						+ "ISBN: 3788675500\r\n" + "EAN: 9783788675509\r\n" + "Empfohlen ab 6 Jahre.\r\n"
						+ "farbige Abbildungen.\r\n" + "Illustriert von Manfred Tophoven\r\n" + "Tessloff Verlag\r\n"
						+ "1. Juli 2020 - kartoniert - 48 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch2;
	}

	public Buch getSchulBuchVorschlag3() {

		Buch buch3 = new Buch("/gui/buchhandel_schuleLernen/img/34909463_9783411060689_big.jpg",
				"Duden - Das Grundschulw�rterbuch", 12.00,
				" Barbara Schneider-Zuschlag, Ulrike " + "Holzwarth-Raether, Angelika Neidthardt",
				"\"Das Grundschulw�rterbuch\" - seit �ber 20 Jahren DER Duden f�r Kinder.\r\n"
						+ "Vollst�ndig �berarbeitet und erweitert, enth�lt dieser Band gut 11.500 W�rter und bildet "
						+ "so den Wortschatz f�r die gesamte Grundschulzeit ab. Das beliebte Nachschlagewerk bietet:\r\n"
						+ "- eine �bersichtliche A-Z-W�rterliste mit Silbentrennung und flektierten Formen\r\n"
						+ "- eine Liste der schwierigen Verbformen\r\n"
						+ "- Extrakapitel zu Wortfamilien und Wortfeldern (inklusive Synonymen f�r abwechslungsreiches Formulieren)\r\n"
						+ "- zahlreiche Rechtschreibtipps und -strategien\r\n"
						+ "- einen liebevoll illustrierten Bildw�rterbuchteil in Englisch, T�rkisch und Arabisch\r\n"
						+ "- ein Glossar der wichtigsten Fachbegriffe aus dem Deutsch- und Mathematikunterricht\r\n"
						+ "\r\n"
						+ "Mit einer Arbeitsblatt- und Materialsammlung f�r Lehrerinnen und Lehrer zum Downloaden inklusive "
						+ "umfangreichem Themenwortschatz, einer A-Z-W�rterliste f�r die 1. Klasse sowie einem Bildw�rterbuchteil in Franz�sisch.\r\n"
						+ "\r\n"
						+ "Das Grundschulw�rterbuch von Duden erm�glicht Kindern ab der 2. Klasse ein einfaches Nachschlagen "
						+ "und begleitet sie sicher beim Lernen und Schreiben schwieriger W�rter. "
						+ "Liebevoll und mit viel Witz von Kerstin Meyer illustriert, macht das Buch Lust aufs St�bern und W�rterfinden.\r\n"
						+ "\r\n" + "Von Lehrerinnen und Lehrern empfohlen.",
				"3411060689", false, true,
				"Produktdetails\r\n" + "Titel: Duden - Das Grundschulw�rterbuch\r\n"
						+ "Autor/en: Barbara Schneider-Zuschlag, Ulrike Holzwarth-Raether, Angelika Neidthardt\r\n"
						+ "\r\n" + "ISBN: 3411060689\r\n" + "EAN: 9783411060689\r\n"
						+ "Mit einer Lehrerhandreichung sowie zus�tzlichen Arbeitsbl�ttern, Lernspielen und W�rterlisten im Dow.\r\n"
						+ "8. , vollst�ndig �berarbeitete und erweiterte Auflage.\r\n"
						+ "Mit zahlreichen witzigen Illustrationen.\r\n" + "Illustriert von Kerstin Meyer\r\n"
						+ "Bibliograph. Instit. GmbH\r\n" + "1. Februar 2019 - kartoniert - 288 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch3;
	}

	public Buch getSchulBuchVorschlag4() {

		Buch buch4 = new Buch("/gui/buchhandel_schuleLernen/img/32194395_9783637026520_big.jpg",
				"Rechtschreib-Stars 2. Schuljahr - �bungsheft", 6.50, "Sandra Duscher, Ulrich Petz, Irmgard Schmidt",
				"Informationen zur Reihenausgabe:\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Bunt, motivierend, kindgerecht\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Hier wird Rechtschreibung ge�bt und das mit Spa�: "
						+ "Mit den komplett neu bearbeiteten Heften der Reihe\r\n" + "Rechtschreib-Stars\r\n"
						+ "entdecken die Kinder hilfreiche Rechtschreibstrategien, "
						+ "�berpr�fen sie und wenden sie wiederholt an. Durch wiederkehrende, "
						+ "klar strukturierte �bungsfolgen k�nnen sie die Aufgaben weitgehend ohne Hilfe l�sen.\r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Die Neubearbeitung ber�cksichtigt die aktuellen Lehr- und Bildungspl�ne. "
						+ "Sie vermittelt die neuesten Rechtschreibstrategien und enth�lt alle "
						+ "wichtigen rechtschriftlichen Lernthemen einer Jahrgangsstufe. "
						+ "So werden die Kinder in der Rechtschreibung immer sicherer.\r\n" + "\r\n" + "\r\n"
						+ "Mit den Heften der Reihe\r\n" + "Rechtschreib-Stars\r\n"
						+ "k�nnen Kinder erg�nzend und selbstst�ndig �ben - als zus�tzliches �bungsangebot auch den Eltern zu empfehlen.\r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Das integrierte L�sungsheft erm�glicht die Selbstkontrolle. "
						+ "Ist eine Aufgabe gel�st und kontrolliert, gibt es zur Belohnung einen Sternchen-Sticker. "
						+ "Aus diesen entsteht schlie�lich auf der letzten Seite ein neues Bild.",
				"363702652X", true, true,
				"Produktdetails\r\n" + "Titel: Rechtschreib-Stars 2. Schuljahr - �bungsheft\r\n"
						+ "Autor/en: Sandra Duscher, Ulrich Petz, Irmgard Schmidt\r\n" + "\r\n" + "ISBN: 363702652X\r\n"
						+ "EAN: 9783637026520\r\n" + "Mit L�sungen.\r\n" + "Neubearbeitung 2018.\r\n"
						+ "zahlreiche Abbildungen.\r\n" + "Oldenbourg Schulbuchverl.\r\n"
						+ "1. September 2018 - kartoniert - 84 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch4;
	}

	public Buch getSchulBuchVorschlag5() {

		Buch buch5 = new Buch("/gui/buchhandel_schuleLernen/img/30687389_9783788675493_big.jpg", "Mathe �ben 2. Klasse",
				4.95, "Julia Meyer",
				"Mathematik 2. Klasse! Ob Zahlen bis 100, plus und minus, "
						+ "Einmaleins oder Geometrie - hier wird ge�bt, was wichtig ist. "
						+ "Und das mit jeder Menge guter Laune! Denn beim Malen, "
						+ "R�tseln und Knobeln geht das �ben fast wie von selbst. Mit L�sungsteil!",
				"3788675497", false, true,
				"Produktdetails\r\n" + "Titel: Mathe �ben 2. Klasse\r\n" + "Autor/en: Julia Meyer\r\n" + "\r\n"
						+ "ISBN: 3788675497\r\n" + "EAN: 9783788675493\r\n"
						+ "Zahlen bis 100, plus und minus, Einmaleins oder Geometrie.\r\n" + "Empfohlen ab 7 Jahre.\r\n"
						+ "farbige.\r\n" + "Grundsch�ler.\r\n" + "Illustriert von Falko Honnen\r\n"
						+ "Tessloff Verlag\r\n" + "22. Januar 2018 - kartoniert - 48 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch5;
	}

	public Buch getSchulBuchVorschlag6() {

		Buch buch6 = new Buch("/gui/buchhandel_schuleLernen/img/23613220_23613220_big.jpg",
				"Deutsch-Stars 1. Schuljahr - Kleine Deutsch-Stars. Vor�bungen zum Schreiben und Lesen", 6.50,
				"Bernd Wehren",
				"Informationen zum Titel:\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Mit diesem Heft bereiten sich die Kinder spielerisch auf das Lesen und Schreiben vor. "
						+ "Durch gezieltes �ben erwerben sie grundlegende Vorl�uferf�higkeiten. "
						+ "Geeignet als F�rdermaterial beim �bergang vom Kindergarten in die ersten Wochen der Grundschule.\r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Informationen zur Reihenausgabe:\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Lesen macht Spa�!\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Hier wird das sinnentnehmende Lesen ge�bt: Mit den �bungsheften\r\n"
						+ "Deutsch-Stars - Lesetraining\r\n"
						+ "trainieren und steigern die Kinder ihre Lesekompetenz. Und dabei k�nnen sich die Fans von Pferden, "
						+ "Fu�ball, Krimis und dem Meer besonders freuen: F�r ihr Lesetraining gibt es eigene Themenhefte.\r\n"
						+ "",
				"3637014211", false, true,
				"Produktdetails\r\n"
						+ "Titel: Deutsch-Stars 1. Schuljahr - Kleine Deutsch-Stars. Vor�bungen zum Schreiben und Lesen\r\n"
						+ "Autor/en: Bernd Wehren\r\n" + "\r\n" + "ISBN: 3637014211\r\n" + "EAN: 9783637014213\r\n"
						+ "�bungsheft. Mit L�sungen.\r\n" + "zahlreiche Abbildungen.\r\n"
						+ "Oldenbourg Schulbuchverl.\r\n" + "1. Juli 2015 - kartoniert - 64 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch6;
	}

	public Buch getSchulBuchVorschlag7() {

		Buch buch7 = new Buch("/gui/buchhandel_schuleLernen/img/38358994_81097315_big.jpg",
				"PONS Grundschulw�rterbuch Englisch", 12.99,
				"Bildw�rterbuch mit dem kompletten Grundschulwortschatz. "
						+ "Empfohlen von 6 bis 11 Jahren. Sprachen: Deutsch�",
				"Englisch lernen - kinderleicht\r\n"
						+ "Bildw�rterbuch mit dem kompletten englischen Wortschatz der Klassen 1-4.\r\n"
						+ "Mit Bild und einfachem Beispielsatz f�r jedes Wort.\r\n"
						+ "Von Grundschulp�dagogen entwickelt und an den Bildungspl�nen der Grundschule orientiert.\r\n"
						+ "Wichtige Ressourcen online: 50-seitiges �bungsheft zur spielerischen "
						+ "F�rderung von Lese- und Schreibkompetenzen. Dialoge aus dem Buch zum Anh�ren und Nachsprechen.\r\n"
						+ "Download: 50-seitiges �bungsheft",
				"3125162408", false, true,
				"Produktdetails\r\n" + "Titel: PONS Grundschulw�rterbuch Englisch\r\n" + "\r\n" + "ISBN: 3125162408\r\n"
						+ "EAN: 9783125162402\r\n" + "Bildw�rterbuch mit dem kompletten Grundschulwortschatz.\r\n"
						+ "Empfohlen von 6 bis 11 Jahren.\r\n" + "Sprachen: Deutsch Englisch.\r\n" + "Pons GmbH\r\n"
						+ "13. Januar 2020 - kartoniert - 176 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch7;
	}

	public Buch getSchulBuchVorschlag8() {

		Buch buch8 = new Buch("/gui/buchhandel_schuleLernen/img/23555271_9783867607834_big.jpg", "Das Pferd", 9.95,
				"Veronika Straa�",
				"Woran erkennt man, wie ein Pferd gelaunt ist? Wie wird aus einem "
						+ "Pferd ein Reitpferd? Welche \"Berufe\" kann ein Pferd haben? Wie schlafen Pferde?\r\n"
						+ "\r\n" + "Hier werden neugierige Pferdeforscher f�ndig: viele interessante Informationen, "
						+ "anschauliche Farbfotos und zahlreiche Tipps f�r eigene Entdeckungen.\r\n" + "\r\n"
						+ "Zum Vorlesen und ab der 2. Klasse zum Selbstlesen.\r\n" + "Portrait\r\n"
						+ "Veronika Straa� ist Diplom-Biologin und als Autorin, freie Journalistin, "
						+ "�bersetzerin und Lektorin t�tig. Sie hat bereits zahlreiche B�cher und "
						+ "Zeitschriftenartikel f�r Kinder und Jugendliche verfasst. Es ist ihr wichtig, "
						+ "den jungen Lesern die Natur vor unserer Haust�r n�herzubringen.",
				"3867607834", false, true,
				"Produktdetails\r\n" + "Titel: Das Pferd\r\n" + "Autor/en: Veronika Straa�\r\n" + "\r\n"
						+ "ISBN: 3867607834\r\n" + "EAN: 9783867607834\r\n" + "Schauen und Wissen!.\r\n"
						+ "Empfohlen ab 7 Jahre.\r\n" + "Hase und Igel Verlag GmbH\r\n"
						+ "1. M�rz 2015 - gebunden - 34 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch8;
	}

}
