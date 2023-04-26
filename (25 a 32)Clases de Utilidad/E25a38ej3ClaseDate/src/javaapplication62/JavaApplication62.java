/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication62;

import Servicios.DateService;
import Servicios.PersonaService;
import entidades.Persona;

/**
 *
 * @author Aldana Hereñu
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateService fecha =new DateService();
        DateService fecha2 =new DateService();
        
       
        
       /* System.out.println("Persona1"+fecha.fechaNacimiento()); 
        System.out.println("Persona2"+fecha2.fechaNacimiento()); */
       
       //compara dos personas
        System.out.println(fecha.fechaActual());
        fecha.diferencia(fecha.fechaNacimiento(), fecha2.fechaNacimiento());
        
        
        //EJ5:
        
         ///PersonaService nueva= new PersonaService();
        ///Persona atri = new Persona();
        ///atri=nueva.crearPersona();
        ///System.out.println(atri.toString());
       ///nueva.calcularEdad(atri);
    }
    
}
