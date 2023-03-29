/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13a18ex1cancion;

import Canciones.Cancion;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E13a18Ex1Cancion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
         */
        String res;
        Scanner sc = new Scanner(System.in);
        Cancion song = new Cancion("titulo", "autor");//no solo seteando se puede guardar un valor en un atributo privado
        System.out.println(song.toString());

        do {
            System.out.println("¿Ingrese un nuevo titulo: ");
            song.setTitulo(sc.nextLine());
            System.out.println("¿ingrese un nuevo autor: ");
            song.setAutor(sc.nextLine());
            System.out.println(song.toString());
            System.out.println("¿Desea ingresar otra? s/n: ");
            res = sc.next();
            res = res.toLowerCase();
        } while (res.equals("s"));

    }

}
