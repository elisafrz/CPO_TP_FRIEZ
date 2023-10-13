/*
/* TD C
/*TP1 exo 1
/*26/09/2023
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_friez_cortes;

import java.util.Scanner;

/**
 *
 * @author friez
 */
public class TP1_manipNombresInt_FRIEZ_CORTES {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println(" Entrer un nombre :");
        int nb1 = sc.nextInt();
        System.out.println("\n Entrer un autre nombre :");
        int nb2 = sc.nextInt();
        System.out.println(""
                + "\n Somme : "+ (nb1+nb2)
                +"\n Difference : "+(nb1-nb2)+
                "\n Produit : "+(nb1*nb2)+
                "\n Quotient entier : "+(nb1/nb2)+
                "\n Reste par la division euclidienne : "+(nb1%nb2));
       
    }
}

