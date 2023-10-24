/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author friez
 */
public abstract class Arme {
    private String nom;
    private int niveauAttaque;
    
     public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque >= 0 && niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        }
     }
      public void setNiveauAttaque(int niveauAttaque) {
        if (niveauAttaque >= 0 && niveauAttaque <= 100) {
            this.niveauAttaque = niveauAttaque;
        }
      }
      
      public String getnom() {
                return nom;
      }
       public int niveauAttaque() {
                return niveauAttaque;
       }
       public void setNom(String nom) {
        this.nom = nom;
       }
    @Override
        public String toString() {
        return "L'arme se nomme " + nom + ", son niveau d'attaque est " + niveauAttaque ;
    }
}
    
