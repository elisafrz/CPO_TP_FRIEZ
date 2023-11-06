/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsoff_friez_version_console;

/**
 *
 * @author friez
 */
public class LightsOff_FRIEZ_version_console {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
