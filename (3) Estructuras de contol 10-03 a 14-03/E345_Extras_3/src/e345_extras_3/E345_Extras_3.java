/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e345_extras_3;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E345_Extras_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
        */
        Scanner dato=new Scanner (System.in);
        System.out.println("Ingrese una letra: ");
        String letra = dato.nextLine();
        
        if ((letra.equalsIgnoreCase("a"))||(letra.equalsIgnoreCase("e"))||(letra.equalsIgnoreCase("i"))||(letra.equalsIgnoreCase("o"))||(letra.equalsIgnoreCase("u"))){
            System.out.println("Es vocal.");
        }else{
            System.out.println("No es vocal.");}
        }
        
    }