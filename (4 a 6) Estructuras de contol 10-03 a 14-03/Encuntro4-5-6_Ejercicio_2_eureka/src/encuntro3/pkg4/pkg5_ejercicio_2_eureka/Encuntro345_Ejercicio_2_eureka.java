/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuntro3.pkg4.pkg5_ejercicio_2_eureka;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuntro345_Ejercicio_2_eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
    */ Scanner dato = new Scanner (System.in);
        System.out.print("Ingrese la palabra secreta: ");
        String palabra = dato.next();
        if (palabra.equals("eureka")){
            System.out.println("Correcto.");  
        }else{System.out.println("Incorrecto.");}
    }
    
}
