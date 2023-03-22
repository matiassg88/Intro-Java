/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro9.pkg10.pkg11_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro91011_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
         */
        Scanner sc = new Scanner(System.in);
        int dim;
int j = 0;
int k = 0;
int l = 0;
int a = 0;
int s = 0;
        System.out.println("Ingrese un valor: ");
        dim = sc.nextInt();
        int[] vector = new int[dim];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 10) {
                
                j++;
            } else if (vector[i] >= 10 && vector[i] < 100)
            {
                
                k++;
            }
            else if (vector[i] >= 100 && vector[i] < 1000)
            {
                
                l++;
            }
            else if (vector[i] >= 1000 && vector[i] < 10000)
            {
                
                a++;
            }
            else if (vector[i] >= 10000 && vector[i] < 100000)
            {
                
                s++;
            }
        }
        System.out.println("En el vector hay: \n" +j+ " numeros de un digito. \n"+k+" numeros de dos digitos. \n"+l+" numeros de tres digitos.\n"+a+" numeros de cuatro digitos \n"+s+" numeros de cinco digitos, Fin.");
    }
}

