/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e19a24ej2cafetera;

import cafeterasServicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E19a24Ej2Cafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        CafeteraServicio cafe = new CafeteraServicio();
        int num;
             
        do {
            System.out.println("\t Cafetería agua sucia\n\t\tBienvenido \nQue desea hacer? \n1.llenar cafetera \n2.servir taza. \n3.vaciar cafetera. \n4.agregar café.\n0.salir");
            num=sc.nextInt();
            switch (num) {
                case 1 -> cafe.llenarCafetera();
                case 2 -> {
                    int taza;
                    System.out.println("Ingrese el tamaño de la taza: ");
                    taza = sc.nextInt();
                    cafe.servirTaza(taza);
                }
                case 3 -> cafe.vaciarCafetera();
                case 4 -> {
                    int addCafe;
                    System.out.println("¿Cuánto cafe agregará? tenga en cuenta a capacidad maxima de la cafetera ;)");
                    addCafe = sc.nextInt();
                    cafe.agregarCafe(addCafe);
                }
                case 0 -> {
                }
                default -> throw new AssertionError();
            }
        } while (num!=0);
    }
}
