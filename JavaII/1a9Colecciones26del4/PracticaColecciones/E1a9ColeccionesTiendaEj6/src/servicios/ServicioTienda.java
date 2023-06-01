/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.Scanner;
import entidades.Tienda;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aldana Hereñu
 */
public class ServicioTienda {

    private Scanner sc;
    private Tienda tienda;
    private HashMap<String, Tienda> productos;

    //esta es una muy buena practica
    public ServicioTienda() {
        this.tienda = new Tienda();
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap<>();
    }

    public void cargaDeProductos() {
        System.out.println("---------CARGA DE PRODUCTO---------");
        System.out.println("Ingrese producto:");
        String producto = sc.next();
        producto = producto.toUpperCase();

        System.out.println("ingrese precio:");
        double precio = sc.nextDouble();

        productos.put(producto, new Tienda(producto, precio));
    }

    public void modificarPrecio() {
        System.out.println("---------MODIFICADOR DE PRECIO---------");
        System.out.println("modificar precio. Ingrese un producto. ");
        String modif = sc.next();
        modif = modif.toUpperCase();
        System.out.println("Ingrese nuevo valor");
        double precio = sc.nextDouble();

        productos.put(modif, new Tienda(modif, precio));

    }

    public void seekAndDestroy() {
        System.out.println("---------SEEK & DESTROY---------");
        System.out.println("Ingrese un producto a eliminar");
        String eliminar = sc.next();
        
        productos.remove(eliminar.toUpperCase());

    }

    public void imprimirColeccion() {

        System.out.println("---------IMPRIMIR COLECCION---------");
        for (Map.Entry<String, Tienda> entry : productos.entrySet()) {
           Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("prod." + key + ",Prod. y precio:" + val.toString());
        }
    }
}
