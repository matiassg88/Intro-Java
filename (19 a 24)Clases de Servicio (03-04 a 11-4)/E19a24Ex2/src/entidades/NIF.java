/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class NIF {
    private long dni;
    private char letra;

    public NIF() {
    }

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
        
}
