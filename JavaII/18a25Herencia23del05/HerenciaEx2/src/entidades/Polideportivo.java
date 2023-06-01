/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean tieneTecho;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean tieneTecho, double anchoProf, double alto, double largo) {
        super(anchoProf, alto, largo);
        this.nombre = nombre;
        this.tieneTecho = tieneTecho;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTieneTecho() {
        return tieneTecho;
    }

    @Override
    public void calcularSuperficie() {
        double superficie=largo*anchoProf;
        System.out.println(nombre+" superficie: "+superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen=largo*anchoProf*alto;
        System.out.println(nombre+" volumen: "+volumen);
    }
    
    
}
