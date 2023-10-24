package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author friez
 */
public abstract class Personnage {
    private String nom;
    private int niveauVie;
   
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
       }

    public void setniveauVie(int niveauVie) {
        this.niveauVie = niveauVie;
    }
    
    public String getnom() {
        return nom;
}

    public int getniveauVie() {
        return niveauVie;
}

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Le personnage se nomme " + nom + " et son niveau de vie est " + niveauVie ;
    }
    
}
