package repository;

import business.Ebook;
import business.Kategorie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EbookRepository {

	public ObservableList<Kategorie> liefertKategorien() {

		ObservableList<Kategorie> kategorieList = FXCollections.observableArrayList();

		kategorieList.addAll(Kategorie.values());

		return kategorieList;

	}

	public Ebook getEbookVorschlag1() {

		Ebook ebook1 = new Ebook("/gui/buchhandel_ebooks/img/38859578_9783641241704_big.jpg",
				"R�ckkehr in die Tuchvilla", 9.99, "Anne Jacobs",
				"Neues aus der Tuchvilla: Die opulente Erfolgssaga geht weiter!\r\n" + "\r\n"
						+ "Augsburg 1930. Marie und Paul Melzer sind gl�cklich, und ihre Liebe ist "
						+ "st�rker denn je - gekr�nt von ihrem dritten Kind, "
						+ "dem mittlerweile vierj�hrigen Kurti. Doch aufgrund der weltweiten Wirtschaftskrise "
						+ "und den schweren Zeiten muss Paul um "
						+ "das �berleben seiner Tuchfabrik k�mpfen. Als er an einer Herzmuskelentz�ndung erkrankt, "
						+ "springt Marie ein, um das Unternehmen vor dem Ruin zu retten, denn es steht nichts anderes als das "
						+ "Schicksal der ganzen Familie auf dem Spiel. Wichtige Entscheidungen sind zu treffen, denn auf den "
						+ "Schultern der Familie Melzer lasten hohe Kreditschulden. Nur, wenn jetzt alle zusammenhalten, "
						+ "ist ihre geliebte Tuchvilla noch zu retten. Doch auf eines k�nnen sich "
						+ "alle verlassen: Wenn die Not am gr��ten ist, " + "ist die Hilfe am n�chsten.\r\n" + "\r\n"
						+ "SPIEGEL-Bestsellerautorin Anne Jacobs bei Blanvalet:\r\n" + "\r\n"
						+ "Die Tuchvilla-Saga:\r\n" + "1. Die Tuchvilla\r\n" + "2. Die T�chter der Tuchvilla\r\n"
						+ "3. Das Erbe der Tuchvilla\r\n" + "4. R�ckkehr in die Tuchvilla\r\n" + "\r\n"
						+ "Die Gutshaus-Saga:\r\n" + "1. Das Gutshaus. Glanzvolle Zeiten\r\n"
						+ "2. Das Gutshaus. St�rmische Zeiten\r\n" + "3. Das Gutshaus. Zeit des Aufbruchs\r\n" + "\r\n"
						+ "Anne Jacobs als Leah Bach:\r\n" + "\r\n" + "Der Himmel �ber dem Kilimandscharo\r\n"
						+ "Sanfter Mond �ber Usambara\r\n" + "Insel der tausend Sterne\r\n" + "\r\n" + "Portrait\r\n"
						+ "Anne Jacobs ver�ffentlichte unter anderem Namen bereits historische Romane und exotische Sagas. "
						+ "Mit �Die Tuchvilla� gestaltete sie ein Familienschicksal vor dem Hintergrund der "
						+ "j�ngeren deutschen Geschichte und st�rmte damit die Bestsellerliste. "
						+ "Nach ihrer ebenfalls sehr erfolgreichen Trilogie um �Das Gutshaus�, "
						+ "die von einem alten herrschaftlichen Gutshof in Mecklenburg-Vorpommern "
						+ "und vom Schicksal seiner Bewohner in bewegten Zeiten erz�hlt, "
						+ "legt Anne Jacobs nun den von den Leserinnen langersehnten vierten Band der �Tuchvilla�-Saga vor.\r\n"
						+ "Technik\r\n"
						+ "Dieses eBook wird im epub-Format geliefert und ist mit einem Wasserzeichen versehen. "
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "\r\n"
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "F�r welche Ger�te?\r\n"
						+ "Sie k�nnen das eBook auf allen Leseger�ten, in Apps und in Lesesoftware �ffnen, die epub unterst�tzen:\r\n"
						+ "\r\n" + "tolino Reader\r\n"
						+ "�ffnen Sie das eBook nach der automatischen Synchronisation auf dem Reader oder "
						+ "�bertragen Sie es manuell auf Ihr tolino Ger�t mit der kostenlosen Software Adobe Digital Editions.\r\n"
						+ "\r\n" + "Andere eBook Reader\r\n"
						+ "Laden Sie das eBook direkt auf dem Reader im Hugendubel.de-Shop herunter oder "
						+ "�bertragen Sie es mit der kostenlosen Software Sony READER FOR PC/Mac oder Adobe Digital Editions.\r\n"
						+ "\r\n" + "F�r Tablets und Smartphones: Unsere Gratis tolino Lese-App\r\n" + "\r\n" + "\r\n"
						+ "PC und Mac\r\n"
						+ "Lesen Sie das eBook direkt nach dem Herunterladen �ber \"Jetzt lesen\" im Browser, "
						+ "oder mit der kostenlosen Lesesoftware Adobe Digital Editions.\r\n" + "\r\n"
						+ "Die eBook-Datei wird beim Herunterladen mit einem nicht l�schbaren "
						+ "Wasserzeichen individuell markiert, sodass die Ermittlung und rechtliche "
						+ "Verfolgung des urspr�nglichen K�ufers im Fall einer missbr�uchlichen Nutzung der eBook-Datei m�glich ist.\r\n"
						+ "Bitte beachten Sie: Dieses eBook ist nicht auf Kindle-Ger�ten lesbar.\r\n" + "\r\n" + "\r\n"
						+ "Ihr erstes eBook?\r\n"
						+ "Hier erhalten Sie alle Informationen rund um die digitalen B�cher f�r Neueinsteiger.",
				"9783641241704", false, true,
				"Produktdetails\r\n" + "Titel: R�ckkehr in die Tuchvilla\r\n" + "Autor/en: Anne Jacobs\r\n" + "\r\n"
						+ "EAN: 9783641241704\r\n" + "Format:  EPUB\r\n" + "Roman.\r\n" + "Familiy Sharing: Ja\r\n"
						+ "Random House ebook\r\n" + "16. November 2020 - epub eBook - 624 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return ebook1;

	}

	public Ebook getEbookVorschlag2() {

		Ebook ebook2 = new Ebook("/gui/buchhandel_ebooks/img/38879354_9783426439838_big.jpg", "Der Heimweg", 14.99,
				"Sebastian Fitzek",
				"Wer das Datum seines Todes kennt, hat mit dem Sterben schon begonnen - "
						+ "der neue Bestseller von Sebastian Fitzek!\r\n" + "\r\n"
						+ "Es ist Samstag, kurz nach 22.00 Uhr. Jules Tannberg sitzt am Begleittelefon. "
						+ "Ein ehrenamtlicher Telefonservice f�r Frauen, die zu sp�ter Stunde auf ihrem "
						+ "Heimweg Angst bekommen und sich einen telefonischen Begleiter w�nschen, "
						+ "dessen beruhigende Stimme sie sicher durch die Nacht nach Hause f�hrt - oder im Notfall Hilfe ruft.\r\n"
						+ "Noch nie gab es eine wirklich lebensgef�hrliche Situation. Bis heute, als Jules mit Klara spricht.\r\n"
						+ "Die junge Frau hat entsetzliche Angst. Sie glaubt, von einem Mann verfolgt zu werden, "
						+ "der sie schon einmal �berfallen hat und der mit Blut ein Datum auf ihre Schlafzimmerwand malte: "
						+ "Klaras Todestag! Und dieser Tag bricht in nicht einmal zwei Stunden an ...\r\n" + "\r\n"
						+ "Geheimnisvoll, beklemmend, nervenaufreibend. Sebastian Fitzeks bislang unheimlichster Psychothriller.",
				"9783426439838", false, true,
				"Produktdetails\r\n" + "Titel: Der Heimweg\r\n" + "Autor/en: Sebastian Fitzek\r\n" + "\r\n"
						+ "EAN: 9783426439838\r\n" + "Format:  EPUB\r\n" + "Psychothriller.\r\n"
						+ "Familiy Sharing: Ja\r\n" + "Droemer Knaur\r\n"
						+ "21. Oktober 2020 - epub eBook - 400 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook2;
	}

	public Ebook getEbookVorschlag3() {

		Ebook ebook3 = new Ebook("/gui/buchhandel_ebooks/img/39317991_9783736314870_big.jpg", "Christmas Deal", 3.99,
				"",
				"Office Romance trifft auf Weihnachten\r\n" + "\r\n"
						+ "Riley Kennedy ist genervt. Immer wieder landen ihre E-Mails bei ihrem Kollegen Kennedy Riley. "
						+ "Doch statt sie einfach weiterzuleiten, gibt dieser stets auch noch seine unpassenden Kommentare dazu ab. "
						+ "Als sie sich auf der Weihnachtsparty dann gegen�ber stehen, will Riley die Gelegenheit nutzen, "
						+ "ihm endlich ordentlich die Meinung zu sagen. Doch ehe sie sich versieht, "
						+ "hat sie der attraktive Kennedy zu einem Weihnachtdeal �berredet: "
						+ "Er spielt ihren Freund auf der Weihnachtsparty ihrer Mutter, "
						+ "daf�r begleitet sie ihn auf eine Hochzeit. Doch was, wenn aus dem Deal auf einmal etwas Echtes wird?\r\n"
						+ "\r\n" + "\"Vi Keelands und Penelope Wards Geschichten sind pure Magie. "
						+ "Ausnahmslos jedes Mal!\" BOOK BABES UNITE\r\n" + "\r\n"
						+ "Eine sexy und romantische Weihnachtsnovella des Bestsellerduos Vi Keeland und Penelope Ward\r\n"
						+ "Portrait\r\n"
						+ "Vi Keeland ist eine SPIEGEL-Bestseller-Autorin. Als waschechte New Yorkerin lebt sie mit ihrer "
						+ "Familie noch immer dort und arbeitet als Anw�ltin. Weitere Informationen unter: vikeeland.com\r\n"
						+ "\r\n"
						+ "Penelope Ward ist eine NEW-YORK-TIMES-, USA-TODAY- und WALL-STREET-JOURNAL-Bestseller-Autorin. "
						+ "Sie arbeitete als Nachrichtensprecherin beim Fernsehen, bevor sie zu schreiben begann. "
						+ "Penelope liebt New-Adult-Romane, Kaffee und ihre Freunde und Familie. "
						+ "Sie ist stolze Mutter zweier Kinder und lebt in Rhode Island. Weitere Informationen unter: "
						+ "penelopewardauthor.com\r\n" + "Technik\r\n"
						+ "Dieses eBook wird im epub-Format geliefert und ist mit einem Wasserzeichen versehen. "
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "\r\n"
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "F�r welche Ger�te?\r\n"
						+ "Sie k�nnen das eBook auf allen Leseger�ten, in Apps und in Lesesoftware �ffnen, die epub unterst�tzen:\r\n"
						+ "\r\n" + "tolino Reader\r\n"
						+ "�ffnen Sie das eBook nach der automatischen Synchronisation auf dem Reader oder "
						+ "�bertragen Sie es manuell auf Ihr tolino Ger�t mit der kostenlosen Software Adobe Digital Editions.\r\n"
						+ "\r\n" + "Andere eBook Reader\r\n"
						+ "Laden Sie das eBook direkt auf dem Reader im Hugendubel.de-Shop herunter oder "
						+ "�bertragen Sie es mit der kostenlosen Software Sony READER FOR PC/Mac oder Adobe Digital Editions.\r\n"
						+ "\r\n" + "F�r Tablets und Smartphones: Unsere Gratis tolino Lese-App\r\n" + "       \r\n"
						+ "\r\n" + "PC und Mac\r\n"
						+ "Lesen Sie das eBook direkt nach dem Herunterladen �ber \"Jetzt lesen\" im Browser, "
						+ "oder mit der kostenlosen Lesesoftware Adobe Digital Editions.\r\n" + "\r\n"
						+ "Die eBook-Datei wird beim Herunterladen mit einem nicht l�schbaren Wasserzeichen "
						+ "individuell markiert, sodass die Ermittlung und rechtliche Verfolgung des urspr�nglichen "
						+ "K�ufers im Fall einer missbr�uchlichen Nutzung der eBook-Datei m�glich ist.\r\n"
						+ "Bitte beachten Sie: Dieses eBook ist nicht auf Kindle-Ger�ten lesbar.\r\n" + "\r\n" + "\r\n"
						+ "Ihr erstes eBook?\r\n"
						+ "Hier erhalten Sie alle Informationen rund um die digitalen B�cher f�r Neueinsteiger.",
				"9783736314870", false, true,
				"Produktdetails\r\n" + "Titel: Christmas Deal\r\n" + "Autor/en: Vi Keeland, Penelope Ward\r\n" + "\r\n"
						+ "EAN: 9783736314870\r\n" + "Format:  EPUB\r\n" + "Originaltitel: The Christmas Pact.\r\n"
						+ "Empfohlen von 16 bis 99 Jahren.\r\n" + "Familiy Sharing: Ja\r\n" + "LYX\r\n"
						+ "1. November 2020 - epub eBook - 172 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook3;
	}

	public Ebook getEbookVorschlag4() {

		Ebook ebook4 = new Ebook("/gui/buchhandel_ebooks/img/38408010_9783843723244_big.jpg", "Sommer der Wahrheit",
				9.99, "Nele Neuhaus",
				"Wenn ein Sommer dein ganzes Leben ver�ndert\r\n"
						+ "Nebraska, Anfang der neunziger Jahre: Sheridan Grant lebt mit ihrer Adoptivfamilie auf "
						+ "einer Farm inmitten von Maisfeldern. Die Eint�nigkeit des Farmlebens und das strenge Regime "
						+ "ihrer Adoptivmutter machen Sheridan das Leben schwer, doch zum Gl�ck gibt es Tante Isabella "
						+ "und die Musik, die Sheridan �ber alles liebt. Der Farmarbeiter Danny, der Rodeoreiter "
						+ "Nick und der K�nstler Christopher machen ihr den Hof, und sie st��t auf die Tageb�cher der "
						+ "geheimnisvollen Carolyn, die vor vielen Jahren spurlos verschwand. Das Leben ist pl�tzlich aufregend, "
						+ "bis in einer Halloween-Nacht etwas Furchtbares passiert. Nun erweist sich, "
						+ "wem Sheridan wirklich vertrauen kann ...\r\n" + "Portrait\r\n"
						+ "Nele Neuhaus, geboren in M�nster / Westfalen, lebt seit ihrer Kindheit im Taunus. "
						+ "Sie ist die erfolgreichste Krimiautorin Deutschlands, ihre B�cher erscheinen au�erdem "
						+ "in �ber 30 L�ndern. Neben den Taunuskrimis schreibt die passionierte Reiterin auch "
						+ "Pferde-Jugendb�cher und Unterhaltungsliteratur, die sie zun�chst unter ihrem "
						+ "M�dchennamen Nele L�wenberg ver�ffentlichte. Ihre Saga um die junge Sheridan "
						+ "Grant st�rmte auf Anhieb die Bestsellerlisten.\r\n" + "Technik\r\n"
						+ "Dieses eBook wird im epub-Format geliefert und ist mit einem Wasserzeichen versehen. "
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "\r\n"
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "F�r welche Ger�te?\r\n"
						+ "Sie k�nnen das eBook auf allen Leseger�ten, in Apps und in Lesesoftware �ffnen, "
						+ "die epub unterst�tzen:\r\n" + "\r\n" + "tolino Reader\r\n"
						+ "�ffnen Sie das eBook nach der automatischen Synchronisation auf dem Reader oder "
						+ "�bertragen Sie es manuell auf Ihr tolino Ger�t mit der kostenlosen Software Adobe Digital Editions.\r\n"
						+ "\r\n" + "Andere eBook Reader\r\n"
						+ "Laden Sie das eBook direkt auf dem Reader im Hugendubel.de-Shop herunter oder "
						+ "�bertragen Sie es mit der kostenlosen Software Sony READER FOR PC/Mac oder Adobe Digital Editions.\r\n"
						+ "\r\n" + "F�r Tablets und Smartphones: Unsere Gratis tolino Lese-App\r\n" + "       \r\n"
						+ "\r\n" + "PC und Mac\r\n"
						+ "Lesen Sie das eBook direkt nach dem Herunterladen �ber \"Jetzt lesen\" im Browser, "
						+ "oder mit der kostenlosen Lesesoftware Adobe Digital Editions.\r\n" + "\r\n"
						+ "Die eBook-Datei wird beim Herunterladen mit einem nicht l�schbaren Wasserzeichen "
						+ "individuell markiert, sodass die Ermittlung und rechtliche Verfolgung des urspr�nglichen "
						+ "K�ufers im Fall einer missbr�uchlichen Nutzung der eBook-Datei m�glich ist.\r\n"
						+ "Bitte beachten Sie: Dieses eBook ist nicht auf Kindle-Ger�ten lesbar.\r\n" + "\r\n" + "\r\n"
						+ "Ihr erstes eBook?\r\n"
						+ "Hier erhalten Sie alle Informationen rund um die digitalen B�cher f�r Neueinsteiger.",
				"9783843723244", false, true,
				"Produktdetails\r\n" + "Titel: Sommer der Wahrheit\r\n" + "Autor/en: Nele Neuhaus\r\n" + "\r\n"
						+ "EAN: 9783843723244\r\n" + "Format:  EPUB\r\n" + "Roman.\r\n" + "Familiy Sharing: Ja\r\n"
						+ "Ullstein Taschenbuchvlg.\r\n" + "15. April 2020 - epub eBook - 512 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook4;
	}

	public Ebook getEbookVorschlag5() {

		Ebook ebook5 = new Ebook("/gui/buchhandel_ebooks/img/39780603_9783967140842_big.jpg", "Winter auf Schottisch",
				3.99, "Karin Lindberg",
				"Wer h�tte gedacht, dass der Winter in Schottland so hei� sein kann ...?\r\n"
						+ "Avas Leben scheint nach au�en hin perfekt zu sein: steile Karriere, "
						+ "Teil eines Power Couples und ein schickes Outfit f�r jede Situation. "
						+ "In Wirklichkeit steht ihr Innenarchitekturb�ro kurz vor dem Aus, "
						+ "ihr ach-so-toller Freund erweist sich als Schwein und ihre Designeroutfits "
						+ "sind absolut ungeeignet f�r den Auftrag, der ihre Agentur retten soll: "
						+ "Wind und St�rme in Schottland, um zur Weihnachtszeit ein altes Schloss "
						+ "umzugestalten? Nein danke! Zu allem �bel l�sst sie der Highlander Colin, "
						+ "mit dem sie zusammenarbeiten soll, deutlich sp�ren, dass er weder von ihr "
						+ "noch von ihrem Modebewusstsein sonderlich beeindruckt ist. Leider ist er "
						+ "aber teuflisch attraktiv, und dass ihre Hormone unter dem Mistelzweig verr�cktspielen, "
						+ "kann sie gar nicht gebrauchen!\r\n"
						+ "Und doch scheint Colin f�r Ava das einzige Gegenmittel zu der Eisesk�lte "
						+ "in den Highlands zu sein - und vielleicht sogar zu der in ihrem Herzen ...\r\n" + "\r\n"
						+ "Der Roman ist in sich abgeschlossen.\r\n"
						+ "Fans von \"Sommer auf Schottisch\" d�rfen sich auf ein Wiedersehen mit Ellie und Kenneth freuen.\r\n"
						+ "Technik\r\n"
						+ "Dieses eBook wird im epub-Format geliefert und ist mit einem Wasserzeichen versehen. "
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "\r\n"
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "F�r welche Ger�te?\r\n"
						+ "Sie k�nnen das eBook auf allen Leseger�ten, in Apps und in Lesesoftware �ffnen, "
						+ "die epub unterst�tzen:\r\n" + "\r\n" + "tolino Reader\r\n"
						+ "�ffnen Sie das eBook nach der automatischen Synchronisation auf dem Reader oder "
						+ "�bertragen Sie es manuell auf Ihr tolino Ger�t mit der kostenlosen "
						+ "Software Adobe Digital Editions.\r\n" + "\r\n" + "Andere eBook Reader\r\n"
						+ "Laden Sie das eBook direkt auf dem Reader im Hugendubel.de-Shop herunter "
						+ "oder �bertragen Sie es mit der kostenlosen Software Sony READER FOR PC/Mac oder Adobe Digital Editions.\r\n"
						+ "\r\n" + "F�r Tablets und Smartphones: Unsere Gratis tolino Lese-App\r\n" + "       \r\n"
						+ "\r\n" + "PC und Mac\r\n"
						+ "Lesen Sie das eBook direkt nach dem Herunterladen �ber \"Jetzt lesen\" "
						+ "im Browser, oder mit der kostenlosen Lesesoftware Adobe Digital Editions.\r\n" + "\r\n"
						+ "Die eBook-Datei wird beim Herunterladen mit einem nicht l�schbaren Wasserzeichen "
						+ "individuell markiert, sodass die Ermittlung und rechtliche Verfolgung des "
						+ "urspr�nglichen K�ufers im Fall einer missbr�uchlichen Nutzung der eBook-Datei m�glich ist.\r\n"
						+ "Bitte beachten Sie: Dieses eBook ist nicht auf Kindle-Ger�ten lesbar.\r\n" + "\r\n" + "\r\n"
						+ "Ihr erstes eBook?\r\n"
						+ "Hier erhalten Sie alle Informationen rund um die digitalen B�cher f�r Neueinsteiger.",
				"9783967140842", false, true,
				"Produktdetails\r\n" + "Titel: Winter auf Schottisch\r\n" + "Autor/en: Karin Lindberg\r\n" + "\r\n"
						+ "EAN: 9783967140842\r\n" + "Format:  EPUB\r\n" + "Highland-Liebesroman.\r\n"
						+ "Familiy Sharing: Ja\r\n" + "Zeilenfluss\r\n" + "15. Oktober 2020 - epub eBook - 349 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook5;
	}

	public Ebook getEbookVorschlag6() {

		Ebook ebook6 = new Ebook("/gui/buchhandel_ebooks/img/31920928_9783641227326_big.jpg", "BECOMING", 14.99,
				"Michelle Obama",
				"Die kraftvolle und inspirierende Autobiografie der ehemaligen First Lady der USA\r\n" + "\r\n"
						+ "Michelle Obama ist eine der �berzeugendsten und beeindruckendsten Frauen der Gegenwart. "
						+ "Als erste afro-amerikanische First Lady der USA trug sie ma�geblich dazu bei,"
						+ "das gastfreundlichste und offenste Wei�e Haus zu schaffen, das es je gab. "
						+ "Sie wurde zu einer energischen F�rsprecherin f�r die Rechte von Frauen und "
						+ "M�dchen in der ganzen Welt, setzte sich f�r einen dringend notwendigen "
						+ "gesellschaftlichen Wandel hin zu einem ges�nderen und aktiveren Leben "
						+ "ein und st�rkte au�erdem ihrem Ehemann den R�cken, w�hrend dieser die "
						+ "USA durch einige der schmerzlichsten Momente des Landes f�hrte. Ganz "
						+ "nebenbei zeigte sie uns noch ein paar l�ssige Dance-Moves, gl�nzte "
						+ "beim \"Carpool Karaoke\" und schaffte es obendrein auch, zwei bodenst�ndige "
						+ "T�chter zu erziehen - mitten im gnadenlosen Blitzlichtgewitter der Medien.\r\n"
						+ "In diesem Buch erz�hlt sie nun erstmals ihre Geschichte - "
						+ "in ihren eigenen Worten und auf ihre ganz eigene Art. Sie nimmt "
						+ "uns mit in ihre Welt und berichtet von all den Erfahrungen, die "
						+ "sie zu der starken Frau gemacht haben, die sie heute ist. Warmherzig, "
						+ "weise und unverbl�mt erz�hlt sie von ihrer Kindheit an der Chicagoer South Side, "
						+ "von den Jahren als Anw�ltin und leitende Angestellte, "
						+ "von der nicht immer einfachen Zeit als berufst�tige Mutter sowie von "
						+ "ihrem Leben an Baracks Seite und dem Leben ihrer Familie im Wei�en Haus. "
						+ "Gnadenlos ehrlich und voller Esprit schreibt sie sowohl �ber "
						+ "gro�e Erfolge als auch �ber bittere Entt�uschungen, den privaten wie den �ffentlichen. "
						+ "Dieses Buch ist mehr als eine Autobiografie. Es enth�lt die ungew�hnlich "
						+ "intimen Erinnerungen einer Frau mit Herz und Substanz, deren Geschichte "
						+ "uns zeigt, wie wichtig es ist, seiner eigenen Stimme zu folgen.",
				"9783641227326", false, true,
				"Produktdetails\r\n" + "Titel: BECOMING\r\n" + "Autor/en: Michelle Obama\r\n" + "\r\n"
						+ "EAN: 9783641227326\r\n" + "Format:  EPUB\r\n" + "Meine Geschichte.\r\n"
						+ "Originaltitel: BECOMING.\r\n" + "Familiy Sharing: Ja\r\n"
						+ "�bersetzt von Harriet Fricke, Tanja Handels, Elke Link\r\n" + "Random House ebook\r\n"
						+ "13. November 2018 - epub eBook - 544 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook6;
	}

	public Ebook getEbookVorschlag7() {

		Ebook ebook7 = new Ebook("/gui/buchhandel_ebooks/img/36574349_9783841218360_big.jpg",
				"Frida Kahlo und die Farben des Lebens", 4.99, "Caroline Bernard",
				"\"Ich bin eine Revolution!\" Frida Kahlo.\r\n" + "\r\n"
						+ "Mexiko, 1925: Frida will �rztin werden, ein Unfall macht dies zunichte. "
						+ "Dann verliebt sie sich in das Malergenie Diego Rivera. Mit ihm taucht "
						+ "sie in die Welt der Kunst ein, er ermutigt sie in ihrem Schaffen - "
						+ "und er betr�gt sie. Frida ist tief verletzt, im Wissen, dass Gl�ck nur "
						+ "geborgt ist, st�rzt sie sich ins Leben. Die Pariser Surrealisten "
						+ "liegen ihr genauso zu F��en wie Picasso und Trotzki. "
						+ "Frida geht ihren eigenen Weg, ob sie mit ihren Bildern Erfolge "
						+ "feiert oder den Schicksalsschlag einer Fehlgeburt hinnehmen muss - "
						+ "doch dann wird sie vor eine Entscheidung gestellt, bei der sie "
						+ "alles in Frage stellen muss, woran sie bisher geglaubt hat.\r\n" + "\r\n"
						+ "�Eine Liebeserkl�rung an die Kunst, an die Weiblichkeit, an die "
						+ "Freiheit und den Mut, sie jeden Tag neu zu erringen - "
						+ "ein wunderbar zartes und doch kraftvolles Herzensbuch.� Nina George.\r\n" + "Portrait\r\n"
						+ "Caroline Bernard ist das Pseudonym von Tania Schlie. "
						+ "Die Literaturwissenschaftlerin arbeitet seit zwanzig Jahren als freie Autorin. "
						+ "Sie liebt es, sich Geschichten �ber starke Frauen auszudenken. "
						+ "Neben \"Die Muse von Wien\" und \"Rendezvous im Caf� de Flore\" erschien von ihr "
						+ "zuletzt im Aufbau Taschenbuch der Bestseller \"Frida Kahlo und die Farben des Lebens\", "
						+ "der monatelang die Bestsellerlisten anf�hrte und in zahlreichen L�ndern erscheinen wird.\r\n"
						+ "\r\n" + "Technik\r\n"
						+ "Dieses eBook wird im epub-Format geliefert und ist mit einem Wasserzeichen versehen. "
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "\r\n"
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "F�r welche Ger�te?\r\n"
						+ "Sie k�nnen das eBook auf allen Leseger�ten, in Apps und in "
						+ "Lesesoftware �ffnen, die epub unterst�tzen:\r\n" + "\r\n" + "tolino Reader\r\n"
						+ "�ffnen Sie das eBook nach der automatischen Synchronisation auf dem Reader "
						+ "oder �bertragen Sie es manuell auf Ihr tolino Ger�t mit der "
						+ "kostenlosen Software Adobe Digital Editions.\r\n" + "\r\n" + "Andere eBook Reader\r\n"
						+ "Laden Sie das eBook direkt auf dem Reader im Hugendubel.de-Shop herunter "
						+ "oder �bertragen Sie es mit der kostenlosen "
						+ "Software Sony READER FOR PC/Mac oder Adobe Digital Editions.\r\n" + "\r\n"
						+ "F�r Tablets und Smartphones: Unsere Gratis tolino Lese-App\r\n" + "       \r\n" + "\r\n"
						+ "PC und Mac\r\n" + "Lesen Sie das eBook direkt nach dem Herunterladen �ber \"Jetzt lesen\" "
						+ "im Browser, oder mit der kostenlosen Lesesoftware Adobe Digital Editions.\r\n" + "\r\n"
						+ "Die eBook-Datei wird beim Herunterladen mit einem nicht l�schbaren Wasserzeichen "
						+ "individuell markiert, sodass die Ermittlung und rechtliche Verfolgung "
						+ "des urspr�nglichen K�ufers im Fall einer missbr�uchlichen Nutzung "
						+ "der eBook-Datei m�glich ist.\r\n"
						+ "Bitte beachten Sie: Dieses eBook ist nicht auf Kindle-Ger�ten lesbar.\r\n" + "\r\n" + "\r\n"
						+ "Ihr erstes eBook?\r\n"
						+ "Hier erhalten Sie alle Informationen rund um die digitalen B�cher f�r Neueinsteiger.",
				"9783841218360", false, true,
				"Produktdetails\r\n" + "Titel: Frida Kahlo und die Farben des Lebens\r\n"
						+ "Autor/en: Caroline Bernard\r\n" + "\r\n" + "EAN: 9783841218360\r\n" + "Format:  EPUB\r\n"
						+ "Roman.\r\n" + "Familiy Sharing: Ja\r\n" + "Aufbau Verlag GmbH\r\n"
						+ "13. September 2019 - epub eBook - 400 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook7;
	}

	public Ebook getEbookVorschlag8() {

		Ebook ebook8 = new Ebook("/gui/buchhandel_ebooks/img/39586198_9783646606379_big.jpg",
				"Nordlichtglanz und Rentiergl�ck", 2.99, "Ana Woods",
				"NIEDRIGER EINF�HRUNGSPREIS nur f�r kurze Zeit!\r\n"
						+ "**Herzklopfen auf einer Rentierfarm in Lappland**\r\n"
						+ "It-Girl Zoey f�hlt sich wie im falschen Film: Sie muss tats�chlich ihre "
						+ "Heimat New York verlassen, um im Rahmen eines Zeugenschutzprogramms nach "
						+ "Lappland zu ziehen. Fortgerissen von ihrem bisherigen Luxusalltag sieht "
						+ "sie sich gezwungen, ihr Leben bei ihrer neuen Familie auf einer urigen "
						+ "Rentierfarm zu akzeptieren. Im Gegensatz zur Stadt, die niemals schl�ft,"
						+ "wirkt das verschneite Finnland wie in einem ewigen Winterschlaf.  "
						+ "W�re da nicht der taffe Shane, der sie st�ndig auf die Palme bringt "
						+ "und bei dem sie trotzdem jedes Mal Herzklopfen bekommt, wenn ihr Blick "
						+ "seine bernsteinfarbenen Augen trifft. Doch als Zoey pl�tzlich von "
						+ "ihrer Vergangenheit eingeholt und alles bedroht wird, was ihr etwas bedeutet, "
						+ "ist Shane der Einzige, auf den sie sich verlassen kann ... \r\n"
						+ "Alle Herzen zum Schmelzen bringende Liebesgeschichte im eiskalten Norden\r\n"
						+ "Der neue Liebesroman von Ana Woods hat alles: Herzkribbeln, "
						+ "Spannung und das perfekte Wintersetting. Der ideale Roman, "
						+ "um sich an kalten Tagen in die malerische Natur Finnlands entf�hren zu lassen.\r\n"
						+ "//\"Nordlichtglanz und Rentiergl�ck\" ist ein in sich "
						+ "abgeschlossener Einzelband.// \r\n" + " \r\n" + "Portrait\r\n"
						+ "Ana Woods lebt am gr�nen Stadtrand von Berlin, wo sie von Inspiration "
						+ "zu ihren Romanen nur so umgeben ist. Bereits in jungen Jahren "
						+ "fing sie mit dem Schreiben an und verzauberte mit ihren fantasievollen "
						+ "Kurzgeschichten nicht nur Freunde und Familie, sondern ebenfalls "
						+ "ihre Lehrer und Klassenkameraden. 2017 hat Woods sich ihren Traum erf�llt "
						+ "und sich als Autorin selbstst�ndig gemacht.\r\n" + "Technik\r\n"
						+ "Dieses eBook wird im epub-Format geliefert und ist mit einem "
						+ "Wasserzeichen versehen. Sie k�nnen dieses eBook auf vielen g�ngigen "
						+ "Endger�ten lesen.\r\n" + "\r\n"
						+ "Sie k�nnen dieses eBook auf vielen g�ngigen Endger�ten lesen.\r\n" + "F�r welche Ger�te?\r\n"
						+ "Sie k�nnen das eBook auf allen Leseger�ten, in Apps und in "
						+ "Lesesoftware �ffnen, die epub unterst�tzen:\r\n" + "\r\n" + "tolino Reader\r\n"
						+ "�ffnen Sie das eBook nach der automatischen Synchronisation auf dem Reader "
						+ "oder �bertragen Sie es manuell auf Ihr tolino Ger�t mit der "
						+ "kostenlosen Software Adobe Digital Editions.\r\n" + "\r\n" + "Andere eBook Reader\r\n"
						+ "Laden Sie das eBook direkt auf dem Reader im Hugendubel.de-Shop "
						+ "herunter oder �bertragen Sie es mit der kostenlosen "
						+ "Software Sony READER FOR PC/Mac oder Adobe Digital Editions.\r\n" + "\r\n"
						+ "F�r Tablets und Smartphones: Unsere Gratis tolino Lese-App\r\n" + "       \r\n" + "\r\n"
						+ "PC und Mac\r\n" + "Lesen Sie das eBook direkt nach dem Herunterladen �ber \"Jetzt lesen\" "
						+ "im Browser, oder mit der kostenlosen Lesesoftware Adobe Digital Editions.\r\n" + "\r\n"
						+ "Die eBook-Datei wird beim Herunterladen mit einem nicht l�schbaren "
						+ "Wasserzeichen individuell markiert, sodass die Ermittlung und rechtliche "
						+ "Verfolgung des urspr�nglichen K�ufers im Fall einer missbr�uchlichen "
						+ "Nutzung der eBook-Datei m�glich ist.\r\n"
						+ "Bitte beachten Sie: Dieses eBook ist nicht auf Kindle-Ger�ten lesbar.\r\n" + "\r\n" + "\r\n"
						+ "Ihr erstes eBook?\r\n"
						+ "Hier erhalten Sie alle Informationen rund um die digitalen B�cher f�r Neueinsteiger.",
				"9783646606379", false, true,
				"Produktdetails\r\n" + "Titel: Nordlichtglanz und Rentiergl�ck\r\n" + "Autor/en: Ana Woods\r\n" + "\r\n"
						+ "EAN: 9783646606379\r\n" + "Format:  EPUB\r\n" + "New Adult Winter'Romance''.\r\n"
						+ "Empfohlen ab 14 Jahre.\r\n" + "Familiy Sharing: Ja\r\n" + "Carlsen Verlag GmbH\r\n"
						+ "29. Oktober 2020 - epub eBook - 245 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");
		return ebook8;
	}

}
