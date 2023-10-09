/*
/* FRIEZ Elisa
/*TP0
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0;

import java.util.Scanner;

/**
 *
 * @author friez
 */
public class TP0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:\n" +
"1) add\n" +
"2) substract\n" +
"3) multiply\n" +
"4) divide\n" +
"5) modulo");
                   
        Scanner saisieUtilisateur = new Scanner(System.in);
        int op = saisieUtilisateur.nextInt();
        Scanner operateur = saisieUtilisateur;
            if ((op>5)||(op<1)){
                System.out.println("Veuillez choisir un opérateur (entre 1 et 5)");
                System.exit(0);}
       
        Scanner saisieUtilisateur1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float ent1 = saisieUtilisateur1.nextInt();
        Scanner operande1 = saisieUtilisateur1;
       
        Scanner saisieUtilisateur2 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        float ent2 = saisieUtilisateur2.nextInt();
        Scanner operande2 = saisieUtilisateur2;
       
        float result = 0;
        if (op == 1){
            result=ent1+ent2;
        }
        if (op == 2){  
            result=ent1-ent2;
        }
        if (op == 3){  
            result=ent1*ent2;
        }
        if (op == 4){  
            result=ent1/ent2;
        }
        if (op == 5){  
            result=ent1%ent2;
        }
       
        System.out.println("Le résultat est : "+result );

    }
   

    }
    
