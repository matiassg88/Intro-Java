/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro3.pkg4.pkg5_ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class Encuentro345_Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
* * * *
*     *
*     *
* * * *
*/
        Scanner dato=new Scanner (System.in);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese cantidad de elementos");
        int num = leer.nextInt();
        
        for(int i=0;i<num;i++)
        {  
            for(int j=0;j<num;j++){
                if(i==0||i==(num-1)||j==0||j==(num-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
    }
}
    
    

