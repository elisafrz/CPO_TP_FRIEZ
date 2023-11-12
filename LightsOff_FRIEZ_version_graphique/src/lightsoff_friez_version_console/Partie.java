package lightsoff_friez_version_console;


import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import lightsoff_friez_version_console.GrilleDeCellules;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author friez
 */
public class Partie {
    
    private GrilleDeCellules grille;
    private int coupsMax;
    private int coupsJoues;
    private Timer timer;

    public Partie(int lignes, int colonnes,int coupsMax) {
        grille = new GrilleDeCellules(lignes, colonnes);
        this.coupsMax = coupsMax;
        coupsJoues = 0;
        timer = new Timer();
    }

    public void lancerPartie() {   // Méthode pour lancer la partie et permettre à l'utilisateur de jouer
        Scanner scanner = new Scanner(System.in);
        boolean partieTerminee = false;
       
        

            while (!partieTerminee) {
            System.out.println("Grille actuelle :");
            System.out.println(grille);
            System.out.println("Coups restants : " + (coupsMax - coupsJoues));
            
            if (coupsJoues >= coupsMax) {
                System.out.println("Nombre maximum de coups atteint. Vous avez perdu.");
                break;
            }

          
            
            System.out.print("Entrez le coup à jouer (ligne colonne) ou 'q' pour quitter : ");
            String input = scanner.nextLine();

            if (input.equals("q")) { // Permet au joueur de quitter la partie en entrant q
                System.out.println("Partie abandonnée.");
                break;
            }

            String[] coup = input.split(" ");
            if (coup.length == 2) {
                int ligne = Integer.parseInt(coup[0]);
                int colonne = Integer.parseInt(coup[1]);

                if (ligne >= 0 && ligne < grille.getLignes() && colonne >= 0 && colonne < grille.getColonnes()) {
                    grille.activerCellule(ligne, colonne);
                    coupsJoues++;
                    if (grille.toutesLesCellulesAllumees()) {
                        System.out.println("Félicitations, vous avez gagné en " + coupsJoues + " coups !");
                        partieTerminee = true;
                    }
                } else {
                    System.out.println("Coup invalide. Réessayez.");
                }
            } else {
                System.out.println("Format de coup incorrect. Utilisez 'ligne colonne'.");
            }
        }

        scanner.close();
    }
}

    
