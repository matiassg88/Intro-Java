/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9.pkg10.pkg11_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E91011_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
        donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
        Crear un programa que permita introducir un cuadrado por teclado y determine si 
        este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos 
        son correctos, es decir, están entre el 1 y el 9.
        */
        int dim, i=0, j=0;
        //preguntar lados
        Scanner sc=new Scanner (System.in);
        System.out.println("Elija lados: ");
        dim = sc.nextInt();
        int [][] matriz = new int [dim][dim];
        //elegir numero correctos
        for ( i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                System.out.println("número del 1 al 9 para guardar en posicion matriz ["+i+"]["+j+"]");
                do {
                    matriz[i][j] = sc.nextInt();
                } while (matriz[i][j] < 1 || matriz[i][j] > 9);

            }

        }

        
        int aux = 0;
        int aux2 = 0;
        boolean valid;
        for ( i = 0; i < dim; i++) {
        aux += matriz[i][i];
        }
        for ( i = 0; i < dim; i++) {
            for (j = 0; j < dim; j++) {
                aux2 += matriz[i][j];
            }
            if (aux2 != aux) {
                valid = false;
            } else {
                j = dim + 1;}
        }
    }
}// ejercicio6 rojo de pseint Terminar.