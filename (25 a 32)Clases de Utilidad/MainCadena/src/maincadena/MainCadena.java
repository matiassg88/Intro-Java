/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maincadena;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;


/**
 *
 * @author Aldana Hereñu
 */
public class MainCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CadenaServicio serv = new CadenaServicio();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
       //guardar frase
        System.out.println("ingrese frase");
        Cadena frase = new Cadena(sc.nextLine());
        //cuenta las vocales
        serv.mostrarVocales(frase);
        System.out.println(frase.toString());
        //invierte la frase
        serv.invertirFrase(frase);
        //busca letra y la contabiliza
        System.out.println("ingrese letra a contabilizar:");
        char letra=sc.next().charAt(0);
        serv.vecesRepetido(letra, frase);
        sc.nextLine();
        //comparar longitud de frase
        System.out.println("Ingrese una frase nueva para que sea comparada con la longitud de la anterior");
        serv.compararLongitud(sc.nextLine(), frase);
        //concatenar frase
        System.out.println("Ingrese una frase que se concatenara con la anterior");
        serv.unirFrase(sc.nextLine(), frase);
        //reemplazar vocal "a"
        System.out.println("ingrese un caracter que reemplazara a todas las letras A de la frase:");
        serv.reemplazar(sc.next().charAt(0), frase);
        sc.nextLine();
        //si contiene X letra
        System.out.println("Ingrese la letra que desea encontrar: ");
        boolean encontrar;
        encontrar=serv.contiene(sc.next().charAt(0), frase);
    }

}
