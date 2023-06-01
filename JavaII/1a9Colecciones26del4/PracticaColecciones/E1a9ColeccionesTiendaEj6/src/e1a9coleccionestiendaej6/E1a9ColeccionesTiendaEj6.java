/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9coleccionestiendaej6;

import servicios.ServicioTienda;

/**
 *
 * @author Aldana Hereñu
 */
public class E1a9ColeccionesTiendaEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
         */
        ServicioTienda nuevaEntrada = new ServicioTienda();
        nuevaEntrada.cargaDeProductos();
        nuevaEntrada.imprimirColeccion();
        nuevaEntrada.cargaDeProductos();
        nuevaEntrada.imprimirColeccion();
        nuevaEntrada.modificarPrecio();
        nuevaEntrada.imprimirColeccion();
        nuevaEntrada.cargaDeProductos();
        nuevaEntrada.seekAndDestroy();
        nuevaEntrada.imprimirColeccion();
    }
    
}


