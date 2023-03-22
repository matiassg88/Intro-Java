/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra_3;

/**
 *
 * @author Aldana Hereñu
 */
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear una función rellene un vector con números aleatorios, 
        pasándole un arreglo por parámetro. Después haremos 
        otra función o procedimiento que imprima el vector.
        */
        int []vector =new int [6];
        relleno (vector);
        imprime (vector);
        
    }

    public static int [] relleno(int[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            vector [i] = (int) (Math.random()* 13 - 6);
            
        }
        return vector;
        
    }

    public static void imprime(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
    }
    
}
