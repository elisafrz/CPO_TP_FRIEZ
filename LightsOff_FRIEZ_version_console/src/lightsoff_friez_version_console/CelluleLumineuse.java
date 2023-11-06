package lightsoff_friez_version_console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author friez
 */
public class CelluleLumineuse {
   private boolean allumee; // true si la cellule est allumée, false sinon
   
   public CelluleLumineuse() { // La cellule est éteinte par défaut
        allumee = false;
    }
   public void allumer() { // Méthode pour allumer la cellule
        allumee = true;
   }
   public void eteindre() { // Méthode pour éteindre la cellule
        allumee = false;
   }
    public boolean estAllumee() {  // Méthode pour vérifier si la cellule est allumée
        return allumee;
    }
    
    public void changerEtat() { // Méthode pour changer l'état de la cellule (inverse de l'état actuel)
        allumee = !allumee;
    }
    public void afficherEtat() { // Méthode pour afficher l'état de la cellule
        if (allumee) {
            System.out.println("La cellule est allumée.");
        } else {
            System.out.println("La cellule est éteinte.");
        }
    }
}
