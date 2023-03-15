/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3.pkg4.pkg5_ejercicio_3_lenght;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro345_Ejercicio_3_lenght {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
        */
        Scanner dato = new Scanner (System.in);
        System.out.println("Ingrese una palabre de 8 caracteres, no más ni menos: ");
        String word = dato.nextLine();
        int largo=word.length();
        if (largo==8){
            System.out.println("Correcto.");
        }else{
            System.out.println("Incorrecto.");
        }
    }
    
}
