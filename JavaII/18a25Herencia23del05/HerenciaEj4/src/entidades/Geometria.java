/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import interfaces.Calculadora;

/**
 *
 * @author Aldana Hereñu
 */
public abstract class Geometria implements Calculadora{
    protected double area;
    protected double perimetro;

    public Geometria() {
    }

    public Geometria(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
}
