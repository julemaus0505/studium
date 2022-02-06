package minimail;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MiniMailStart extends JFrame {

	// automatisch über Eclipse erzeugt
	private static final long serialVersionUID = 3610196939297879702L;

	// Klassenvariabel für den den Login erstellt
	private String email;
	private String password;

	// die innere Klasse für den ActionListener
	class MeinListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {

			// wurde auf Senden geklickt?
			if (event.getActionCommand().equals("senden")) {

				// dann das Senden starten
				senden();

			// wurde auf Empfangen geklickt?
			} else if (event.getActionCommand().equals("empfangen")) {

				// dann das Empfangen starten
				empfangen();
				
			// wurde auf Weiterleiten geklickt?
			} else if (event.getActionCommand().equals("weiterleiten")) {
				
				// dann das Weiterleiten starten
				weiterleiten();
				
			// wurde auf Weiterleiten geklickt?
			} else if (event.getActionCommand().equals("beantworten")) {
				
				// dann Beantworten starten 
				beantworten();
		
				// wurde auf Beenden geklickt?
		} else if (event.getActionCommand().equals("ende")) {

				// dann beenden
				beenden();
			}
		}
	}

	// der Konstruktor
	public MiniMailStart(String titel, String email, String password) {
		super(titel);
		this.email = email;
		this.password = password;

		// ein FlowLayout
		setLayout(new FlowLayout(FlowLayout.LEFT));

		// die Schaltflächen
		JButton liste = new JButton("Senden");
		liste.setActionCommand("senden");
		JButton einzel = new JButton("Empfangen");
		einzel.setActionCommand("empfangen");
		JButton weiterleitenButton = new JButton("Weiterleiten");
		weiterleitenButton.setActionCommand("weiterleiten");
		JButton beantwortenButton = new JButton("Beantworten");
		beantwortenButton.setActionCommand("beantworten");
		JButton beenden = new JButton("Beenden");
		beenden.setActionCommand("ende");

		MeinListener listener = new MeinListener();
		liste.addActionListener(listener);
		einzel.addActionListener(listener);
		weiterleitenButton.addActionListener(listener);
		beantwortenButton.addActionListener(listener);
		beenden.addActionListener(listener);

		add(liste);
		add(einzel);
		add(weiterleitenButton);
		add(beantwortenButton);
		add(beenden);
		
		// Button zum Weiterleiten, mit dem Button wird die Methode senden aufgerufen
		weiterleitenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				senden();
				
			}
		});
		
		beantwortenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				senden();
				
			}
		});
		

		// Größe setzen, Standardverhalten festlegen und anzeigen
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	// die Dummy-Methoden
	private void senden() {
		new Senden(email, password);
	}

	private void empfangen() {
		new Empfangen(email, password);
	}
	
	private void weiterleiten() {
		new Weiterleiten();
		
	}
	
	private void beantworten() {
		new Beantworten();
		
	}
	
	private void beenden() {
		System.exit(0);
	}
}
