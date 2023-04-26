/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e25a32ej3clasearrays;

import servicios.ArregloService;

/**
 *
 * @author Aldana Hereñu
 */
public class E25a32ej3ClaseArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArregloService arreglo=new ArregloService();
        double arrayA []=new double [50];
        double arrayB []=new double [20];
        arreglo.inicializarA(arrayA);
        arreglo.mostrar(arrayA);
        arreglo.ordenar(arrayA);
        arreglo.inicializarB(arrayA, arrayB);
    }
    
}
