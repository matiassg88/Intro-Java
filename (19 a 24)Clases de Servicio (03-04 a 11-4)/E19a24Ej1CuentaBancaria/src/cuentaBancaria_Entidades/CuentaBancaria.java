/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria_Entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class CuentaBancaria {
     
    private int numeroCuenta;
    private double saldoActual;
    private long dni;

    public CuentaBancaria() {
    }

    public CuentaBancaria(long dni, int saldoActual, int numeroCuenta) {
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.numeroCuenta= numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public long getDni() {
        return dni;
    }

    public void setNumeroCuenta(int numeroCuenta) {

        do {
            this.numeroCuenta = numeroCuenta;
            if (numeroCuenta >= 100 || numeroCuenta <= 9) {
                System.out.println("Ingrese un numero válido.");
            }
        } while (numeroCuenta >= 100 || numeroCuenta <= 9);


        
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
   
    
}
