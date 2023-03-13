/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;
//aqui se importan las clases para utilizar en el programa
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


/**
 *
 * @author Aldana Hereñu
 */
public class Ejercicio_3 {
//ksfgailhgfhadbfg
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese su frase: ");
        Scanner texto = new Scanner (System.in).useDelimiter("\n");
        String frase= texto.next ();//
        System.out.println("La frase ingrsado es: "+frase);
       
        String frasem = toLowerCase(frase);
        System.out.println("En mayusculas: "+ frase.toUpperCase());//esta es otra forma sin la necesidad de importar la clase
        System.out.println("En mayusculas: "+frasem);
        // TODO code application logic here
    }
    
}
