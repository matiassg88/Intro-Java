/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_2;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que averigüe si dos vectores de N 
        enteros son iguales (la comparación deberá detenerse en
        cuanto se detecte alguna diferencia entre los elementos).
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector:");
        boolean band=false;
        int dim = sc.nextInt();
        int[] vector = new int[dim];
        int[] vector2 = new int[dim];
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese el valor del vector 1 indice " + i);
            vector[i] = sc.nextInt();
            System.out.println("Ingrese el valor del vector 2 indice " + i);
            vector2[i] = sc.nextInt();
            if (vector[i]!=vector2[i]) {
                break;
            }
            

        }

    }
}
