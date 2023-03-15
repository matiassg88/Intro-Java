/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.de.la.guia;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class DeLaGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique 
la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
        */
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase, terminando en un punto");
        String entrada = leer.nextLine();
        String salida = codificarFrase(entrada);
        System.out.println("La frase codificada es "+salida);
    }
    
    public static String codificarFrase(String entrada){
        String[] vector; //Crear un vector para guardar la palabra
        vector= new String [entrada.length()]; //Tiene el tamaño de la cantidad de carácteres
        
        int aux1=0; //auxiliares para hacer substring
        int aux2=1; //auxiliares para hacer substring
        String palabra="";
        //Guardar cada letra de la palabra en cada posición del vector
        for (int i=0; i<entrada.length(); i++) {  //hola: 0-3 porque debe ser menor a 4.
            vector[i]=entrada.substring(aux1,aux2); //Guarda pos 0 del vector con substring 0,1(es decir primer letra)
            aux1++;
            aux2++;
        }
        
        for (int j=0; j<entrada.length(); j++) {
            //si en una posición hay una vocal, la reemplaza
            switch (vector[j]) {
                case "a":
                    vector[j]= "@";
                    break;
                case "e":
                    vector[j]= "#";
                    break;
                case "i":
                    vector[j]= "$";
                    break;
                case "o":
                    vector[j]= "%";
                    break;
                case "u":
                    vector[j]= "*";
                    break;
            }
            palabra=palabra+vector[j]; //palabra estuvo inicializada en vacio; concatenamos lo que haya en el vector
        }
        return palabra; //Devuelve lo que concatenó
    }
}