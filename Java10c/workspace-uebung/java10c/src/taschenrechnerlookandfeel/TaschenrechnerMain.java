package taschenrechnerlookandfeel;

import javax.swing.UIManager;

public class TaschenrechnerMain {
	public static void main(String[] args) {

		// eine Zeichenkette f�r das Look& Feel
		String aussehen;

		// das Standard-Look&Feel f�r Windows holen
		aussehen = UIManager.getSystemLookAndFeelClassName();
		new TaschenrechnerGUILookAndFeel(aussehen, aussehen);

		// und im Metal-Look&Feel, das ist aber Standard
		aussehen = UIManager.getCrossPlatformLookAndFeelClassName();
		new TaschenrechnerGUILookAndFeel(aussehen, aussehen);
	}
}
