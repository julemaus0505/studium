package java09c_projekt04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchaltflaechenListener implements ActionListener{
	
	//eine Instanzvariable f�r den Zugriff auf die Klasse mit der grafischen Oberfl�che
	TextTauscherGUI referenz;
	
	//der Konstruktor setzt die Referenz f�r die Klasse mit der grafischen Oberfl�che
	public SchaltflaechenListener(TextTauscherGUI referenz) {
		this.referenz = referenz;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Welche Schaltfl�che wurde angeklickt?
		//Dazu beschaffen wir uns den Text auf der angeklickten Schaltfl�che
		//wenn Tauschen angeklickt wurde, tauschen wir die Texte �ber eine eigene Methode
		//in der Klasse f�r die Oberfl�che
		if (e.getActionCommand().equals("Text tauschen"))
			referenz.texteTauschen();
		
		//wenn Beenden angeklickt wurde, beenden wir die Anwendung
		if (e.getActionCommand().equals("Beenden"))
			System.exit(0);
		
		//Zur Auffrischung:
//		Sie k�nnten den Vergleich der Zeichenketten grunds�tzlich auch mit dem Operator
//		== durchf�hren. Das geht in unserem Code aber nur, weil sich eine konstante
//		Zeichenkette rechts vom Operator befindet. Denn mit dem Operator == vergleichen
//		Sie bei Zeichenketten ja nicht den Inhalt, sondern die Referenz.
//		F�r einen echten inhaltlichen Vergleich m�ssen Sie die Methode equals() der
//		Klasse String benutzen.
	}
}
