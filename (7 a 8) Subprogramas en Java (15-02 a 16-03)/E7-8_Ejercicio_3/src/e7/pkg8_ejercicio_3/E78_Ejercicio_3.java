/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7.pkg8_ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E78_Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 "₤" libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 ¥ yenes es un 1 €
        */
        Scanner dato = new Scanner (System.in);
        float euro;
        String moneda;
        System.out.println("Ingrese la cantidad de euros (€) a cambiar: ");
        euro = dato.nextFloat();
        System.out.println("\tAhora eliga el tipo de moneda a cambiar escribiendo la palabra:\nLibra.\nDolar.\nYen.");
        moneda = dato.next();
        cambio (euro, moneda);
        
    }

    public static void cambio(float euro, String moneda) {
        
        switch (moneda.toLowerCase()){
            case ("libra"):System.out.println("A recibir ₤:"+(euro*0.86));
            break;
            case ("dolar"):System.out.println("A recibir $:"+(euro*1.2811));
            break;
            case ("yen"):System.out.println("A recibir ¥:"+(euro*129.852));
            break;
        }
        
    }
    
}
