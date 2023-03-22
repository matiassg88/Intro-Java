/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e7.pkg8_ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E78_Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
         */

        //enviar la funcion dentro de do while !=NO
        String nombre = "";
        String res = "";
        int edad = 0;
        int i = 1;//parqa contar las cantidades de personas

        datos(nombre,res, edad, i);
    }

    public static void datos(String nombre, String res, int edad, int i) {
        Scanner dato = new Scanner(System.in);
        String mayorMenor;

        do {
            System.out.println("Ingrese el nombre la la persona " + i + ":");
            nombre = dato.next();
            System.out.println("Ingrese la edad de la persona " + i + ":");
            edad = dato.nextInt();

            if (edad >= 18) {
                mayorMenor = "(mayor)";
            } else {
                mayorMenor = "(menor)";
            }

            System.out.println("Persona " + i + ": nombre: " + nombre + ", edad: " + edad + " " + mayorMenor + "");

            System.out.println("¿Desa ingresar mas personas? si/no: ");
            res=dato.next();
            i++;
            /*if (!res.equalsIgnoreCase("no")){
             i++; 
             continue;
            }else break;
           */
            //res.toLowerCase(); //verif
            
        } while (!res.equalsIgnoreCase("no"));
        //en la funcion solicitar datos, 
//if >=18 "emayor" 
//imprimirlos ej persona 1 (mayor/menor), nombre,edad,
    }

}
