/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;


import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Aldana Hereñu
 */
public class DateService {
    Scanner sc = new Scanner(System.in);
    /*Método fechaNacimiento que pregunte al usuario día, 
    mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
    El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
*/
    public Date fechaNacimiento (){
        
        Date cumple = new Date();
        System.out.println("Indique su fecha de nacimiento.");
        System.out.println("dia:");
        cumple.setDate(sc.nextInt());
        System.out.println("mes:");
        cumple.setMonth(sc.nextInt()-1);
        System.out.println("anio");
        cumple.setYear(sc.nextInt()-1900);
        System.out.println("Indique la hora en la que nacio");
        cumple.setHours(sc.nextInt());
        System.out.println("Indique los minutos");
        cumple.setMinutes(sc.nextInt());
        System.out.println("Indique los segundos");
        cumple.setSeconds(sc.nextInt());
        return cumple;
    }
    /*Método fechaActual que cree un objeto fecha con el día actual. 
    Para esto usaremos el constructor vacío de la clase Date. 
    Ejemplo: Date fechaActual = new  Date();*/
    public Date fechaActual(){
      return new Date();        
    } 
    
    /*Método diferencia que reciba las dos fechas por parámetro y 
    retorna la diferencia de años entre una y otra (edad del usuario).
    */
    public void diferencia (Date nac, Date nac2){
        
        
        int anio = Math.abs(nac.getYear() - nac2.getYear());

      
        
        System.out.println("años: "+anio);
    }
    
}
