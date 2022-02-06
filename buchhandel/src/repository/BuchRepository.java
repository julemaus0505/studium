package repository;

import business.Buch;
import business.Kategorie;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BuchRepository  {

	public Object kategorieComboBox;

	public ObservableList<Kategorie> liefertKategorien() {

		ObservableList<Kategorie> kategorieListe = FXCollections.observableArrayList();

		kategorieListe.addAll(Kategorie.values());

		return kategorieListe;

	}

	public Buch getBuchvorschlag1() {

		Buch buch1 = new Buch("/gui/buchhandel/img/38339995_9783832181192_big.jpg", "Offene See", 20.00, "Benjamin Myers",
				"Ausgezeichnet als �Lieblingsbuch der Unabh�ngigen� 2020!\r\n" + "\r\n"
						+ "Eine zeitlose und geradezu z�rtliche Geschichte �ber die Bedeutung und Kraft menschlicher Beziehungen\r\n"
						+ "\r\n" + "\r\n" + "\r\n"
						+ "Der junge Robert wei� schon fr�h, dass er wie alle M�nner seiner Familie Bergarbeiter sein wird.\n"
						+ "Dabei ist ihm Enge ein Graus. Er liebt Natur und Bewegung, sehnt sich nach der Weite des Meeres.\n"
						+ " Daher beschlie�t er kurz nach dem Zweiten Weltkrieg, sich zum Ort seiner Sehnsucht, der offenen See,\n"
						+ "aufzumachen. Fast am Ziel angekommen, lernt er eine �ltere Frau kennen, die ihn auf eine Tasse Tee in ihr\n"
						+ "leicht heruntergekommenes Cottage einl�dt. Eine Frau wie Dulcie hat er noch nie getroffen: unverheiratet,\n"
						+ "allein lebend, unkonventionell, mit sehr klaren und f�r ihn unerh�rten Ansichten zu Ehe, Familie und Religion.\n"
						+ "Aus dem Nachmittag wird ein l�ngerer Aufenthalt, und Robert lernt eine ihm vollkommen unbekannte Welt kennen.\n"
						+ "In den Gespr�chen mit Dulcie wandelt sich sein von den Eltern gepr�gter Blick auf das Leben.\n"
						+ "Als Dank f�r ihre Gro�z�gigkeit bietet er ihr seine Hilfe rund um das Cottage an.\n"
						+ " Doch als er eine wild wuchernde Hecke stutzen will, um den Blick auf das Meer freizulegen,\n"
						+ "verbietet sie das barsch. Ebenso ablehnend reagiert sie auf ein Manuskript mit Gedichten, das Robert findet.\n"
						+ "Gedichte, die Dulcie gewidmet sind, die sie aber auf keinen Fall lesen will.\r\n" + "\r\n"
						+ "\r\n" + "\r\n"
						+ "�Ein intensiver und bewegender Roman, der an J. L. Carrs >Ein Monat auf dem Land< denken l�sst.� The Guardian",
				"3832181199", true, false,
				"Produktdetails\r\n" + "Titel: Offene See\r\n" + "Autor/en: Benjamin Myers\r\n" + "\r\n"
						+ "ISBN: 3832181199\r\n" + "EAN: 9783832181192\r\n" + "Roman.\r\n"
						+ "Originaltitel: The Offing.\r\n" + "�bersetzt von Klaus Timmermann, Ulrike Wasel\r\n"
						+ "DuMont Buchverlag GmbH\r\n" + "1. M�rz 2020 - gebunden - 270 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch1;
	}

	public Buch getBuchvorschlag2() {

		Buch buch2 = new Buch("/gui/buchhandel/img/22392073_9783522504355_big.jpg",
				"Freche M�dchen - " + "\r\n" + "frecher Adventskalender", 12.99, "Sabine Both, Brinx/K�mmerling",
				"\r\n" + "DER Adventskalender f�r alle Freche-M�dchen-Fans mit aufklappbaren T�rchen und 24 weihnachtlichen\n"
						+ "Geschichten und Rezepten. F�r M�dchen ab 10 Jahren geeignet.Hinter jedem T�rchen steckt eine freche\n"
						+ "Advents�berraschung: 24 Geschichten, Gedichte, leckere Rezepte sowie weihnachtliche Tests und R�tsel\n"
						+ "der beliebten Bestsellerautorinnen Sabine Both, Bianka Minte-K�nig, Martina Sahler, Chantal Schreiber,\n"
						+ "Hortense Ullrich, Irene Zimmermann und dem Erfolgsduo Brinx/K�mmerling lassen Tag f�r Tag eine festliche\n"
						+ "Stimmung aufkommen. Mit sechs bunten Geschenkanh�ngern zum Ausschneiden. Freche M�dchen frecher Advent!\n",
				"3522504356", false, true,
				"Produktdetails\r\n" + "Titel: Freche M�dchen - frecher Adventskalender\r\n"
						+ "Autor/en: Sabine Both, Brinx/K�mmerling, Anja K�mmerling, Chantal Schreiber, Hortense Ullrich\r\n"
						+ "\r\n" + "ISBN: 3522504356\r\n" + "EAN: 9783522504355\r\n"
						+ "| 24 Geschichten und T�rchen zum �ffnen.\r\n" + "Empfohlen ab 10 Jahre.\r\n"
						+ "2. Auflage.\r\n" + "mit farbigen Illustrationen.\r\n" + "Illustriert von Birgit Sch�ssow\r\n"
						+ "Planet!\r\n" + "1. Oktober 2014 - kartoniert - 224 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch2;

	}

	public Buch getBuchvorschlag3() {

		Buch buch3 = new Buch("/gui/buchhandel/img/38902740_9783956143960_big.jpg", "Mach dieses Bilderbuch fertig", 15.00,
				"Keri Smith",
				"\r\n" + "Dieses Buch hier wartet auf dich. Ja, auf dich! Es braucht dich dringend, ohne dich ist es nichts.\n"
						+ "Aber du kannst es zum Leben erwecken und zum Fliegen bringen ...\r\n"
						+ "Ist ein Buch, das nicht benutzt wird, eigentlich �berhaupt ein Buch? Nein, denn B�cher brauchen ihre Leser.\n"
						+ "Sie wollen gehalten und geliebt werden, sie wollen, dass man mit ihnen tanzt und sie schweben l�sst,\n"
						+ "dass man sich an ihnen reibt und sie in Bewegung versetzt, dass man ihre Farben entdeckt,\n"
						+ " ihren Duft schnuppert und sie zum Klingen bringt. Dass man sie nicht mehr aus der Hand \n"
						+ "gibt und dass sie einen Sturm entfachen.\r\n"
						+ "Dieses Buch jedenfalls m�chte all das unbedingt - und zwar ganz w�rtlich! Keri Smith,\n"
						+ "die mit Mach dieses Buch fertig Millionen von Menschen den Weg zur eigenen Kreativit�t gezeigt hat,\n"
						+ "aktiviert mit diesem liebe- und humorvoll gestalteten Bilderbuch die kindliche Freude an B�chern und am Lesen.\n"
						+ " Sie zeigt den Nachwuchsb�cherw�rmern und -leseratten, was f�r ein sinnliches Erlebnis der Umgang mit B�chern\n"
						+ "sein kann und wie entscheidend der eigene Beitrag beim Lesen ist: die eigene Fantasie, die Gef�hle,\n"
						+ "Ideen und Erfahrungen, die man mitbringt und die dieses Buch bei jedem Lesen ver�ndern. Genauso wie die Schrammen,\n"
						+ "Kritzeleien und Eselsohren, die umso zahlreicher werden, je st�rker es geliebt wird.\n",
				"3956143965", false, false,
				"Produktdetails\r\n" + "Titel: Mach dieses Bilderbuch fertig\r\n" + "Autor/en: Keri Smith\r\n" + "\r\n"
						+ "ISBN: 3956143965\r\n" + "EAN: 9783956143960\r\n"
						+ "Originaltitel: Wreck this Picture Book.\r\n" + "Empfohlen ab 5 Jahre.\r\n"
						+ "20, 1 cm / 26, 9 cm / 1, 8 cm ( B/H/T ).\r\n" + "�bersetzt von Ulrike Becker\r\n"
						+ "Kunstmann Antje GmbH\r\n" + "1. Oktober 2020 - kartoniert - 56 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch3;
	}

	public Buch getBuchvorschlag4() {

		Buch buch4 = new Buch("/gui/buchhandel/img/39046096_9783745901115_big.jpg",
				"Mein Adventskalender-Buch:" + "\r\n" + "H�kelzauber", 9.99, "Michael Fischer",
				"\r\n" + "Wollige Weihnacht! Diese 24 �berraschungen\n"
						+ "vers��en garantiert allen H�kel-Fans die Vorweihnachtszeit. Hinter jedem \"T�rchen\"\n"
						+ "versteckt sich eine Anleitung f�r ein bezaubernd-weihnachtliches H�kelprojekt f�r einen\n"
						+ "entspannten H�kelabend auf der Couch. Diese Amigurimis, Christbaumanh�nger und Co. lassen das Zuhause\n"
						+ "in weihnachtlichem Glanz erstrahlen und sind die perfekten Einsteiger-Projekte f�r Anf�nger.\n",
				"3745901118", false, true,
				"Produktdetails\r\n" + "Titel: Mein Adventskalender-Buch: H�kelzauber\r\n" + "\r\n"
						+ "ISBN: 3745901118\r\n" + "EAN: 9783745901115\r\n"
						+ "24 Projekte bis Weihnachten h�keln - Niedliche Amigurumis, s��e Geschenkanh�nger, festlicher Baumschmuck und mehr - Mit perforierten Seiten zum Auftrennen.\r\n"
						+ "1. Auflage.\r\n" + "Edition Michael Fischer\r\n" + "18. August 2020 - gebunden - 112 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch4;

	}

	public Buch getBuchBarackObama() {

		Buch buch5 = new Buch("/gui/buchhandel/img/39661180_9783328600626_xl.jpg", "Ein verhei�enes Land", 42.00,
				"Barack Obama",
				"\r\n" + "Ein fesselnder und zutiefst pers�nlicher Bericht dar�ber, wie Geschichte geschrieben wird - von dem US-Pr�sidenten,\n"
						+ "der uns inspirierte, an die Kraft der Demokratie zu glauben\r\n" + "\r\n"
						+ "In diesem mit Spannung erwarteten ersten Band seiner Pr�sidentschaftserinnerungen erz�hlt\n"
						+ "Barack Obama die Geschichte seiner unwahrscheinlichen Odyssee vom jungen Mann auf der Suche nach\n"
						+ "seiner Identit�t bis hin zum f�hrenden Politiker der freien Welt. In erstaunlich pers�nlichen\n"
						+ "Worten beschreibt er seinen politischen Werdegang wie auch die wegweisenden Momente der ersten\n"
						+ "Amtszeit seiner historischen Pr�sidentschaft - einer Zeit dramatischer Ver�nderungen und Turbulenzen.\r\n"
						+ "\r\n"
						+ "Obama nimmt die Leser und Leserinnen mit auf eine faszinierende Reise von seinem fr�hesten\n"
						+ "politischen Erwachen �ber den ausschlaggebenden Sieg in den Vorwahlen von Iowa,\n"
						+ "der die Kraft basisdemokratischer Bewegungen verdeutlichte,\n"
						+ "hin zur entscheidenden Nacht des 4. Novembers 2008, als er zum 44. Pr�sidenten der Vereinigten Staaten von Amerika\n"
						+ "gew�hlt wurde und als erster Afroamerikaner das h�chste Staatsamt antreten sollte.\r\n"
						+ "\r\n"
						+ "Sein R�ckblick auf seine Pr�sidentschaft bietet eine einzigartige Reflexion �ber Ausma�\n"
						+ "und Grenzen pr�sidialer Macht und liefert zugleich au�ergew�hnliche Einblicke in die\n"
						+ "Dynamik US-amerikanischer Politik und internationaler Diplomatie.\n"
						+ "Wir begleiten Obama ins Oval Office und in den Situation Room des Wei�en Hauses sowie nach Moskau,\n"
						+ "Kairo, Peking und an viele Orte mehr. Er teilt seine Gedanken �ber seine Regierungsbildung,\n"
						+ "das Ringen mit der globalen Finanzkrise, seine Bem�hungen, Wladimir Putin einzusch�tzen,\n"
						+ "die Bew�ltigung scheinbar un�berwindlicher Hindernisse auf dem Weg zur Verabschiedung einer Gesundheitsreform.\n"
						+ "Er beschreibt, wie er mit US-Gener�len �ber die amerikanische Strategie in Afghanistan aneinanderger�t,\n"
						+ "die Wall Street reformiert, wie er auf das verheerende Leck der Bohrplattform Deepwater\n"
						+ "Horizon reagiert und die Operation \"Neptune's Spear\" autorisiert, die zum Tode Osama bin Ladens f�hrt.�\r\n"
						+ "\r\n"
						+ "Ein verhei�enes Land� ist ungew�hnlich intim und introspektiv - die Geschichte eines einzelnen Mannes,\n"
						+ "der eine Wette mit der Geschichte eingeht, eines community organizer,\n"
						+ "dessen Ideale auf der Weltb�hne auf die Probe gestellt werden.\n"
						+ "Obama berichtet offen vom Balanceakt, den es bedeutet, als Schwarzer Amerikaner f�r das Amt \n"
						+ "zu kandidieren und damit die Erwartungen einer Generation zu schultern, \n"
						+ "die Mut aus der Botschaft von \"Hoffnung und Wandel\" gewinnt, berichtet offen vom Balanceakt,\n"
						+ "als Schwarzer Amerikaner f�r das Amt zu kandidieren und damit die Erwartungen einer Generation zu schultern,\n"
						+ "die Mut aus der Botschaft von \"Hoffnung und Wandel\" gewinnt, und was es bedeutet, \n"
						+ "die moralische Herausforderung anzunehmen, Entscheidungen von gro�er Tragweite zu treffen.\n"
						+ "Er spricht freim�tig �ber die Kr�fte, die sich ihm im In- und Ausland entgegenstellten,\n"
						+ "gibt ehrlich Auskunft dar�ber, wie das Leben im Wei�en Haus seine Frau und seine T�chter pr�gte, \n"
						+ "und scheut sich nicht, Selbstzweifel und Entt�uschungen offenzulegen. \n"
						+ "Und doch verliert er nie den Glauben daran, dass innerhalb des gro�en, \n"
						+ "andauernden amerikanischen Experiments Fortschritt stets m�glich ist.\r\n" + "\r\n"
						+ "In diesem wunderbar geschriebenen und eindr�cklichen Buch bringt Barack Obama seine \n"
						+ "�berzeugung zum Ausdruck, dass Demokratie kein Geschenk des Himmels ist, \n"
						+ "sondern auf Empathie und gegenseitigem Verst�ndnis gr�ndet und Tag f�r Tag gemeinsam geschaffen werden muss.\n",
				"3328600620", true, true,
				"Produktdetails\r\n" + "Titel: Ein verhei�enes Land\r\n" + "Autor/en: Barack Obama\r\n" + "\r\n"
						+ "ISBN: 3328600620\r\n" + "EAN: 9783328600626\r\n"
						+ "�ber 1000 Seiten mit 32 Seiten Farbbildteil.\r\n" + "Originaltitel: A Promised Land.\r\n"
						+ "�bersetzt von Sylvia Bieker, Harriet Fricke, Stephan Gebauer\r\n" + "Penguin Verlag\r\n"
						+ "17. November 2020 - gebunden - 1024 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch5;

	}

	public Buch getBuchvorschlag6() {

		Buch buch6 = new Buch("/gui/buchhandel_buecher_navi/img/39013490_9783833906367_xl.jpg",
				"Gregs Tagebuch 15 - Halt mal die Luft an!", 14.99, "Jeff Kinney",
				"\r\n" + "Zugegeben, Familienurlaube sind einfach nicht Gregs Ding. Doch f�r diese Sommerferien hat seine Mom ganz besondere Pl�ne:\n"
						+ "eine Tour mit dem Wohnmobil quer durchs ganze Land. Und es klingt sogar so, als k�nnte diese Reise richtig cool werden! Jedenfalls so lange,\n"
						+ "bis Greg und seine Familie auf einem Campingplatz landen, der alles andere als paradiesisch ist. Als es anf�ngt,\n"
						+ "wie aus K�beln zu regnen, steht Greg das Wasser bald bis zum Hals ...\n"

						+ "Gregs Tagebuch von Jeff Kinney ist eine der erfolgreichsten Kinderbuchserien der Welt. \n"
						+ "Die humorvollen Comics um Greg Heffley besitzen mittlerweile Kultstatus. \n",
				"3833906367", true, true,
				"Produktdetails\r\n" + "Titel: Gregs Tagebuch 15 - Halt mal die Luft an!\r\n"
						+ "Autor/en: Jeff Kinney\r\n" + "\r\n" + "ISBN: 3833906367\r\n" + "EAN: 9783833906367\r\n"
						+ "Empfohlen ab 10 Jahre.\r\n" + "2. Aufl. 2020.\r\n" + "�bersetzt von Dietmar Schmidt\r\n"
						+ "Baumhaus Verlag GmbH\r\n" + "17. November 2020 - gebunden - 217 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch6;

	}

	public Buch getBuchvorschlag7() {

		Buch buch7 = new Buch("/gui/buchhandel_buecher_navi/img/38342001_2325353_xl.jpg",
				"Kingsbridge - Der Morgen einer neuen Zeit", 36.00, "Ken Follett",
				"\r\n" + "Ein Epos um Gut und B�se, Liebe und Hass - die Vorgeschichte zu Ken Folletts Weltbestseller \"Die S�ulen der Erde\"\r\n"
						+ "\r\n"
						+ "England im Jahr 997. Im Morgengrauen wartet der junge Bootsbauer Edgar auf seine Geliebte. Deshalb ist er der Erste, "
						+ "der die Gefahr am Horizont entdeckt: Drachenboote. Jeder wei�: Die Wikinger bringen Tod und Verderben �ber Land und Leute.\r\n"
						+ "\r\n" + "Edgar versucht alles, um die B�rger von Combe zu warnen. Doch er kommt zu sp�t. "
						+ "Die Stadt wird beinahe v�llig zerst�rt. Viele Menschen sterben, auch Edgars Familie bleibt nicht verschont."
						+ " Die Werft der Bootsbauer brennt nieder. Edgar bleibt nur ein Ausweg: ein verlassener Bauernhof in einem Weiler fern der K�ste.\r\n"
						+ "\r\n"
						+ "W�hrend Edgar ums �berleben k�mpft, streiten andere um Reichtum und Macht in England. "
						+ "Unter ihnen: der gleicherma�en ehrgeizige wie skrupellose Bischof Wynstan, der idealistische"
						+ " M�nch Aldred und Ragna, die Tochter eines normannischen Grafen ...\r\n" + "\r\n"
						+ "Edgar, Ragna, Wynstan, Aldred - ihre Schicksale sind untrennbar miteinander und mit ihrer Zeit verbunden."
						+ " Ihr Land, das England der Angelsachsen, ist eine Gesellschaft voller Gewalt. Eine Gesellschaft, "
						+ "in der selbst der K�nig es schwer hat, Recht und Gerechtigkeit durchzusetzen.\r\n" + "\r\n"
						+ "Gemeinsam mit Edgar, Ragna, Wynstan und Aldred erleben wir den �bergang von dunklen Zeiten "
						+ "ins englische Mittelalter - und den Aufstieg eines unbedeutenden Weilers zum Ort Kingsbridge, "
						+ "den wir seit \"Die S�ulen der Erde\" kennen und lieben.",
				"3785727003", true, true,
				"Produktdetails\r\n" + "Titel: Kingsbridge - Der Morgen einer neuen Zeit\r\n"
						+ "Autor/en: Ken Follett\r\n" + "\r\n" + "ISBN: 3785727003\r\n" + "EAN: 9783785727003\r\n"
						+ "Historischer Roman.\r\n" + "Originaltitel: The Evening and the Morning.\r\n"
						+ "Empfohlen von 16 bis 99 Jahren.\r\n" + "3. Aufl. 2020.\r\n"
						+ "Illustriert von Markus Weber\r\n" + "�bersetzt von Dietmar Schmidt, Rainer Schuhmacher\r\n"
						+ "L�bbe\r\n" + "15. September 2020 - gebunden - 1017 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch7;

	}

	public Buch getBuchvorschlag8() {

		Buch buch8 = new Buch("/gui/buchhandel_buecher_navi/img/39462162_9783442491728_xl.jpg", "Die Sonnenschwester",
				12.00, "Lucinda Riley",
				"\r\n" + "Die gro�e Saga von Bestsellerautorin Lucinda Riley.\r\n" + "\r\n"
						+ "Reich, ber�hmt und bildsch�n: das ist Elektra d'Apli�se, die als Model ein glamour�ses Leben in New York f�hrt. "
						+ "Doch der Schein tr�gt - in Wahrheit ist sie eine verzweifelte junge Frau, die im Begriff ist, ihr Leben zu ruinieren. "
						+ "Da taucht eines Tages ihre Gro�mutter Stella auf, von deren Existenz Elektra nichts wusste. "
						+ "Sie ist ein Adoptivkind und kennt ihre Wurzeln nicht. Als Stella ihr die ber�hrende Lebensgeschichte der "
						+ "jungen Amerikanerin Cecily Huntley-Morgan erz�hlt, �ffnet sich f�r Elektra die T�r zu einer neuen Welt. "
						+ "Denn Cecily lebte in den 1940er Jahren auf einer Farm in Afrika - wo einst Elektras Schicksal seinen Anfang nahm ... "
						+ "Der sechste Band aus der Bestseller-Serie um die sieben Schwestern.\r\n" + "\r\n" + "\r\n"
						+ "Portrait\r\n"
						+ "Lucinda Riley wurde in Irland geboren und verbrachte als Kind mehrere Jahre in Fernost. "
						+ "Sie liebt es zu reisen und ist nach wie vor den Orten ihrer Kindheit sehr verbunden. "
						+ "Nach einer Karriere als Theater- und Fernsehschauspielerin konzentriert sich Lucinda Riley "
						+ "heute ganz auf das Schreiben - und das mit sensationellem Erfolg: Seit ihrem gefeierten Roman"
						+ "�Das Orchideenhaus� st�rmte jedes ihrer B�cher die internationalen Bestsellerlisten. "
						+ "Lucinda Riley lebt mit ihrem Mann und ihren vier Kindern an der englischen K�ste in North Norfolk und in West Cork, Irland.",
				"344249172X", true, true,
				"Produktdetails\r\n" + "Titel: Die Sonnenschwester\r\n" + "Autor/en: Lucinda Riley\r\n" + "\r\n"
						+ "ISBN: 344249172X\r\n" + "EAN: 9783442491728\r\n" + "Roman - Die sieben Schwestern 6.\r\n"
						+ "Originaltitel: The Sun Sister.\r\n" + "Erstmals im TB.\r\n"
						+ "�bersetzt von Sonja Hauser, Ursula Wulfekamp, Sibylle Schmidt\r\n" + "Goldmann TB\r\n"
						+ "16. November 2020 - kartoniert - 864 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch8;

	}

	public Buch getBuchvorschlag9() {

		Buch buch9 = new Buch("/gui/buchhandel_buecher_navi/img/38858880_9783570104101_xl.jpg",
				"Der Massai, der in Schweden noch eine Rechnung offen hatte", 22.00, "Jonas Jonasson",
				"\r\n" + "Eine abenteuerliche Reise, eine geheime Mission, eine fast perfekte Rache - ein echter Jonasson!\r\n"
						+ "\r\n" + "Wunderbar verr�ckt und respektlos komisch: Profitgieriger schwedischer Galerist, "
						+ "der f�r Geld �ber Leichen geht, trifft auf kenianischen Massai-Krieger, der nicht genau wei�, "
						+ "was Geld ist, daf�r aber ein millionenschweres Gem�lde besitzt, das von der deutsch-afrikanischen "
						+ "K�nstlerin Irma Stern stammen k�nnte ...In seiner einzigartigen Erz�hlweise beschreibt Jonasson "
						+ "einen Kultur-Clash der Extraklasse und h�lt den Menschen den Spiegel vor. Wie in seinen bisherigen "
						+ "Weltbestsellern umgarnt Jonasson seine Leserinnen und Leser mit �berbordendem Ideenreichtum und "
						+ "zeichnet seine Figuren mit so viel Witz und Charme, dass es eine wahre Freude ist!"
						+ "Portrait\r\n"
						+ "Jonas Jonasson, geboren 1961 im schwedischen V�xj�, arbeitete lange als Journalist und gr�ndete "
						+ "eine eigene Medien-Consulting-Firma. Nach zwanzig Jahren in der Medienwelt verkaufte er seine "
						+ "Firma und schrieb seinen ersten Roman: �Der Hundertj�hrige, der aus dem Fenster stieg und verschwand�. "
						+ "Das Buch wurde ein Weltbestseller und verkaufte sich allein in Deutschland 4,4 Millionen Mal. "
						+ "Auch Jonassons weitere B�cher waren alle Nr.-1-Bestseller.",
				"3570104109", true, true,
				"Produktdetails\r\n" + "Titel: Der Massai, der in Schweden noch eine Rechnung offen hatte\r\n"
						+ "Autor/en: Jonas Jonasson\r\n" + "\r\n" + "ISBN: 3570104109\r\n" + "EAN: 9783570104101\r\n"
						+ "Roman.\r\n" + "Originaltitel: H�mnden �r ljuv AB.\r\n" + "Deutsche Erstausgabe.\r\n"
						+ "�bersetzt von Astrid Arz\r\n" + "Bertelsmann Verlag\r\n"
						+ "26. Oktober 2020 - gebunden - 400 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch9;

	}

	public Buch getBuchvorschlag10() {

		Buch buch10 = new Buch("/gui/buchhandel_buecher_navi/img/38849550_9783426281550_xl.jpg", "Der Heimweg", 22.99,
				"Sebastian Fitzek",
				"\r\n" + "Wer das Datum seines Todes kennt, hat mit dem Sterben schon begonnen - "
						+ "der neue Bestseller von Sebastian Fitzek!\r\n" + "\r\n" + "\r\n" + "\r\n"
						+ "Es ist Samstag, kurz nach 22.00 Uhr. Jules Tannberg sitzt am Begleittelefon. "
						+ "Ein ehrenamtlicher Telefonservice f�r Frauen, die zu sp�ter Stunde auf ihrem "
						+ "Heimweg Angst bekommen und sich einen telefonischen Begleiter w�nschen, "
						+ "dessen beruhigende Stimme sie sicher durch die Nacht nach Hause f�hrt - oder im Notfall Hilfe ruft.\r\n"
						+ "\r\n"
						+ "Noch nie gab es eine wirklich lebensgef�hrliche Situation. Bis heute, als Jules mit Klara spricht.\r\n"
						+ "\r\n"
						+ "Die junge Frau hat entsetzliche Angst. Sie glaubt, von einem Mann verfolgt zu werden, "
						+ "der sie schon einmal �berfallen hat und der mit Blut ein Datum auf ihre Schlafzimmerwand malte: "
						+ "Klaras Todestag! Und dieser Tag bricht in nicht einmal zwei Stunden an ...\r\n" + "\r\n"
						+ "\r\n" + "\r\n"
						+ "Geheimnisvoll, beklemmend, nervenaufreibend. Sebastian Fitzeks bislang unheimlichster Psychothriller.",
				"3426281554", true, true,
				"Produktdetails\r\n" + "Titel: Der Heimweg\r\n" + "Autor/en: Sebastian Fitzek\r\n" + "\r\n"
						+ "ISBN: 3426281554\r\n" + "EAN: 9783426281550\r\n" + "Psychothriller.\r\n" + "4. Auflage.\r\n"
						+ "Unterschiedliche Buchschnittfarbe, nicht frei w�hlbar.\r\n" + "Droemer HC\r\n"
						+ "21. Oktober 2020 - gebunden - 400 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch10;

	}

	public Buch getBuchvorschlag11() {

		Buch buch11 = new Buch("/gui/buchhandel_buecher_navi/img/39463729_9783764507381_xl.jpg", "Ohne Schuld", 24.00,
				"Charlotte Link",
				"\r\n" + "Wenn dich die Angst dein Leben lang verfolgt, weil du zu viel wei�t ...\r\n" + "\r\n"
						+ "Ein wolkenloser Sommertag, die Hitze dr�ckt aufs Land. Im Zug von London nach York zielt ein "
						+ "Fremder mit einer Pistole auf eine Frau. Sie entkommt in letzter Sekunde. Zwei Tage sp�ter: "
						+ "Eine junge Frau st�rzt mit ihrem Fahrrad, weil jemand einen d�nnen Draht �ber den Weg gespannt hat. "
						+ "Sie ist sofort bewusstlos. Den folgenden Schuss h�rt sie schon nicht mehr.\r\n"
						+ "Die Frauen stehen in keiner Verbindung zueinander, aber die Tatwaffe ist dieselbe.\r\n"
						+ "Kate Linville, neu bei der North Yorkshire Police, wird sofort in die Ermittlungen hineingezogen. "
						+ "Sie kommt einem grausamen Geheimnis auf die Spur und ger�t selbst in t�dliche Gefahr. "
						+ "Denn der T�ter, der eine vermeintliche Schuld r�chen will, gibt nicht auf ...\r\n"
						+ "Weitere F�lle f�r Kate Linville und Caleb Hale:\r\n" + "Die Betrogene\r\n" + "Die Suche.",
				"3764507381", true, true,
				"Produktdetails\r\n" + "Titel: Ohne Schuld\r\n" + "Autor/en: Charlotte Link\r\n" + "\r\n"
						+ "ISBN: 3764507381\r\n" + "EAN: 9783764507381\r\n" + "Kriminalroman.\r\n"
						+ "Originalausgabe.\r\n" + "Blanvalet Verlag\r\n" + "2. November 2020 - gebunden - 544 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch11;

	}

	public Buch getBuchvorschlag12() {

		Buch buch12 = new Buch("/gui/buchhandel_buecher_navi/img/38822305_9783492070591_xl.jpg", "Olympia", 24.00,
				"Volker Kutscher",
				"\r\n" + "�Die TV-Serie Babylon Berlin mag gutes Fernsehen sein. Volker Kutschers Romane aber sind gro�es Kino."
						+ "� tazBerlin, Sommer 1936. Inmitten der Olympiabegeisterung muss Gereon Rath verdeckt einen "
						+ "Todesfall im olympischen Dorf aufkl�ren. Die Machthaber bef�rchten, dass Kommunisten die Spiele sabotieren. "
						+ "Rath hat seine Zweifel und ermittelt eher lustlos, zumal er private Probleme hat: "
						+ "Er ist Gastgeber amerikanischer Olympiatouristen, und seine Ehefrau Charly hat die gemeinsame "
						+ "Wohnung unter Protest verlassen. Dann findet er im olympischen Dorf einen Mitarbeiter mit "
						+ "kommunistischer Vergangenheit, der auch am Tatort war. W�hrend der Verd�chtige brutalen "
						+ "Verh�ren der SS ausgesetzt ist, geschieht ein zweiter Mord. Rath ermittelt fieberhaft, "
						+ "um weitere Todesf�lle zu verhindern, und ahnt nicht, dass sein eigenes Todesurteil l�ngst gef�llt ist. "
						+ "Spannung pur!\r\n" + "Portrait\r\n"
						+ "Volker Kutscher, geboren 1962, arbeitete nach dem Studium der Germanistik,"
						+ " Philosophie und Geschichte zun�chst als Tageszeitungsredakteur und Drehbuchautor, "
						+ "bevor er seinen ersten Kriminalroman schrieb. Heute lebt er als freier Autor in K�ln. "
						+ "Mit dem Roman �Der nasse Fisch� (2007), dem Auftakt seiner Krimiserie um Kommissar Gereon "
						+ "Rath im Berlin der Drei�igerjahre, gelang ihm auf Anhieb ein Bestseller, "
						+ "dem bisher sechs weitere folgten. Die Reihe ist die Vorlage f�r die internationale Fernsehproduktion "
						+ "�Babylon Berlin�, deren erste zwei Staffeln auf Sky und in der ARD zu sehen waren, "
						+ "die dritte Staffel hatte Ende Januar 2020 Premiere auf Sky und wird im November in der ARD ausgestrahlt."
						+ "Mit der von Kat Menschik illustrierten Erz�hlung \"Moabit\" gelang ihm im Oktober 2017 ein weiterer Bestseller. "
						+ "�Marlow�, der siebte Rath-Roman, verkaufte sich bisher �ber 100.000mal.\r\n"
						+ "Pressestimmen\r\n"
						+ "�Kutscher versteht es, in leisen T�nen die Gewissenskonflikte seines Protagonisten darzustellen.� neues deutschland\r\n"
						+ "\r\n"
						+ "�Das ist f�r Freunde des Kriminalromans und f�r historisch Interessierte gleicherma�en interessant, "
						+ "weil die Geschichte spannend erz�hlt wird und die Details zur Zeitgeschichte gut recherchiert sind. "
						+ "Au�erdem ist es ein Lehrst�ck zum Missbrauch der olympischen Idee durch die Politik. "
						+ "Dass ideologische Verblendung nicht unbedingt der Wahrheitsfindung dient, "
						+ "wird ebenfalls �berzeugend thematisiert.� Borkumer Zeitung\r\n" + "\r\n"
						+ "� Olympia ist der bislang �berzeugendste Roman Kutschers.� Spiegel Bestseller\r\n" + "\r\n"
						+ "�Eine Lesefreude f�r Krimifans, die eine Abwechslung zum n�chsten Schweden-Krimi suchen.� St. P�lten Konkret (A)\r\n"
						+ "\r\n"
						+ "�Wieder ist es ein spannender Kriminalfall dieses Mal spielt das Geschehen im Jahr 1936, "
						+ "und es geht zun�chst um einen mysteri�sen Todesfall im Olympischen Dorf. "
						+ "Wieder ist es aber auch eine atmosph�risch dichte Darstellung des Alltags und desTerrors in "
						+ "den ersten Jahren der NS-Diktatur.� Aachener Zeitung\r\n" + "\r\n"
						+ "�Es gelingt Volker Kutscher in Olympia beeindruckend, die f�r viele Menschen immer bedrohlicher "
						+ "werdende Stimmung in einem Deutschland einzufangen, das sich f�r einen Monat im Sommer 1936 das"
						+ " M�ntelchen der Weltoffenheit und V�lkerverst�ndigung umgeh�ngt hat.� literaturkritik.de\r\n"
						+ "\r\n" + "�Spannung pur!� Saarbr�cker Zeitung\r\n" + "\r\n"
						+ "�In dem neuen Band Olympia , der am 2. November erschienen ist, verbindet der Autor wieder Zeitgeschichte"
						+ " und eine fiktive Kriminalhandlung zu einem d�steren, atmosph�risch dichten Roman.� Arte Journal\r\n"
						+ "\r\n"
						+ "�Atmosph�risch dicht, spannungs- und temporeich schildert Volker Kutscher in Olympia den "
						+ "Alltag und das Leben in einer Diktatur, die mit perfekt inszenierter Propaganda von den Menschen "
						+ "nach und nach Besitz ergreift.� ARD Druckfrisch\r\n" + "\r\n"
						+ "�Und ganz im Gegensatz zu Tykwers f�rchterlich �berzogenem Mainstream-Machwerk Babylon Berlin , "
						+ "in dem Exzesse und ein Bilderrausch ungeahnten Ausma�es das eigentliche (und viel spannendere) "
						+ "Geschehen vollkommen in den Hintergrund treten lassen, ist die Vorlage zwar leiser und unaufgeregter, "
						+ "weniger farbenpr�chtig, daf�r aber ungleich spannender und durch die leisen T�ne umso eindringlicher."
						+ "� glarean-magazin.ch (CH)\r\n" + "\r\n"
						+ "�F�r Olympia hat sich Kutscher einen spektakul�ren Schluss einfallen lassen.� K�lner Stadt-Anzeiger\r\n"
						+ "\r\n" + "�Auch dieser Krimi von Kutscher ist punkto Dichte und Umfang anspruchsvoll. "
						+ "Doch Erz�hlweise und historische Hintergr�nde packen.� Luzerner Zeitung (CH)\r\n" + "\r\n"
						+ "�Ein erneutes Meisterwerk der Spannungsliteratur mit faszinierendem Zeit- und Lokalkolorit� "
						+ "Wilhelmshavener Zeitung\r\n" + "\r\n"
						+ "�Kutscher gelingt es abermals, einen spannenden Krimi-Plot und ein bedr�ckendes "
						+ "Stimmungsbild der damaligen Zeit zu einem fesselnden Leseerlebnis zu vereinen.� Kronen Zeitung (A)\r\n"
						+ "\r\n"
						+ "�Wie immer gleichzeitig Krimi und detailgenaues Gesellschaftsportr�t der Zeit zwischen den Weltkriegen� Weser Kurier\r\n"
						+ "\r\n"
						+ "�Der eigentliche Kriminalfall wird geschickt im Hintergrund weitergestrickt, sodass der "
						+ "Leser bei der Aufl�sung am Ende doch �berrascht werden d�rfte, obwohl er die Entwicklung sicher h�tte vorausahnen k�nnen, "
						+ "wenn er sich nicht so gekonnt aufs Glatteis h�tte lotsen lassen.� Ibbenb�rener Volkszeitung\r\n"
						+ "\r\n"
						+ "�D�ster, beklemmend und brutal. Die vermutlich spannendste Geschichtsstunde des Jahres.� Altm�hl-Bote\r\n"
						+ "\r\n" + "� Olympia ist einer der st�rksten Krimis der Rath-Reihe.� Express K�ln\r\n" + "\r\n"
						+ "�Spannender kann Geschichte nicht erz�hlt werden.� S�dkurier\r\n" + "\r\n"
						+ "�Wie �blich, hat Kutscher wieder akribisch recherchiert und seinen fiktiven Fall in ein historisch "
						+ "absolut stimmiges Setting eingebettet.� Hamburger Abendblatt\r\n" + "\r\n"
						+ "�Das spannende, nachdenklich machende und doch unterhaltsame Buch ist eine gro�artige Abwechslung "
						+ "von der TV-Serie Babylon Berlin .� Fuldaer Zeitung\r\n" + "\r\n"
						+ "�Komplex, packend, f�r Fans ein Muss.� Freundin\r\n" + "\r\n"
						+ "�Kutscher gelingt auch in seinem neuen Roman die Verbindung von spannender Krimi-Handlung und Gesellschaftsportrait."
						+ "� radioeins rbb Die Deutschlandpremiere im Radio\r\n" + "\r\n"
						+ "�Ein Kriminalroman mit eindrucksvollen Szenen, den man geradezu als Film vor sich sieht.� M�rkische Oderzeitung\r\n"
						+ "\r\n"
						+ "� Olympia ist wieder bis in die kleinsten Kleinigkeiten genau recherchiert. Ein beklemmender und packender Ritt."
						+ "� rbb Inforadio Quergelesen\r\n" + "\r\n"
						+ "�Wer aufregende Krimis mit viel Kolorit mag, kommt an Volker Kutscher nicht vorbei.� kulturexpresso.de\r\n"
						+ "\r\n"
						+ "�Kutschers gro�e St�rke, die ihn von anderen Verfassern historischer Krimis abhebt, ist, "
						+ "dass er keine Nazi-Krimis schreibt, sondern Romane, die in der NS-Zeit spielen.� Ober�sterreichische Nachrichten (A)\r\n"
						+ "\r\n" + "�Die Mischung aus historischem Ger�st, atmosph�rischem Lokalkolorit, "
						+ "sympathischem Ermittlerpaar und ein Gesp�r f�r Spannung sind das Erfolgsgeheimnis Kutschers. "
						+ "Wer in Geschichte in der Schule nicht aufgepasst hat, der kann mit diesen acht B�chern viel an Wissen nachholen."
						+ "� N�rnberger Nachrichten\r\n" + "\r\n"
						+ "�Empfehlenswert. Ein spannender, historischer Kriminalroman w�hrend der Olympischen Spiele 1936 in Berlin."
						+ "� literaturweltblog.com\r\n" + "\r\n"
						+ "�Dass er eine Atmosph�re zu evozieren vermag, in der manche damals noch die Hoffnung hegten, "
						+ "der totalen nationalsozialistischen Durchdringung der Gesellschaft etwas entgegensetzen zu k�nnen, eine Atmosph�re, "
						+ "die besonders w�hrend der Olympischen Spiele in der Luft lag und erst mit den radikalen Ma�nahmen der Folgejahre "
						+ "vollkommen zerschlagen wurde, ist die gro�e Leistung des Romans.� Berliner Zeitung\r\n"
						+ "\r\n"
						+ "�Volker Kutscher schreibt in Olympia , dem achten Gereon-Rath-Fall, detailversessen spannend.� Stern\r\n"
						+ "\r\n"
						+ "�Auch der achte Band von Kutschers Historienkrimireihe ist wieder packend und exzellent recherchiert.� H�rzu\r\n"
						+ "\r\n"
						+ "�Einmal mehr gelingt es Kutscher, das pers�nliche Schicksal seiner Figuren geschickt mit der politischen und "
						+ "gesellschaftlichen Entwicklung zu verweben.� Westdeutsche Allgemeine:\r\n" + "\r\n"
						+ "�Die Geschichte ist spannend geschrieben und l�sst am Schluss eine Reihe offener Enden, die Volker Kutscher "
						+ "sicher im neunten Teil (also im Jahr 1937) aufnehmen wird. Wir bleiben dabei.� Neue Presse\r\n"
						+ "\r\n"
						+ "�Dieser achte Rath-Roman l�sst sich auch ohne Vorwissen lesen. Kutscher informiert elegant �ber Hintergr�nde und Personal. "
						+ "Der Olympia -Plot funktioniert f�r sich.� S�dwest Presse\r\n" + "\r\n"
						+ "�Allein schon die Frage, wie Kutscher die Reihe nach dem dramatischen Finale von Olympia fortsetzen will, "
						+ "birgt viel Spannung in sich.� dpa-Meldung\r\n" + "\r\n"
						+ "�Sehr verwickelte aber atmosph�risch dichte Geschichte mit einem Cliffhanger als Schluss, "
						+ "der die Frage aufwirft ob es �berhaupt weitergeht mit der Reihe.� Bayern 5 Kulturnachrichten\r\n"
						+ "\r\n" + "�Beklemmend, d�ster und gleichzeitig ein Pageturner� rbb infoRadio Kultur\r\n"
						+ "\r\n"
						+ "�Kutscher schafft es auch im achten Band seiner Rath-Reihe, den Fall, die politischen "
						+ "Umst�nde und die pers�nlichen Probleme des Paares Charly und Gereon Rath meisterhaft zu verweben."
						+ "� M�rkische Allgemeine\r\n" + "\r\n"
						+ "�Wie schon in den bisherigen Rath-Romanen geht es Kutscher vor allem darum, dem Alltag in einer Diktatur nachzusp�ren, "
						+ "und er tut das in einer langsamen und atmosph�risch dichten Prosa, in der jedes Detail stimmt und der Autor immer ganz "
						+ "nah bei seinen Figuren ist.� Deutschlandfunk Kultur Buchkritik\r\n" + "\r\n"
						+ "�Schneller, h�her, blutiger� Berliner Morgenpostweiterlesen\r\n" + "Rezensionen\r\n"
						+ "Frankfurter Allgemeine Zeitung - RezensionBesprechung vom 02.11.2020\r\n" + "\r\n"
						+ "Gangster im Sturm\r\n" + "Krimis in K�rze: Denise Mina, Robert Brack, Volker Kutscher\r\n"
						+ "\r\n"
						+ "Der Titel verweist auf Aristoteles, aber das muss niemanden verschrecken. \"Gods and Beasts\" "
						+ "hat sich einer der Akteure auf den Hals t�towieren lassen - wer nicht in Gemeinschaft leben k�nne oder ihrer nicht bed�rfe, "
						+ "sei entweder Gott oder Tier, hei�t es im ersten Buch der \"Politik\". In \"G�tter und Tiere\" "
						+ "(Ariadne im Argument Verlag, 352 S., geb., 21,- [Euro]) von Denise Mina kommen definitiv keine G�tter vor. "
						+ "Die \"Queen of Tartan Noir\", die K�nigin der schottischen Noir-Spielart, erz�hlt von Existenzen, "
						+ "die mit der Gemeinschaft und deren Regeln gro�e Probleme haben, und solchen, die �ber diese Regeln wachen. "
						+ "Minas Heldin Alex Morrow ist inzwischen Mutter von Zwillingen geworden, leidet unter Schlafentzug und ist leicht reizbar.\r\n"
						+ "\r\n"
						+ "Sie hat einen Halbbruder, Danny, der ein Glasgower Gangster ist, und ihr Leben ist daher \"immer ein Spiegel von Dannys\". "
						+ "Morrow ist eine angenehm komplexe Figur in der internationalen Ermittlerwelt. Und die Plots, "
						+ "die Denise Mina konstruiert, bleiben dahinter nicht zur�ck. In \"G�tter und Tiere\" sind es drei Erz�hlstr�nge, "
						+ "die einander ber�hren, dann aber nicht am Ende zu einem netten Schleifchen gebunden werden, damit alles seine Ordnung hat.\r\n"
						+ "\r\n"
						+ "Durch dieses Verfahren bleibt Zeit, in verschiedene soziale Milieus der Glasgower Gesellschaft zu blicken. "
						+ "Man erlebt einen popul�ren linken Politiker im Kampf mit der Boulevardpresse und seiner Ehefrau, zwei Polizisten, "
						+ "die das Geld, das sie im Kofferraum eines Dealers finden, beiseiteschaffen, und einen blutigen �berfall auf eine Postfiliale, "
						+ "bei dem Morrow lange nicht weiterkommt, auch weil der Zeuge mit dem Aristoteles-Tattoo eine sehr undurchsichtige Gestalt bleibt. "
						+ "Wie Mina dieses Szenario dann ausklingen l�sst, ist ziemlich souver�n.\r\n" + "\r\n"
						+ "Wer an die Hamburger Sturmflut von 1962 denkt, der denkt eher an Helmut Schmidt, den damaligen Polizeisenator, "
						+ "der als Krisenmanager ber�hmt wurde, als an einen Kriminalroman. F�r \"Dammbruch\" (Ellert & Richter, 240 S., br., 12,- [Euro]) "
						+ "von Robert Brack liefert die Naturkatastrophe jedoch sogar ein neues Subgenre: den \"Sturmflut-Thriller\". "
						+ "Bracks Idee ist simpel und sehr �berzeugend. Der gerade entlassene Einbrecher Rinke will noch einen letzten gro�en Bruch machen, "
						+ "auf einem Frachter voller Gold. Doch es ist die Nacht, in der das Sturmtief kommt, und so geht es f�r Rinke wie f�r die Polizisten "
						+ "schnell nur noch ums �berleben.\r\n" + "\r\n"
						+ "Brack erz�hlt, von einigen etwas blumig geratenen Passagen abgesehen, knapp, direkt und spannend. Und wie in einem guten "
						+ "B-Movie, an denen der Film noir so reich ist, gibt es da auch eine Femme fatale, "
						+ "die Betty hei�t, sich auf ihre Weise um Kriegsversehrte k�mmert und die alte Noir-Figur vom good-bad girl, "
						+ "dem M�dchen, das b�se erscheint, aber im Grunde gut ist, auf den Kopf stellt. "
						+ "Brack �bertreibt es nicht mit Lokalkolorit und historischen Anekdoten, die meist nur Redundanzen hervorbringen. "
						+ "Das letzte Wort hat hier das Sturmtief, das die auch damals schon benennungsw�tigen Meteorologen \"Vincinette\" tauften.\r\n"
						+ "\r\n"
						+ "Gereon Rath sieht f�r Leser nicht zwingend aus wie Volker Bruch in \"Babylon Berlin\", der international gefeierten Serie, "
						+ "die aus den Romanen von Volker Kutscher hervorgegangen ist. Das ist auch gut so. "
						+ "Denn Kutscher hat unbeirrbar weitergeschrieben an seinen Rath-Romanen, die mit den Mitteln des Kriminalromans zu begreifen versuchen, "
						+ "wie sich die Weimarer Republik in den Nationalsozialismus bewegte. "
						+ "Inzwischen ist die Reihe im Jahr 1936 angekommen. An den Tagen von \"Olympia\" (Piper, 544 S., geb., 24,- [Euro]) "
						+ "waren die Nationalsozialisten propagandistisch ein letztes Mal bem�ht, Deutschland als weltoffenes, "
						+ "zivilisiertes Land darzustellen.\r\n" + "\r\n"
						+ "Rath wird diesmal ins olympische Dorf abkommandiert - und geht nat�rlich wieder seine eigenen Wege."
						+ "Kutscher verschr�nkt dabei auf bew�hrte Art Historie und Fiktion zum immer d�sterer werdenden Zeitbild. "
						+ "Man liest das Buch wie immer in einem Zug - und ist nach dem v�llig �berraschenden Finale ratlos, "
						+ "wie Kutscher aus dieser selbsterzeugten Situation in den beiden noch ausstehenden B�nden wieder herauskommen will.\r\n"
						+ "\r\n" + "PETER K�RTE\r\n" + "\r\n"
						+ "� Alle Rechte vorbehalten. Frankfurter Allgemeine Zeitung GmbH, Frankfurt.weiterlesen\r\n"
						+ "",
				"3492070590", false, true,
				"Produktdetails\r\n" + "Titel: Olympia\r\n" + "Autor/en: Volker Kutscher\r\n" + "\r\n"
						+ "ISBN: 3492070590\r\n" + "EAN: 9783492070591\r\n" + "Der achte Rath-Roman.\r\n"
						+ "3. Auflage.\r\n" + "Piper Verlag GmbH\r\n" + "2. November 2020 - kartoniert - 536 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch12;

	}

	public Buch getBuchvorschlag13() {

		Buch buch13 = new Buch("/gui/buchhandel_buecher_navi/img/38914127_9783550081804_xl.jpg", "Funkenmord", 22.99,
				"Volker Kl�pfel, Michael Kobr",
				"\r\n" + "Kluftinger r�umt auf\r\n" + "\r\n"
						+ "Kluftinger steht vor einem R�tsel: Wie um Himmels Willen funktioniert eine Waschmaschine? Wieso gibt es "
						+ "verschiedene Sorten Waschmittel? Und wie �berlebt man eine Verkaufsparty f�r K�chenmaschinen bei Doktor Langhammer? "
						+ "Weil seine Frau Erika krank ist und zu Hause ausf�llt, muss sich Kluftinger mit derartig ungewohnten Fragen herumschlagen.\r\n"
						+ "Die Aufgaben im Pr�sidium sind nicht weniger anspruchsvoll: Der Kommissar will nach �ber drei�ig "
						+ "Jahren endlich den grausamen Mord an einer Lehrerin aufkl�ren. Die junge Frau wurde am Funkensonntag an einem Kreuz verbrannt. "
						+ "Doch das Team des Kommissars zeigt wenig Interesse am Fall �Funkenmord�. "
						+ "Nur die neue Kollegin Lucy Beer steht dem Kommissar mit ihren unkonventionellen Methoden zur Seite. "
						+ "Der letzte Brief des Mordopfers bringt die beiden auf eine hei�e Spur.\r\n" + "\r\n"
						+ "Endlich: Die Bestseller-Serie um den Kultkommissar geht weiter\r\n" + "Portrait\r\n"
						+ "Altusried hat einen prominenten Sohn: Kommissar Kluftinger. Volker Kl�pfel, Jahrgang 1971, "
						+ "kommt wenigstens aus dem gleichen Ort. Nach dem Abitur zog es ihn in die weite Welt nach Franken: "
						+ "In Bamberg studierte er Politikwissenschaft und Geschichte. "
						+ "Danach arbeitete er bei einer Zeitung in den USA und stellte beim Bayerischen Rundfunk fest, "
						+ "dass ihm doch eher das Schreiben liegt. Seine letzte Station vor dem Dasein als Schriftsteller "
						+ "war die Feuilletonredaktion der Augsburger Allgemeinen. "
						+ "Die knappe Freizeit verbringt er am liebsten mit seiner Familie, mit der er im Allg�u lebt. "
						+ "Sollte noch etwas Zeit �brig sein, treibt er Sport, fotografiert und spielt Theater. "
						+ "Auf der gleichen B�hne wie Kommissar Kluftinger.\r\n" + "\r\n"
						+ "Michael Kobr, geboren 1973 in Kempten im Allg�u, studierte in Erlangen ziemlich viele F�cher, "
						+ "aber nur zwei bis zum Schluss: Germanistik und Romanistik. Nach dem Staatsexamen arbeitete er als Realschullehrer. "
						+ "Momentan aber hat er schweren Herzens dem Klassenzimmer den R�cken gekehrt die Sch�ler werden s ihm danken , "
						+ "um sich dem Schreiben, den ausgedehnten Lesetouren und nat�rlich seiner Familie widmen zu k�nnen. "
						+ "Kobr wohnt mit seiner Frau und seinen beiden T�chtern im Unterallg�u und in einem kleinen H�uschen "
						+ "mitten in den Bergen, wo die Kobrs im Winter h�ufig auf der Skipiste, im Sommer auf Rad- und Bergtouren unterwegs sind. "
						+ "Wenn nicht gerade mal wieder eine gemeinsame Reise ansteht ...",
				"3550081804", true, true,
				"Produktdetails\r\n" + "Titel: Funkenmord\r\n" + "Autor/en: Volker Kl�pfel, Michael Kobr\r\n" + "\r\n"
						+ "ISBN: 3550081804\r\n" + "EAN: 9783550081804\r\n" + "Kluftingers neuer Fall.\r\n"
						+ "5. Auflage.\r\n" + "Ullstein Verlag GmbH\r\n" + "29. September 2020 - gebunden - 496 Seiten",
				"inkl. MwSt.", "Sofort lieferbar", "Kaufen");

		return buch13;

	}

}
