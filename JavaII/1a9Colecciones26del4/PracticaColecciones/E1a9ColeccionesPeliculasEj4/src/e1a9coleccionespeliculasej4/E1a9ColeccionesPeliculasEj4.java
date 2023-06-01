/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9coleccionespeliculasej4;

import java.util.Scanner;
import servicios.PeliculaService;

/**
 *
 * @author Aldana Hereñu
 */
public class E1a9ColeccionesPeliculasEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        PeliculaService peli = new PeliculaService();
        peli.guardarPelicula();
    }
    
}
