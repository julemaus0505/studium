package text1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Text1 extends JFrame {
	//automatisch über Eclipse ergänzt
	private static final long serialVersionUID = 6468516705291496250L;
	
	//für das Eingabefeld
	private JTextArea feld;
	
	//für die Schaltflächen
	private JButton einlesen, beenden, schreiben;
	
	//die innere Klasse für den ActionListener
	class MeinListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			
			//wurde auf Lesen geklickt?
			if (event.getActionCommand().equals("lesen")) {
				
				//dann die Datei einlesen
				dateiLesen();
				
				//wurde auf Schreiben geklickt?
			}else if (event.getActionCommand().equals("schreiben")) {
				
				//dann die Datei schreiben
				dateiSchreiben();
			
			} else {
				
				//wurde auf Beenden geklickt?
				System.exit(0);
			}
		}
	}

	//der Konstruktor
	public Text1(String titel) {
		super(titel);
		
		//für das Panel mit den Schaltflächen 
		JPanel tempPanel;
		
		//ein neues Eingabefeld erstellen
		feld = new JTextArea();
		
		//die Schaltflächen
		einlesen = new JButton("Einlesen");
		einlesen.setActionCommand("lesen");
		schreiben = new JButton("Schreiben");
		schreiben.setActionCommand("schreiben");
		beenden = new JButton("Beenden");
		beenden.setActionCommand("ende");
		
		MeinListener listener = new MeinListener();
		einlesen.addActionListener(listener);
		schreiben.addActionListener(listener);
		beenden.addActionListener(listener);
				
		//ein BorderLayout anwenden
		setLayout(new BorderLayout());
		
		//das Eingabefeld mit Scrollbars
		add(new JScrollPane(feld), BorderLayout.CENTER);
		
		//ein Panel für die Schaltflächen
		tempPanel = new JPanel();
		tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tempPanel.add(einlesen);
		tempPanel.add(schreiben);
		tempPanel.add(beenden);
		add(tempPanel,BorderLayout.SOUTH);
		
		//Größe setzen, Standard-Verhalten festlegen und anzeigen
		setMinimumSize(new Dimension(400,300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	//die Methode zum Lesen
	private void dateiLesen() {
		
		//eine Instanz der Klasse FileReader mit der Datei daten.txt
		try (FileReader datei = new FileReader("daten.txt")){
			
			//in das Textfeld lesen
			feld.read(datei, null);
			
			
		}
		
		catch (IOException e ) {
			JOptionPane.showMessageDialog(this, "Beim Laden ist ein Problem aufgetreten");
	    }
	}

	//die Methode zum Schreiben
	private void dateiSchreiben() {
		
		//eine Instanz der Klasse FileWriter mit der Datei daten.txt
		try (FileWriter datei = new FileWriter("daten.txt")){
			
			//den Inhalt aus dem Feld schreiben
			feld.write(datei);
		}
		
		catch (IOException e ) {
			JOptionPane.showMessageDialog(this, "Beim Schreiben ist ein Problem aufgetreten");
	    }
	}
}
