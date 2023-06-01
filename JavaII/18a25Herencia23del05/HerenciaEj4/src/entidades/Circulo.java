/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Circulo extends Geometria {
    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }   

    @Override
    public void calcularArea() {    
    super.area=PHI*Math.pow(radio, 2);
    }

    @Override
    public void calcularPerimetro() {
    super.perimetro=PHI*diametro;
    }
    
}
