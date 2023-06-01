/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobrarelaciones;

import entidades.Equipo;
import entidades.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class ManosALaObraRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res;
        Equipo nuevoEquipo=new Equipo();
        do {
            System.out.println("ingrese nombre de jugador.");
            String nombre = sc.next();
            System.out.println("apellido");
            String apellido = sc.next();
            System.out.println("posicion");
            String pos=sc.next();
            System.out.println("numero");
            byte num=sc.nextByte();
            System.out.println("otro?si/no");
            res= sc.next();
            nuevoEquipo.setJugador(new Jugador(nombre, apellido, pos, num));
        } while (res.equalsIgnoreCase("si"));
        mostrar(nuevoEquipo);
    }
    public static void mostrar (Equipo nuevoEquipo){
        System.out.println(nuevoEquipo.toString());
    }
    
}
