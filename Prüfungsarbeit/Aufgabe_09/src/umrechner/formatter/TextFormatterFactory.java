package umrechner.formatter;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

import javafx.scene.control.TextFormatter;
import javafx.util.StringConverter;

/**
 * Diese Klasse erstellt {@link TextFormatter}
 * 
 * Quelle: Fabrik-Methoden entnommen aus dem Buch "Java ist auch eine Insel", Seite 854
 * @author julia
 */
public class TextFormatterFactory {

	/**
	 *  Erstellt einen {@link TextFormatter} für Double-Werte
	 *  
	 *  Quelle: https://stackoverflow.com/questions/45977390/how-to-force-a-double-input-in-a-textfield-in-javafx
	 */
	public static TextFormatter<Integer> createIntegerTextFormatter() {

		Pattern validEditingState = Pattern.compile("(([0-9][0-9][0-9][0-9])|([0-9][0-9][0-9])|([0-9][0-9])|([0-9]))?");

		// Filter damit nur bis zu 4 Zahlen eingegeben werden können
		UnaryOperator<TextFormatter.Change> filter = c -> {
			String text = c.getControlNewText();
			if (validEditingState.matcher(text).matches()) {
				return c;
			} else {
				return null;
			}
		};

		// Konvertierer um den eingegebenen Text in ein Integer umzuwandeln  
		StringConverter<Integer> converter = new StringConverter<Integer>() {

			@Override
			public Integer fromString(String text) {
				if (text.isEmpty() || "-".equals(text) || ".".equals(text) || "-.".equals(text)) {
					return null;
				} else {
					return Integer.valueOf(text);
				}
			}

			@Override
			public String toString(Integer zahl) {
				if (zahl != null) {
					return zahl.toString();
				}
				return "";
			}
		};

		TextFormatter<Integer> textFormatter = new TextFormatter<>(converter, null, filter);
		return textFormatter;
	}

	public static TextFormatter<String> createRoemischeZahlenTextFormatter() {

		Pattern validEditingState = Pattern.compile("[IVXLCDM]*");

		// Filter damit nur römische Zahlen eingegeben werden können 
		UnaryOperator<TextFormatter.Change> filter = c -> {
			String text = c.getControlNewText();
			if (validEditingState.matcher(text).matches()) {
				return c;
			} else {
				return null;
			}
		};
		
		TextFormatter<String> textFormatter = new TextFormatter<>(null, null, filter);
		return textFormatter;
	}
}
