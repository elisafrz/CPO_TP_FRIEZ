/*
/* TD C
/* TP1 exo 2
/* 26/09/2023
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_friez_cortes;

import java.util.Scanner;

/**
 *
 * @author friez
 */
public class TP1_convertisseur_FRIEZ_CORTES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer une temperature reelle :");
        double val = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaiter effectuer : \n 1)De Celcius vers Kelvin \n 2)De Kelvin vers Celcius \n 3)De Farenheit vers Celcius \n 4)De Celcius vers Farenheit \n 5)De Kelvin vers Farenheit \n 6)De Farenheit vers Kelvin");
        int rep =sc.nextInt();
        if (rep==1){
            System.out.println(val+" degré Celcius est égal à"+CelciusVersKelvin(val)+" Kelvin");
        }
        else if (rep==2){
            System.out.println(val+" Kelvin est égal à"+KelvinVersCelcius(val)+" degré Celcius");
        }
        else if (rep==3){
            System.out.println(val+" degré Farenheit est égal à"+FarenheitVersCelcius(val)+" degré Celcius");
        }
        else if (rep==4){
            System.out.println(val+" degré Celcius est égal à"+CelciusVersFarenheit(val)+" degré Farenheit");
        }
        else if (rep==5){
            System.out.println(val+" Kelvin est égal à"+KelvinVersFarenheit(val)+" degré Farenheit");
        }
        else if (rep==6){
            System.out.println(val+" degré Farenheit est égal à"+FarenheitVersKelvin(val)+" Kelvin");
        }
    }
   
    public static double CelciusVersKelvin(double tCelcius){
        return (tCelcius+273.15);
    }
   
    public static double KelvinVersCelcius(double tKelvin){
        return (tKelvin-273.15);
    }
    public static double FarenheitVersCelcius(double tFarenheit){
        return ((5.0/9)*(tFarenheit-32));
    }
    public static double CelciusVersFarenheit(double tCelcius){
        return((1.8*tCelcius)+32);
    }
    public static double KelvinVersFarenheit(double tKelvin){
        return (CelciusVersFarenheit(KelvinVersCelcius(tKelvin)));
    }
    public static double FarenheitVersKelvin(double tFarenheit){
        return (CelciusVersKelvin(FarenheitVersCelcius(tFarenheit)));
    }
}
