/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner resultado = new Scanner (System.in);
        
        System.out.println("Ingrese la calor: ");
        int c = resultado.nextInt();
        
        int f = 32 + (9*c/5);
        System.out.println("Los calor ingresada en Centidrados y pasada a Farenheit es: "+f);
        // TODO code application logic here
    }
    
}
