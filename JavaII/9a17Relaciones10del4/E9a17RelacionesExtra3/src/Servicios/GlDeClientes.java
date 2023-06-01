/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 *Gestión Integral(servicios) de clientes(entidades). En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */
public class GlDeClientes {
    private Cliente cliente;
    private HashMap <Integer,Cliente> mapaClientes;
    private Scanner sc;
    private GestionDePolizas gDePoliza;
    private Poliza poliza;
    private GestionDeVehiculos gDeVehiculo;
    private Vehiculo vehiculo;
    
    public GlDeClientes() {
        gDeVehiculo = new GestionDeVehiculos();
        gDePoliza = new GestionDePolizas();
        mapaClientes=new HashMap <>();
        sc = new Scanner(System.in).useDelimiter("\n");
    }
    
    

    public void registrarCliente(){
        System.out.println("Ingresar nuevo cliente.");
        System.out.println("Nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Apellido: ");
        String apellido=sc.next();
        System.out.println("Documento: ");
        Integer dni=sc.nextInt();
        System.out.println("Mail: ");
        String mail=sc.next();
        System.out.println("Domicilio: ");
        String domicilio=sc.next();
        System.out.println("telefono: ");
        Integer tel=sc.nextInt();
        
        vehiculo=gDeVehiculo.registrarVehiculo();
        poliza=gDePoliza.llenarPoliza();
        
        
        //traer una poliza desde la gestion
        cliente = new Cliente(nombre, apellido, dni, mail, domicilio, tel, poliza ,vehiculo);
        mapaClientes.put(cliente.getDocumento(), cliente);
        
    }
    
    public void ActualizarCliente (){
        //recorre el mapa y se consulta que dato se va a modificar
    }
    public void seekAndDestroy (){
        //recorre el mapa y se elimina
    }
    
    public void Facturacion (){
        
    }
    
    public void mostrarMapaClientes (){
        for (Map.Entry<Integer, Cliente> entry : mapaClientes.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Value"+val.toString());
        }
    }   
    
}
