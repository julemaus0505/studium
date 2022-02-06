package repository;

import business.FilmeSerien;
import business.Kategorie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FilmeSerienRepository {

	public ObservableList<Kategorie> liefertKategorien() {

		ObservableList<Kategorie> kategorieList = FXCollections.observableArrayList();

		kategorieList.addAll(Kategorie.values());

		return kategorieList;

	}

	public FilmeSerien getFilmeSerienVorschlag1() {

		FilmeSerien filmeSerien1 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/38751003_2751835_big.jpg",
				"THE SECRET - DAS GEHEIMNIS: Traue dich zu tr�umen", 11.99,
				"Bekah Brunstetter, Rhonda Byrne, " + "Rick Parks, Andy Tennant",
				"In Miranda Wells' (Katie Holmes) Leben scheint gerade alles schiefzulaufen. "
						+ "Der alleinerziehenden Mutter von drei Kindern w�chst alles �ber den Kopf. "
						+ "Das Geld reicht hinten und vorne nicht mehr, seitdem ihr Mann vor ein paar "
						+ "Jahren bei einem Flugzeugabsturz ums Leben gekommen ist. Als h�tte sich "
						+ "das Schicksal gegen sie gerichtet, kracht w�hrend eines Hurrikans auch "
						+ "noch ein Ast durch das Dach ihres Hauses. Doch das Unwetter stellt Miranda "
						+ "nicht nur vor ihre n�chste finanzielle Herausforderung, sondern bringt "
						+ "auch den hilfsbereiten Bray Johnson (Josh Lucas) in ihr Leben. Von nun "
						+ "an scheint sich das Blatt f�r Miranda und ihre Familie zu wenden. "
						+ "Ob das an dem positiven und lebensbejahenden Spirit liegt, mit dem Bray "
						+ "in ihr Leben tritt? Und was hat es mit dem r�tselhaften Umschlag auf sich, "
						+ "der Bray Johnson urspr�nglich zu Miranda gef�hrt hat? Ein Geheimnis, "
						+ "das den neu gewonnenen Lebensmut und das langsam wiederkehrende Gl�ck "
						+ "der Familie Wells sogleich wieder aufs Spiel zu setzen scheint ...\r\n" + "Trailer",
				"4042564200980", false, true,
				"Produktdetails\r\n" + "Titel: THE SECRET - DAS GEHEIMNIS: Traue dich zu tr�umen\r\n"
						+ "Autor/en: Bekah Brunstetter, Rhonda Byrne, Rick Parks, Andy Tennant\r\n" + "\r\n"
						+ "ISBN: 4042564200980\r\n" + "EAN: 4042564200980\r\n" + "Untertitel: Deutsch.\r\n"
						+ "Empfohlen ab 0 Jahre.\r\n" + "FSK ohne Altersbeschr�nkung.\r\n"
						+ "Laufzeit ca. 103 Minuten.\r\n" + "Sprachen: Deutsch Englisch.\r\n" + "Amaray Case.\r\n"
						+ "Schnitt: Troy Takaki\r\n" + "Regie: Andy Tennant\r\n"
						+ "Kamera: Andrew Dunn Mit Katie Holmes, Josh Lucas, Jerry OConnell\r\n" + "AL!VE AG\r\n"
						+ "4. Dezember 2020 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien1;

	}

	public FilmeSerien getFilmeSerienVorschlag2() {

		FilmeSerien filmeSerien2 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/32781451_5053083152864_big.jpg",
				"Fifty Shades of Grey - 3 Movie - Collection", 26.99, "E. L. James",
				"-> Fifty Shades of Grey - Geheimes Verlangen (USA 2015, 120 Min., FSK 16):\r\n" + "\r\n"
						+ "Der gr��te globale Bestseller der letzten Jahre erz�hlt die Geschichte der "
						+ "21-j�hrigen Studentin Anastasia Steele (Dakota Johnson), die f�r ihre "
						+ "Universit�tszeitung ein Interview mit dem 27-j�hrigen Milliard�r "
						+ "Christian Grey f�hrt. Grey tritt derart arrogant und anz�glich auf, dass sich die\r\n"
						+ "junge Frau v�llig �berrumpelt f�hlt - ihr Fluchtimpuls weicht aber bald "
						+ "einer geheimen Faszination, der sie sich nicht entziehen kann. "
						+ "Unentrinnbar wird Anastasia in Greys Bann gezogen, der ihr eine ungeahnte Welt er�ffnet.\r\n"
						+ "\r\n" + "\r\n"
						+ "-> Fifty Shades of Grey - Gef�hrliche Liebe (USA 2017, 126 Min., FSK 16):\r\n" + "\r\n"
						+ "Anastasia versucht, Christian zu vergessen und st�rzt sich in ihren neuen Job. "
						+ "Doch Christian tut alles in seiner Macht, um sie zur�ckzugewinnen. "
						+ "Als auch Ana ihr Verlangen nicht l�nger unterdr�cken kann, wirft "
						+ "Christians Vergangenheit einen dunklen Schatten...\r\n" + "\r\n" + "\r\n"
						+ "-> Fifty Shades of Grey - Befreite Lust (USA 2018, 101 Min., FSK 16):\r\n" + "\r\n"
						+ "Nach ihrer Hochzeit schweben Ana und Christian zwar im siebten Himmel, "
						+ "doch schon bald legt sich ein bedrohlicher Schatten �ber das Gl�ck der "
						+ "Frischverm�hlten: Christian wird von seiner mysteri�sen Vergangenheit "
						+ "eingeholt und ein gef�hrlicher Bekannter bedroht die Ehe und Familie der\r\n"
						+ "beiden - verstrickt in kriminelle Intrigen und im Sog dunkler "
						+ "Leidenschaft muss die erstarkte Ana erneut um ihre Liebe k�mpfen.\r\n"
						+ "Inhaltsverzeichnis\r\n" + "Fifty Shades Of Grey - Geheimes Verlangen:\r\n" + "\r\n"
						+ "- Teaser \"Fifty Shades Of Grey - Gef�hrliche Liebe\"\r\n" + "\r\n" + "\r\n"
						+ "Fifty Shades Of Grey - Gef�hrliche Liebe:\r\n" + "\r\n"
						+ "- Teaser \"Fifty Shades Of Grey - Befreite Lust\"\r\n" + "\r\n"
						+ "- Unver�ffentlichte Szenen\r\n" + "\r\n" + "- \"Gef�hrliche Liebe\" schreiben\r\n" + "\r\n"
						+ "- \"Gef�hrliche\" Wiedervereinigung\r\n" + "\r\n" + "\r\n"
						+ "Fifty Shades Of Grey - Befreite Lust:\r\n" + "\r\n" + "- Unver�ffentlichte Szene\r\n"
						+ "\r\n" + "- Der finale H�hepunkt\r\n" + "\r\n"
						+ "- Christian & Ana aus der Sicht von Jamie & Dakota",
				"5053083152864", false, true,
				"Produktdetails\r\n" + "Titel: Fifty Shades of Grey - 3 Movie - Collection\r\n"
						+ "Autor/en: E. L. James\r\n" + "\r\n" + "ISBN: 5053083152864\r\n" + "EAN: 5053083152864\r\n"
						+ "USA.\r\n" + "Untertitel: Deutsch, Englisch, T�rkisch.\r\n"
						+ "Originaltitel: Fifty Shades of Grey.\r\n" + "Empfohlen ab 16 Jahre.\r\n"
						+ "FSK freigegeben ab 16 Jahren.\r\n" + "Laufzeit ca. 334 Minuten.\r\n"
						+ "Sprachen: Deutsch T�rkisch Englisch.\r\n" + "Regie: Sam Taylor-Johnson, James Foley\r\n"
						+ "Mit Jamie Dornan, Dakota Johnson, Luke Grimes\r\n" + "Universal Pictures\r\n"
						+ "14. Juni 2018 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien2;

	}

	public FilmeSerien getFilmeSerienVorschlag3() {

		FilmeSerien filmeSerien3 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/39437376_4260623485851_big.jpg",
				"Das Weihnachtsgl�ck - Liebe ist das sch�nste Geschenk", 9.99,
				"Untertitel: Deutsch. Originaltitel: The Christmas Cabin. "
						+ "Empfohlen ab 0 Jahre. FSK ohne Altersbeschr�nkung.�",
				"Sammys Plan, sich an Weihnachten alleine in die einsam gelegene H�tte ihrer Familie "
						+ "zur�ck zu ziehen, wird von einem unbekannten Mitbesitzer durchkreuzt, "
						+ "der nach anf�nglichen Schwierigkeiten durchaus seine Reize entwickelt.\r\n"
						+ "Inhaltsverzeichnis\r\n" + "- Trailer\r\n" + "- Bildergalerie",
				"4260623485851", false, true,
				"Produktdetails\r\n" + "Titel: Das Weihnachtsgl�ck - Liebe ist das sch�nste Geschenk\r\n" + "\r\n"
						+ "ISBN: 4260623485851\r\n" + "EAN: 4260623485851\r\n" + "Untertitel: Deutsch.\r\n"
						+ "Originaltitel: The Christmas Cabin.\r\n" + "Empfohlen ab 0 Jahre.\r\n"
						+ "FSK ohne Altersbeschr�nkung.\r\n" + "Trailer, Bildergalerie.\r\n"
						+ "Laufzeit ca. 82 Minuten.\r\n" + "Sprachen: Deutsch Englisch.\r\n"
						+ "Regie: Dustin J. Robison\r\n"
						+ "Mit Peyton McDavitt, Chad Michael Collins, Gina St. John\r\n" + "Koch Media GmbH\r\n"
						+ "15. Oktober 2020 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien3;

	}

	public FilmeSerien getFilmeSerienVorschlag4() {

		FilmeSerien filmeSerien4 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/27907367_4042564172492_big.jpg",
				"Sissi Trilogie - K�niginnenblau-Edition", 21.49,
				"Empfohlen ab 6 Jahre. FSK freigegeben " + "ab 6 Jahren. Laufzeit ca. 321 Minuten.",
				"Enth�lt die folgenden drei Filme: Sissi (1955) Sissi Die junge Kaiserin (1956) "
						+ "Sissi Schicksalsjahre einer Kaiserin (1957) Erzherzogin Sophie sucht f�r ihren Sohn, "
						+ "den �sterreichischen Kaiser Franz Joseph, eine Ehefrau. Sie entscheidet sich f�r Prinzessin Nene, "
						+ "die �lteste Tochter ihrer Schwester Ludovika. Bei ihrer Reise nach Bad Ischl begleitet sie Sissi, "
						+ "die j�ngere Schwester von Nene. Sissi trifft auf den Kaiser. Er ist hingerissen von "
						+ "ihrer Anmut und Sch�nheit. Als Sissi jedoch von der geplanten Verlobung mit Nene erf�hrt, "
						+ "will sie deren Gl�ck nicht im Wege stehen. Franz Joseph hat jedoch nur noch Augen f�r "
						+ "Sissi und verk�ndet die Verlobung mit ihr! Nach der glanzvollen Hochzeit kommt es zu Spannungen "
						+ "zwischen Sissi und ihrer Schwiegermutter. Als Sissi einer kleinen Prinzessin zur Welt bringt, "
						+ "beschlie�t Erzherzogin Sophie das Kind selbst zu erziehen. Franz Joseph stimmt zu, "
						+ "aber Sissi sucht Zuflucht bei ihren Eltern. Franz Joseph holt sie voller Liebe nach Wien zur�ck. "
						+ "Sissi gewinnt den Kampf um ihre Tochter, doch die politische Lage mit Ungarn ist gespannt. "
						+ "Dringende Staatsgesch�fte halten Franz Joseph in Wien fest, Sissi aber f�hrt nach Ungarn. "
						+ "Mit Hilfe des ihr treu ergebenen Grafen Andrassy gelingt es Sissi, "
						+ "den revolution�ren Grafen Batthyani f�r die �sterreichische Krone zu gewinnen. "
						+ "Eine starke Lungenerkrankung zwingt Sissi zu einem l�ngeren Kuraufenthalt "
						+ "auf der griechischen Insel Korfu...\r\n" + "Inhaltsverzeichnis\r\n" + "- Booklet\r\n"
						+ "\r\n" + "- Interview mit Karlheinz B�hm\r\n" + "\r\n" + "- Making-of\r\n" + "\r\n"
						+ "- \"Legende Romy Schneider\" (Doku)\r\n" + "\r\n"
						+ "- \"Ach, die Sissi! Wie Romy lernte, nein zu sagen\" (mit Renate Seydel)\r\n" + "\r\n"
						+ "- \"Elisabeth von �sterreich\"\r\n" + "\r\n"
						+ "- \"Zwei B�cher f�r Romy: Ein Besuch bei Renate Seydel\"\r\n" + "\r\n" + "- Trailer",
				"4042564172492", false, true,
				"Produktdetails\r\n" + "Titel: Sissi Trilogie - K�niginnenblau-Edition\r\n" + "\r\n"
						+ "ISBN: 4042564172492\r\n" + "EAN: 4042564172492\r\n" + "Empfohlen ab 6 Jahre.\r\n"
						+ "FSK freigegeben ab 6 Jahren.\r\n" + "Laufzeit ca. 321 Minuten.\r\n"
						+ "Regie: Ernst Marischka\r\n" + "Mit Helene Lauterb�ck, Hans Ziegler, Richard Eybner\r\n"
						+ "AL!VE AG\r\n" + "6. Oktober 2017 - Blu-ray",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien4;

	}

	public FilmeSerien getFilmeSerienVorschlag5() {

		FilmeSerien filmeSerien5 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/27907367_4042564172492_big.jpg",
				"Message in a Bottle", 7.99, "Nicholas Sparks, Gerald Di Pego",
				"Die geschiedene Journalistin Theresa k�mmert sich liebevoll um ihren "
						+ "Sohn Jason und leidet unter der Trennung. W�hrend ihres Urlaubs findet "
						+ "sie eine Flaschenpost mit einem leidenschaftlichen Liebesbrief. "
						+ "Sie ist so ber�hrt, da� sie den Absender aufsp�ren will: "
						+ "Es ist der wortkarge Segelbootbauer Garret, der sich nach dem Tod seiner "
						+ "Frau vollkommen zur�ckgezogen hat und nur noch mit seinem alten Vater spricht. "
						+ "Theresa weckt in Garret wieder tiefe Gef�hle, doch ihre Beziehung wird auf eine harte Probe gestellt...\r\n"
						+ "Trackliste\r\n" + "Trackliste\r\n" + "\r\n" + "1.01: Message In A Bottle - Dvd\r\n" + "\r\n"
						+ "\r\n" + "Inhaltsverzeichnis\r\n" + "- Produktionsnotizen\r\n" + "- Kino-Trailer zum Film\r\n"
						+ "- TV Spots zum Film (4 St�ck)\r\n" + "- Making-Of\r\n"
						+ "- Musik-Video: \"Only Lonely\" von Hootie & the Blowfisch\r\n" + "- Biographien\r\n"
						+ "- Interviews (Darsteller und Regie)\r\n"
						+ "- Trailer zu weiteren Titeln (5 St�ck (4 zu Filmen mit Kevin Costner))\r\n"
						+ "- DVD-ROM-Anteile",
				"0743217528690", false, true,
				"Produktdetails\r\n" + "Titel: Message in a Bottle\r\n"
						+ "Autor/en: Nicholas Sparks, Gerald Di Pego\r\n" + "\r\n" + "ISBN: 0743217528690\r\n"
						+ "EAN: 0743217528690\r\n" + "Der Beginn einer gro�en Liebe.\r\n"
						+ "Untertitel: Deutsch, Deutsch (in OF nicht ausblendbar).\r\n"
						+ "FSK freigegeben ab 6 Jahren.\r\n"
						+ "Titelmen�-Kapitelstruktur- Sprachauswahl-Untertitelauswahl-Biographie der Schauspieler-Filmographie der Schauspieler-Filmtrailer-Andere Filmtrailer.\r\n"
						+ "Laufzeit ca. 2 Stunden.\r\n" + "Sprachen: Deutsch Englisch.\r\n" + "Super Jewel Case.\r\n"
						+ "Schnitt: Steven Weisberg\r\n" + "Regie: Luis Mandoki\r\n"
						+ "Kamera: Caleb Deschanel Mit Kevin Costner, Robin Wright, Paul Newman\r\n"
						+ "LEONINE Distribution GmbH\r\n" + "1. September 2000 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien5;

	}

	public FilmeSerien getFilmeSerienVorschlag6() {

		FilmeSerien filmeSerien6 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/6975874_null_big.jpg",
				"Der Polarexpress", 7.99,
				"F�r H�rgesch�digte geeignet. USA. Untertitel: Deutsch, "
						+ "Englisch. Originaltitel: The Polar Express. Empfohlen�",
				"Beschreibung\r\n" + "Aufstehen, einsteigen... jetzt beginnt die Reise unseres Lebens. "
						+ "In der Weihnachtsnacht erleben wir eine Achterbahnfahrt �ber Berg und Tal,"
						+ "wir schliddern �ber Eisfl�chen, taumeln �ber Kilometer hohe Br�cken und hei�e "
						+ "Schokolade wird uns von singenden Kellnern serviert, die uns �ber alle Ma�en faszinieren. "
						+ "Wir sind im Polarexpress! Mit Tom Hanks in der Hauptrolle inszeniert "
						+ "Robert Zemeckis diesen neuen Weihnachtsklassiker im mitrei�enden "
						+ "Performance-Capture-Animationsverfahren, das jeden Moment verzaubert. \"Glaub nur, was du siehst\", "
						+ "sagt der geheimnisvolle Landstreicher, der mit uns auf die Reise geht. "
						+ "Wir sehen die Wunder. Und wir glauben an sie. Alles einsteigen!\r\n"
						+ "Inhaltsverzeichnis\r\n" + "- US-Kinotrailer",
				"7321925006513", false, true,
				"Produktdetails\r\n" + "Titel: Der Polarexpress\r\n" + "\r\n" + "ISBN: 7321925006513\r\n"
						+ "EAN: 7321925006513\r\n" + "F�r H�rgesch�digte geeignet. USA.\r\n"
						+ "Untertitel: Deutsch, Englisch.\r\n" + "Originaltitel: The Polar Express.\r\n"
						+ "Empfohlen ab 6 Jahre.\r\n" + "FSK freigegeben ab 6 Jahren.\r\n"
						+ "Laufzeit ca. 100 Minuten.\r\n" + "Sprachen: Deutsch Englisch.\r\n"
						+ "Regie: Robert Zemeckis\r\n" + "Mit Tom Hanks, Michael Jeter, Peter Scolari\r\n"
						+ "Warner Bros Entertainment\r\n" + "28. September 2020 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien6;

	}

	public FilmeSerien getFilmeSerienVorschlag7() {

		FilmeSerien filmeSerien7 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/28521442_3263622_big.jpg",
				"Fifty Shades of Grey 2 - Gef�hrliche Liebe", 8.99,
				"USA. Empfohlen ab 16 Jahre. FSK freigegeben ab 16 Jahren. "
						+ "Laufzeit ca. 112 Minuten. Sprachen: Deutsch�",
				"Anastasia versucht Christian zu vergessen und st�rzt sich in ihren neuen Job. "
						+ "Doch Christian ist zu allem bereit, um sie zur�ckzugewinnen und offenbart "
						+ "ihr seine dunkelsten Geheimnisse. Bevor Ana einwilligt, verlangt sie eine neue Vereinbarung - "
						+ "zu ihren Bedingungen: Dieses Mal gibt es keine Regeln! Ihre Leidenschaft "
						+ "entflammt st�rker als zuvor und gemeinsam entdecken sie neue Spielarten der Lust, "
						+ "die ihnen die Sinne rauben. Doch Anas Chef (Eric Johnson) und eine "
						+ "fr�here Gespielin Christians (Kim Basinger) wollen dieses neue Gl�ck um jeden Preis zerst�ren.\r\n"
						+ "Inhaltsverzeichnis\r\n" + "- Teaser FIFTY SHADES OF GREY - BEFREITE LUST (00:32)\r\n"
						+ "\r\n" + "- Unver�ffentlichte Szenen (01:52)\r\n" + "\r\n"
						+ "- GEF�HRLICHE LIEBE schreiben (03:06)\r\n" + "\r\n"
						+ "- GEF�HRLICHE Wiedervereinigung (07:37)",
				"5053083103729", false, true,
				"Produktdetails\r\n" + "Titel: Fifty Shades of Grey 2 - Gef�hrliche Liebe\r\n" + "\r\n"
						+ "ISBN: 5053083103729\r\n" + "EAN: 5053083103729\r\n" + "USA.\r\n"
						+ "Empfohlen ab 16 Jahre.\r\n" + "FSK freigegeben ab 16 Jahren.\r\n"
						+ "Laufzeit ca. 112 Minuten.\r\n" + "Sprachen: Deutsch Englisch.\r\n" + "Regie: James Foley\r\n"
						+ "Mit Dakota Johnson, Jamie Dornan, Bella Heathcote\r\n" + "Universal Pictures\r\n"
						+ "8. Juni 2017 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien7;

	}

	public FilmeSerien getFilmeSerienVorschlag8() {

		FilmeSerien filmeSerien8 = new FilmeSerien("/gui/buchhandel_filmeSerien/img/27471257_0889853526994_big.jpg",
				"Nicholas Sparks - The Collection", 24.99,
				"Message in a Bottle / The Best of Me / Safe Haven / The Choice. "
						+ "Untertitel: Deutsch. FSK freigegeben ab 12�",
				"Beschreibung\r\n" + "In Southport, einem kleinen K�stenst�dtchen in North Carolina, "
						+ "will Katie Feldman (JULIANNE HOUGH) ein neues, friedliches Leben beginnen. "
						+ "Sie mietet ein kleines Holzhaus im Wald und findet einen Job als Kellnerin im Ort. "
						+ "Sie will nicht auffallen und im Hintergrund bleiben. "
						+ "Doch schon bald f�hlt sich Katie von der W�rme und Zuneigung der Bewohner von "
						+ "Southport angezogen, ganz besonders aber von Alex (JOSH DUHAMEL), "
						+ "der allein zwei kleine Kinder aufzieht.Allm�hlich �ffnet sich Katie gegen�ber "
						+ "der Gemeinschaft und genie�t mit Alex das Leben. Doch als ein "
						+ "mysteri�ser Fremder im Ort eintrifft und Fragen �ber Katie stellt, "
						+ "droht sie die Vergangenheit einzuholen. Obwohl sie instinktiv sofort "
						+ "die Flucht ergreifen m�chte, fasst Katie den mutigen Entschluss, "
						+ "zu bleiben und ihr neues Leben mit allen Mitteln zu verteidigen. "
						+ "So entdeckt sie wieder, was es bedeutet, zu vertrauen und Verantwortung "
						+ "zu �bernehmen in einer packenden und spannenden Geschichte, in der es um Hoffnung, "
						+ "�berleben und die Kraft wahrer Liebe geht.\r\n" + "Inhaltsverzeichnis\r\n"
						+ "Message in a Bottle:\r\n" + "\r\n" + "- Insider Infos\r\n" + "\r\n"
						+ "- \"�ffne die Flaschenpost\r\n" + "\r\n" + "- Making Of\r\n" + "\r\n"
						+ "- Cast & Crew mit Statements\r\n" + "\r\n"
						+ "- Video Clip \"Only Lonly\" von Hootie & Blowfish\r\n" + "\r\n" + "- Trailer & TV-Spots\r\n"
						+ "\r\n" + "\r\n" + "Safe Haven:\r\n" + "\r\n" + "- Making of\r\n" + "\r\n"
						+ "- Deleted Scenes\r\n" + "\r\n" + "- Alternatives Ende\r\n" + "\r\n"
						+ "- Featurettes: Die Romantik in Safe Haven, \"Josh Duhamels Lektion im \"Krebse fangen\"\r\n"
						+ "\r\n" + "- Der Drehort\r\n" + "\r\n" + "\r\n" + "The Best of Me:\r\n" + "\r\n"
						+ "- Filmfassung mit alternativem Ende: Eine zweite Chance f�r die Liebe\r\n" + "\r\n"
						+ "- Nicholas Sparks im Gespr�ch mit den Hauptdarstellern\r\n" + "\r\n" + "- Deleted Scenes\r\n"
						+ "\r\n" + "- Musikvideo \"I did\" von Lady Antebellum\r\n" + "\r\n" + "\r\n"
						+ "The Choice:\r\n" + "\r\n" + "- Interviews\r\n" + "\r\n" + "- Featurettes\r\n" + "\r\n"
						+ "- Deleted Scenes\r\n" + "\r\n" + "- Audiokommentar von Benjamin Walker und Ross Katz\r\n"
						+ "",
				"0889853526994", false, true,
				"Produktdetails\r\n" + "Titel: Nicholas Sparks - The Collection\r\n" + "\r\n"
						+ "ISBN: 0889853526994\r\n" + "EAN: 0889853526994\r\n"
						+ "Message in a Bottle / The Best of Me / Safe Haven / The Choice.\r\n"
						+ "Untertitel: Deutsch.\r\n" + "FSK freigegeben ab 12 Jahren.\r\n"
						+ "Laufzeit ca. 455 Minuten.\r\n" + "Sprachen: Deutsch Englisch.\r\n"
						+ "Regie: Lasse Hallstr�m\r\n" + "Mit Kevin Costner, Robin Wright, Paul Newman\r\n"
						+ "LEONINE Distribution GmbH\r\n" + "9. Dezember 2016 - DVD",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return filmeSerien8;

	}

}
