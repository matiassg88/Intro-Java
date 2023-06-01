/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1a9relacionesej1adoptar;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author Aldana Hereñu
 */
public class E1a9RelacionesEj1Adoptar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
        */
        Perro perro1 = new Perro("Batata", "Batata", 2, "mediano");
        Perro perro2 = new Perro("Perro", "Calle", null, "medio flaco");
        Persona caco1;
        Persona caco2;
        
        caco1 = new Persona("carlo", "Saul", null, null, perro1);
        caco2 = new Persona("domingo", "Saul", null, null, perro2);
        System.out.println(caco1.toString());
        System.out.println(caco2.toString());
        
    }
}
