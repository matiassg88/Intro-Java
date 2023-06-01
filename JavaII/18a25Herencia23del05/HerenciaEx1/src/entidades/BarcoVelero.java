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
public class BarcoVelero extends Barco{
    
    private int cantidadMastil;

    public BarcoVelero() {
    }

    public BarcoVelero(int cantidadMastil, String matricula, Integer eslora, LocalDate fabricacion) {
        super(matricula, eslora, fabricacion);
        this.cantidadMastil = cantidadMastil;
    }

    public int getCantidadMastil() {
        return cantidadMastil;
    }

    public void setCantidadMastil(int cantidadMastil) {
        this.cantidadMastil = cantidadMastil;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(LocalDate fabricacion) {
        this.fabricacion = fabricacion;
    }
    
}
