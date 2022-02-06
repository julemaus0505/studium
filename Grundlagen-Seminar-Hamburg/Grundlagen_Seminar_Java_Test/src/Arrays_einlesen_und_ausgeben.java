import javax.swing.JOptionPane;

public class Arrays_einlesen_und_ausgeben {

	public static void main(String[] args) {

		int[][] zahlen = new int[3][2];

		for (int i = 0; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen[i].length; j++) {
				zahlen[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine Zahl ein"));
			}
		}
		
		
		// Werte aus dem Array lesen
		for (int i = 0; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen[i].length; j++) {
				System.out.println(zahlen[i][j]); 
			}
		}
	}
}
