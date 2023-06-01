/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Vehiculo;
import java.util.Scanner;

/**
 *
 *estión de vehículos(servicio). Se registra la información de cada vehículo(entidad) asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
 */
public class GestionDeVehiculos {
    private Scanner sc ;

    public GestionDeVehiculos() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }
    
public Vehiculo registrarVehiculo (){
    System.out.println("Ingresar vehículo. ");
    System.out.println("Marca: ");
    String marca=sc.next();
    System.out.println("Modelo: ");
    String modelo=sc.next();
    System.out.println("año: ");
    Integer anio=sc.nextInt();
    System.out.println("Número de motor: ");
    Integer nMotor = sc.nextInt();
    System.out.println("Número de chasis: ");
    Integer nChasis = sc.nextInt();
    System.out.println("Color: ");
    String color=sc.next();
    System.out.println("Tipo: ");
    String tipo=sc.next();
    
    return new Vehiculo(marca, modelo, anio, nMotor, nChasis, color, tipo);
}    
    
}
