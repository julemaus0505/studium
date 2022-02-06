module buchhandel {

	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;

	opens gui.buchhandel to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_buch_empfehlung to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_buecher to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_warenkorb to javafx.graphics, javafx.fxml;

	opens gui.buchhandel_buch_eigene_seiten to javafx.graphics, javafx.fxml;
	opens gui.startseite to javafx.graphics, javafx.fxml;
	opens gui.buch_bilder_gross to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_buecher_navi to javafx.graphics, javafx.fxml;

	opens gui.buchhandel_ebooks to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_ebook_eigene_seiten to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_ebook_empfehlung to javafx.graphics, javafx.fxml;
	opens gui.ebook_bilder_gross to javafx.graphics, javafx.fxml;

	opens gui.buchhandel_schulBuchEmpfehlung to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_schule_lernen_buch_eigene_seiten to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_schuleLernen to javafx.graphics, javafx.fxml;
	opens gui.schule_lernen_bilder_gross to javafx.graphics, javafx.fxml;

	opens gui.buchhandel_kalender to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_kalender_eigene_seiten to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_kalender_empfehlung to javafx.graphics, javafx.fxml;
	opens gui.kalender_bilder_gross to javafx.graphics, javafx.fxml;

	opens gui.buchhandel_hoerbuecher to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_hoerbuch_eigene_seiten to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_hoerbuch_empfehlung to javafx.graphics, javafx.fxml;
	opens gui.hoerbuch_bilder_gross to javafx.graphics, javafx.fxml;
	
	opens gui.buchhandel_filmeSerien to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_filmeSerien_eigene_seiten to javafx.graphics, javafx.fxml;
	opens gui.buchhandel_filmeSerien_empfehlung to javafx.graphics, javafx.fxml;
	opens gui.filmeSerien_bilder_gross to javafx.graphics, javafx.fxml;
}