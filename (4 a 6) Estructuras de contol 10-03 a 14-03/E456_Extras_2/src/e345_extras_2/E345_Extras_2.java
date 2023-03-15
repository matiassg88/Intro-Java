/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e345_extras_2;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E345_Extras_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner leer = new Scanner(System.in);
        String cad;
        int contPos=0,contNeg=0;
        
       boolean verdad=true;
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
        if (cad.equals("&&&&&")){
       break;}
        }while(verdad=true);
        
                
        System.out.println("cantidad de palabras correctas " + contPos +"\ncantidad de palabras incorrectas "+ (contNeg-1));
        
    }
    
}