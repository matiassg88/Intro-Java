/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Aldana Hereñu
 */
public class Comparadores {
    public static Comparator <Pelicula> ordenAsc = new Comparator <Pelicula> (){
        @Override 
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getHoras().compareTo(p2.getHoras());            
        }
    };
    
    public static Comparator <Pelicula> ordenDes = new Comparator <Pelicula> (){
        @Override 
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getHoras().compareTo(p1.getHoras());            
        }
    };
    
     public static Comparator <Pelicula> ordenAlfAutor = new Comparator <Pelicula> (){
        @Override 
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getAutor().compareTo(p2.getAutor());            
        }
    };
       public static Comparator <Pelicula> ordenAlfTitulo = new Comparator <Pelicula> (){
        @Override 
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());            
        }
    };


}