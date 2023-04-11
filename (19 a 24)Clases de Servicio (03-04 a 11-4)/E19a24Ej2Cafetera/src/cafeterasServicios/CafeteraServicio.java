/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafeterasServicios;

import cafeterasEntidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class CafeteraServicio {
    Cafetera cafe= new Cafetera ();
    Scanner sc = new Scanner(System.in);
public void llenarCafetera (){
    cafe.setCantidadActual(cafe.getCapacidadMaxima());
    System.out.println("Cafetera llena.");
}
public void servirTaza (int taza){
   int lqQ;//variable para guardar "lo que queda" en la cafetera.
    cafe.setCantidadActual(cafe.getCantidadActual()-taza);
   // System.out.println(""+cafe.getCantidadActual());
    if (cafe.getCantidadActual()<0) {
        /*siendo que cantAct es menor que cero 
        al sumarle el valor de la taza quedara disponible lo que queda*/
        lqQ=cafe.getCantidadActual()+taza;
        System.out.println("se le servirá: "+lqQ+" le quedan: " +(taza-lqQ)+" disponible en la taza");
        System.out.println("Cafetera Vacía.");
        }else if (cafe.getCantidadActual()==0) {
        System.out.println("Taza llena.\nCafetera Vacía.");
    }else System.out.println("Taza lena");
    
}
public void vaciarCafetera(){
    cafe.setCantidadActual(0);
    System.out.println("Cafetera vacia.");
}
public void agregarCafe(int addCafe) {

        cafe.setCantidadActual(cafe.getCantidadActual() + addCafe);
        if (cafe.getCantidadActual() > cafe.getCapacidadMaxima()) {
            System.out.println("La cafetera esta rebalsando de café, usted perdió: " + (addCafe = cafe.getCantidadActual() - cafe.getCapacidadMaxima()) + " café");
        }
        llenarCafetera();
        System.out.println("Cafetera llena.");
    }
}
