/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3_extras_1;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E3_Extras_1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        /* Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        Scanner leer= new Scanner (System.in);
int min;
int hr;
int dia;
        System.out.println("Ingrese el tiempo en minutos:");
        min= leer.nextInt();
       
        dia= min/1440;
        System.out.println("Equivalen a "+ dia + " Días");
         hr= (min%1440)/60;
        System.out.println("Equivalen a "+ hr + " Horas");
    }
    
}