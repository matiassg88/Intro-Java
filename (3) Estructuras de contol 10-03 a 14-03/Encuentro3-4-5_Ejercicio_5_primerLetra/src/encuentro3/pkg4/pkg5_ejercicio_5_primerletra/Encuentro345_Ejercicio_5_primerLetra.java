/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3.pkg4.pkg5_ejercicio_5_primerletra;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro345_Ejercicio_5_primerLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
         */
       Scanner dato = new Scanner (System.in);
        System.out.println("Ingrese un numero positvo que sea de limite: ");
        int lim = dato.nextInt();
        int suma=0;
        do {
            System.out.println("Ingrese un valor que sera sumado:");
            int num = dato.nextInt();
            suma = suma+num;
        } while (suma<lim);
        if (suma>lim){
            System.out.println("Supera límite");
        }
            
    }
    
}
