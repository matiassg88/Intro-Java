/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
