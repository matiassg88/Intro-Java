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
public abstract class Barco {
    //su matrícula, su eslora en metros y año de fabricación.
    protected String matricula;
    protected Integer eslora;
    protected LocalDate fabricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, LocalDate fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public LocalDate getFabricacion() {
        return fabricacion;
    }
    
}
