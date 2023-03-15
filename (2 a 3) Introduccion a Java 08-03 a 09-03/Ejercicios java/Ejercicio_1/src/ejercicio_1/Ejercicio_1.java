/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner resultado = new Scanner (System.in);
        
        System.out.println("Ingrese el numero 1");
        int num1 = resultado.nextInt();
        System.out.println("Ingrese el numero 2");
        int num2 = resultado.nextInt();
         int suma=num1+num2;
        System.out.println("El resultado de la suma de los dos numeros es: "+suma);
        // TODO code application logic here
    }
    
}
