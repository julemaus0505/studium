package java09c_projekt03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//die Klasse implementiert ActionListener
public class SchaltflaecheListener implements ActionListener {

	//die Methode actionPerformed() wird durch die
	//Schnittstelle vorgegeben
	@Override
	public void actionPerformed(ActionEvent e) {
		//das Programm beenden
		System.exit(0);
		
	}

	
	
	
}
