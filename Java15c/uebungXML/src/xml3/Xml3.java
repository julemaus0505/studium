package xml3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Xml3 extends JFrame {

	// für das Eingabefeld
	private JTextArea feld;
	
	// für die Schaltflächen
	private JButton einlesen;
	private JButton beenden;
	private JButton schreiben;
	
	// die innere Klasse für den ActionListener
	class MeinListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//wurde auf Lesen geklickt?
			if (e.getActionCommand().equals("lesen"))
				
				//dann die XML-Datei einlesen
				dateiLesen();
			
			//wurde auf Schreiben geklickt?
			if (e.getActionCommand().equals("schreiben"))
				
				//dann die XML-Datei schreiben
				dateiSchreiben();
			
			//wurde auf Beenden geklickt?
			if (e.getActionCommand().equals("ende"))
				System.exit(0);
		}
	}

	//der Konstruktor
	public Xml3(String titel) {
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
		
		//für die Ereignisse
		int ereignis;
		
		//zum Lesen der XML-Datei für den Stream
		InputStream eingabeStream;
		
		//die "Fabrik"
		XMLInputFactory xmlInput;
		
		//für den Parser
		XMLStreamReader xmlParserIn;
		
		//zur Zwischenspeicherung der Zeichenkette für den Namen eines Knotens
		String text = null;
		
		//die Ausnahmebehandlung ist zwingend erforderlich
		try {
			
			//einen Eingabestream für die Datei erzeugen
			//die Datei muss im Projekt-Ordner liegen
			eingabeStream = new FileInputStream( "probe.xml" );
			
			//eine neue Instanz für die Factory
			xmlInput = XMLInputFactory.newInstance();
			
			//für den Parser einen StreamReader erzeugen
			xmlParserIn = xmlInput.createXMLStreamReader(eingabeStream);
			
			//solange es noch weitere Elemente gibt
			while (xmlParserIn.hasNext()) {
				
				//das nächste Ereignisse holen und verarbeiten
		        ereignis = xmlParserIn.next();
		        switch (ereignis)  {
		        	
		        //das Ende
		        	case XMLStreamConstants.END_DOCUMENT:
		        		
		        		//schließen
		        		xmlParserIn.close();
		        	break;
		            
		        	//der Start eines Elements
		        	case XMLStreamConstants.START_ELEMENT:
		        		
		        		//den Namen lesen und ablegen
		        		text = xmlParserIn.getLocalName() + ": ";
		            break;
		           
		            //die Zeichen
		        	case XMLStreamConstants.CHARACTERS:
		        		
		        		//wenn es keine Sonderzeichen sind
		        		if (xmlParserIn.isWhiteSpace() == false)			
		        			feld.setText(feld.getText() +  text + xmlParserIn.getText() + '\n');
		        	break;
		        }
		    }
		}
		catch (IOException e ) {
			JOptionPane.showMessageDialog(this, "Beim Laden ist ein Problem aufgetreten");
	    }
	    catch (XMLStreamException e ) {
	    	JOptionPane.showMessageDialog(this, "Beim Verarbeiten ist ein Problem aufgetreten");
	    }
	}

	//die Methode zum Schreiben
	private void dateiSchreiben() {
		
		//zum Schreiben der XML-Datei für den Stream
		OutputStream ausgabeStream;
		
		//die "Fabrik"
		XMLOutputFactory xmlOutput;
		
		//für den "Schreiber"
		XMLStreamWriter xmlWriter;

		//die Ausnahmebehandlung ist zwingend erforderlich
		try {
			
			//einen Ausgabestream für die Datei erzeugen
			ausgabeStream = new FileOutputStream("probe.xml");
			
			//eine neue Instanz für die Factory
			xmlOutput = XMLOutputFactory.newInstance();
			
			//für den "Schreiber" einen Stream-Writer erzeugen			 
			//hier wird explizit UTF-8 gesetzt als Format
			xmlWriter = xmlOutput.createXMLStreamWriter(ausgabeStream, "UTF-8");
			
			//der XML-Prolog wird erzeugt
			xmlWriter.writeStartDocument("UTF-8","1.0");
			
			//das Start-Tag für eintraege
			xmlWriter.writeStartElement( "eintraege" );
			
			//dann für eintrag
			xmlWriter.writeStartElement( "eintrag" );
			
			//und für name
			xmlWriter.writeStartElement( "name" );
			
			//den Text des Elements schreiben
			xmlWriter.writeCharacters( "Maier" );
			
			//das Ende-Tag für das Element
			xmlWriter.writeEndElement();
			
			//das nächste Element
			xmlWriter.writeStartElement( "punkte" );
			xmlWriter.writeCharacters( "100" );
			
			//das Ende-Tag für punkte
			xmlWriter.writeEndElement();
			
			//das Ende-Tag für eintrag
			xmlWriter.writeEndElement();
			
			//der nächste Eintrag
			xmlWriter.writeStartElement( "eintrag" );
			xmlWriter.writeStartElement( "name" );
			xmlWriter.writeCharacters( "Maier" );
			xmlWriter.writeEndElement();
			xmlWriter.writeStartElement( "punkte" );
			xmlWriter.writeCharacters( "1000" );
			xmlWriter.writeEndElement();
			xmlWriter.writeEndElement();
			
			//das Ende-Tag für eintraege
			xmlWriter.writeEndElement();
			
			//das Ende des Dokuments
			xmlWriter.writeEndDocument();
			
			//den "Schreiber" schließen
			xmlWriter.close();
			
			//und den Stream
			ausgabeStream.close();
	    }
	    catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Beim Schreiben ist ein Problem aufgetreten");
	    }
	    catch (XMLStreamException e ) {
			JOptionPane.showMessageDialog(this, "Beim Verarbeiten ist ein Problem aufgetreten");
	    }
	}
	

}
