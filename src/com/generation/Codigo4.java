package com.generation;

import java.util.Scanner;

public class Codigo4 {
	
	
	public void game() {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = s.nextLine();
    int g=0;

    if (j1.equals(j2)) {
        System.out.println("Empate");
      } else {
    	  
    	switch 
        (j1) {
        
        // Case piedra gana tijera
          case "piedra":
          {
        	  
            if (j2.equals("tijeras")) {
              g = 1;
            }
            if(j2.equals("papel")) {
            	g=2;	
            }
            
            break;}
            // // Case papel gana piedra
          case "papel":
            if (j2.equals("piedra")) {
              g = 1;
            }
            if(j2.equals("tijeras")) {
            	g=2;
            }
            break;
         // Case tijera gana papel
          case "tijeras":
            if (j2.equals("papel")) {
              g = 1;
            }
            if(j2.equals("piedra")){
            	g = 2;
            }
            
            break;
            // Default case
          default: System.out.println("No results");
        	  
        }// Switch
        System.out.println("Gana el jugador " + g);
      } // else
        
      
    
  
    }// game()
}//class Codigo4