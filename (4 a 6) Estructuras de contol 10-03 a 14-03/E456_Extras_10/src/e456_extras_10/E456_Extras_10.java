/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e456_extras_10;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E456_Extras_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner dato=new Scanner (System.in);
        int num1;
        int num2;
        num1 = (int) (Math.random()*11);
        num2 = (int) (Math.random()*11);
        int res = num1*num2;
        int datoTec;
        System.out.println("Adivine el resultado de  la suma de dos numeros aleatoriose ntre el 0 y 10: ");
        datoTec = dato.nextInt();
        if (datoTec==res){
            System.out.println("Correcto");
        }else System.out.println("Incorrecto");
    }
    
}
