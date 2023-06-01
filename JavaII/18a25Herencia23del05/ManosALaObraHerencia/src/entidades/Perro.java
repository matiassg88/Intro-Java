/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, String edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void queCome() {
        System.out.println("El perro come "+ alimento);
                
    }

   
    
}
