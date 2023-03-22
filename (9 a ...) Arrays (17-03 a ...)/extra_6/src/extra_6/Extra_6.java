/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_6;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Extra_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        String [] [] matriz = new String [20] [20];
        String palabra;
        int fila;
        int [] vector = new int [5];
        int i, j;
        for (i=0; i<20; i++){
            for (j=0; j<20;j++){
            matriz [i] [j] = "*";    
        }
        }
        for ( i =0; i<5;i++){
            System.out.println("Ingrese una palabra para la posicion " + (i+1));
            palabra=leer.next();
            while (palabra.length()<3 || palabra.length()>5){
            System.out.println("Ingrese una palabra para la posicion " + (i+1));
            palabra=leer.next();
            } 
            fila = (int) (Math.random()*20);
            System.out.println(fila);
            vector [i]=fila;
            while (i>0 && fila==vector[i-1]){
            fila = (int) (Math.random()*20);
            }
            for ( j=0; j<palabra.length();j++){
                matriz [fila] [j] = palabra.substring(j, j+1);
                }
            }
        for (i=0; i<20; i++){
            for (j=0; j<20;j++){
            if (matriz [i] [j].equals("*")) {
                matriz [i] [j] = String.valueOf((int)(Math.random()*10));
            }    
        }
        }
        for (i=0;i<20;i++){
            for (j=0;j<20;j++){
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println("");
        }
    }
    
}
