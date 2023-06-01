/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Rectangulo extends Geometria {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        super.area = base * altura;
    }
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    @Override
    public void calcularPerimetro() {
        super.perimetro = Math.pow((base+altura), 2);
    }
}
