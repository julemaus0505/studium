package java09c_projekt03;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

//Da die Klasse WindowAdapter die Schnittstelle WindowListener selbst implementiert, 
//können Sie auch auf die implements-Anweisung in Ihrer Klasse verzichten.

//public class FensterListener implements WindowListener

public class FensterListener extends WindowAdapter {

	@Override
	public void windowOpened(WindowEvent e) {
		//für den Zugriff auf die Instanz der Klasse mit
		//der grafischen Oberfläche
		HalloWeltGUI temp;

		//die Eingabe einlesen
		String eingabe = JOptionPane.showInputDialog("Wer will die Welt grüßen?");
		
		//temp erhält die Referenz des Aufrufers
		//das Ergebnis von e.getSource() muss in den
		//passenden Typ umgewandelt werden
		temp = (HalloWeltGUI) e.getSource();
		temp.setAusgabe2Text(eingabe);
				
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
