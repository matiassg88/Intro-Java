/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9colecionesrazasperrosej1;

import java.util.Scanner;
import servicios.PerroService;

/**
 *
 * @author Aldana Hereñu
 */
public class E1a9ColecionesEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PerroService listaRazas=new PerroService();
        String res;
        
      
        do {
             
        System.out.println("ingrese una raza para añadir a la lista: ");
        listaRazas.añadirRaza();
            System.out.println("¿Desea añadir otra? S/N: ");
            res=sc.nextLine();
        } while (!res.equalsIgnoreCase("n"));
         listaRazas.mostrarLista();
         
        System.out.println("Ingrese el nombre de la raza que quiere eliminar: ");
        listaRazas.bucarEliminar(sc.nextLine());
        
        listaRazas.mostrarLista();
    }
    
    
    
}
