/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class PersonaService {
   
    Scanner sc = new Scanner(System.in);
 /*Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
*/
    public Persona crearPersona() {
        Persona nueva = new Persona();
        Date nac = new Date();
        System.out.println("Ingrese el nombre de la persona:");
        nueva.setNombre(sc.nextLine());
        System.out.println("Ingrese la fecha de nacimiento.\naño:");
        nac.setYear(sc.nextInt() - 1900);
        sc.nextLine();
        System.out.println("mes:");
        nac.setMonth(sc.nextInt() - 1);
        System.out.println("día:");
        nac.setDate(sc.nextInt());
        nueva.setNacimiento(nac);

        return nueva;

    }
    /*Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
*/
    public void calcularEdad (Persona nac){
        //datos de la persona
       Date calcuEdad=nac.getNacimiento();
       //datos actuales
       DateService act=new DateService();
       Date fechaAct=act.fechaActual();
       
       int edad= fechaAct.getYear()-calcuEdad.getYear();
        if (calcuEdad.getMonth() > fechaAct.getMonth()) {
            edad -= 1;

        }
        if (calcuEdad.getMonth() == fechaAct.getMonth() && calcuEdad.getDate() > fechaAct.getDate()) {
            edad -= 1;
        }
        System.out.println("años: "+edad);
    }
}
