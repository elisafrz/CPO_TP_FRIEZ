/*
/* TD C
/* TP 1 exo 4
/* 03/10/2023
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_friez_cortes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author friez
 */
public class TP1_stats_FRIEZ_CORTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] tab = new int [6];
        int m, nb;
        String tab2="[";
        Random generateurAleat = new Random();
       
       
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer un nombre m:");
        m=sc.nextInt();
        for (int i=1;i<m;i++){
            nb = generateurAleat.nextInt(6);
            ++tab[nb];
        }
        for (int i=0;i<tab.length;i++){
            if (i==tab.length-1){
                tab2+=(tab[i]/(double)m);
            }
            else{
                tab2+= (tab[i]/(double)m)+" ; ";
            }
        }
        tab2+="]";
        System.out.print(tab2);
    }
   
}
