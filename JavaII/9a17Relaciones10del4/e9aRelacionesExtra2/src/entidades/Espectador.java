/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *Por último, del clase.espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
 */
public class Espectador {
    private String nombre;
    private boolean dinero;
    private boolean edad;
    
    
    public Espectador() {
    }

    public Espectador(String nombre, boolean dinero, boolean edad) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDinero() {
        return dinero;
    }

    public void setDinero(boolean dinero) {
        this.dinero = dinero;
    }

    public boolean isEdad() {
        return edad;
    }

    public void setEdad(boolean edad) {
        this.edad = edad;
    }

            
    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", dinero=" + dinero + ", edad=" + edad + '}';
    }
    
}
