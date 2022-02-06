package einsendeaufgabe_java04c;


	import java.util.Arrays;

	import javax.swing.*;

	public class UebungNeu
	{
	      
	    //Neue Kiste eingeben
	     
	    static void eingabe(int[][]argEingabe){

	          int nummer;
	          int breite, laenge, hoehe;
	       
	          //Kistennummer vergeben
	          do {
	              nummer=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte eine Kistennummer ein (1 -75)"));
	           
	              //Kistennummer g�ltig und nicht vergeben
	              if(nummer>0 && nummer<=argEingabe.length)
	                  if(argEingabe[nummer-1][0]==0){
	                   
	                      //Kistennummer zuweisen
	                      argEingabe[nummer-1][0]=nummer;
	                   
	                      //Werte Einlesen
	                      breite=Integer.parseInt(JOptionPane.showInputDialog("Kistenbreite"));
	                      argEingabe[nummer-1][1]=breite;
	                   
	                      laenge=Integer.parseInt(JOptionPane.showInputDialog("Kistenlaenge"));
	                      argEingabe[nummer-1][2]=laenge;
	                   
	                      hoehe=Integer.parseInt(JOptionPane.showInputDialog("Kistenhoehe"));
	                      argEingabe[nummer-1][3]=hoehe;                  
	                   
	                     }
	               
	                  else {
	                      System.out.println("\nDie Kistennummer ist ung�ltig oder schon vergeben");
	                  }
	          }
	          while(nummer<=0 || nummer>argEingabe.length);
	 
	       
	    }
	    //Eine Kiste l�schen
	    static void loeschen(int[][] argLoeschen) {
	   
	          int nummer;
	   
	      //Kistennummer eingeben
	      do {
	          nummer=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die zu l�schende Kistennummer ein"));
	   
	          //Kontrolle ob Kistennummer schon vergeben ist
	          if(nummer>0 && nummer<=argLoeschen.length)

	              if(argLoeschen[nummer-1][0]==nummer){
	           
	              argLoeschen[0][0]=nummer;
	           
	              }
	       
	              else {
	                  System.out.println("\nDie Kistennummer " +nummer + " ist nicht bekannt");
	              }
	      }
	          while(nummer<=0 || nummer>argLoeschen.length);
	          }
	       
	   
	   
	    //Kiste �ndern
	    static void aendern(int[][] argAendern) {
	          int nummer;
	          int breite, laenge, hoehe;
	       
	           //Kistennummer eingeben
	          do {
	              nummer=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte eine Kistennummer ein (1 -75)"));
	           
	              //Kistennummer g�ltig und noch nicht vergeben
	              if(nummer>0 && nummer<=argAendern.length)
	                  if(argAendern[nummer-1][0]!=0){
	   
	                      //Werte Einlesen
	                      breite=Integer.parseInt(JOptionPane.showInputDialog("Kistenbreite"));
	                      argAendern[nummer-1][1]=breite;
	                   
	                      laenge=Integer.parseInt(JOptionPane.showInputDialog("Kistenlaenge"));
	                      argAendern[nummer-1][2]=laenge;
	                   
	                      hoehe=Integer.parseInt(JOptionPane.showInputDialog("Kistenhoehe"));
	                      argAendern[nummer-1][3]=hoehe;
	                   
	                  }
	                   
	                      else {
	                          System.out.println("\nDie Kistennummer ist ung�ltig oder noch nicht vergeben");
	                      }
	              }
	              while(nummer<=0 || nummer>argAendern.length);
	   
	  }
	  //Kiste Anzeigen
	   static void anzeigen(int[][] argAnzeigen){
	          int nummer;
	          nummer=Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine vorhandene Kistennummer ein"));
	          for(int i=0; i<argAnzeigen.length; i++){
	              if(nummer>0 && nummer<=argAnzeigen.length && argAnzeigen[i][0] == nummer){
	                  System.out.println("\nDie Daten der Kiste sind t:\t"+Arrays.toString(argAnzeigen[i]));
	                  return;
	              }
	          }
	          System.out.println("\nDie Kistennummer " +nummer + " ist nicht bekannt");
	           
	      }
	  public static void main(String[] args) {
	   
	      //Vereinbarung des Arrays
	      int[][] kistenArray = new int[75][4];
	   
	      //Auswahl der Funktion
	   
	      String funktionEinlesen;
	   
	      char funktion;
	   
	      System.out.println("Folgende Funktionen stehen Ihnen zur Auswahl: \n");
	      System.out.println("A \t Eingabe einer neuen Kiste");
	      System.out.println("B \t L�schen einer Kiste");
	      System.out.println("C \t �ndern einer Kiste");
	      System.out.println("D \t Daten einer Kiste anzeigen");
	      System.out.println("E \t Daten aller Kisten anzeigen");
	   
	      funktionEinlesen=JOptionPane.showInputDialog("W�hlen Sie eine Funktion");
	      funktion = funktionEinlesen.charAt(0);
	   
	      //Auswahl auswerten

	    
	      switch(funktion) {
	   
	      case 'a':
	      case 'A':
	          System.out.println("\nSie haben Eingabe einer neuen Kiste gew�hlt");
	          eingabe(kistenArray);
	          break;
	       
	      case 'b':
	      case 'B':
	          System.out.println("\nSie haben L�schen einer Kiste gew�hlt");
	          loeschen(kistenArray);
	          break;
	   
	      case 'c':
	      case 'C':
	          System.out.println("\nSie haben �ndern einer Kiste gew�hlt");
	          aendern(kistenArray);
	          break;
	   
	      case 'd':
	      case 'D':
	          System.out.println("\nSie haben Daten einer Kiste anzeigen gew�hlt");
	          anzeigen(kistenArray);
	          break;

	      }
	   
	   
	      System.exit(0);

	  

	   }
	}
	

