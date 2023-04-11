/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author Aldana Hereñu
 */
public class Alumnx {
    private int id;
    private String nombres;
    private String apellido;
    private String observaciones;

    public Alumnx() {
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
}
