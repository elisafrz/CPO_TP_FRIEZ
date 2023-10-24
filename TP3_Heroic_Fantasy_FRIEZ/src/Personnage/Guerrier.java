package Personnage;


import Personnage.Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author friez
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }

    public boolean aCheval() {
        return aCheval;
    }

    public void setaCheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
}
