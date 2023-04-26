/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.Scanner;
import persona_Entidades.Persona;

/**
 *
 * @author Aldana Hereñu
 */
public class  PersonaServicio {
    Persona nueva = new Persona();
    Scanner sc = new Scanner(System.in);
    
    public boolean esMayor (Persona pp){
        if (pp.getEdad()<18) {
            return false;
        }else return true;
    }
public Persona crearPersona(Persona p){
    
    System.out.println("Ingrese el nombre de la persona: ");
    nueva.setNombre(sc.nextLine());
    System.out.println("Ingrese la edad: ");
    nueva.setEdad(sc.nextInt());
    sc.nextLine();
    do {
        System.out.println("Ingrese el sexo (H)hombre (F)mujer (O)otro:");
        nueva.setSexo(sc.nextLine());
        if (!nueva.getSexo().equalsIgnoreCase("h")&&!nueva.getSexo().equalsIgnoreCase("f")&&!nueva.getSexo().equalsIgnoreCase("o")) {
            System.out.println("Ingrese una referencia válida.");
        }
    } while (!nueva.getSexo().equalsIgnoreCase("h")&&!nueva.getSexo().equalsIgnoreCase("f")&&!nueva.getSexo().equalsIgnoreCase("o"));
    System.out.println("Ingrese el peso (Kg):");
    nueva.setPeso(sc.nextFloat());
    System.out.println("Ingrese la altura (m):");
    nueva.setAltura(sc.nextFloat());
    sc.nextLine();
    p = nueva;
 
    return nueva;
}
public int calcularIMC (Persona pp){
    //(peso en kg/(altura^2 en mt2))
    float imc;
    imc =  (float) (pp.getPeso()/(Math.pow(pp.getAltura(), 2)));
    if (imc<20) {
        System.out.println("Por debajo del peso ideal.");
        return -1;
    }else if (imc>=20&&imc<=25) {
        System.out.println("En el peso ideal.");
        return 0;
    }else System.out.println("Sobrepeso.");return 1;
}
public void porcentajes (Persona[] pp){
    
}
}
