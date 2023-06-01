/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Asiento {
    private String columna;
    private int fila;
    private boolean SiOcupado;

    public Asiento() {
    }

    public Asiento(String columna, int fila, boolean SiOcupado) {
        this.columna = columna;
        this.fila = fila;
        this.SiOcupado = SiOcupado;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isSiOcupado() {
        return SiOcupado;
    }

    public void setSiOcupado(boolean SiOcupado) {
        this.SiOcupado = SiOcupado;
    }

    @Override
    public String toString() {
        return "[" + fila + columna + " " + SiOcupado +"]" ;
    }
    
}
