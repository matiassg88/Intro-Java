/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Aldana Hereñu
 */
public final class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void queCome() {
        System.out.println("El caballo come "+alimento);
    }
    
}