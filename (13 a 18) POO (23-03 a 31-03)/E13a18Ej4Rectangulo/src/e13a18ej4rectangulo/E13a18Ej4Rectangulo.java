
package e13a18ej4rectangulo;

import java.util.Scanner;
import modelador.Rectangulo;


public class E13a18Ej4Rectangulo {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Rectangulo rc = new Rectangulo();
        
        System.out.println("Ingrese los datos para crear un rectangulo.");
        System.out.println("Base: ");
        rc.setBase(sc.nextInt());
        System.out.println("Altura: ");
        rc.setAltura(sc.nextInt());
        System.out.println(rc.toString());
        System.out.println("Perimetro del rectangulo: "+rc.calcuPer()+"\nSuperficie del rectangulo: "+rc.calcuSup()+"\nRectangulo:\n"/*+*/);
        rc.modelRect();
    }
    
}
