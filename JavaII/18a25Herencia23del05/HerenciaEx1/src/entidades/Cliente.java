/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;


/**
 *
 * @author Aldana Hereñu
 */
public class Cliente {
    /*
    Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
    la posición del amarre y el barco que lo ocupará.
    */
    private String nombre, DNI;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private String posAmarre;
    private BarcoVelero barcoV;
    private BarcoAMotor barcoM;
    private BarcoYate barcoY;

    public Cliente() {
    }

    public Cliente(String nombre, String DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posAmarre, BarcoVelero barcoV) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barcoV = barcoV;
    }

    public Cliente(String nombre, String DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posAmarre, BarcoAMotor barcoM) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barcoM = barcoM;
    }

    public Cliente(String nombre, String DNI, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posAmarre, BarcoYate barcoY) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barcoY = barcoY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public BarcoVelero getBarcoV() {
        return barcoV;
    }

    public void setBarcoV(BarcoVelero barcoV) {
        this.barcoV = barcoV;
    }

    public BarcoAMotor getBarcoM() {
        return barcoM;
    }

    public void setBarcoM(BarcoAMotor barcoM) {
        this.barcoM = barcoM;
    }

    public BarcoYate getBarcoY() {
        return barcoY;
    }

    public void setBarcoY(BarcoYate barcoY) {
        this.barcoY = barcoY;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", DNI=").append(DNI);
        sb.append(", fechaAlquiler=").append(fechaAlquiler);
        sb.append(", fechaDevolucion=").append(fechaDevolucion);
        sb.append(", posAmarre=").append(posAmarre);
        sb.append(", barcoV=").append(barcoV);
        sb.append(", barcoM=").append(barcoM);
        sb.append(", barcoY=").append(barcoY);
        sb.append('}');
        return sb.toString();
    }

    


    
}
