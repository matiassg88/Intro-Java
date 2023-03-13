/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3.pkg4.pkg5_ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro345_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.    */
        Scanner dato = new Scanner (System.in);
        System.out.println("Ingrese dos valores");
        int num1 = dato.nextInt();
        int num2 = dato.nextInt();
        int opc;
        char y='j';
       
        
        do {
            System.out.println("\tMenu. \n1-sumar. \n2-restar. \n3-multiplicar. \n4-dividir. \n5-salir.");
            opc = dato.nextInt();
            switch(opc){
                case 1:
                    System.out.println((num1+num2));
                    break;
                case 2:
                    System.out.println((num1-num2));
                    break;
                case 3:
                    System.out.println((num1*num2));
                    break;
                case 4:
                    System.out.println((float)((num1/num2)));
                    break;
                case 5:
                System.out.println("estas seguro que desea salir? \n S - si \n N - no");
                y = dato.next().charAt(0);   
                  break;
                
        }
        
        }while(opc!=5 || y!='s' );
    }
    
}
