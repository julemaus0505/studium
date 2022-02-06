package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

 class WoerterAusListe {

	static List<String> holeWoerterAusListe() throws IOException{
		List<String> woerter = Files.readAllLines(Paths.get("wortliste.txt"), StandardCharsets.ISO_8859_1);
		return woerter;
	}
	
}
