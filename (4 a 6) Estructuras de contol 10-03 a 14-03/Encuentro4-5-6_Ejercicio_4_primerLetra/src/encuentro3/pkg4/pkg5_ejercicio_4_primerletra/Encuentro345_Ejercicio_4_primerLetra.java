/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3.pkg4.pkg5_ejercicio_4_primerletra;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro345_Ejercicio_4_primerLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java        
        */
        Scanner dato = new Scanner (System.in);
        System.out.println("Ingrese unA pAlAbrA vAlidA ;) ");
        String palabra = dato.nextLine();
        
        String car = palabra.substring(0,1);
      
        if (car.equals("A")){
            System.out.println("Correcto.");
        }else{System.out.println("Incorrecto.");}
        
        
    }

    private static char Substrings(String palabra, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
