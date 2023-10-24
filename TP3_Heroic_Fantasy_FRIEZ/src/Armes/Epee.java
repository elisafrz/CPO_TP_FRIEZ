/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author friez
 */
public class Epee extends Arme {
     private int indiceFinesse;
    public Epee(String nom, int niveauAttaque,int indiceFinesse) {
        super(nom, niveauAttaque);
         if (indiceFinesse >= 0 && indiceFinesse < 100) {
         this.indiceFinesse = indiceFinesse;
        }
    }
       public int getIndiceFinesse() {
        return indiceFinesse;
       }

    /**
     *
     * @return
     */
    @Override
       public String toString() {
        return super.toString() + " et son indice de Finesse est " + indiceFinesse ;
    }
}
