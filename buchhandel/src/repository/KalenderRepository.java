package repository;


import business.Kalender;
import business.Kategorie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KalenderRepository {

	public ObservableList<Kategorie> liefertKategorien() {

		ObservableList<Kategorie> kategorieList = FXCollections.observableArrayList();

		kategorieList.addAll(Kategorie.values());

		return kategorieList;

	}

	public Kalender getKalenderVorschlag1() {

		Kalender kalender1 = new Kalender("/gui/buchhandel_kalender/img/39311536_BRA495617_xl.jpg",
				"Mattel - Hot-Wheels-Adventskalender mit Überraschungen für 24 Tage, Fahrzeugen u", 25.99,
				"Empfohlen von 3 bis 99 Jahren. " + "Kindergartenkinder. Grundschüler. Jugendliche",
				"Hot-Wheels-Adventskalender mit Überraschungen für 24 Tage, Fahrzeugen und Zubehör\r\n" + "\r\n"
						+ "Mit dem bunten Adventskalender und 24 Fenstern für eine tägliche Überraschung wird die "
						+ "Adventszeit zum coolen Countdown! Am 1. Dezember geht das erste Türchen auf und der Hot-Wheels-"
						+ "Weihnachtscountdown beginnt! Dieser Hot-Wheels-Adventskalender begeistert Kinder jeden Alters. "
						+ "Er enthält acht Motivfahrzeuge von Hot Wheels und 16 Zubehörteile für jeden Tag bis Weihnachten. "
						+ "Der Hot-Wheels-Adventskalender enthält nun auch eine Spielmatte zum Ausbreiten, damit der "
						+ "Spielspaß mit den Hot-Wheels-Fahrzeugen und dem Zubehör sofort beginnen kann!\r\n"
						+ "Mit dem bunten Adventskalender und 24 Fenstern für eine tägliche Überraschung wird die "
						+ "Adventszeit zum coolen Countdown!\r\n"
						+ "Am 1. Dezember geht das erste Türchen auf und der Hot-Wheels-Weihnachtscountdown beginnt!\r\n"
						+ "Dieser Hot-Wheels-Adventskalender begeistert Kinder jeden Alters.\r\n"
						+ "Er enthält acht Motivfahrzeuge von Hot Wheels und 16 Zubehörteile, für jeden Tag bis Weihnachten.\r\n"
						+ "Der Hot-Wheels-Adventskalender enthält nun auch eine Spielmatte zum Ausbreiten, damit der Spielspaß "
						+ "mit den Hot-Wheels-Fahrzeugen und dem Zubehör sofort beginnen kann.\r\n"
						+ "Der Adventskalender regt die Fantasie an und macht während der Adventszeit jeden Tag zu etwas ganz Besonderem!\r\n"
						+ "Warnhinweise\r\n" + "Warnhinweis:\r\n"
						+ "ACHTUNG! Nicht für Kinder unter 36 Monaten geeignet.\r\n" + "\r\n" + "Warnhinweis:\r\n"
						+ "ACHTUNG! Kleine Teile können erzeugt werden.",
				"", false, true,
				"Produktdetails\r\n"
						+ "Titel: Mattel - Hot-Wheels-Adventskalender mit Überraschungen für 24 Tage, Fahrzeugen u\r\n"
						+ "\r\n" + "EAN: 0887961812961\r\n" + "Empfohlen von 3 bis 99 Jahren.\r\n"
						+ "Kindergartenkinder. Grundschüler. Jugendliche.\r\n" + "Mattel\r\n"
						+ "26. August 2020 - Spielzeug",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender1;

	}

	public Kalender getKalenderVorschlag2() {

		Kalender kalender2 = new Kalender("/gui/buchhandel_kalender/img/39643902_5702016616743_xl.jpg",
				"LEGO® Friends 41420 - Adventskalender", 26.49,
				"Empfohlen von 6 bis 12 Jahren. Grundschüler. Jugendliche.",
				"LEGO Friends 41420 - Adventskalender\r\n" + "\r\n"
						+ "Spielzeug-Adventskalender mit 24 Geschenken zum Bauen und Aufstellen\r\n" + "\r\n"
						+ "Der LEGO Friends Adventskalender (41420) steigert die Spannung aufs Weihnachtsfest. "
						+ "Hinter jedem Türchen finden Kinder eine neue Überraschung zum Zusammenbauen. "
						+ "Der Kalender enthält jede Menge supersüße Figuren, die perfekt in drei weihnachtliche "
						+ "Kulissen passen: Emmas Kinderzimmer, die Werkstatt des Weihnachtsmanns und eine Winterlandschaft. "
						+ "Kinder öffnen die Türchen, bauen die Modelle, um der Reihe nach in den jeweiligen Kulissen zu spielen. "
						+ "Dabei entwickeln sie immer größere Vorfreude auf Weihnachten. "
						+ "Spielzeuge und Schaustücke Neben anderen Spielzeugen sind Frau Weihnachtsmann und "
						+ "2 Elfen als LEGO Friends Spielfiguren enthalten, um mit den Modellen das Kinderzimmer zu schmücken, "
						+ "kreativ zu spielen oder spannende Geschichten zu erzählen. "
						+ "Darüber hinaus gibt es auch Modelle wie das witzige Schneeballkatapult und ein "
						+ "rollendes Spielzeug-Skateboard, die jede Menge Spaß versprechen. "
						+ "24 LEGO Friends Weihnachtsüberraschungen Kinder ab 6 Jahren können die unterhaltsamen "
						+ "Spielzeuge dank der verständlichen Bauanleitungen mühelos zusammenbauen, "
						+ "um sich kreativ zu beschäftigen. Kinder lernen Heartlake City kennen, "
						+ "wo sie tolle Freundschaften schließen und besonders fröhliche Weihnachtsfeste erleben!\r\n"
						+ "Warnhinweise\r\n" + "Achtung! Nicht für Kinder unter 36 Monaten geeignet\r\n"
						+ "Achtung! Enthält verschluckbare Kleinteile. Erstickungsgefahr.",
				"", false, true,
				"Produktdetails\r\n" + "Titel: LEGO® Friends 41420 - Adventskalender\r\n" + "\r\n"
						+ "EAN: 5702016616743\r\n" + "Empfohlen von 6 bis 12 Jahren.\r\n"
						+ "Grundschüler. Jugendliche.\r\n" + "LEGO\r\n" + "2020 - Spiele (außer Software)",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender2;

	}

	public Kalender getKalenderVorschlag3() {

		Kalender kalender3 = new Kalender("/gui/buchhandel_kalender/img/5263527_5263527_xl.jpg",
				"Magic Adventskalender 2020", 26.99, "Empfohlen ab 8 Jahre. Grundschüler. Jugendliche.",
				"Magic Adventskalender 2020\r\n" + "\r\n" + "Magische Vorweihnachtszeit\r\n"
						+ "Wann ist es endlich soweit? Nur noch 24 Zaubertricks bis Weihnachten! "
						+ "Mit dem MAGIC Adventskalender wird das Warten auf den schönsten Tag des "
						+ "Jahres so spannend wie noch nie. Kinder ab 8 Jahren studieren jeden Tag "
						+ "einen neuen Trick ein und überraschen an Heiligabend die ganze Familie mit "
						+ "einer umwerfenden Show. Die Box wird dafür wie ein Buch aufgeklappt und "
						+ "verwandelt sich in Windeseile in eine Bühne. Dank der speziellen "
						+ "japanischen Bindung bleibt jeder Trick in der ausführlichen Anleitung bis "
						+ "zum großen Tag geheim. Bühne frei für die kleinen Magier!!\r\n" + "Besprechung\r\n"
						+ "Die Gespenster geistern unglücklich durch das Schloss, weil sie etwas verloren haben. "
						+ "Es gilt, das jeweils gesuchte Teil zu ertasten, damit die Gespenster wieder glücklich sind. "
						+ "Ein Geschicklichkeits- und Tast-Spiel.\r\n" + "Warnhinweise\r\n"
						+ "Achtung! Nicht für Kinder unter 36 Monaten geeignet\r\n"
						+ "Achtung! Enthält verschluckbare Kleinteile. Erstickungsgefahr.\r\n"
						+ "Inhaltsverzeichnis\r\n"
						+ "- It s magic: Jeden Tag mindestens einen neuen Zaubertrick und ein spannendes Zauberutensil entdecken\r\n"
						+ "- Fördert Geschick und Selbstbewusstsein: An Weihnachten die Familie mit einer großen Zaubershow begeistern\r\n"
						+ "- Bühne frei: Viele magische Gimmicks und Materialien in der aufklappbaren Showbühnen-Verpackung\r\n"
						+ "- Einfach Zaubern lernen: Mit farbiger Anleitung für die ideale Vorführung\r\n"
						+ "- Der ideale Adventskalender für Nachwuchszauberer: Ein tolles Geschenk für interessierte Kinder und neugierige Erwachsene",
				"", false, true,
				"Produktdetails\r\n" + "Titel: Magic Adventskalender 2020\r\n" + "\r\n" + "ISBN: 4002051698010\r\n"
						+ "EAN: 4002051698010\r\n" + "Empfohlen ab 8 Jahre.\r\n" + "Grundschüler. Jugendliche.\r\n"
						+ "Franckh-Kosmos\r\n" + "7. September 2020 - Spiel",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender3;

	}

	public Kalender getKalenderVorschlag4() {

		Kalender kalender4 = new Kalender("/gui/buchhandel_kalender/img/38006835_4006333060731_xl.jpg",
				"Dickie 203149003 - PJ Masks Kinder, Adventskalender Spielzeug inkl. 3 Die-Cast-Fahrzeuge & 5 Figuren, zum…",
				31.49, "Empfohlen ab 3 Jahre. Karton.",
				"PJ Masks: Am Tag sind Connor, Amaya und Greg Klassenkameraden und Freunde. "
						+ "In der Nacht verwandeln sie sich in drei Helden in Pyjamas: Catboy, Eulette und Gecko. "
						+ "In der neuen Staffel erfüllen die drei Superhelden\r\n" + "neue Missionen auf dem Mond.\r\n"
						+ "Warnhinweise\r\n" + "- Achtung: Nicht für Kinder unter 36 Monaten geeignet\r\n"
						+ "- Achtung: Benutzung unter unmittelbarer Aufsicht von Erwachsenen\r\n"
						+ "Inhaltsverzeichnis\r\n"
						+ "- Weihnachten steht vor der Tür und die Kinder freuen sich gemeinsam mit den "
						+ "Helden von PJ Masks auf 24 tolle Überraschungen!\r\n" + "\r\n"
						+ "- Adventskalender PJ Masks bespielbar, Diorama mit 3 Die-Cast Micro Racers und 5 "
						+ "Figuren aus der beliebten Kinderserie, Weihnachtsepisode aus der Sendung wird dargestellt, "
						+ "in der Luna (im Set enthalten) die Weihnachtsgeschenke klaut und die Pyjamahelden dies abwenden wollen\r\n"
						+ "(Gecko rettet Weihnachten)\r\n" + "\r\n"
						+ "- dieser Kalender beinhaltet einen Schneemann, Glow in the dark Zubehör, "
						+ "ein Schneekatapult, einen Mini-Shooter, eine Papierrampe und vielen weiteren tollen Überraschungen\r\n"
						+ "\r\n" + "- sehr großer Spielwert dank der vielen liebevoll gestalteten Details, "
						+ "perfektes Geschenk für Kinder ab 3 Jahren\r\n" + "\r\n"
						+ "- Den Kalender kann man entweder aufhängen oder aufstellen und die Flügel "
						+ "und Ohren am Kalender sind ausklappbar, sodass das Headquarter der Serienhelden dargestellt wird.",
				"", false, true,
				"Produktdetails\r\n"
						+ "Titel: Dickie 203149003 - PJ Masks Kinder, Adventskalender Spielzeug inkl. 3 Die-Cast-Fahrzeuge & 5 Figuren, zum Aufhängen oder Aufstellen\r\n"
						+ "\r\n" + "EAN: 4006333060731\r\n" + "Empfohlen ab 3 Jahre.\r\n" + "Karton.\r\n"
						+ "Simba Toys GmbH & Co.\r\n" + "1. September 2019 - Spiel",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender4;

	}

	public Kalender getKalenderVorschlag5() {

		Kalender kalender5 = new Kalender("/gui/buchhandel_kalender/img/39095610_9783742315328_xl.jpg",
				"Wer weiß denn sowas? - Der Adventskalender zur beliebten Wissensshow im Ersten", 12.99,
				"zur beliebten Wissensshow im Ersten. Adventskalender.",
				"So vergeht die Zeit bis Weihnachten wie im Flug!\r\n"
						+ "Die Wissensshow »Wer weiß denn sowas?« genießt Kultcharakter im Ersten und verkürzt nun auch "
						+ "allen Rätselfreunden und Fans mit kniffligen wie spannenden Fragen die Adventszeit.\r\n"
						+ "Hinter jedem der 24 Türchen zum Aufreißen verstecken sich drei unglaubliche, "
						+ "amüsante und überraschende Fragen und Antworten zum Miträtseln und Staunen. "
						+ "Ob Wissenschaft, Tierwelt oder tägliches Leben - mit diesem Adventskalender "
						+ "stellst du dein Wissen in den unterschiedlichsten Themengebieten auf die Probe "
						+ "und lernst garantiert noch einiges dazu.",
				"", false, true,
				"Produktdetails\r\n"
						+ "Titel: Wer weiß denn sowas? - Der Adventskalender zur beliebten Wissensshow im Ersten\r\n"
						+ "\r\n" + "ISBN: 3742315323\r\n" + "EAN: 9783742315328\r\n"
						+ "zur beliebten Wissensshow im Ersten.\r\n" + "Adventskalender.\r\n" + "riva Verlag\r\n"
						+ "15. September 2020 - gebunden - 100 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender5;

	}

	public Kalender getKalenderVorschlag6() {

		Kalender kalender6 = new Kalender("/gui/buchhandel_kalender/img/39095523_9783742315588_xl.jpg",
				"Flucht aus dem Eis", 12.99, "Der packende Escape-Adventskalender. Empfohlen ab 12 Jahre",
				"Besinnliche Adventszeit war gestern\r\n" + "\r\n"
						+ "Denn dieser packende Escape-Adventskalender nimmt dich mit auf eine nervenaufreibende "
						+ "Spurensuche voller kniffliger Rätsel und kryptischer Codes.\r\n"
						+ "Die mysteriöse Geschichte startet am 1. Dezember auf einem Schiff mitten im Eis. "
						+ "Du solltest schleunigst einen Fluchtweg finden, denn der Treibstoff ist knapp und es "
						+ "bleiben nur noch 24 Tage, um der erbarmungslosen Kälte zu entkommen. "
						+ "Willst du den Heiligabend also nicht als Tiefkühlware verbringen, musst du Kombinationsgabe, "
						+ "Kreativität und vor allem einen kühlen Kopf beweisen.\r\n"
						+ "Eine aufregende Spurensuche für Rätselfreunde und Escape-Fans ab 12 Jahren.\r\n"
						+ "Portrait\r\n"
						+ "Katrin Abfalter studierte Nordische Philologie, Germanistische Mediävistik und "
						+ "Germanistische Linguistik in München und Lund. Nach dem Abschluss ihres "
						+ "Literaturstudiums war sie als selbstständige Grafikdesignerin tätig. Sie lebt in Berlin, "
						+ "wo sie seit 2017 Spiele entwickelt. Für ihre Spieleidee HEXXGARTEN wurde "
						+ "sie 2018 auf dem Göttinger Spieleautorentreffen für ein Autorenstipendium nominiert.",
				"", false, true,
				"Produktdetails\r\n" + "Titel: Flucht aus dem Eis\r\n" + "Autor/en: Katrin Abfalter\r\n" + "\r\n"
						+ "ISBN: 3742315587\r\n" + "EAN: 9783742315588\r\n" + "Der packende Escape-Adventskalender.\r\n"
						+ "Empfohlen ab 12 Jahre.\r\n" + "riva Verlag\r\n"
						+ "15. September 2020 - gebunden - 128 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender6;

	}

	public Kalender getKalenderVorschlag7() {

		Kalender kalender7 = new Kalender("/gui/buchhandel_kalender/img/37967615_9783845835976_xl.jpg",
				"24 Tage Yogaglück", 8.50,
				"Der Yoga-Adventskalender in der Dose. 1. Auflage. Metalldose mit 24 runden Karten.",
				"24 Tage Yogaglück - für mehr Achtsamkeit in der Adventszeit\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Der Yoga-Adventskalender in der Dose! Für zu Hause, für unterwegs, "
						+ "für zwischendurch: 24 illustrierte Karten für eine entspannte und achtsame Weihnachtszeit. "
						+ "Mit simplen, alltagstauglichen Yoga-Übungen für jeden Tag und kleinen Achtsamkeitsanregungen "
						+ "begleitet dieser Adventskalender dich durch die Vorweihnachtszeit. "
						+ "Die Illustrationen von Karo Oh lassen dich an jedem Tag deine Yogapraxis "
						+ "mit einem Augenzwinkern beginnen. Für mehr Gelassenheit und innere Stärke im alljährlichen Weihnachtstrubel! \r\n"
						+ "\r\n" + "\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Inspirierend: Kleine Yoga-Übungen und Tipps für achtsame Momente und weniger Stress in der Vorweihnachtszeit\r\n"
						+ "\r\n" + "\r\n" + "Namaste und nur kein Stress: Ideal auch für Yoga-Anfänger\r\n" + "\r\n"
						+ "\r\n"
						+ "Praktisches Format: Die Kärtchen können auch einzeln auf einen selbst gebastelten Adventskalender verteilt werden\r\n"
						+ "\r\n" + "\r\n"
						+ "Schön verstaut: In der Kartenbox aus Metall sind die Anti-Stress-Karten für unterwegs auch sicher aufbewahrt\r\n"
						+ "\r\n" + "\r\n"
						+ "Geschenk gesucht? Tolle Geschenkidee für die Schwester, Lieblingskollegin, Mama oder beste Freundin",
				"", false, true,
				"Produktdetails\r\n" + "Titel: 24 Tage Yogaglück\r\n" + "\r\n" + "ISBN: 3845835974\r\n"
						+ "EAN: 9783845835976\r\n" + "Der Yoga-Adventskalender in der Dose.\r\n" + "1. Auflage.\r\n"
						+ "Metalldose mit 24 runden Karten.\r\n" + "Illustriert von Karolin Ohrnberger\r\n"
						+ "Ars Edition GmbH\r\n" + "1. Oktober 2020 - kartoniert - 24 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender7;

	}

	public Kalender getKalenderVorschlag8() {

		Kalender kalender8 = new Kalender("/gui/buchhandel_kalender/img/38858508_9783845115993_xl.jpg",
				"Disney - Die Eiskönigin: Mein Adventskalenderbuch (mit perforierten Seiten)", 8.99,
				"Mit 24 magischen Überraschungs-Geschichten aus \"Die Eiskönigin - "
						+ "Völlig unverfroren\" und \"Die Eiskönigin 2\".…",
				"Vom 1. Dezember bis Heiligabend darfst du jeden Tag eine "
						+ "der versiegelten Seiten öffnen. Hinter jedem Türchen verbirgt sich "
						+ "eine wunderbare Geschichte mit Eiskönigin Elsa, ihrer Schwester Anna, "
						+ "Kristoff, dem Rentier Sven und natürlich dem immer fröhlichen Schneemann Olaf.\r\n" + "\r\n"
						+ "So vergeht die Zeit bis Weihnachten wie im Flug!\r\n" + "",
				"", false, true,
				"Produktdetails\r\n"
						+ "Titel: Disney - Die Eiskönigin: Mein Adventskalenderbuch (mit perforierten Seiten)\r\n"
						+ "\r\n" + "ISBN: 3845115998\r\n" + "EAN: 9783845115993\r\n"
						+ "Mit 24 magischen Überraschungs-Geschichten aus \"Die Eiskönigin - Völlig unverfroren\" und \"Die Eiskönigin 2\".\r\n"
						+ "Empfohlen ab 4 Jahre.\r\n" + "2. Auflage.\r\n" + "vierfarbig.\r\n"
						+ "18, 0 cm / 24, 7 cm / 1, 7 cm ( B/H/T ).\r\n" + "Nelson Verlag\r\n"
						+ "1. Oktober 2020 - gebunden - 96 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return kalender8;

	}

}
