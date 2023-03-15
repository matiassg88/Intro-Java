/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner resultado = new Scanner (System.in);
        
        System.out.println("Ingrese un número y vemos que pasa: ");
        int num = resultado.nextInt();
        double nRaizC = Math.sqrt(num);
        int doble = num*2;
        int trible = num*3;
        System.out.println("El doble del numero ingressado es: "+doble+", el triple: "+trible+", y la raiz cuadrada es: "+nRaizC);
        // TODO code application logic here
    }
    
}
