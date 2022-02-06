package java09c_projekt08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutsProgramm extends JFrame{
	
	//die ID wurde automatisch über Eclipse erzeugt
	private static final long serialVersionUID = -5862964739630294625L;
	private JLabel ausgabe;
	private JButton schaltflaeche;
	
	//die innere Klasse für den ActionListener
	class SchaltflaechenListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//neue Instanzen der Fenster erzeugen
			new FensterFlow("Ein Flow-Layout");
			new FensterBorder("Ein Border-Layout");
			new FensterGrid("Ein Grid-Layout");
			new FensterNull("Ohne Layout");
		}
	}
	
	//der Konstruktor
	LayoutsProgramm() {
		super("Layouts");
		//das Label erzeugen
		ausgabe = new JLabel("Das Programm erzeugt Fenster mit unterschiedlichen Layouts");
		schaltflaeche = new JButton("Los geht's");
		
		add(ausgabe);
		add(schaltflaeche);
		schaltflaeche.addActionListener(new SchaltflaechenListener());
		
		setLayout(new FlowLayout());
		setSize(600, 300);
		
		setLocationByPlatform(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LayoutsProgramm();
	}
}

