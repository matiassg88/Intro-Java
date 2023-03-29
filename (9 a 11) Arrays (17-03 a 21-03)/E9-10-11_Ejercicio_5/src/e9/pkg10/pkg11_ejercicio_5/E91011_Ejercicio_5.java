/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e9.pkg10.pkg11_ejercicio_5;

/**
 *
 * @author Aldana Hereñu
 */
public class E91011_Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica.
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
        traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
        La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
        sus filas por columnas (o viceversa)
         */
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matriz2Inv = new int[4][4];
        System.out.println("Matriz original.");
        for (int i = 0; i < 4; i++) {//se genera una matriz con aleatorios entre -10y10 y se imprime
            for (int j = 0; j < 4; j++) {
                matriz1[i][j] = (int) (Math.random() * 3 - 1);//el primer num indica el rango-1(de 0 a 21) y el segungo mueve el cero hacia la derecha sin contar el mismo
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Traspuesta invertida");
        for (int i = 0; i < 4; i++) {                //se obtiene la traspuesta cambiada de signo
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = matriz1[j][i];      //o se le cambia el signo a matriz 1 y listo
                matriz2Inv[i][j]= -matriz2[i][j];   
                System.out.print(matriz2Inv[i][j] + " ");//System.out.print( -(matriz2[i][j])+" "); orta forma
            }
            System.out.println(" ");
        }
        //Si es anti
        //funcion vacia para coorroborar antisimetrica
         siEsAnti(matriz1, matriz2);
    }

    public static void siEsAnti(int[][] matriz1, int[][] matriz2Inv) {
     int k = 0;
       
     for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz1[i][j] == -matriz2Inv[i][j]) {//se vuelven a invertir los signos para que el operador "==" devuelva verdadero.
                    k++;
                }
            }
        }
        if (k == 16) {
            System.out.println("Es antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }
    }
}
