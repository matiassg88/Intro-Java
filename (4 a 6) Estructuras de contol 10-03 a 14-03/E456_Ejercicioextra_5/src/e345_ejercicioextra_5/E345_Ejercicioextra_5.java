/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e345_ejercicioextra_5;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E345_Ejercicioextra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
         */
        Scanner dato = new Scanner(System.in);
        float desc;
        int tratDesc;
        System.out.println("¿Que tipo de socio es? 'A', 'B' o 'C', ingrese un valor: ");
        String socio = dato.next();
        
        switch (socio.toUpperCase()) {//toUpperCase para modificar el "estado" de la variable ingresada
            case "A":
                System.out.println("Ingrese el valor neto del tratamiento: ");
                tratDesc = dato.nextInt();
                desc = (float) (tratDesc * 0.5);
                System.out.println("El importe con descuento es: $" + desc);
                break;
            case "B":
                System.out.println("Ingrese el valor neto del tratamiento: ");
                tratDesc = dato.nextInt();
                desc = (float) (tratDesc * 0.65);
                System.out.println("El importe con descuento es: $" + desc);
                break;
            case "C":
                System.out.println("Ingrese el valor neto del tratamiento: ");
                tratDesc = dato.nextInt();
                
                System.out.println("El importe con descuento es: $" + tratDesc);
        }
    }

}
