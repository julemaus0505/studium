package hangmanFXSpiel_Aufgabe1_und_Aufgabe2;

import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "wortliste")
public class Wortliste {
	
	@XmlElement(name = "wort")
	private List<String> woerter;
	
	@XmlElement
	private int anzahlWoerter;
	
	
}
