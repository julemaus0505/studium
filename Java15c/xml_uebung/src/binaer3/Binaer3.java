package binaer3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Binaer3 extends JFrame{

	//für die Schatflächen
	private JButton einlesen;
	private JButton beenden;
	
	//für das Eingabefeld
	private JTextField eingabePosition;
	
	//die innere Klasse für den ActionListener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			//wurde auf Lesen geklickt?
			if (event.getActionCommand().equals("lesen")) {
				
				//dann die Datei einlesen
				datenLesen();
				
			} else {
				//wurde auf Beenden geklickt?
				System.exit(0);
			}
		}
	}
		
		//der Konstruktor
		public Binaer3(String titel) {
			super(titel);
			
			//ein GridLayout mit 2 Spalten anwenden
			setLayout(new GridLayout(0,2));
			
			//ein Label und ein Eingabefeld
			add(new JLabel("Neue Position"));
			eingabePosition = new JTextField("0");
			add(eingabePosition);
			
			//die Schaltflächen
			einlesen = new JButton("Einlesen");
			einlesen.setActionCommand("lesen");
			beenden = new JButton("Beenden");
			beenden.setActionCommand("ende");
			
			MeinListener listener = new MeinListener();
			einlesen.addActionListener(listener);
			beenden.addActionListener(listener);
			
			add(einlesen);
			add(beenden);
			
			//gibt es die Datei daten.bin schon?
			File dateiTest = new File("daten.bin");
			
				//wenn nicht, erstellen wir sie neu
				if (dateiTest.exists() == false) {
					datenSchreiben();
				} 
				
				//Größe setzen, Standard-Verhalten festlegen und anzeigen
				pack();
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
		}

		//die Methode zum Lesen
		private void datenLesen() {
			
			//steht im Eingabefeld ein Wert?
			//sonst verlassen wir die Methode direkt wieder
			if (eingabePosition.getText().isEmpty()) {
				return;	
			}
			
			//geöffnet wird die Datei daten.bin im Nur-Lesen-Modus
			try (RandomAccessFile datei = new RandomAccessFile("daten.bin","r")){
				
				//für das Positionieren
				long neuePosition = 0;
				
				//die neue Position holen
				neuePosition = Long.parseLong(eingabePosition.getText());
				
				//ist die neue Position gültig?
				if (neuePosition <= datei.length()-4) {
					
					//dann positionieren
					datei.seek(neuePosition);
					
					//lesen und anzeigen
					add(new JLabel("Wert an Position: " + neuePosition));
					add(new JLabel(Integer.toString(datei.readInt())));
				}
			}
			
			catch (IOException e ) {
				JOptionPane.showMessageDialog(this, "Beim Laden ist ein Problem aufgetreten");
		    }
			
			//das Fenster neu "packen"
			pack();
		}
		
		//die Methode zum Schreiben
		private void datenSchreiben() {
			
			//geöffnet wird die Datei daten.bin im Lese- und Schreibmodus
			try (RandomAccessFile datei = new RandomAccessFile("daten.bin","rw")){
				
				//20 Werte als int in die Datei schreiben
				for (int i = 0; i < 20; i++)
					datei.writeInt(i * 10);
			}
			catch (IOException e ) {
				JOptionPane.showMessageDialog(this, "Beim Schreiben ist ein Problem aufgetreten");
		    }
		}
	}
