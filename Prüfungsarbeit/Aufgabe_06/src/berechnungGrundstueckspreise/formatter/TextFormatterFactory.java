package berechnungGrundstueckspreise.formatter;

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
	public static TextFormatter<Double> createDoubleTextFormatter() {

		Pattern validEditingState = Pattern.compile("-?(([1-9][0-9]*)|0)?(\\.[0-9]*)?");

		// Filter damit nur diese Zeichen und Zahlen eingegeben werden können
		UnaryOperator<TextFormatter.Change> filter = c -> {
			String text = c.getControlNewText();
			if (validEditingState.matcher(text).matches()) {
				return c;
			} else {
				return null;
			}
		};

		// Konvertierer um den eingegebenen Text in ein Integer umzuwandeln  
		StringConverter<Double> converter = new StringConverter<Double>() {

			@Override
			public Double fromString(String text) {
				if (text.isEmpty() || "-".equals(text) || ".".equals(text) || "-.".equals(text)) {
					return null;
				} else {
					return Double.valueOf(text);
				}
			}

			@Override
			public String toString(Double zahl) {
				if (zahl != null) {
					return zahl.toString();
				}
				return "";
			}
		};

		TextFormatter<Double> textFormatter = new TextFormatter<>(converter, null, filter);
		return textFormatter;
	}
}
