/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Interfaces.InterfazAlquiler;
import entidades.Barco;
import entidades.BarcoAMotor;
import entidades.BarcoVelero;
import entidades.BarcoYate;
import entidades.Cliente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


/**
 *
 * @author Aldana Hereñu
 */
public class AlquilerDeAmarres implements InterfazAlquiler{
    private Scanner sc;
    private Cliente nuevoCliente;
    private Barco nuevoBarco;
    private final double precioPorUnidad=1000.00;

    
    public AlquilerDeAmarres() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void ingresarCliente (){
        
        LocalDate fechaInicio,fechaCese;
        
        System.out.println("Ingrese Nombre: ");
        String nombre = sc.next();
        System.out.println("Ingrese DNI: ");
        String DNI = sc.next();
        System.out.println("Ingrese Fecha de Inicio de Alquiler YYYY/MM/DD: ");        
        int anio=sc.nextInt();
        int mes =sc.nextInt();
        int dia=sc.nextInt();
        fechaInicio=LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese Fecha de retiro del Barco YYYY/MM/DD: ");        
        anio=sc.nextInt();
        mes =sc.nextInt();
        dia=sc.nextInt();
        fechaCese=LocalDate.of(anio, mes, dia);
        System.out.println("Ingrese posicion del amarre: ");
        String posAmarre=sc.next();
        byte num;
        do {
        System.out.println("Ingrese con un numero el tipo de barco:\n1.Velero\n2.Simple a motor.\n3.Yate. ");
        num=sc.nextByte();    
        } while (num>3||num<1);
        
        switch (num) {
            case 1:                
                nuevoCliente=new Cliente(nombre, DNI, fechaCese, fechaInicio, posAmarre, ingresarVelero());                
            break;
            case 2:
                 nuevoCliente=new Cliente(nombre, DNI, fechaCese, fechaInicio, posAmarre, ingresarBarcoAMotor()); 
            break;
            case 3:
                  nuevoCliente=new Cliente(nombre, DNI, fechaCese, fechaInicio, posAmarre, ingresarYate()); 
            break;
        }
       // nuevoCliente=new Cliente(nombre, DNI, fechaInicio, fechaCese, posAmarre, nuevoBarco);
    }
    
    private BarcoVelero ingresarVelero(){
        System.out.println("Ingrese la cantidad de Mastiles que tiene el velero: ");
        int cantidadMastil= sc.nextInt();
        System.out.println("Ingrese la Matricula: ");
        String matricula=sc.next();
        System.out.println("Ingrese la eslora: ");
        int eslora=sc.nextInt();
        System.out.println("Ingrese fecha de fabricacion YYYY/MM/DD");
        LocalDate fabricacion;
        int anio=sc.nextInt();
        int mes=sc.nextInt();
        int dia=sc.nextInt();
        fabricacion=LocalDate.of(anio, mes, dia);
        return new BarcoVelero(cantidadMastil, matricula, eslora, fabricacion);
    }
    private BarcoAMotor ingresarBarcoAMotor(){
          System.out.println("Ingrese la cantidad de Caballos de Vapor: ");
        int cv= sc.nextInt();
        System.out.println("Ingrese la Matricula: ");
        String matricula=sc.next();
        System.out.println("Ingrese la eslora: ");
        int eslora=sc.nextInt();
        System.out.println("Ingrese fecha de fabricacion YYYY/MM/DD");
        LocalDate fabricacion;
        int anio=sc.nextInt();
        int mes=sc.nextInt();
        int dia=sc.nextInt();
        fabricacion=LocalDate.of(anio, mes, dia);
        
        return new BarcoAMotor(cv, matricula, eslora, fabricacion);
    }
    private BarcoYate ingresarYate(){
        System.out.println("Ingrese la cantidad de Caballos de Vapor: ");
        int cv= sc.nextInt();
        System.out.println("Ingrese la cantidad de camarotes: ");
        int camarotes=sc.nextInt();
        System.out.println("Ingrese la Matricula: ");
        String matricula=sc.next();
        System.out.println("Ingrese la eslora: ");
        int eslora=sc.nextInt();
        System.out.println("Ingrese fecha de fabricacion YYYY/MM/DD");
        LocalDate fabricacion;
        int anio=sc.nextInt();
        int mes=sc.nextInt();
        int dia=sc.nextInt();
        fabricacion=LocalDate.of(anio, mes, dia);
        
        return new BarcoYate(cv, camarotes, matricula, eslora, fabricacion);
    }
    
    @Override
    public void calcularAlquiler() {
        
       LocalDateTime AlquilerLocalDate=nuevoCliente.getFechaAlquiler().atStartOfDay();
       LocalDateTime DevolucionLocalDate=nuevoCliente.getFechaDevolucion().atStartOfDay();
       
        long diasDeAlquiler=ChronoUnit.DAYS.between(DevolucionLocalDate, AlquilerLocalDate);
        int valorModulo;
        long valorTotal;
        if (nuevoCliente.getBarcoM()!=null) {
            valorModulo= (VALOR_CONSTANTE*nuevoCliente.getBarcoM().getEslora())+(nuevoCliente.getBarcoM().getCV());
            valorTotal=valorModulo*diasDeAlquiler;
            System.out.println("El Alquiler del amarre del BarcoM es: "+valorTotal);
        }else if (nuevoCliente.getBarcoV()!=null) {
            valorModulo= (VALOR_CONSTANTE*nuevoCliente.getBarcoV().getEslora())+(nuevoCliente.getBarcoV().getCantidadMastil());
            valorTotal=valorModulo*diasDeAlquiler;
            System.out.println("El Alquiler del amarre del BarcoV es: "+valorTotal);
        }else if (nuevoCliente.getBarcoY()!=null) {
            valorModulo= (VALOR_CONSTANTE*nuevoCliente.getBarcoY().getEslora())+(nuevoCliente.getBarcoY().getCV()+nuevoCliente.getBarcoY().getCantidadCamarotes());
            valorTotal=valorModulo*diasDeAlquiler;
            System.out.println("El Alquiler del amarre del BarcoY es: "+valorTotal);
        }     
        
    }

}
