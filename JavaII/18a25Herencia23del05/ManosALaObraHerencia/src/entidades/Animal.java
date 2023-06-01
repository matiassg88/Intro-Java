/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author Aldana Hereñu
 */
public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected String edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, String edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
   
    
   public abstract void queCome ();

  
}
