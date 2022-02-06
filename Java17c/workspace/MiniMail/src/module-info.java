module MiniMail {
	exports minimail;
	exports minimaildatenbankanlegen;

	requires transitive java.desktop;
	requires transitive java.sql;
	requires miglayout.swing;
	requires javax.mail;

}