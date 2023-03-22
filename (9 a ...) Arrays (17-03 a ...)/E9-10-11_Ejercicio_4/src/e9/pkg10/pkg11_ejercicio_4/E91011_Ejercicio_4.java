/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9.pkg10.pkg11_ejercicio_4;

/**
 *
 * @author Aldana Hereñu
 */
public class E91011_Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
        */
        int[][] matriz1 = new int [4][4];
        int[][] matriz2 = new int [4][4];
        System.out.println("Matriz original.");
        for (int i = 0; i < 4; i++) {
        for (int j =0 ; j < 4; j++){
                matriz1[i][j] = (int) (Math.random() * 100);
                System.out.print( matriz1[i][j]+" ");
            }
         System.out.println(" ");
        }
        System.out.println("Matriz traspuesta.");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = matriz1[j][i];
                System.out.print( matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
        
    }

}
