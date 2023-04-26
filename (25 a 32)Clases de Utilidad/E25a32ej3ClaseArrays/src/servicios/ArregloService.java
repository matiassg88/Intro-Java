/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author Aldana Hereñu
 */
public class ArregloService {
    /*Método inicializarA recibe un arreglo por parámetro y 
    lo inicializa con números aleatorios.*/
    
    public double [] inicializarA (double arrayA[]){
        
        for (int i = 0; i < 50; i++) {
            arrayA[i]=Math.random()*100;
        }
        return arrayA;
        
    }

    /*Método mostrar recibe un arreglo por parámetro y
    lo muestra por pantalla.*/
    public void mostrar(double arrayA[]) {
        for (int i = 0; i < 50; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("");
    }

    /*Método ordenar recibe un arreglo por parámetro y
    lo ordena de mayor a menor.*/
    public void ordenar(double arrayA[]) {
        double arreglox[] = new double[50];
        //sort ordena de menor a mayor
        Arrays.sort(arrayA);
        //Arrays.sort(arrayA, Collections.reverseOrder());
        //creo un nuevo arreglo auxiliar para luego reemplazar los del original.

        for (int i = 0; i < 50; i++) {
            arreglox[i] = arrayA[i];
        }

        int j = 49;

        for (int i = 0; i < 50; i++) {
            arrayA[i] = arreglox[j];
            j--;
        }

        mostrar(arrayA);
        //System.out.println(Arrays.toString(arrayA));

    }

    /*Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     */
    public void inicializarB(double arrayA[], double arrayB[]) {

        for (int i = 0; i < 10; i++) {
            arrayB[i] = arrayA[i];
        }
        
        Arrays.fill(arrayB, 10, 20, 0.5);

        System.out.println(Arrays.toString(arrayB));
    }

}

