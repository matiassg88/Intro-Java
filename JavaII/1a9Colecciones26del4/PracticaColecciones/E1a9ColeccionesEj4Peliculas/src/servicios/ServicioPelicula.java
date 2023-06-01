/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Aldana Hereñu
 */
public class ServicioPelicula {
    private Scanner sc = new Scanner(System.in);
    private Pelicula pelicula= new Pelicula();
    private List <Pelicula> listaDePeliculas= new ArrayList();
    
    public void guardarPelicula() {
        char res;
        do {

            System.out.println("Ingresá el título:");
            pelicula.setTitulo(sc.nextLine());
            System.out.println("Poné de quién:");
            pelicula.setAutor(sc.nextLine());
            System.out.println("¿Cuánto dura?\nDecilo en minutos:");
            pelicula.setHoras(sc.nextInt());
            System.out.println(pelicula.toString());
            System.out.println("¿queres meter otra peli? S/N");
            sc.nextLine();
            res = sc.nextLine().charAt(0);
            listaDePeliculas.add(new Pelicula(pelicula.getTitulo(), pelicula.getAutor(), pelicula.getHoras()));

        } while (res != 'n' && res == 's');

    }
    public void mostrarPelis (){
         System.out.println("-------------LISTA DE PELIS--------------");
        for (Pelicula listaDePelicula : listaDePeliculas) {
            
            System.out.println("----------------------"+"\nTítulo: "+listaDePelicula.getTitulo()+"."+"\nAutor: "+listaDePelicula.getAutor()+"."+"\nDuracion: "+listaDePelicula.getHoras().toString()+" minutos.");
        }
        
    }
    public void masDeUnaHora (){
        //TODO mostrar las de mayor duracion
    }
    
    public void listaOrdenadaAsc (){
        
        Collections.sort(listaDePeliculas, Comparadores.ordenAsc);
        System.out.println("--------ORDEN ASCENDENTE POR TIEMPO---------");
        for (Pelicula listaDePelicula : listaDePeliculas) {
            
            System.out.println("----------------------"+"\nTítulo: "+listaDePelicula.getTitulo()+"."+"\nAutor: "+listaDePelicula.getAutor()+"."+"\nDuracion: "+listaDePelicula.getHoras().toString()+" minutos.");
        }
        
        
        
    }
    public void listaOrdenadaDes (){
        Collections.sort(listaDePeliculas, Comparadores.ordenDes);
        System.out.println("--------ORDEN DESCENDENTE POR TIEMPO---------");
        for (Pelicula listaDePelicula : listaDePeliculas) {
            
            System.out.println("----------------------"+"\nTítulo: "+listaDePelicula.getTitulo()+"."+"\nAutor: "+listaDePelicula.getAutor()+"."+"\nDuracion: "+listaDePelicula.getHoras().toString()+" minutos.");
        }
    }
    
    public void listaOrdenadaAutor (){
        Collections.sort(listaDePeliculas, Comparadores.ordenAlfAutor);
        System.out.println("--------ORDEN ALFABETICO POR AUTOR---------");
        for (Pelicula listaDePelicula : listaDePeliculas) {
            
            System.out.println("----------------------"+"\nTítulo: "+listaDePelicula.getTitulo()+"."+"\nAutor: "+listaDePelicula.getAutor()+"."+"\nDuracion: "+listaDePelicula.getHoras().toString()+" minutos.");
        }
    }
    public void listaOrdenadaTitulo (){
        Collections.sort(listaDePeliculas, Comparadores.ordenAlfTitulo);
        System.out.println("--------ORDEN ALFABETICO POR TÍTULO---------");
        for (Pelicula listaDePelicula : listaDePeliculas) {
            
            System.out.println("----------------------"+"\nTítulo: "+listaDePelicula.getTitulo()+"."+"\nAutor: "+listaDePelicula.getAutor()+"."+"\nDuracion: "+listaDePelicula.getHoras().toString()+" minutos.");
        }
    }
}
