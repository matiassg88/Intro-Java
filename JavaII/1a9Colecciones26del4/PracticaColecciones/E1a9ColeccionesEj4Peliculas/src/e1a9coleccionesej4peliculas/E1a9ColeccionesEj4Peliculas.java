/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9coleccionesej4peliculas;

import java.util.Scanner;
import servicios.ServicioPelicula;

/**
 *
 * @author Aldana Hereñu
 */
public class E1a9ColeccionesEj4Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula peli = new ServicioPelicula();
        peli.guardarPelicula();
        peli.mostrarPelis();
        peli.listaOrdenadaAsc();
        peli.listaOrdenadaDes();
        peli.listaOrdenadaAutor();
        peli.listaOrdenadaTitulo();
    }
    
}
   