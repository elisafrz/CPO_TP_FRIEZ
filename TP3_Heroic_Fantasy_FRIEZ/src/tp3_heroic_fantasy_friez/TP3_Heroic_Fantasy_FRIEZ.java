/*
/* TP3
/*23/10/2023
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_friez;

import java.util.ArrayList;

/**
 *
 * @author friez
 */
public class TP3_Heroic_Fantasy_FRIEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Arme> armes = new ArrayList<>();
        
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);
        
      for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i);
            System.out.println("Arme " + (i + 1) + ": " + arme);
      }
    }
    
}
