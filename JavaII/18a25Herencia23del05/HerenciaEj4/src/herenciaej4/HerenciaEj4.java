/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaej4;

import entidades.Circulo;
import entidades.Geometria;
import entidades.Rectangulo;

/**
 *
 * @author Aldana Hereñu
 */
public class HerenciaEj4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
     Geometria circulo1 = new Circulo(2.5, 5.0);
     Geometria rectangulo1 = new Rectangulo(2.5, 5.0);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        System.out.println("<><><><><><><><><><><><><><><>");
        System.out.println("Area del circulo: "+circulo1.getArea()+"\nPerimetro del circulo"+circulo1.getPerimetro());
        System.out.println("<><><><><><><><><><><><><><><>");
        System.out.println("Area del rectangulo: "+rectangulo1.getArea()+"\nPerimetro del rectangulo: "+rectangulo1.getPerimetro());
    }
    
}
