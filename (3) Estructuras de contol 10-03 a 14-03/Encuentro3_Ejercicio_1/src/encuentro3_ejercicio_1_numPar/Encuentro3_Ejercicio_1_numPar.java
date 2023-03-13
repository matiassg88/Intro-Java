/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3_ejercicio_1_numPar;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro3_Ejercicio_1_numPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un número determine si es par o impar.
       Scanner dato = new Scanner (System.in);
        System.out.print("Ingrese un número entero:");
       int num = dato.nextInt();
       if (num%2==0){
           System.out.println("Has ingresado un número par.");
       }else{
           System.out.println("Has ingresado un numero impar.");}
    }
    
}
