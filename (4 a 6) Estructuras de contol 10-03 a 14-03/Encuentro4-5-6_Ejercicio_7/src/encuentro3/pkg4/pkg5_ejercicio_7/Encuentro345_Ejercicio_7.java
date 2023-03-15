/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3.pkg4.pkg5_ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro345_Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String cad;
        int contPos=0,contNeg=0;
        
       
        do{
        System.out.println("ingrese un palabra de 5 letras, inicio X y fin O");
        cad = leer.nextLine();
        
        if(cad.length()==5&&cad.startsWith("X")==true&&cad.endsWith("O")==true)
        {
            contPos++;
        }else
        {
            contNeg++;
        }
        
        }while(!cad.equals("&&&&&"));
        
                
        System.out.println("cantidad de palabras correctas " + contPos +"\ncantidad de palabras negativas "+ (contNeg-1));
        
    }
    
}