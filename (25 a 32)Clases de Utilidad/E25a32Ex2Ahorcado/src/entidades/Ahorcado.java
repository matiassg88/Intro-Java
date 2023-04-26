/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;


/**
 *
 * @author Aldana Hereñu
 */
public class Ahorcado {

    private ArrayList<String> ahorcado;
    private int jugadas;
    private int letrasEncontradas;
    
    public Ahorcado() {
    }

    public Ahorcado(ArrayList<String> ahorcado, int jugadas,int letrasEncontradas) {
        this.ahorcado = ahorcado;
        this.jugadas = jugadas;
        this.letrasEncontradas=letrasEncontradas;
    }

    public ArrayList<String> getAhorcado() {
        return ahorcado;
    }

    public int getJugadas() {
        return jugadas;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }
    

    public void setAhorcado(ArrayList<String> ahorcado) {
        this.ahorcado = ahorcado;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "ahorcado=" + ahorcado + ", jugadas=" + jugadas + ", letrasEncontradas=" + letrasEncontradas + '}';
    }

   
   
    
}
