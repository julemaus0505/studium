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
				"Der Teufel von Straßburg", 3.99, "Heidrun Hurst",
				"Er lauert in der Dunkelheit Der packende Historienroman \"Der Teufel von Straßburg\" "
						+ "von Bestseller-Autorin Heidrun Hurst jetzt als Hörbuch bei dotbooks.\r\n" + "\r\n"
						+ "Seine Opfer sind jung, wehrlos und vollkommen allein Straßburg, 1348: "
						+ "Ein grausamer Mörder treibt in der Stadt sein Unwesen, aber niemand schert sich darum, "
						+ "denn er tötet nur namenlose Kinder der Gasse. Als die Klosterschülerin "
						+ "Adelheid von den Morden erfährt, beschließt sie, auf eigene Faust zu handeln "
						+ "einem Leben in Armut und Elend ist sie selbst nur knapp entronnen. Unerwartete "
						+ "Hilfe erhält sie dabei von Martin, dem Henkerssohn, der mit seiner düsteren "
						+ "Bestimmung hadert und von Adelheids Mut und Kampfgeist von der ersten Sekunde "
						+ "an gefesselt ist Doch wem können Adelheid und Martin trauen bei der "
						+ "Suche nach einem Mörder, so eiskalt und berechnend, dass er scheinbar "
						+ "keine Spuren hinterlässt?\r\n" + "\r\n"
						+ "So atemberaubend wie ein Gemälde der alten Meister die dunkle "
						+ "Seite des Mittelalters in all ihrer Pracht!\r\n" + "\r\n"
						+ "Jetzt als Hörbuch kaufen und genießen: \"Der Teufel von Straßburg\" "
						+ "von Bestseller-Autorin Heidrun Hurst als ungekürzte Lesung bei dotbooks. "
						+ "Brigitte Trübenbachs klangvolle Erzählstimme macht diesen historischen "
						+ "Roman zu einem mitreißenden Hörvergnügen.",
				"9783966552028", false, true,
				"Produktdetails\r\n" + "Titel: Der Teufel von Straßburg\r\n" + "Autor/en: Heidrun Hurst\r\n" + "\r\n"
						+ "ISBN: 9783966552028\r\n" + "EAN: 9783966552028\r\n" + "Format:  MP3-Hörbuch Download\r\n"
						+ "Historischer Roman - Ungekürztes Hörbuch.\r\n" + "Laufzeit ca. 847 Minuten.\r\n"
						+ "Dateigröße in MByte: 571.\r\n" + "Vorgelesen von Brigitte Trübenbach\r\n" + "dotbooks\r\n"
						+ "2. September 2020 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch1;

	}

	public Hoerbuch getHoerbuchVorschlag2() {

		Hoerbuch hoerbuch2 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/38553510_9783732452446_big.jpg",
				"Nächte, in denen Sturm aufzieht (Ungekürzte Lesung)", 12.99, "Jojo Moyes",
				"Liza McCullen weiß, dass sie ihrer Vergangenheit nicht entfliehen kann. Doch in dem beschaulichen "
						+ "Örtchen Silver Bay an der Küste Australiens hat sie für sich und ihre Tochter "
						+ "Hannah ein Zuhause gefunden. Die unberührten Strände, der Zusammenhalt in der "
						+ "kleinen Gemeinde und die majestätischen Wale, die in der Bucht vor Silver Bay leben, "
						+ "bedeuten ihr alles. Täglich fährt sie mit ihrem Boot raus aufs Meer und bietet "
						+ "Walbeobachtungstouren an. Doch das ruhige Leben gerät in Gefahr, als sich der "
						+ "Engländer Mike Dormer in der Pension von Lizas Tante einquartiert. Der Fremde "
						+ "in den schicken Klamotten passt so gar nicht nach Silver Bay, und niemand ahnt, "
						+ "dass er Pläne schmiedet, die den kleinen Ort für immer verändern könnten.",
				"9783732452446", false, true,
				"Produktdetails\r\n" + "Titel: Nächte, in denen Sturm aufzieht (Ungekürzte Lesung)\r\n"
						+ "Autor/en: Jojo Moyes\r\n" + "\r\n" + "ISBN: 9783732452446\r\n" + "EAN: 9783732452446\r\n"
						+ "Format:  MP3-Hörbuch Download\r\n" + "Laufzeit ca. 831 Minuten.\r\n"
						+ "Dateigröße in MByte: 526.\r\n" + "Vorgelesen von Luise Helm\r\n" + "Argon Verlag GmbH\r\n"
						+ "31. Januar 2020 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch2;

	}

	public Hoerbuch getHoerbuchVorschlag3() {

		Hoerbuch hoerbuch3 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/27807402_9783844915549_big.jpg",
				"Gans & Elch & Weihnachtsmann", 4.99,
				"Friedrich Wolf, James Krüss, Andreas Steinhöfel, " + "Hans Christian Andersen, Wolfdi (…)",
				"Diese einmalige Geschichtensammlung gehört unter jeden Weihnachtsbaum. "
						+ "Im festlichen Geschenkschuber versammeln sich beliebte Weihnachtsklassiker wie u.a. "
						+ "Friedrich Wolfs Weihnachtsgans Auguste, Es ist ein Elch entsprungen "
						+ "von Andreas Steinhöfel oder Der Weihnachtspapagei von James Krüss. "
						+ "Ein tolles Geschenk für die ganze Familie! Gelesen von Rufus Beck, "
						+ "Walter Kreye, Stefan Kaminski, Gustav Peter Wöhler und Peter Kaempfe.\r\n"
						+ "Die Weihnachtsgans Auguste von Friedrich Wolf\r\n"
						+ "Die Gans Auguste wird von Vater Löwenhaupt für das Weihnachtsessen gemästet. "
						+ "Sie soll als Festbraten auf dem Teller landen. Doch längst hat die Familie, "
						+ "allen voran der kleine Peter, Auguste in ihr Herz geschlossen.\r\n"
						+ "Es ist ein Elch entsprungen von Andreas Steinhöfel\r\n"
						+ "Wer glaubt heutzutage noch an den Weihnachtsmann? Der kleine Bertil Wagner "
						+ "bestimmt nicht. Doch als eines Tages Mr. Moose, der Elch, bei ihm zu Hause "
						+ "durch die Wohnzimmerdecke kracht und ihm merkwürdige Geschichten von seinem "
						+ "Chef Santerklaus erzählt, kommt Bertil ins Grübeln.Und als dieser Chef selbst "
						+ "bei Bertil in der Tür steht und seinen Elch abholen will, wird's richtig spannend. "
						+ "Den Weihnachtsmann gibt es also wirklich! Vielleicht kann er Bertil sogar "
						+ "seinen sehnlichsten Wunsch erfüllen und seinen Vater dazu bringen, "
						+ "dieses Weihnachtsfest wieder mit ihnen in der Finkenwaldstraße zu feiern.\r\n"
						+ "Der Weihnachtspapagei von James Krüss\r\n"
						+ "O je! Leentjes Papagei ist gestorben und das kleine Mädchenist vor "
						+ "Kummer furchtbar krank. Dabei steht Weihnachten vor der Tür! Da hilft keine "
						+ "Medizin und guter Rat ist teuer. Der alte Doktor van der Tholen verspricht Leentje, "
						+ "dass sie bis Heiligabend einen neuen Papagei haben wird. Nur, wer soll bei "
						+ "den Winterstürmen bis nach London fahren, um dort so ein Tier zu besorgen? "
						+ "Des Doktors Neffe Pieter und sein Freund Hein sind gestandene Männer, "
						+ "die das Unmögliche wagen könnten.\r\n" + "Portrait\r\n"
						+ "Friedrich Wolf, 1888 in Neuwied geboren, studierte Medizin, Philosophie und Kunstgeschichte. "
						+ "Er promovierte 1913 und schrieb Hörspiele, Drehbücher, Dramen, Romane, Erzählungen und Kinderbücher. "
						+ "Nach der Machtergreifung der Nazis emigrierte Wolf nach Moskau. Ab 1945 lebte er wieder "
						+ "in Deutschland und arbeitete vorwiegend als Schriftsteller. Von 1949 bis 1951 war Friedrich "
						+ "Wolf der erste Botschafter der DDR in Polen. Er starb 1953 in Lehnitz bei Berlin.",
				"9783844915549", false, true,
				"Produktdetails\r\n" + "Titel: Gans & Elch & Weihnachtsmann\r\n"
						+ "Autor/en: Friedrich Wolf, James Krüss, Andreas Steinhöfel, Hans Christian Andersen, Wolfdietrich Schnurre\r\n"
						+ "\r\n" + "ISBN: 9783844915549\r\n" + "EAN: 9783844915549\r\n"
						+ "Format:  MP3-Hörbuch Download\r\n" + "Geschichten zur Weihnachtszeit.\r\n"
						+ "Laufzeit ca. 368 Minuten.\r\n"
						+ "Vorgelesen von Rufus Beck, Walter Kreye, Stefan Kaminski\r\n" + "Silberfisch\r\n"
						+ "29. September 2016 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch3;

	}

	public Hoerbuch getHoerbuchVorschlag4() {

		Hoerbuch hoerbuch4 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/23774815_23774815_big.jpg",
				"Der kleine Lord", 3.49, "Frances Burnett",
				"Gehört zum Fest wie Lichter und Lametta: der kleine Lord!\r\n" + "\r\n"
						+ "Eben war Cedric noch ein ganz normaler amerikanischer Junge und jetzt soll "
						+ "er plötzlich ein Lord sein! Sein Großvater, ein Graf, holt ihn nach England, "
						+ "um ihn zu einem richtigen Adligen auszubilden. Voller Staunen begibt Cedric "
						+ "sich in die fremde Welt - und schafft es, aus dem griesgrämigen Alten einen "
						+ "freundlichen Menschen zu machen!\r\n" + "\r\n"
						+ "Hörbuch-Prachtausgabe des Klassikers mit viel Musik.",
				"9783837362404", false, true,
				"Produktdetails\r\n" + "Titel: Der kleine Lord\r\n" + "Autor/en: Frances Burnett\r\n" + "\r\n"
						+ "ISBN: 9783837362404\r\n" + "EAN: 9783837362404\r\n" + "Format:  MP3-Hörbuch Download\r\n"
						+ "Gekürzte Lesung.\r\n" + "Laufzeit ca. 276 Minuten.\r\n" + "Dateigröße in MByte: 210.\r\n"
						+ "Vorgelesen von Ursula Illert\r\n" + "Oetinger audio\r\n"
						+ "1. Januar 2011 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch4;

	}

	public Hoerbuch getHoerbuchVorschlag5() {

		Hoerbuch hoerbuch5 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39578216_9783844541779_big.jpg",
				"Die Sieben Schwestern-Saga (1-3)", 9.99, "Lucinda Riley",
				"Band 1 bis 3 der faszinierenden und bewegenden Bestseller-Reihe in einem Bundle\r\n" + "\r\n"
						+ "Ein Vater hinterlässt seinen Adoptivtöchtern Hinweise zu ihren Wurzeln. "
						+ "Drei Hörbücher voller Geheimnisse, Gefühle und Rätsel der Vergangenheit."
						+ "Maia möchte in \"Die sieben Schwestern\" das Geheimnis ihrer Herkunft ergründen. "
						+ "Ihre Suche führt sie nicht nur nach Rio, sondern auch in die Vergangenheit "
						+ "ihrer Großmutter und in das mondäne Paris der Jahrhundertwende."
						+ "In \"Die Sturmschwester\" begibt sich Seglerin Ally auf Spurensuche "
						+ "in das raue Norwegen und in die Welt der Musik Edvard Griegs.Und die "
						+ "dritte Schwester, Star, findet in \"Die Schattenschwester\" in einer "
						+ "Londoner Buchhandlung und in den Tagebüchern einer gewissen Flora McNichol "
						+ "mehr über sich heraus und vielleicht auch die wahre Liebe. "
						+ "Track 001-117 \"Die sieben Schwestern\", Track 118 346 \"Die Sturmschwester\", Track 347 - 627 \"Die Schattenschwester\"\r\n"
						+ "\r\n" + "Gekürzte Lesung mit Sinja Dieks, Oliver Siebeck, Bettina Kurth, "
						+ "Katharina Spiering, Simone Kabst\r\n" + "41h 24min",
				"9783844541779", false, true,
				"Produktdetails\r\n" + "Titel: Die Sieben Schwestern-Saga (1-3)\r\n" + "Autor/en: Lucinda Riley\r\n"
						+ "\r\n" + "ISBN: 9783844541779\r\n" + "EAN: 9783844541779\r\n"
						+ "Format:  MP3-Hörbuch Download\r\n"
						+ "Die Sieben Schwestern Band 1-3: Die Sieben Schwestern - Die Sturmschwester - Die Schattenschwester.\r\n"
						+ "Laufzeit ca. 2484 Minuten.\r\n" + "Dateigröße in MByte: 1820.\r\n"
						+ "Vorgelesen von Sinja Dieks, Oliver Siebeck, Bettina Kurth\r\n" + "Der Hörverlag\r\n"
						+ "16. November 2020 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch5;

	}

	public Hoerbuch getHoerbuchVorschlag6() {

		Hoerbuch hoerbuch6 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/24959134_24959134_big.jpg",
				"Bibi & Tina - Folge 50: Das Kürbisfest", 5.99, "Nelly Sand",
				"Bibi und Tina haben eine ganze Wagenladung Kürbisse bekommen. "
						+ "Nur was fangen sie damit an? Als sie dann die netten Mühlenhof-Ferienkinder treffen, "
						+ "hat Bibi die Idee: ein riesiges Herbst-Ernte-Ferienabschluss-Kürbisfest! "
						+ "Doch es gibt ein Problem, die Ferienkinder reisen bald ab und die "
						+ "Vorbereitungen dauern bestimmt ein paar Tage.",
				"4057664013866", false, true,
				"Produktdetails\r\n" + "Titel: Bibi & Tina - Folge 50: Das Kürbisfest\r\n" + "Autor/en: Nelly Sand\r\n"
						+ "\r\n" + "ISBN: 4057664013866\r\n" + "EAN: 4057664013866\r\n"
						+ "Format:  MP3-Hörbuch Download\r\n" + "Laufzeit ca. 41 Minuten.\r\n"
						+ "Dateigröße in MByte: 47.\r\n" + "Vorgelesen von S. Bonasewicz, D. Hugo, S. Hasper\r\n"
						+ "KIDDINX\r\n" + "4. Oktober 2004 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch6;

	}

	public Hoerbuch getHoerbuchVorschlag7() {

		Hoerbuch hoerbuch7 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39762596_9783837154221_big.jpg",
				"Ohne Schuld", 14.99, "Charlotte Link",
				"Zwei Opfer, eine Tatwaffe, kein Motiv das perfekte Verbrechen?\r\n" + "\r\n"
						+ "Ein wolkenloser Sommertag, die Hitze drückt aufs Land. "
						+ "Im Zug von London nach York zielt ein Fremder mit einer "
						+ "Pistole auf eine Frau. Sie entkommt in letzter Sekunde. "
						+ "Zwei Tage später: Eine junge Frau stürzt mit ihrem Fahrrad, "
						+ "weil jemand einen dünnen Draht über den Weg gespannt hat. "
						+ "Sie ist sofort bewusstlos. Den folgenden Schuss hört sie schon nicht mehr. "
						+ "Die Frauen stehen in keiner Verbindung zu einander, "
						+ "aber die Tatwaffe ist dieselbe. Kate Linville, "
						+ "neu beim CID Scarborough, wird sofort in die Ermittlungen hineingezogen. "
						+ "Sie kommt einem grausamen Geheimnis auf die Spur und gerät "
						+ "selbst in tödliche Gefahr. Denn der Täter, der eine vermeintliche "
						+ "Schuld rächen will, gibt nicht auf\r\n" + "\r\n"
						+ "Gekürzte Lesung mit Claudia Michelsen\r\n" + "12h 33min\r\n" + "Video",
				"9783837154221", false, true,
				"Produktdetails\r\n" + "Titel: Ohne Schuld\r\n" + "Autor/en: Charlotte Link\r\n" + "\r\n"
						+ "ISBN: 9783837154221\r\n" + "EAN: 9783837154221\r\n" + "Format:  MP3-Hörbuch Download\r\n"
						+ "Laufzeit ca. 753 Minuten.\r\n" + "Dateigröße in MByte: 570.\r\n"
						+ "Vorgelesen von Claudia Michelsen\r\n" + "Random House Audio\r\n"
						+ "2. November 2020 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch7;

	}

	public Hoerbuch getHoerbuchVorschlag8() {

		Hoerbuch hoerbuch8 = new Hoerbuch("/gui/buchhandel_hoerbuecher/img/39733210_4064066718350_big.jpg",
				"Conni und der Nikolaus / Conni im Schnee", 3.99,
				"Hans-Joachim Herwald, Ludger Billerbeck, Julia Boehme",
				"Conni ist ganz aufgeregt. Denn morgen kommt der Nikolaus! "
						+ "Jetzt nur noch schnell die Stiefel putzen und vor die Tür stellen. "
						+ "Doch abends bekommt Conni vor lauter Aufregung kein Auge zu. "
						+ "Hat sie da nicht eben ein Geräusch gehört? Bestimmt war das der Nikolaus, "
						+ "oder? Irgendwann schläft sie dann aber doch ein und am nächsten Morgen "
						+ "sind die Stiefel voll bis oben hin mit tollen Sachen. Und weil "
						+ "Papa gar nichts in seinem Schuh hat, steckt Conni ihm heimlich "
						+ "ein Marzipanbrot hinein. Jetzt kann er sich auch über den Nikolaus freuen!\r\n"
						+ "Der erste Schnee! Als Conni aus dem Fenster schaut, glaubt sie "
						+ "ihren Augen nicht zu trauen. Es hat geschneit! Schnell Mütze, "
						+ "Schal und Handschuh angezogen und dann ab nach draußen. "
						+ "Was man da alles machen kann: einen Schneemann bauen, "
						+ "mit dem Schlitten zum Kindergarten fahren, rodeln gehen und "
						+ "natürlich eine Schneeballschlacht.\r\n"
						+ "Ein spannendes Hörspiel für alle Conni-Fans, nach den gleichnamigen "
						+ "Conni-Büchern von Liane Schneider. Die Bücher \"Conni und der Nikolaus\" und \"Conni im Schnee\" der "
						+ "Autorin Liane Schneider sind im Carlsen Verlag erschienen.\r\n" + "\r\n"
						+ "Hörspielspaß für kleine und große Leute ab 3 Jahren!\r\n" + "Spieldauer ca. 38 Minuten",
				"4064066718350", false, true,
				"Produktdetails\r\n" + "Titel: Conni und der Nikolaus / Conni im Schnee\r\n"
						+ "Autor/en: Hans-Joachim Herwald, Ludger Billerbeck, Julia Boehme\r\n" + "\r\n"
						+ "ISBN: 4064066718350\r\n" + "EAN: 4064066718350\r\n" + "Format:  MP3-Hörbuch Download\r\n"
						+ "Empfohlen ab 3 Jahre.\r\n" + "Laufzeit ca. 38 Minuten.\r\n" + "Dateigröße in MByte: 43.\r\n"
						+ "Vorgelesen von Wolf Frass, Mareike Fell, Jan Dreyer\r\n" + "Karussell\r\n"
						+ "2. Oktober 2020 - MP3 Hörbuch Download",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return hoerbuch8;

	}

}
