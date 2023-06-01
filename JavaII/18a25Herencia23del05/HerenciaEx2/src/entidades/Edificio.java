/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public abstract class Edificio {
    protected double anchoProf;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double anchoProf, double alto, double largo) {
        this.anchoProf = anchoProf;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAnchoProf() {
        return anchoProf;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
    
}
