/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e19a24ej1cuentabancaria;

import cuentaBancaria_Servicios.CuentaBancariaServicio;

/**
 *
 * @author Aldana Hereñu
 */
public class E19a24Ej1CuentaBancaria {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        CuentaBancariaServicio cuenta = new CuentaBancariaServicio();
        
        cuenta.crearCuenta();
        cuenta.Ingresar();
        cuenta.ConsultarSaldo();
        cuenta.Retirar();
        cuenta.ExtraccionRapida();
        cuenta.CosultarDatos();
        
    }
    
}
