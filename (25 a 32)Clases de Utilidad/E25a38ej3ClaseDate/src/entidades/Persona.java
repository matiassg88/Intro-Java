/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Aldana Hereñu
 */
public class Persona {
    private Date nacimiento;
    private String nombre;

    public Persona() {
    }

    public Persona(Date nacimiento, String nombre) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nacimiento=" + nacimiento + ", nombre=" + nombre + '}';
    }

   
    
}
