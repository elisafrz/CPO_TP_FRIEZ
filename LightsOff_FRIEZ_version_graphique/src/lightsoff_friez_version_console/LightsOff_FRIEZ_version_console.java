/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsoff_friez_version_console;

import java.util.Scanner;

/**
 *
 * @author friez
 */
public class LightsOff_FRIEZ_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1. Facile (5x5)");
        System.out.println("2. Moyen (8x8)");
        System.out.println("3. Difficile (10x12)");
        int choixDifficulte = scanner.nextInt();
        int lignes, colonnes;
        
     
        switch (choixDifficulte) {
            case 1:
                lignes = 5;
                colonnes = 5;
                break;
            case 2:
                lignes = 8;
                colonnes = 8;
                break;
            case 3:
                lignes = 10;
                colonnes = 12;
                break;
            default:
                System.out.println("Niveau de difficulté non valide. Choisissez entre 1, 2, et 3.");
           return;
             
                
         }
         
       
        
        
        
        System.out.print("Entrez le nombre maximum de coups (ou 0 pour le mode Zen) : ");
        
        

        int coupsMax = scanner.nextInt();

        Partie jeu = new Partie(lignes, colonnes,coupsMax);
        
        
        jeu.lancerPartie();
         
    
    

        GrilleDeCellules grille = new GrilleDeCellules(5, 5);
        
        
        System.out.println("Grille initiale :");
        System.out.println(grille);
        
         

        grille.activerLigneColonneOuDiagonaleAleatoire();
        System.out.println("Grille après activation aléatoire :");
        System.out.println(grille);

        grille.melangerMatriceAleatoirement(10);
        System.out.println("Grille après mélange aléatoire :");
        System.out.println(grille);

    
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();
        
        System.out.println("État initial de la cellule 1 :");
        cellule1.afficherEtat(); // La cellule 1 est éteinte
        
        System.out.println("État initial de la cellule 2 :");
        cellule2.afficherEtat(); // La cellule 2 est éteinte.
        
        // Changer l'état de la cellule 1 (de allumée à éteinte)
        cellule1.changerEtat();
        System.out.println("État de la cellule 1 après changement d'état :");
        cellule1.afficherEtat(); // La cellule 1 est allumée.

        // Changer l'état de la cellule 2 (de éteinte à allumée)
        cellule2.changerEtat();
        System.out.println("État de la cellule 2 après changement d'état :");
        cellule2.afficherEtat(); // La cellule 2 est allumée.
}

    
}
