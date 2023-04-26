/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e25a32ex2ahorcado;

import entidades.Ahorcado;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import servicios.AhorcadoService;

/**
 *
 * @author Aldana Hereñu
 */
public class E25a32Ex2Ahorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AhorcadoService crear = new AhorcadoService();
        Scanner sc = new Scanner(System.in);
        Ahorcado datos = new Ahorcado();
        
        juego(sc,datos,crear);
    }
    
    public static void juego(Scanner sc, Ahorcado datos, AhorcadoService crear) {
        int life;
        
        
        //crea objeto para poder guardar las letras usadas en un metodo ArrayList en Service.
        ArrayList<String> letraUsed=new ArrayList<>();
        
        //Ingresa la palabra que tiene que adivinar el ahorcado.
        System.out.println("\tBienvenido al ahorcado.");
        crear.crearJuego(sc, datos);
        
        //esta variable se crea aqui para obtener el Size() de la palabra y poder mostrarla.
        String[] mostrarJuego = new String[datos.getAhorcado().size()];
        System.out.println("Intente adivinar la palabra.\n------------------------------");
        crear.longitud(datos);
        life = crear.intentos(datos);
        
        do {
            System.out.println("Ingrese una letra, tiene " + life + " vidas.");
            String letra = sc.next().substring(0);
            sc.nextLine();
            crear.buscar(letra, datos);
            
            //guardar el arreglo parcial.
            mostrarJuego = crear.encontradas(mostrarJuego, letra, datos);
            System.out.println(Arrays.toString(mostrarJuego));
            
            //muestra las letras usadas.
            System.out.print("Letras Usadas");
            letraUsed = crear.letrasUsadas(letra,letraUsed);
            System.out.println(letraUsed);
            
            //resta una vida.
            life--;
            System.out.println("------------------------------");
            
            //mustra un mensaje si gano o perdio.
            crear.gano(mostrarJuego,datos,life);
        } while (life > 0);
        System.out.println("Fin del juego");
        
    }
}
