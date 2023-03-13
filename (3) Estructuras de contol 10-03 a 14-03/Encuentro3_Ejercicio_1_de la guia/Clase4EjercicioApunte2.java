/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4.ejercicio.apunte.pkg2;

import java.util.Scanner;

/**
 *
 * @author berna
 */
public class Clase4EjercicioApunte2 {

    /**
     * Considera que estás desarrollando una web para una empresa que fabrica motores 
     * (suponemos que se trata del tipo de motor de una bomba para mover fluidos). 
     * Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. 
     * El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
     * @param args
     */
    public static void main(String[] args) {
        
        int tipoMotor;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor entre 1 y 4 para ver que tipo de motor tiene");
        
        tipoMotor = leer.nextInt();
        
        switch(tipoMotor){
            
            case 1: System.out.println("La bomba es una bomba de agua");
            break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3: System.out.println("La bomba es una bomba de hormigon");
            break;
            case 4: System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            
    
        }
        
    }
    
}
