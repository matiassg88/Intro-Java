/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7.pkg8_ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E78_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una aplicación que le pida dos números al usuario
        y este pueda elegir entre sumar, restar, multiplicar y dividir. 
        La aplicación debe tener una función para cada operación matemática y 
        deben devolver sus resultados para imprimirlos en el main. 
         */
        Scanner dato = new Scanner(System.in);
        int num1;
        int num2;
        int resultado = 0;
        System.out.println("Ingrese dos numeros: ");
        num1 = dato.nextInt();
        num2 = dato.nextInt();
        System.out.println("\t¿Que operacion desea realizar?\nIngrese un valor numerico:\n1.Sumar.\n2.restar.\n3.multiplicar.\n4.Dividir.");
        int caso = dato.nextInt();
        switch (caso) {
            case 1:
                resultado = suma(num1, num2);
                System.out.println(resultado);
                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.println(resultado);
                break;
            case 3:
                resultado = multi(num1, num2);
                System.out.println(resultado);
                break;
            case 4:
                float resu = (float)(div(num1, num2));
                System.out.println(resu);
                break;
        }
    }

    public static int suma(int num1, int num2) {
        int res;
        res = num1 + num2;
        return res;
    }

    public static int resta(int num1, int num2) {
        int res;
        res = num1 - num2;
        return res;
    }

    public static int multi(int num1, int num2) {
        int res;
        res = num1 * num2;
        return res;
    }

    public static float div(float num1, float num2) {
        float res;
        res = num1 / num2;
        return res;
    }

}
