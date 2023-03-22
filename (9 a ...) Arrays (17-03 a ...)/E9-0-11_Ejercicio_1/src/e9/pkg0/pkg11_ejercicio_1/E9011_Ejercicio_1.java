/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9.pkg0.pkg11_ejercicio_1;

/**
 *
 * @author Aldana Hereñu
 */
public class E9011_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    
        /*
        Realizar un algoritmo que llene un vector con los 100 primeros números
        enteros y los muestre por pantalla en orden descendente.
        */
        public static void main(String[] args) {
        int [] vector = new int [100];
        
        for (int i = 0; i < vector.length; i++) {
            vector [i]= i+1;
    }
        for (int i=vector.length-1; i>=0;i--){
            System.out.println(vector [i]);
        }
    
    }
    
}
