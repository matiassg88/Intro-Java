/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manosalaobraherencia;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aldana Hereñu
 */
public class ManosALaObraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List <Animal> lista=new ArrayList<>();
        
        
        lista.add(new Perro("basurero", "lo que cae al sopi", "1", "de la casa"));
        lista.add(new Gato("vagoneta", "alimento nuevo de la bolsa, no puede ser sobra", "2", "felino"));
        lista.add(new Caballo("Tornado", "cosas verdes", "inmortal", "actor"));
        for (Animal animal : lista) {
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-");
           animal.queCome();
        }
        
    }
    
}
