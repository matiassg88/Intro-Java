/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e9arelacionesextra2;

import Servicios.ServicioCine;
import entidades.Cine;

/**

 */
public class E9aRelacionesExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cine cine =new Cine();
       ServicioCine SerCin = new ServicioCine();
       SerCin.mostrarEspectador();
       cine.mostrarSala();
        System.out.println("hoy: "+ SerCin.peliculas().getTitulo().toString());
        SerCin.ubicar(cine);
        cine.mostrarSala();
    
}

    }