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
public class Magicien extends Personnage {
    private boolean Confirme;

    public Magicien(String nom, int niveauVie, boolean Confirme) {
        super(nom, niveauVie);
        this.Confirme = Confirme;
    }

    /**
     *
     * @return
     */
    public boolean Confirme() {
        return Confirme;
    }

    public void setConfirme(boolean Confirme) {
        this.Confirme = Confirme;
    }
}
