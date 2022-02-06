package repository;

import business.Buch;
import business.Hoerbuch;
import business.Kategorie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HoerbuchRepository {

	public ObservableList<Kategorie> liefertKategorien() {

		ObservableList<Kategorie> kategorieList = FXCollections.observableArrayList();

		kategorieList.addAll(Kategorie.values());

		return kategorieList;

	}

	public Hoerbuch getHoerbuchVorschlag1() {

		Hoerbuch hoerbuch1 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39531884_9783966552028_big.jpg",
				"Der Teufel von Stra�burg", 3.99, "Heidrun Hurst",
				"Er lauert in der Dunkelheit Der packende Historienroman \"Der Teufel von Stra�burg\" "
						+ "von Bestseller-Autorin Heidrun Hurst jetzt als H�rbuch bei dotbooks.\r\n" + "\r\n"
						+ "Seine Opfer sind jung, wehrlos und vollkommen allein Stra�burg, 1348: "
						+ "Ein grausamer M�rder treibt in der Stadt sein Unwesen, aber niemand schert sich darum, "
						+ "denn er t�tet nur namenlose Kinder der Gasse. Als die Klostersch�lerin "
						+ "Adelheid von den Morden erf�hrt, beschlie�t sie, auf eigene Faust zu handeln "
						+ "einem Leben in Armut und Elend ist sie selbst nur knapp entronnen. Unerwartete "
						+ "Hilfe erh�lt sie dabei von Martin, dem Henkerssohn, der mit seiner d�steren "
						+ "Bestimmung hadert und von Adelheids Mut und Kampfgeist von der ersten Sekunde "
						+ "an gefesselt ist Doch wem k�nnen Adelheid und Martin trauen bei der "
						+ "Suche nach einem M�rder, so eiskalt und berechnend, dass er scheinbar "
						+ "keine Spuren hinterl�sst?\r\n" + "\r\n"
						+ "So atemberaubend wie ein Gem�lde der alten Meister die dunkle "
						+ "Seite des Mittelalters in all ihrer Pracht!\r\n" + "\r\n"
						+ "Jetzt als H�rbuch kaufen und genie�en: \"Der Teufel von Stra�burg\" "
						+ "von Bestseller-Autorin Heidrun Hurst als ungek�rzte Lesung bei dotbooks. "
						+ "Brigitte Tr�benbachs klangvolle Erz�hlstimme macht diesen historischen "
						+ "Roman zu einem mitrei�enden H�rvergn�gen.",
				"9783966552028", false, true,
				"Produktdetails\r\n" + "Titel: Der Teufel von Stra�burg\r\n" + "Autor/en: Heidrun Hurst\r\n" + "\r\n"
						+ "ISBN: 9783966552028\r\n" + "EAN: 9783966552028\r\n" + "Format:  MP3-H�rbuch Download\r\n"
						+ "Historischer Roman - Ungek�rztes H�rbuch.\r\n" + "Laufzeit ca. 847 Minuten.\r\n"
						+ "Dateigr��e in MByte: 571.\r\n" + "Vorgelesen von Brigitte Tr�benbach\r\n" + "dotbooks\r\n"
						+ "2. September 2020 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch1;

	}

	public Hoerbuch getHoerbuchVorschlag2() {

		Hoerbuch hoerbuch2 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/38553510_9783732452446_big.jpg",
				"N�chte, in denen Sturm aufzieht (Ungek�rzte Lesung)", 12.99, "Jojo Moyes",
				"Liza McCullen wei�, dass sie ihrer Vergangenheit nicht entfliehen kann. Doch in dem beschaulichen "
						+ "�rtchen Silver Bay an der K�ste Australiens hat sie f�r sich und ihre Tochter "
						+ "Hannah ein Zuhause gefunden. Die unber�hrten Str�nde, der Zusammenhalt in der "
						+ "kleinen Gemeinde und die majest�tischen Wale, die in der Bucht vor Silver Bay leben, "
						+ "bedeuten ihr alles. T�glich f�hrt sie mit ihrem Boot raus aufs Meer und bietet "
						+ "Walbeobachtungstouren an. Doch das ruhige Leben ger�t in Gefahr, als sich der "
						+ "Engl�nder Mike Dormer in der Pension von Lizas Tante einquartiert. Der Fremde "
						+ "in den schicken Klamotten passt so gar nicht nach Silver Bay, und niemand ahnt, "
						+ "dass er Pl�ne schmiedet, die den kleinen Ort f�r immer ver�ndern k�nnten.",
				"9783732452446", false, true,
				"Produktdetails\r\n" + "Titel: N�chte, in denen Sturm aufzieht (Ungek�rzte Lesung)\r\n"
						+ "Autor/en: Jojo Moyes\r\n" + "\r\n" + "ISBN: 9783732452446\r\n" + "EAN: 9783732452446\r\n"
						+ "Format:  MP3-H�rbuch Download\r\n" + "Laufzeit ca. 831 Minuten.\r\n"
						+ "Dateigr��e in MByte: 526.\r\n" + "Vorgelesen von Luise Helm\r\n" + "Argon Verlag GmbH\r\n"
						+ "31. Januar 2020 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch2;

	}

	public Hoerbuch getHoerbuchVorschlag3() {

		Hoerbuch hoerbuch3 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/27807402_9783844915549_big.jpg",
				"Gans & Elch & Weihnachtsmann", 4.99,
				"Friedrich Wolf, James Kr�ss, Andreas Steinh�fel, " + "Hans Christian Andersen, Wolfdi (�)",
				"Diese einmalige Geschichtensammlung geh�rt unter jeden Weihnachtsbaum. "
						+ "Im festlichen Geschenkschuber versammeln sich beliebte Weihnachtsklassiker wie u.a. "
						+ "Friedrich Wolfs Weihnachtsgans Auguste, Es ist ein Elch entsprungen "
						+ "von Andreas Steinh�fel oder Der Weihnachtspapagei von James Kr�ss. "
						+ "Ein tolles Geschenk f�r die ganze Familie! Gelesen von Rufus Beck, "
						+ "Walter Kreye, Stefan Kaminski, Gustav Peter W�hler und Peter Kaempfe.\r\n"
						+ "Die Weihnachtsgans Auguste von Friedrich Wolf\r\n"
						+ "Die Gans Auguste wird von Vater L�wenhaupt f�r das Weihnachtsessen gem�stet. "
						+ "Sie soll als Festbraten auf dem Teller landen. Doch l�ngst hat die Familie, "
						+ "allen voran der kleine Peter, Auguste in ihr Herz geschlossen.\r\n"
						+ "Es ist ein Elch entsprungen von Andreas Steinh�fel\r\n"
						+ "Wer glaubt heutzutage noch an den Weihnachtsmann? Der kleine Bertil Wagner "
						+ "bestimmt nicht. Doch als eines Tages Mr. Moose, der Elch, bei ihm zu Hause "
						+ "durch die Wohnzimmerdecke kracht und ihm merkw�rdige Geschichten von seinem "
						+ "Chef Santerklaus erz�hlt, kommt Bertil ins Gr�beln.Und als dieser Chef selbst "
						+ "bei Bertil in der T�r steht und seinen Elch abholen will, wird's richtig spannend. "
						+ "Den Weihnachtsmann gibt es also wirklich! Vielleicht kann er Bertil sogar "
						+ "seinen sehnlichsten Wunsch erf�llen und seinen Vater dazu bringen, "
						+ "dieses Weihnachtsfest wieder mit ihnen in der Finkenwaldstra�e zu feiern.\r\n"
						+ "Der Weihnachtspapagei von James Kr�ss\r\n"
						+ "O je! Leentjes Papagei ist gestorben und das kleine M�dchenist vor "
						+ "Kummer furchtbar krank. Dabei steht Weihnachten vor der T�r! Da hilft keine "
						+ "Medizin und guter Rat ist teuer. Der alte Doktor van der Tholen verspricht Leentje, "
						+ "dass sie bis Heiligabend einen neuen Papagei haben wird. Nur, wer soll bei "
						+ "den Winterst�rmen bis nach London fahren, um dort so ein Tier zu besorgen? "
						+ "Des Doktors Neffe Pieter und sein Freund Hein sind gestandene M�nner, "
						+ "die das Unm�gliche wagen k�nnten.\r\n" + "Portrait\r\n"
						+ "Friedrich Wolf, 1888 in Neuwied geboren, studierte Medizin, Philosophie und Kunstgeschichte. "
						+ "Er promovierte 1913 und schrieb H�rspiele, Drehb�cher, Dramen, Romane, Erz�hlungen und Kinderb�cher. "
						+ "Nach der Machtergreifung der Nazis emigrierte Wolf nach Moskau. Ab 1945 lebte er wieder "
						+ "in Deutschland und arbeitete vorwiegend als Schriftsteller. Von 1949 bis 1951 war Friedrich "
						+ "Wolf der erste Botschafter der DDR in Polen. Er starb 1953 in Lehnitz bei Berlin.",
				"9783844915549", false, true,
				"Produktdetails\r\n" + "Titel: Gans & Elch & Weihnachtsmann\r\n"
						+ "Autor/en: Friedrich Wolf, James Kr�ss, Andreas Steinh�fel, Hans Christian Andersen, Wolfdietrich Schnurre\r\n"
						+ "\r\n" + "ISBN: 9783844915549\r\n" + "EAN: 9783844915549\r\n"
						+ "Format:  MP3-H�rbuch Download\r\n" + "Geschichten zur Weihnachtszeit.\r\n"
						+ "Laufzeit ca. 368 Minuten.\r\n"
						+ "Vorgelesen von Rufus Beck, Walter Kreye, Stefan Kaminski\r\n" + "Silberfisch\r\n"
						+ "29. September 2016 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch3;

	}

	public Hoerbuch getHoerbuchVorschlag4() {

		Hoerbuch hoerbuch4 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/23774815_23774815_big.jpg",
				"Der kleine Lord", 3.49, "Frances Burnett",
				"Geh�rt zum Fest wie Lichter und Lametta: der kleine Lord!\r\n" + "\r\n"
						+ "Eben war Cedric noch ein ganz normaler amerikanischer Junge und jetzt soll "
						+ "er pl�tzlich ein Lord sein! Sein Gro�vater, ein Graf, holt ihn nach England, "
						+ "um ihn zu einem richtigen Adligen auszubilden. Voller Staunen begibt Cedric "
						+ "sich in die fremde Welt - und schafft es, aus dem griesgr�migen Alten einen "
						+ "freundlichen Menschen zu machen!\r\n" + "\r\n"
						+ "H�rbuch-Prachtausgabe des Klassikers mit viel Musik.",
				"9783837362404", false, true,
				"Produktdetails\r\n" + "Titel: Der kleine Lord\r\n" + "Autor/en: Frances Burnett\r\n" + "\r\n"
						+ "ISBN: 9783837362404\r\n" + "EAN: 9783837362404\r\n" + "Format:  MP3-H�rbuch Download\r\n"
						+ "Gek�rzte Lesung.\r\n" + "Laufzeit ca. 276 Minuten.\r\n" + "Dateigr��e in MByte: 210.\r\n"
						+ "Vorgelesen von Ursula Illert\r\n" + "Oetinger audio\r\n"
						+ "1. Januar 2011 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch4;

	}

	public Hoerbuch getHoerbuchVorschlag5() {

		Hoerbuch hoerbuch5 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39578216_9783844541779_big.jpg",
				"Die Sieben Schwestern-Saga (1-3)", 9.99, "Lucinda Riley",
				"Band 1 bis 3 der faszinierenden und bewegenden Bestseller-Reihe in einem Bundle\r\n" + "\r\n"
						+ "Ein Vater hinterl�sst seinen Adoptivt�chtern Hinweise zu ihren Wurzeln. "
						+ "Drei H�rb�cher voller Geheimnisse, Gef�hle und R�tsel der Vergangenheit."
						+ "Maia m�chte in \"Die sieben Schwestern\" das Geheimnis ihrer Herkunft ergr�nden. "
						+ "Ihre Suche f�hrt sie nicht nur nach Rio, sondern auch in die Vergangenheit "
						+ "ihrer Gro�mutter und in das mond�ne Paris der Jahrhundertwende."
						+ "In \"Die Sturmschwester\" begibt sich Seglerin Ally auf Spurensuche "
						+ "in das raue Norwegen und in die Welt der Musik Edvard Griegs.Und die "
						+ "dritte Schwester, Star, findet in \"Die Schattenschwester\" in einer "
						+ "Londoner Buchhandlung und in den Tageb�chern einer gewissen Flora McNichol "
						+ "mehr �ber sich heraus und vielleicht auch die wahre Liebe. "
						+ "Track 001-117 \"Die sieben Schwestern\", Track 118 346 \"Die Sturmschwester\", Track 347 - 627 \"Die Schattenschwester\"\r\n"
						+ "\r\n" + "Gek�rzte Lesung mit Sinja Dieks, Oliver Siebeck, Bettina Kurth, "
						+ "Katharina Spiering, Simone Kabst\r\n" + "41h 24min",
				"9783844541779", false, true,
				"Produktdetails\r\n" + "Titel: Die Sieben Schwestern-Saga (1-3)\r\n" + "Autor/en: Lucinda Riley\r\n"
						+ "\r\n" + "ISBN: 9783844541779\r\n" + "EAN: 9783844541779\r\n"
						+ "Format:  MP3-H�rbuch Download\r\n"
						+ "Die Sieben Schwestern Band 1-3: Die Sieben Schwestern - Die Sturmschwester - Die Schattenschwester.\r\n"
						+ "Laufzeit ca. 2484 Minuten.\r\n" + "Dateigr��e in MByte: 1820.\r\n"
						+ "Vorgelesen von Sinja Dieks, Oliver Siebeck, Bettina Kurth\r\n" + "Der H�rverlag\r\n"
						+ "16. November 2020 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch5;

	}

	public Hoerbuch getHoerbuchVorschlag6() {

		Hoerbuch hoerbuch6 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/24959134_24959134_big.jpg",
				"Bibi & Tina - Folge 50: Das K�rbisfest", 5.99, "Nelly Sand",
				"Bibi und Tina haben eine ganze Wagenladung K�rbisse bekommen. "
						+ "Nur was fangen sie damit an? Als sie dann die netten M�hlenhof-Ferienkinder treffen, "
						+ "hat Bibi die Idee: ein riesiges Herbst-Ernte-Ferienabschluss-K�rbisfest! "
						+ "Doch es gibt ein Problem, die Ferienkinder reisen bald ab und die "
						+ "Vorbereitungen dauern bestimmt ein paar Tage.",
				"4057664013866", false, true,
				"Produktdetails\r\n" + "Titel: Bibi & Tina - Folge 50: Das K�rbisfest\r\n" + "Autor/en: Nelly Sand\r\n"
						+ "\r\n" + "ISBN: 4057664013866\r\n" + "EAN: 4057664013866\r\n"
						+ "Format:  MP3-H�rbuch Download\r\n" + "Laufzeit ca. 41 Minuten.\r\n"
						+ "Dateigr��e in MByte: 47.\r\n" + "Vorgelesen von S. Bonasewicz, D. Hugo, S. Hasper\r\n"
						+ "KIDDINX\r\n" + "4. Oktober 2004 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch6;

	}

	public Hoerbuch getHoerbuchVorschlag7() {

		Hoerbuch hoerbuch7 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39762596_9783837154221_big.jpg",
				"Ohne Schuld", 14.99, "Charlotte Link",
				"Zwei Opfer, eine Tatwaffe, kein Motiv das perfekte Verbrechen?\r\n" + "\r\n"
						+ "Ein wolkenloser Sommertag, die Hitze dr�ckt aufs Land. "
						+ "Im Zug von London nach York zielt ein Fremder mit einer "
						+ "Pistole auf eine Frau. Sie entkommt in letzter Sekunde. "
						+ "Zwei Tage sp�ter: Eine junge Frau st�rzt mit ihrem Fahrrad, "
						+ "weil jemand einen d�nnen Draht �ber den Weg gespannt hat. "
						+ "Sie ist sofort bewusstlos. Den folgenden Schuss h�rt sie schon nicht mehr. "
						+ "Die Frauen stehen in keiner Verbindung zu einander, "
						+ "aber die Tatwaffe ist dieselbe. Kate Linville, "
						+ "neu beim CID Scarborough, wird sofort in die Ermittlungen hineingezogen. "
						+ "Sie kommt einem grausamen Geheimnis auf die Spur und ger�t "
						+ "selbst in t�dliche Gefahr. Denn der T�ter, der eine vermeintliche "
						+ "Schuld r�chen will, gibt nicht auf\r\n" + "\r\n"
						+ "Gek�rzte Lesung mit Claudia Michelsen\r\n" + "12h 33min\r\n" + "Video",
				"9783837154221", false, true,
				"Produktdetails\r\n" + "Titel: Ohne Schuld\r\n" + "Autor/en: Charlotte Link\r\n" + "\r\n"
						+ "ISBN: 9783837154221\r\n" + "EAN: 9783837154221\r\n" + "Format:  MP3-H�rbuch Download\r\n"
						+ "Laufzeit ca. 753 Minuten.\r\n" + "Dateigr��e in MByte: 570.\r\n"
						+ "Vorgelesen von Claudia Michelsen\r\n" + "Random House Audio\r\n"
						+ "2. November 2020 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch7;

	}

	public Hoerbuch getHoerbuchVorschlag8() {

		Hoerbuch hoerbuch8 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39733210_4064066718350_big.jpg",
				"Conni und der Nikolaus / Conni im Schnee", 3.99,
				"Hans-Joachim Herwald, Ludger Billerbeck, Julia Boehme",
				"Conni ist ganz aufgeregt. Denn morgen kommt der Nikolaus! "
						+ "Jetzt nur noch schnell die Stiefel putzen und vor die T�r stellen. "
						+ "Doch abends bekommt Conni vor lauter Aufregung kein Auge zu. "
						+ "Hat sie da nicht eben ein Ger�usch geh�rt? Bestimmt war das der Nikolaus, "
						+ "oder? Irgendwann schl�ft sie dann aber doch ein und am n�chsten Morgen "
						+ "sind die Stiefel voll bis oben hin mit tollen Sachen. Und weil "
						+ "Papa gar nichts in seinem Schuh hat, steckt Conni ihm heimlich "
						+ "ein Marzipanbrot hinein. Jetzt kann er sich auch �ber den Nikolaus freuen!\r\n"
						+ "Der erste Schnee! Als Conni aus dem Fenster schaut, glaubt sie "
						+ "ihren Augen nicht zu trauen. Es hat geschneit! Schnell M�tze, "
						+ "Schal und Handschuh angezogen und dann ab nach drau�en. "
						+ "Was man da alles machen kann: einen Schneemann bauen, "
						+ "mit dem Schlitten zum Kindergarten fahren, rodeln gehen und "
						+ "nat�rlich eine Schneeballschlacht.\r\n"
						+ "Ein spannendes H�rspiel f�r alle Conni-Fans, nach den gleichnamigen "
						+ "Conni-B�chern von Liane Schneider. Die B�cher \"Conni und der Nikolaus\" und \"Conni im Schnee\" der "
						+ "Autorin Liane Schneider sind im Carlsen Verlag erschienen.\r\n" + "\r\n"
						+ "H�rspielspa� f�r kleine und gro�e Leute ab 3 Jahren!\r\n" + "Spieldauer ca. 38 Minuten",
				"4064066718350", false, true,
				"Produktdetails\r\n" + "Titel: Conni und der Nikolaus / Conni im Schnee\r\n"
						+ "Autor/en: Hans-Joachim Herwald, Ludger Billerbeck, Julia Boehme\r\n" + "\r\n"
						+ "ISBN: 4064066718350\r\n" + "EAN: 4064066718350\r\n" + "Format:  MP3-H�rbuch Download\r\n"
						+ "Empfohlen ab 3 Jahre.\r\n" + "Laufzeit ca. 38 Minuten.\r\n" + "Dateigr��e in MByte: 43.\r\n"
						+ "Vorgelesen von Wolf Frass, Mareike Fell, Jan Dreyer\r\n" + "Karussell\r\n"
						+ "2. Oktober 2020 - MP3 H�rbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch8;

	}

}
