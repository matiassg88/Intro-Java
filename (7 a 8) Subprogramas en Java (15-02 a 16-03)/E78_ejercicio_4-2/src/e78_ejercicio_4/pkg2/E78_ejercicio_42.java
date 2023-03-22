/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e78_ejercicio_4.pkg2;

import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class E78_ejercicio_42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num = leer.nextInt();
        
        boolean result = primo(num);
        
        System.out.println(result);
    }
    
    public static boolean primo(int num) {
        boolean p;
        double div;
        int cdiv = 0;   
        
        for (int i = 1; i <= num; i++) {
            div = num%i;
            
            if(div == 0){
                cdiv++;
            }
        }
        if (cdiv > 2) {
        p = false;
        } else {
        p = true;
        }
        
        return p;
    }
}
    

