package minidb;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NeuerEintrag extends JDialog{
	
	//automatisch �ber Eclipse erzeugt
	private static final long serialVersionUID = -5496318621928815910L;

	//f�r die Eingabefelder
	private JTextField name;
	private JTextField nachname;
	private JTextField strasse;
	private JTextField plz;
	private JTextField ort;
	private JTextField telefon;
	
	//f�r die Schaltfl�chen 
	private JButton ok;
	private JButton abbrechen;
	
	//die innere Klasse f�r den ActionListener
	class NeuListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			//wurde auf OK geklickt?
			if (event.getActionCommand().equals("ok")) {
				
				//dann die Daten �bernehmen
				uebernehmen();
				
				// NEU Meldung das die Daten �bernommen wurden
				JOptionPane.showMessageDialog(null, "Die Daten wurden der Datenbank hinzugef�gt.");
				
				//wurde auf Abbrechen geklickt?
			} else if (event.getActionCommand().equals("abbrechen")) {
				
				//dann Dialog schlie�en
				dispose();
			}	
		}
	}
	
	//der Konstruktor
	public NeuerEintrag(JFrame parent, boolean modal) {
		super(parent, modal);
		setTitle("Neuer Eintrag");
		
		//die Oberfl�che erstellen
		initGui();
		
		//Standardoperation setzen
		//hier den Dialog ausblenden und l�schen
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
	
	private void initGui() {
		setLayout(new GridLayout(0, 2));
		
		//f�r die Eingabe
		add(new JLabel("Vorname:"));
		name = new JTextField();
		add(name);
		add(new JLabel("Nachname:"));
		nachname = new JTextField();
		add(nachname);
		add(new JLabel("Strasse:"));
		strasse = new JTextField();
		add(strasse);
		add(new JLabel("PLZ:"));
		plz = new JTextField();
		add(plz);
		add(new JLabel("Ort:"));
		ort = new JTextField();
		add(ort);
		add(new JLabel("Telefon:"));
		telefon = new JTextField();
		add(telefon);
		
		//die Schaltfl�chen
		ok = new JButton("OK");
		ok.setActionCommand("ok");
		abbrechen = new JButton("Abbrechen");
		abbrechen.setActionCommand("abbrechen");
		
		NeuListener listener = new NeuListener();
		ok.addActionListener(listener);
		abbrechen.addActionListener(listener);
		
		add(ok);
		add(abbrechen);

		//packen und anzeigen
		pack();
		setVisible(true);
	}
	
	//die Methode legt einen neuen Datensatz an
	private void uebernehmen() {
		Connection verbindung;
		ResultSet ergebnisMenge;
		
		try {
			
			//Verbindung herstellen und Ergebnismenge beschaffen
			verbindung=MiniDBTools.oeffnenDB("org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:adressenDB");
			ergebnisMenge = MiniDBTools.liefereErgebnis(verbindung, "SELECT * FROM adressen");
        	
			//zur "Einf�gezeile" bewegen
        	ergebnisMenge.moveToInsertRow();
        	
        	//die Nummer wird automatisch gesetzt
        	//angegeben werden die Nummer der Spalte und der neue Wert
        	ergebnisMenge.updateString(2, name.getText());
        	ergebnisMenge.updateString(3, nachname.getText());
        	ergebnisMenge.updateString(4, strasse.getText());
        	ergebnisMenge.updateString(5, plz.getText());
        	ergebnisMenge.updateString(6, ort.getText());
        	ergebnisMenge.updateString(7, telefon.getText());   	
  	
        	//und einf�gen
        	ergebnisMenge.insertRow();
        	
        	//Ergebnismenge und Verbindung schlie�en
	        ergebnisMenge.close();
        	verbindung.close();
        	
        	//und das Datenbank-System auch
        	MiniDBTools.schliessenDB("jdbc:derby:adressenDB");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(this, "Problem: \n" + e.toString());
		}
	}
}
