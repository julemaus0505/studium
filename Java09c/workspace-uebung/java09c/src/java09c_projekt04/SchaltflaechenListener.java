package java09c_projekt04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchaltflaechenListener implements ActionListener{
	
	//eine Instanzvariable für den Zugriff auf die Klasse mit der grafischen Oberfläche
	TextTauscherGUI referenz;
	
	//der Konstruktor setzt die Referenz für die Klasse mit der grafischen Oberfläche
	public SchaltflaechenListener(TextTauscherGUI referenz) {
		this.referenz = referenz;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Welche Schaltfläche wurde angeklickt?
		//Dazu beschaffen wir uns den Text auf der angeklickten Schaltfläche
		//wenn Tauschen angeklickt wurde, tauschen wir die Texte über eine eigene Methode
		//in der Klasse für die Oberfläche
		if (e.getActionCommand().equals("Text tauschen"))
			referenz.texteTauschen();
		
		//wenn Beenden angeklickt wurde, beenden wir die Anwendung
		if (e.getActionCommand().equals("Beenden"))
			System.exit(0);
		
		//Zur Auffrischung:
//		Sie könnten den Vergleich der Zeichenketten grundsätzlich auch mit dem Operator
//		== durchführen. Das geht in unserem Code aber nur, weil sich eine konstante
//		Zeichenkette rechts vom Operator befindet. Denn mit dem Operator == vergleichen
//		Sie bei Zeichenketten ja nicht den Inhalt, sondern die Referenz.
//		Für einen echten inhaltlichen Vergleich müssen Sie die Methode equals() der
//		Klasse String benutzen.
	}
}
