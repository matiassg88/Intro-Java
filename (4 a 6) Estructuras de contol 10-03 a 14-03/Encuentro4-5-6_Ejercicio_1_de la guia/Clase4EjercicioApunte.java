/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4.ejercicio.apunte;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Clase4EjercicioApunte {

    /**
     * Implementar un programa que le pida dos números enteros al usuario y determine
     * si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero entero");
        num2 = leer.nextInt();
        
        if (num1 > 25 || num2 > 25){
            System.out.println("Uno de los numeros ingresados es mayor a 25");
           
        }
         else {System.out.println("Los numeros son menores a 25");
                    }
            
            
        
    }
    
}
