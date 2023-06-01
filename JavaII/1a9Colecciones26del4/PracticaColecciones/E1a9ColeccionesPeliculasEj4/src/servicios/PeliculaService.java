/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Peliculas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class PeliculaService {
    private Scanner sc = new Scanner(System.in);
    private Peliculas pelicula= new Peliculas();
    private ArrayList <Peliculas> listaDePeliculas= new ArrayList();

//    public PeliculaService() {
//    }
    
    
    
    public void guardarPelicula (){
        System.out.println("Ingrese el nombre de la pelicula: ");
        pelicula.setTitulo(sc.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
        pelicula.setAutor(sc.nextLine());
        System.out.println("Ingrese la duración. \nHoras: ");
        int [] horas = new int [2];
        horas[0]=sc.nextInt();
        System.out.println("Minutos:");
        horas[1]=sc.nextInt();
        pelicula.setHoras(horas);
        
    }
}
