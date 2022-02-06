module einsendeaufgabe_java15c {
	exports hangmanFXSpiel_Aufgabe1_und_Aufgabe2;
	
	requires javafx.base;
	requires javafx.controls;
	requires java.desktop;
	requires java.xml;
	requires javafx.fxml;
	requires javafx.graphics;
	requires jdk.compiler;
	requires lombok;
	requires jakarta.xml.bind;
    
	opens hangmanFXSpiel_Aufgabe1_und_Aufgabe2 to javafx.fxml, javafx.graphics, jakarta.xml.bind; 
}