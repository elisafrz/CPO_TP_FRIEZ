package lightsoff_friez_version_console;


import java.util.Random;
import lightsoff_friez_version_console.CelluleLumineuse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author friez
 */
public class GrilleDeCellules {
public CelluleLumineuse[][] matriceCellules;  
public CelluleLumineuse[][] grille;

public GrilleDeCellules(int lignes, int colonnes) {
    matriceCellules = new CelluleLumineuse[lignes][colonnes];
    for (int i = 0; i < lignes; i++) {
        for (int j = 0; j < colonnes; j++) {
            matriceCellules[i][j] = new CelluleLumineuse();
        }
    }
}

public void activerCellule(int ligne, int colonne) {  // Méthode pour activer une cellule spécifique
        if (ligne >= 0 && ligne < matriceCellules.length && colonne >= 0 && colonne < matriceCellules[0].length) {
            matriceCellules[ligne][colonne].allumer();
        }
    }

 public void activerLigneDeCellules(int idLigne) { // Méthode pour activer une ligne de cellules
        for (int j = 0; j < matriceCellules[idLigne].length; j++) {
            matriceCellules[idLigne][j].allumer();
        }
    }
 
  public void activerColonneDeCellules(int idColonne) { // Méthode pour activer une colonne de cellules
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][idColonne].allumer();
        }
    }
  
    public void activerDiagonaleDescendante() { // Méthode pour activer la diagonale descendante
        for (int i = 0; i < matriceCellules.length; i++) {
            matriceCellules[i][i].allumer();
        }
    }
    
    public void activerDiagonaleMontante() {  // Méthode pour activer la diagonale montante
        int n = matriceCellules.length;
        for (int i = 0; i < n; i++) {
            matriceCellules[i][n - i - 1].allumer();
        }
    }
    
    public void activerLigneColonneOuDiagonaleAleatoire() { // Méthode pour activer une ligne, colonne ou diagonale aléatoire
        Random random = new Random();
        int choix = random.nextInt(4);
        
        switch (choix) {
            case 0:
                int ligne = random.nextInt(matriceCellules.length);
                activerLigneDeCellules(ligne);
                break;
            case 1:
                int colonne = random.nextInt(matriceCellules[0].length);
                activerColonneDeCellules(colonne);
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }
    
    
    public void melangerMatriceAleatoirement(int nbTours) { // Méthode pour mélanger la grille
        Random random = new Random();
        int lignes = matriceCellules.length;
        int colonnes = matriceCellules[0].length;

        for (int tour = 0; tour < nbTours; tour++) {
            int ligneOuColonne = random.nextInt(2);
            if (ligneOuColonne == 0) {
                int ligne = random.nextInt(lignes);
                activerLigneDeCellules(ligne);
            } else {
                int colonne = random.nextInt(colonnes);
                activerColonneDeCellules(colonne);
            }
        }
    }
    
    public int getLignes() { // Méthode pour obtenir le nombre de lignes
        return matriceCellules.length;
    }
    
    public int getColonnes() { // Méthode pour obtenir le nombre de colonnes
        return matriceCellules.length;
    }
    
    public boolean toutesLesCellulesAllumees() {  // Méthode pour vérifier si toutes les cellules sont allumées
        for (int i = 0; i < matriceCellules.length; i++) {
            for (int j = 0; j < matriceCellules[i].length; j++) {
                if (!matriceCellules[i][j].estAllumee()) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean toutesLesCellulesEteintes() {  
    for (int i = 0; i < matriceCellules.length; i++) {
        for (int j = 0; j < matriceCellules[i].length; j++) {
            if (matriceCellules[i][j].estAllumee()) {
                return false;
            }
        }
    }
    return true;
}

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        int lignes = matriceCellules.length;
    int colonnes = matriceCellules[0].length;

    StringBuilder builder = new StringBuilder();

    // Afficher les indices de colonnes
    builder.append("  ");
    for (int i = 0; i < colonnes; i++) {
        builder.append(" " + i);
    }
    builder.append("\n");

    // Afficher la grille avec les indices de lignes
    for (int i = 0; i < lignes; i++) {
        builder.append(i + " ");
        for (int j = 0; j < colonnes; j++) {
            if (matriceCellules[i][j].estAllumee()) {
                builder.append(" X");
            } else {
                builder.append(" O");
            }
        }
        builder.append("\n");
    }

    return builder.toString();
}
}
