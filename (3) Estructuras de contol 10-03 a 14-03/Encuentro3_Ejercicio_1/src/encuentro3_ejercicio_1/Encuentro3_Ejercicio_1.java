/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro3_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        Scanner teclado = new Scanner (System.in);
        System.out.println("ingese una nota entre 0 y 10:");
        nota = teclado.nextInt();
        
        while (nota>10 || nota<0){
            System.out.println("ingese una nota entre 0 y 10:");
            nota = teclado.nextInt();
            continue;
        }
            System.out.println("La nota ingresada esta entre 0 o 10");
        // TODO code application logic here
    }
    
}
