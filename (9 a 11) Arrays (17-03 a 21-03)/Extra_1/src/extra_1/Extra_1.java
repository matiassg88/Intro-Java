/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_1;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un algoritmo que calcule la suma de todos los elementos 
        de un vector de tamaño N, con los valores ingresados por el usuario.

        */
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector:");
        int dim = sc.nextInt();
        int[] vector =new int [dim];
        int aux=0;
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese el valor del indice "+i);
            vector [i] = sc.nextInt();
            aux += vector [i];
        }
        System.out.println("La suma del vector es: "+ aux );
    }
    
    
}
