/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13a18ejercicio1_libro;

import java.util.Scanner;
import libreria.Libro;

/**
 *
 * @author Aldana Hereñu
 */
public class E13a18Ejercicio1_Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Libro book = new Libro();
        System.out.println("Ingrese un nuevo libro.");
        System.out.println("ISBN");
        book.ISBN = sc.nextInt();
        System.out.println("Páginas:");
        book.paginas = sc.nextInt();
        System.out.println("Autor:");
        book.autor = sc.next();
        System.out.println("Título");
        book.titulo = sc.next();
        System.out.println(book);
    }

}
