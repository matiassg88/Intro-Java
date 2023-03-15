/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.de.la.guia;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class DeLaGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea un procedimiento EsMultiplo que reciba 
        los dos números pasados por el usuario, validando que 
        el primer número múltiplo del segundo e imprima si el primer 
        número es múltiplo del segundo, sino informe que no lo son
        */
        Scanner dato = new Scanner (System.in);
        System.out.println("Ingrese dos número: ");
        int num1 = dato.nextInt();
        int num2 = dato.nextInt();
        int resultado = esMultiplo(num1,num2);
        
        if ( resultado == 0){
            System.out.println(num1+" es multiplo de "+num2);
        }else { 
            System.out.println(num1+" No es multiplo de "+num2);}
        }

    public static int esMultiplo(int num1, int num2) {
        
       int res = num1 % num2;
       
    return res;}
        }