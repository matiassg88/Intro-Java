/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cadena;

/**
 *
 * @author Aldana Hereñu
 */
public class CadenaServicio {

    public void mostrarVocales(Cadena frase) {
        int aux = 0;
        char letra;
        for (int i = 0; i < frase.getLongitud(); i++) {
            letra=frase.getFrase().charAt(i);
            if (letra=='a'|| letra=='e' || letra=='i'|| letra=='o'|| letra=='u') {
                aux++;
            }
        }
        System.out.println("Existen " + aux + " vocales en su frase.");
        System.out.println(frase.toString()+"2");
        /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.*/
    }

    public void invertirFrase(Cadena frase) {
        
        int aux = frase.getLongitud();
        for (int i = aux-1; i >= 0 ; i--) {
            System.out.print(frase.getFrase().charAt(i));    
        }
        System.out.println("");
        /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
        Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    }

    public void vecesRepetido(char letra, Cadena frase) {
        int aux = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i)==letra) {
                aux++;
            }
        }
        System.out.println("Existen " + aux + " vocales "+letra);
       
        /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
        y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    }

    public void compararLongitud(String frase, Cadena fraseO) {
        
        if (frase.length()==fraseO.getLongitud()) {
            System.out.println("Son del mismo largo");
        }else System.out.println("no coinciden en longitud");
        
        /*Método compararLongitud(String frase), deberá comparar la longitud de la frase 
        que compone la clase con otra nueva frase ingresada por el usuario.*/
    }

    public void unirFrase(String frase, Cadena fraseO) {
        
        System.out.println(fraseO.getFrase()+" "+frase);
        /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    }

    public void reemplazar(char letra, Cadena frase) {
        
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i)=='a') {
                System.out.print(letra);
                continue;
            }
            System.out.print(frase.getFrase().charAt(i));
        }
        System.out.println("");
        /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
        por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    }

    public boolean contiene(char letra, Cadena frase) {
        int aux=0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().charAt(i)==letra) {
                aux++;
                break;
            }
        }
        return 1==aux;
    }
}
