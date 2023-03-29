/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e13a18ej2.circunferencia;

import entidad.Circunferencia;
import java.util.Scanner;

public class E13a18Ej2Circunferencia {

    public static void main(String[] args) {
        String res;
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Para crear una circunferencia pimero ingrese el valor del radio: ");
            Circunferencia circu = new Circunferencia();//crea objeto circunferencia;
            crearCircunferencia(sc, circu);//envia parametros al metodo
            System.out.println("\rIngrese una accion que desee realizar:\n(1)Calcular area.\n(2)Calcular perímetro.");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    area(circu);
                    break;
                case 2:
                    perimetro(circu);
                    break;
            }
            System.out.println("¿Desea crear otra circunferencia? s/n: ");
            res = sc.next();
            res = res.toLowerCase();
        } while (res.equals("s"));
    }

    public static void crearCircunferencia(Scanner sc, Circunferencia circu) {//envia el valor ingresado por Set
        
        System.out.println("Ingrese el radio:");
        
        circu.setRadio(sc.nextDouble());
        System.out.println(circu.toString());
    }

    public static void area(Circunferencia circu) {
        double area;
        double rad = circu.getRadio();//obtiene el valor del radio de la clase
        area = Math.pow((Math.PI) * rad , 2);
        System.out.println("El área calculada fue de: "+area);
         
    }

    public static void perimetro(Circunferencia circu) {
        double peri;
        
        peri = (2 * Math.PI * circu.getRadio());//otra forma de usar el valor del radio sin guardarlo en otra variable
        System.out.println("El perímertro calculado fue de: "+peri);
    }

}
