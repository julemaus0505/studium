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

	// f�r das Eingabefeld
	private JTextArea feld;
	
	// f�r die Schaltfl�chen
	private JButton einlesen;
	private JButton beenden;
	private JButton schreiben;
	
	// die innere Klasse f�r den ActionListener
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
		
		//f�r das Panel mit den Schaltfl�chen 
		JPanel tempPanel;
		
		//ein neues Eingabefeld erstellen
		feld = new JTextArea();
		
		//die Schaltfl�chen
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
		
		//ein Panel f�r die Schaltfl�chen
		tempPanel = new JPanel();
		tempPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		tempPanel.add(einlesen);
		tempPanel.add(schreiben);
		tempPanel.add(beenden);
		add(tempPanel,BorderLayout.SOUTH);
		
		//Gr��e setzen, Standard-Verhalten festlegen und anzeigen
		setMinimumSize(new Dimension(400,300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	//die Methode zum Lesen
	private void dateiLesen() {
		
		//f�r die Ereignisse
		int ereignis;
		
		//zum Lesen der XML-Datei f�r den Stream
		InputStream eingabeStream;
		
		//die "Fabrik"
		XMLInputFactory xmlInput;
		
		//f�r den Parser
		XMLStreamReader xmlParserIn;
		
		//zur Zwischenspeicherung der Zeichenkette f�r den Namen eines Knotens
		String text = null;
		
		//die Ausnahmebehandlung ist zwingend erforderlich
		try {
			
			//einen Eingabestream f�r die Datei erzeugen
			//die Datei muss im Projekt-Ordner liegen
			eingabeStream = new FileInputStream( "probe.xml" );
			
			//eine neue Instanz f�r die Factory
			xmlInput = XMLInputFactory.newInstance();
			
			//f�r den Parser einen StreamReader erzeugen
			xmlParserIn = xmlInput.createXMLStreamReader(eingabeStream);
			
			//solange es noch weitere Elemente gibt
			while (xmlParserIn.hasNext()) {
				
				//das n�chste Ereignisse holen und verarbeiten
		        ereignis = xmlParserIn.next();
		        switch (ereignis)  {
		        	
		        //das Ende
		        	case XMLStreamConstants.END_DOCUMENT:
		        		
		        		//schlie�en
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
		
		//zum Schreiben der XML-Datei f�r den Stream
		OutputStream ausgabeStream;
		
		//die "Fabrik"
		XMLOutputFactory xmlOutput;
		
		//f�r den "Schreiber"
		XMLStreamWriter xmlWriter;

		//die Ausnahmebehandlung ist zwingend erforderlich
		try {
			
			//einen Ausgabestream f�r die Datei erzeugen
			ausgabeStream = new FileOutputStream("probe.xml");
			
			//eine neue Instanz f�r die Factory
			xmlOutput = XMLOutputFactory.newInstance();
			
			//f�r den "Schreiber" einen Stream-Writer erzeugen			 
			//hier wird explizit UTF-8 gesetzt als Format
			xmlWriter = xmlOutput.createXMLStreamWriter(ausgabeStream, "UTF-8");
			
			//der XML-Prolog wird erzeugt
			xmlWriter.writeStartDocument("UTF-8","1.0");
			
			//das Start-Tag f�r eintraege
			xmlWriter.writeStartElement( "eintraege" );
			
			//dann f�r eintrag
			xmlWriter.writeStartElement( "eintrag" );
			
			//und f�r name
			xmlWriter.writeStartElement( "name" );
			
			//den Text des Elements schreiben
			xmlWriter.writeCharacters( "Maier" );
			
			//das Ende-Tag f�r das Element
			xmlWriter.writeEndElement();
			
			//das n�chste Element
			xmlWriter.writeStartElement( "punkte" );
			xmlWriter.writeCharacters( "100" );
			
			//das Ende-Tag f�r punkte
			xmlWriter.writeEndElement();
			
			//das Ende-Tag f�r eintrag
			xmlWriter.writeEndElement();
			
			//der n�chste Eintrag
			xmlWriter.writeStartElement( "eintrag" );
			xmlWriter.writeStartElement( "name" );
			xmlWriter.writeCharacters( "Maier" );
			xmlWriter.writeEndElement();
			xmlWriter.writeStartElement( "punkte" );
			xmlWriter.writeCharacters( "1000" );
			xmlWriter.writeEndElement();
			xmlWriter.writeEndElement();
			
			//das Ende-Tag f�r eintraege
			xmlWriter.writeEndElement();
			
			//das Ende des Dokuments
			xmlWriter.writeEndDocument();
			
			//den "Schreiber" schlie�en
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
