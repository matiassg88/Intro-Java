/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria_Servicios;

import cuentaBancaria_Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * @author Aldana Hereñu
 */
public class CuentaBancariaServicio {
     Scanner sc = new Scanner(System.in);
     CuentaBancaria nuevo = new CuentaBancaria();
   
    public CuentaBancaria crearCuenta(){
    int nCuenta;
        System.out.println("Ingrese su dni");
        long dni = sc.nextLong();
       
        System.out.println("Su número de cuenta sera su dni más un número de dos cifras que usted elija a continuación:");
        
         do {
            nCuenta  = sc.nextInt();
            if (nCuenta >= 100 || nCuenta <= 9) {
                System.out.println("Ingrese un numero válido.");
            }
        } while (nCuenta >= 100 || nCuenta <= 9);
        
         nuevo=new CuentaBancaria(dni ,1, nCuenta);
        
        //System.out.println("Usted ha creado la cuenta n°: "+nuevo.getNumeroCuenta()+"/"+nuevo.getDni()+"\nPerteneciente a: "+nuevo.getDni()+"\nCon un saldo inicial de regalo de : $"+nuevo.getSaldoActual());
        return nuevo; 
    }
    
    public double Ingresar(){
        System.out.println("Ingrese cuanto dinero va a ingresar: ");
        double ingreso = sc.nextDouble();
        double sNue = nuevo.getSaldoActual();
        double sAct = sNue+ingreso;
        nuevo.setSaldoActual(sAct);
      return sAct;
    }
    public double Retirar (){
     System.out.println("Ingrese cuanto dinero va a retirar: ");
     
     double sAct;
        
        double ingreso = sc.nextDouble();
        
        double sNue = nuevo.getSaldoActual();
        
        if ((sNue-ingreso)>=0) {
            sAct = sNue-ingreso;
        } else sAct = 0;
        nuevo.setSaldoActual(sAct);
        
        return sAct;
    }
    public void ExtraccionRapida (){
        double sAct=nuevo.getSaldoActual();
        double sNue = nuevo.getSaldoActual()*0.2;
        sAct = sAct-sNue;
        nuevo.setSaldoActual(sAct);
    }
    public void ConsultarSaldo(){
        System.out.println("saldo atual: "+nuevo.getSaldoActual() );
    }
    
    public void CosultarDatos (){
        System.out.println("Datos de la cuenta.\nn° de Cuenta: "+nuevo.getNumeroCuenta()+"\nDni: "+nuevo.getDni()+"\nSaldo actual: "+nuevo.getSaldoActual());
    }
}